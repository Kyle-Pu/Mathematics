import java.math.BigDecimal;
import java.math.BigInteger;

import java.math.RoundingMode;

import java.util.Scanner;

// This program calculates Gamma function using factorial for integers and Spouge approximation for floating point numbers; see  https://en.wikipedia.org/wiki/Spouge%27s_approximation
//
// For integer input, it calculates accurate integer value using factorial representation, if input does not contain decimal point;
// otherwise the Spouge approximation will be used for integer input as well, e.g. for input of, say, "7.0" or "7."  it will use Spouge appriximation; whereas  for input of "7" it will use factorial calculation
//
// calculation  is limited to arguments in the range 0 < arg <= 2000.0
//
// tested with jdk 1.8.0_25

public class GammaFunctionSpouge {


    // define accurate values for constants

    public static final BigDecimal PI = new BigDecimal(
            "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");

    public static final BigDecimal e = new BigDecimal(
            "2.71828182845904523536028747135266249775724709369995957496696762772407663");

    public static final BigDecimal SQRT_PI = new BigDecimal("1.7724538509055160272981674833411451827975494561223871282138077898529112845910321813750");

    public static final BigDecimal SQRT_2 = new BigDecimal("1.414213562373095048801688724209698078569671875376948073176679737990732478462107038850387534327641572735");

    public static final int DIG_ACC  = 1000;

    public static int [] accuraciesArray = {0,1,2,3,5,6,6,7,8,9,11,12,13,15,16,17,18,19,21,22,23,24,26,27,28,29,31,32,33,34,36,37,38,39,41,42};



    public GammaFunctionSpouge() {




        BigDecimal[][] cks = new BigDecimal[43][43];


        // accurate calculation of sqrt(2*PI)

        BigDecimal c0 = SQRT_PI.multiply(SQRT_2);







        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Gamma Function Calculator!");


        // get the argument from the user


        System.out.println("Enter the argument for which you want to calculate Gamma function (if argument is entered as integer without decimal dot, the calculation will be done through factorial): ");

        //scan.nextLine();
        String zinpString = scan.nextLine().trim();


        boolean isInteger = true;
        boolean isDouble = true;
        int iz = -1;
        double zinp = -1.0;
        try{
           iz = Integer.parseInt(zinpString);
        } catch(Exception ex){
            isInteger = false;
        }



        if(isInteger && iz > 0) {

            // calculate as factorial for integers

            BigDecimal gamma = factorial(new BigDecimal(iz-1));
            System.out.println("\u0393(" + iz + ") is equal to (" + (iz - 1) + ")! and is equal to " + gamma);
            System.exit(0);

        }  else if (isInteger && (iz <= 0 || iz > 2000)){
            System.out.println("This program calculates Gamma function only for positive numbers <= 2000.");
            System.exit(0);
        } else {


            try {
                zinp = Double.parseDouble(zinpString);
            } catch (Exception ex) {
                isDouble = false;
            }


            if (isDouble && (zinp <= 0.0 || zinp > 2000.0)) {

                System.out.println("The argument of the Gamma function should be valid positive number in the range between 0.0 and 2000.0.");
                System.exit(0);

            }
        }
        double z = zinp - 1.0;




        int digits;

        // get accuracy from the user


        do
        {
            System.out.print("Enter the minimum number of accurate digits you want to see in the result (integer in the range 1-35): ");
            System.out.println("");
            digits = scan.nextInt();
            if(digits == 0)break;
            if(digits < 1 || digits > 35) {
                System.out.println("Enter integer in the range 1-35; please, try again. ");
                System.out.println("");
            }

        }while(digits < 1 || digits > 35);




        int a = accuraciesArray[digits];

        // takes some time to calculate coefficients of Spouge approximation for range of accuracies

        if(a > 3){
            System.out.println("");
            System.out.println("Please, wait while we do the calculations. The time mostly depends on your selected accuracy and anyway should not take more than couple of minutes ...");
            System.out.println("");
        }


        if (a > 0) {
            for (int k = 1; k < a; k++) {

                BigDecimal factkm1 = factorial(new BigDecimal(k - 1));

                BigDecimal mkpa = new BigDecimal(-k + a);
                BigDecimal kmhalf = new BigDecimal((double) k - 0.5);
                BigDecimal revfact = (new BigDecimal(1.0)).divide(factkm1, DIG_ACC, RoundingMode.HALF_UP);

                cks[k][a] = revfact.multiply(pow_bd(mkpa, kmhalf)).multiply(pow_bd(e, mkpa));
                if ((k % 2) == 0) cks[k][a] = cks[k][a].multiply(new BigDecimal(-1.0));


            }
        }



        // calcualte Spouge sum for given argument and given accuracy
        BigDecimal sum = c0;
        for(int k=1; k<a; k++){

            BigDecimal zpk = new BigDecimal(z + k);

           sum = sum.add(cks[k][a].divide(zpk, DIG_ACC, RoundingMode.HALF_UP));



        }



        // calculate Gamma function value
        BigDecimal zpa = new BigDecimal(z + a);
        BigDecimal mzpa = zpa.multiply(new BigDecimal(-1.0));
        BigDecimal zphalf = new BigDecimal(z + 0.5);


        BigDecimal gamma = pow_bd(zpa, zphalf).multiply(pow_bd(e,mzpa)).multiply(sum);



       System.out.println("\u0393(" + zinp + ") is equal to (" + (zinp - 1.0) + ")! and is equal to " + gamma.setScale(60, RoundingMode.HALF_UP));



    }


    private static BigDecimal pow_bd(BigDecimal v1, BigDecimal v2) {

        // Java standard library does not have implementation of BigDecimal in non-integere power
        //This implementation is taken from
        //  https://stackoverflow.com/questions/3579779/how-to-do-a-fractional-power-on-bigdecimal-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
        // however that link relies on java.math Math.pow() method for doubles, which reduces accuracy and was not sufficient for Spouge calculation with high accuracy
        //Therefore, the method from above link was enhanced to allow to calculate the fractional power to any desired accuracy; see recursive method pow_less1()
        //which is used for that purpose

        int signOf2 = v2.signum();

        v2 =v2.multiply(new BigDecimal(signOf2)); // n2 is now positive
        BigDecimal remainderOf2 = v2.remainder(BigDecimal.ONE);
        BigDecimal n2IntPart = v2.subtract(remainderOf2);
        BigDecimal intPow = v1.pow(n2IntPart.intValueExact());





        BigDecimal fractionPart = pow_less1(new BigDecimal(1.0),  v1, new BigDecimal(1.0), remainderOf2, new BigDecimal("1.0E-" + DIG_ACC));

        BigDecimal result = intPow.multiply(fractionPart);
        if(signOf2 ==-1)

        {

            result = (new BigDecimal(1.0)).divide(result,DIG_ACC, RoundingMode.HALF_UP);
        }
        return result;
    }







    private static BigDecimal factorial(BigDecimal number) {
        if (number.compareTo(new BigDecimal(1)) < 0) return new BigDecimal(1.0);
        else return number.multiply(factorial(number.subtract(new BigDecimal(1.0))));
    }




    private static BigDecimal pow_less1(BigDecimal currentResult,  BigDecimal base_cur, BigDecimal power_2, BigDecimal power, BigDecimal tolerance){

        if(base_cur.subtract(new BigDecimal(1.0)).compareTo(tolerance) < 0)return currentResult.multiply(base_cur);



        while(power_2.compareTo(power) > 0){



            base_cur = sqrt(base_cur, DIG_ACC);

            power_2 = power_2.divide((new BigDecimal(2.0)).setScale(DIG_ACC, RoundingMode.HALF_DOWN), DIG_ACC, RoundingMode.HALF_DOWN);



        }



        if(base_cur.subtract(new BigDecimal(1.0)).compareTo(tolerance) < 0)return currentResult.multiply(base_cur);

        if(power.subtract(power_2).compareTo(new BigDecimal("1.0E-" + DIG_ACC)) <0)return currentResult.multiply(base_cur);

        currentResult = currentResult.multiply(base_cur);

        return pow_less1(currentResult,  base_cur, power_2, power.subtract(power_2), tolerance);


    }


    private static BigDecimal sqrt(BigDecimal x, int scale)
    {
        // this is sqrt(BigDecimal) method taken from book by Ronald Mak : https://www.amazon.com/Java-Number-Cruncher-Programmers-Numerical/dp/0130460419
        // however the exit condition for the while loop had to be modified in order to avoid infinite looping which happens in some cases
        //  ix.compareTo(ixPrev) != 0 is used; the difference not just exactly zero , but also difference of one in the last digits should allow to exit as well.

        // Check that x >= 0.
        if (x.signum() < 0) {
            throw new IllegalArgumentException("x < 0");
        }

        // n = x*(10^(2*scale))
        BigInteger n = x.movePointRight(scale << 1).toBigInteger();

        // The first approximation is the upper half of n.
        int bits = (n.bitLength() + 1) >> 1;
        BigInteger ix = n.shiftRight(bits);
        BigInteger ixPrev;
        BigInteger test;

        // Loop until the approximations converge
        // (two successive approximations are equal after rounding).
        do {
            ixPrev = ix;

            // x = (x + n/x)/2
            ix = ix.add(n.divide(ix)).shiftRight(1);

            Thread.yield();
            test = ix.subtract(ixPrev).abs();
       // } while (ix.compareTo(ixPrev) != 0);
    } while (test.compareTo(BigInteger.ZERO) != 0 && test.compareTo(BigInteger.ONE) != 0 );

        return new BigDecimal(ix, scale);
    }



    public static void main(String[] args) {
        new GammaFunctionSpouge();
    }

}

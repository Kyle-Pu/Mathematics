import java.util.Scanner;
public class CoterminalAngles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//Declaring Scanner

        System.out.println("Enter first angle:");
        String text1=sc.nextLine();
        System.out.println("Enter second angle:");
        String text2=sc.nextLine();

        if(!text1.contains("[a-zA-Z]") && !text2.contains("[a-zA-Z]")) {//checking for words in scanner
            double angle1 = Double.parseDouble(text1);//storing and converting text1 to double form
            double angle2 = Double.parseDouble(text2);//storing and converting text2 to double form
            double sum = angle1;//storing value of angle1 in another variable(sum) to perform operations on
            if (angle1== angle2) {//comparing both angles for equality
                System.out.println("Angles are coterminal");
            }
            a:
            if (sum < angle2) {//if sum is less than angle2, its value will be increased to match angle
                while (true) {//infinite loop
                    sum += 360;
                    if (sum == angle2) {//comparing both angles for equality
                        System.out.println("Angles are coterminal");
                        break a;//breaking out of conditions because result have been found
                    } else if (sum > angle2) {//if sum has crossed angle 2 means they are not equal
                        System.out.println("Angles are not coterminal");
                        break a;//breaking out of conditions because result have been found
                    }
                }
            } else if (sum > angle2) {//if sum is greater than angle2, its value will be decreased to match angle
                while (true) {//infinite loop
                    sum -= 360;
                    if (sum == angle2) {//comparing both angles for equality
                        System.out.println("Angles are coterminal");
                        break a;//breaking out of conditions because result have been found
                    } else if (sum < angle2) {//if sum has crossed angle 2 means they are not equal
                        System.out.println("Angles are not coterminal");
                        break a;//breaking out of conditions because result have been found
                    }
                }
            }
        }
        else{
            System.out.println("You entered words instead of numbers, please reload the program");
        }

    }
}

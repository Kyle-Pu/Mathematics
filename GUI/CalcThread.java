package GUI;

//dont mess with This :)

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public  class CalcThread extends Thread{

	private CalcHandler handler;
	private final int ASECOND = 1000;

	private double deltaTime = 0;


	public CalcThread(CalcHandler handler){
		this.handler = handler;
	}

	@Override
	public void run(){
		long lastTime = System.currentTimeMillis();
		int count = 0;
		int millCount = 0;
		while(System.currentTimeMillis() - 17 < lastTime){
			deltaTime = getDeltaTime(lastTime);
			handler.update();
			count++;
			boolean LessThanASecond = getMillCount(lastTime, millCount) >= ASECOND;
			if(LessThanASecond){
					//System.out.println("60 Frames in: " + millCount + "ms");
					//System.out.println("Count: " + count);
				count = 0;
				millCount = 0;
			}
			lastTime = System.currentTimeMillis();
		}
	}

	private int getMillCount(long lastTime, int millCount) {
		millCount += System.currentTimeMillis()-lastTime;
		return millCount;
	}

	private double getDeltaTime(long lastTime) {
		return (1.0 * System.currentTimeMillis()-lastTime)/1000;
	}

	public double getDeltaTime(){
		return deltaTime;
	}
}

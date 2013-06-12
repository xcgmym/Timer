package com.zndzcn.timertest;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest extends TimerTask{

	public TimerTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer=new Timer();
		timer.schedule(new TimerTest(), 2000);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is a TimerTask");
	}

}

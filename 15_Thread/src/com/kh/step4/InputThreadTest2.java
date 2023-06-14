package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {

	boolean inputCheck = false;
	boolean endCount = false;
	
	public static void main(String[] args) {

		InputThreadTest2 process = new InputThreadTest2();
		

		Thread itThread = new Thread(new InputThread(process));
		Thread ctThread = new Thread(new CountingThread(process));

		itThread.start();
		ctThread.start();

	}
}

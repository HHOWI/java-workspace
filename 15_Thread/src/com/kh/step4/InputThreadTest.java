package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {

		InputThread it = new InputThread();
		CountingThread ct = new CountingThread();

		Thread itThread = new Thread(it, "InputThread");
		Thread ctThread = new Thread(ct, "CountingThread");

		itThread.start();
		ctThread.start();

	}
}

package com.kh.step4;

public class CountingThread implements Runnable {

	InputThreadTest2 process;
	CountingThread(InputThreadTest2 process) {
		this.process = process;
	}

	@Override
	public void run() {

		for (int i = 10; i > 0; i--) {
			try {
				if(process.inputCheck) {
					break;
				} 
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
		}
		
		if(!process.inputCheck) {
			System.out.println("10초 경과되었습니다... 값 입력 초과!!");
			System.exit(0);
		}
	}

}

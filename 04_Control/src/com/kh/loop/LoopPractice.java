package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
 
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
    public void method1() {
    	int num = 0; 	
    	
    	System.out.print("사용자 입력 : ");
    	num = sc.nextInt();
    	
    	for(int i=0; num!=i; num--) { //false가 될 때 까지 반복! 
    		System.out.println(num);
    	}

    }

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
        int num1 = 0;
        int num2 = 0;
 
        // 민수님 코드 그대로 왜 작동하는지 설명 작성할게요~~
        while(num1 < 100) { // 조건식을 100 이하 까지로 해놓으셨으니!
            ++num2;         // num1 = 0에서 시작, num2가 여기서 더해지니 이때 1로 시작하죠?
            if(num2 % 2 == 0) { // 조건문을 만남! 짝수면 여기! 짝수인 경우 -를 붙이라고 했으니 잘하셨음!
            	num1-=num2; // 1-2=-1 2-4=-2 3-6=-3 4-8=-4
            } else {            // 나머지는 홀수! 여기~~
            	num1+=num2; // 0+1=1 -1+3=2 -2+5=3 -3+7=4
            }
            // num1이 계속 더해지고 더해지고~~ 고러다 100 이상이 되는 순간 stop하겠죠?
        }
        System.out.println(num2); // 그때 나온 것이 여기!
    	    } //구글링해서 겨우 풀긴했는데 해석이 잘 안되네요 너무 어려워요 ㅠㅠ 

    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3

    */
    public void method3() {
    	String str = null;
    	char ch = '\u0000';
    	int count = 0;
    	
    	System.out.print("문자열 : ");
    	str = sc.nextLine();
    	System.out.print("문자 : ");
    	ch = sc.nextLine().charAt(0);
    	
    	for(int i=0; i<str.length(); i++) { 	//입력받은 문자열의 갯수만큼 반복. 반복 할때마다 i는 1개씩 늘어남
    		if(str.charAt(i) == ch) {			//입력받은 문자열의 i 번째 문자와 입력받은 문자가 일치할 때
    			count++;						//count 1 증가
    		}
    	}
    	System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);	
    }

    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용! 0~10)
        7
        3
        4
        2
        3
        4
        0
     */
    public void method4() { 	
    	
    	
    	// Math.random 범위 수정! 지금은 0~9까지만 나와서 10이 안나와요! 
    	
    	while(true) {  								//조건 없이 반복
    		int random = (int)(Math.random() * 11); //랜덤값 대입. 반복문 안에 있기 때문에 반복적으로 계속 대입됨
        	System.out.println(random);				//랜덤값 출력
        	if(random == 0) {						//만약 랜덤이 0이 나왔다면		
        		break;								//while문에서 빠져나옴
        	}
    	}

    }

    /*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)

        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0

     */
    public void method5() {
    	int count1 = 0;
    	int count2 = 0;
    	int count3 = 0;
    	int count4 = 0;
    	int count5 = 0;
    	int count6 = 0; //주사위 값 마다 정수형 선언
    	int i=0;
    	while(i<10) { //주사위 10번 던지면 while문에서 빠져나옴
    		int random =(int)(Math.random() * 6) + 1; //정수형으로 변환되었기 때문에 0이상 1미만 곱하기 6은 0이상 6미만이 됨 더하기 1하면 1~6이 됨
    		switch(random) {
    		case 1 : count1++; break;
    		case 2 : count2++; break;
    		case 3 : count3++; break;
    		case 4 : count4++; break;
    		case 5 : count5++; break;
    		case 6 : count6++; break; //주사위 값 마다 카운트 
    		}
    		i++; //주사위 던진 횟수 카운트
    	}
    	System.out.println("1 : " + count1);
    	System.out.println("2 : " + count2);
    	System.out.println("3 : " + count3);
    	System.out.println("4 : " + count4);
    	System.out.println("5 : " + count5);
    	System.out.println("6 : " + count6);
    }

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {
    	String name = null;
    	String comRps = null;
    	String userRps = null;
    	int winCount = 0;
    	int loseCount = 0;
    	int drawCount = 0;
    	
    	System.out.print("당신의 이름을 입력해주세요 : ");
    	name = sc.nextLine();
    	
    	while(winCount<1) { // 이기면 while문에서 빠져나옴
    		int random =(int)(Math.random() * 3); // 랜덤으로 3가지 값만 받을수 있도록 지정
    		switch(random) {
    		case 0 : comRps = "가위"; break;
    		case 1 : comRps = "바위"; break;
    		case 2 : comRps = "보"; break; //받은 정수값을 가위 바위 보 로 변환
    		}
    		System.out.print("가위바위보 : ");
    		userRps = sc.nextLine(); 		//while문 안에 있기 때문에 이길때 까지 가위바위보 반복 입력
    		
    		System.out.println("컴퓨터 : " + comRps);
    		System.out.println(name + " : " + userRps);
    		
    		if(comRps.equals(userRps)) { 
    			System.out.println("비겼습니다."); drawCount++; // 비겼을 때 비긴 수 카운트
    		} 		
    		else if(comRps.equals("가위")) {		//컴퓨터가 가위를 냈을때 발생할 결과와 결과값 카운트
    			if(userRps.equals("바위")) {
    				System.out.println("이겼습니다 !"); winCount++; 
    			}else if(userRps.equals("보")) { //else보다 읽기 편할것 같아서 else if로 작성했습니다
    				System.out.println("졋습니다 ㅠㅠ"); loseCount++; 
    			}    			
    		}
    		else if(comRps.equals("바위")) {		//컴퓨터가 가위를 냈을때 발생할 결과와 결과값 카운트
    			if(userRps.equals("가위")) {
    				System.out.println("졋습니다 ㅠㅠ"); loseCount++;
    			}else if(userRps.equals("보")) { //else보다 읽기 편할것 같아서 else if로 작성했습니다
    				System.out.println("이겼습니다 !"); winCount++; 
    			}    			
    		}
    		else if(comRps.equals("보")) {		//컴퓨터가 가위를 냈을때 발생할 결과와 결과값 카운트
    			if(userRps.equals("가위")) {
    				System.out.println("이겼습니다 !"); winCount++;
    			}else if(userRps.equals("바위")) { //else보다 읽기 편할것 같아서 else if로 작성했습니다
    				System.out.println("졋습니다 ㅠㅠ"); loseCount++; 
    			}
    		}
    	}
    	System.out.println("이긴횟수 : " + winCount);
    	System.out.println("비긴횟수 : " + drawCount);
    	System.out.println("진횟수 : " + loseCount); //while문에서 빠져나온뒤(승리시) 결과값 카운트 출력
    }
    public static void main(String[] args) {
    	LoopPractice lp = new LoopPractice();
//    	lp.method1();
//    	lp.method2(); 
//    	lp.method3();
    	lp.method4();
//    	lp.method5();
//    	lp.method6();
    }
}
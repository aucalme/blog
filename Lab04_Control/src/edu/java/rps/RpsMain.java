package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain {

	public static void main(String[] args) {
		// 가위/바위/보 게임(Rock Paper Scissors)
		
		//가위=1, 바위=2, 보=3으로 정의
		//사용자가 가위/바위/보 중에 하나를 선택:
		//Scanner 사용해서 1,2,3 중에 하나를 입력받고 저장함.
		//컴퓨터가 가위/바위/보 중에 하나를 선택:
		//Random 사용해서 1,2,3 중에 하나를 난수로 만들고 저장함.
		//사용자와 컴퓨터 중 누가 이겼는 지를 판단하고 그 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위/바위/보 게임");
		System.out.println("[1] 가위");
		System.out.println("[2] 바위");
		System.out.println("[3] 보");
		System.out.println("선택(1,2,3) >>>");
		int user = sc.nextInt();
		
		sc.close();
		
		Random rand = new Random();
		int computer = rand.nextInt(3)+1;
		
		System.out.println("user : computer = "+ user +" : "+ computer);
		
		String userChoice = "";
		switch (user) {
		case 1 : 
			userChoice = "가위";
			break;
			
		case 2 :
			userChoice = "바위";
			break;
			
		case 3 :
			userChoice = "보";
			break;
		}
		
		String comChoice = "";
		switch (computer) {
		case 1:
			comChoice = "가위";
			break;
			
		case 2:
			comChoice = "바위";
			break;
			
		case 3:
			comChoice = "보";
			break;
		}
		
		System.out.println("user : computer = "+ userChoice+" : "+comChoice);
		
		if (user == 1) {
			if (computer == 1) {
				System.out.println("Tie");
			}else if (computer == 2) {
				System.out.println("You lose...");
			}else if (computer == 3) {
				System.out.println("You win!!!");
			}
		}else if (user == 2) {
			if (computer == 1) {
				System.out.println("You win!!!");
			}else if (computer == 2) {
				System.out.println("Tie");
			}else if (computer == 3) {
				System.out.println("You lose...");
			}
		}else if (user == 3) {
			if (computer == 1) {
				System.out.println("You lose...");
			}else if (computer == 2) {
				System.out.println("You win!!!");
			}else if (computer == 3) {
				System.out.println("Tie");
			}
		}
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("가위=1,바위=2,보=3 중에 하나를 입력하세요.");
		int user =sc.nextInt();
		System.out.println("user = " + user);
		
		Random rand = new Random();
		int com = rand.nextInt(3)+1;
		System.out.println("com = " + com);
		
		
		
		if(user == 1 && com == 3) {
			System.out.println("user가 이겼습니다");
		}else if (user == 1 && com == 2) {
			System.out.println("computer가 이겼습니다");
		}else if (user == 2 && com == 1) {
			System.out.println("user가 이겼습니다");
		}else if (user == 2 && com == 3) {
			System.out.println("computer가 이겼습니다");
		}else if (user == 3 && com == 2) {
			System.out.println("user가 이겼습니다");
		}else if (user == 3 && com == 1) {
			System.out.println("computer가 이겼습니다");
		}else {
			System.out.println("비겼습니다");
		}*/
		
		
		
		
		
	}

}

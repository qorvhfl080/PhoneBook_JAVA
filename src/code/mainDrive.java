package code;

import java.util.Scanner;

public class mainDrive {

	public static void main(String[] args) {
		
		printMenu();
		
	}
	
	static void printMenu() {
		
		Scanner sc = new Scanner(System.in);
		int menu = 111;
		while (menu != 0) {
			System.out.println("======= 전화번호부 =======");
			System.out.println("1. 전화번호 추가 등록");
			System.out.println("2. 전화번호 목록 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("=======================");
			System.out.print("메뉴 입력 : ");
			
			menu = sc.nextInt();
			
			
		}
		
		sc.close();
		System.out.println("프로그램 종료...");
		
	}

}

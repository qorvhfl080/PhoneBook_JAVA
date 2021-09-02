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
			
			if (menu == 1) {

				addPhoneNum();
				
			} else if (menu == 2) {
				
				showAllPhoneNum();
				
			} else {
				System.out.println("잘못된 입력입니다.");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
			
		}
		
		sc.close();
		System.out.println("프로그램 종료...");
		
	}
	
	static void addPhoneNum() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("폰번 입력 : ");
		String phoneNum = sc.next();
		
		System.out.print("출생년도 입력 : ");
		int birthYear = sc.nextInt();
		
	}
	
	static void showAllPhoneNum() {
		
	}

}

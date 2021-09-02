package code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import code.data.UserData;

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
		
		String content = String.format("%s,%s,%d", name, phoneNum, birthYear);
		
		savePhoneNumToFile(content);
		
	}
	
	static void savePhoneNumToFile(String content) {
		
		File myFile = new File("phoneBook.csv");
		
		try {
			FileWriter fw = new FileWriter(myFile, true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.append(content);
			bw.newLine();
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	static void showAllPhoneNum() {
		
		List<UserData> userList = new ArrayList<UserData>();
		
		addUsersByFile(userList);
		
		for (UserData user : userList) {
			System.out.println(user);
		}
		
	}
	
	static void addUsersByFile(List<UserData> list) {
		
		File myFile = new File("phoneBook.csv");
		
		try {
			FileReader fr = new FileReader(myFile);
			
			BufferedReader br = new BufferedReader(fr);
			
			while (true) {
				
				String line = br.readLine();
				
				if (line == null)
					break;
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("아직 저장된 번호가 하나도 없습니다.");
			System.out.println("전화번호부 파일이 만들어지지 않았습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("손상된 내용이 있습니다.");
			e.printStackTrace();
		}
		
		
		
	}

}

package edu.kh.jdbc.common;

import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Scanner;


public class createXMLFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//XML key:value
		//*Properties 컬렉션 객체
		//-Map 의 후손클래스
		//-Key, Value 모두 String 형식
		//-XML 파일을 읽고 쓰는데 특화된 메서드 제공
		
		try {
			Scanner sc = new Scanner(System.in);
			
			//Properties 객체 생성
			Properties prop = new Properties();
			
			
			System.out.println("생성할 파일 이름 : ");
			String fileName = sc.nextLine();
			
			//FileOutputStream 생성
			FileOutputStream fos = new FileOutputStream(fileName + ".xml");
			
			//Properties 객체를 이용해서 XML 파일 생성
			prop.storeToXML(fos, fileName + ".xml file");
			
			System.out.println(fileName + ".xml file 생성완료");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}

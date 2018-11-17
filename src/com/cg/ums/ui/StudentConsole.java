package com.cg.ums.ui;

import java.util.Scanner;

import com.cg.ums.bean.Student;

public class StudentConsole {
	Scanner scan = new Scanner(System.in);
	public void apply(){
		Student stud=new Student();
		System.out.println("Enter your full name");
		scan.nextLine();
		System.out.println("Enter date of birth in format dd/mm/yyyy");
		scan.nextInt();
		System.out.println("Enter the highest qualification");
		scan.nextLine();
		System.out.println("Enter marks obtained");
		scan.nextInt();
		System.out.println("Enter goals");
		scan.nextInt();
		System.out.println("Enter email-id");
		scan.nextLine();
		System.out.println("Enter scheduled program Id");
		scan.nextInt();
	}

}

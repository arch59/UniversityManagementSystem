package com.cg.ums.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.cg.ums.bean.ProgramsOffered;
import com.cg.ums.exceptions.UMSExceptions;
import com.cg.ums.service.AdminServiceIMPL;
import com.cg.ums.service.IAdminService;

public class AdminConsole {
	private String currentUser;
	IAdminService iAdmin = new AdminServiceIMPL();
	public AdminConsole(String currentUser) {
		this.currentUser = currentUser;
	}
int choice=0;

	public void start() throws UMSExceptions {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome"+currentUser);
		System.out.println("Select your choice");
		System.out.println("1.addPrograms 2.deletePrograms 3.updatePrograms 4.logout");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			addPrograms();
			break;
		case 2:
			deleteProgram();
			break;
		case 3:
			updateProgram();
			break;
		case 4:
			
		}
	}

public void addPrograms() throws UMSExceptions{
	Scanner sc=new Scanner(System.in);
	ProgramsOffered pOffered = new ProgramsOffered();
	System.out.println("Enter Program Name");
	String pName=sc.nextLine();
	System.out.println("Enter description");
	String desc=sc.nextLine();
	System.out.println("Enter applicant eligibility");
	String aEligibility=sc.nextLine();
	System.out.println("Enter duration");
	int duration = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter degree certificate offered");
	String dCertificate=sc.nextLine();
	pOffered.setProgramName(pName);
	
	pOffered.setDesc(desc);
	pOffered.setaEligibility(aEligibility);
	pOffered.setDuration(duration);
	pOffered.setdCertificate(dCertificate);
int result=iAdmin.addPrograms(pOffered);
		
	}
public void deleteProgram() throws UMSExceptions{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the program name to delete");
	String pName= sc.nextLine();
	int result=iAdmin.deleteProgram(pName);
	System.out.println(result+"record deleted with name"+pName);

	
}
public void updateProgram() throws UMSExceptions{
	Scanner sc = new Scanner(System.in);
	ProgramsOffered pOffered1 = new ProgramsOffered();
	System.out.println("Enter the program name to update");
	String pName=sc.nextLine();
	
	System.out.println("Enter description");
	String desc=sc.nextLine();
	System.out.println("Enter applicant eligibility");
	String aEligibility=sc.nextLine();

	pOffered1.setProgramName(pName);
	pOffered1.setDesc(desc);
	pOffered1.setaEligibility(aEligibility);
	int result=iAdmin.updateProgram(pOffered1);
	System.out.println(result+ "updated with id"+pName);
}
public void getAllPrograms(){

	
	
}

}

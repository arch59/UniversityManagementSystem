package com.cg.ums.ui;

import java.util.Scanner;
import com.cg.ums.exceptions.UMSExceptions;
import com.cg.ums.service.IUniversityService;
import com.cg.ums.service.UniversityServiceIMPL;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	IUniversityService uService=new UniversityServiceIMPL();
	int choice=0;
	System.out.println("Welcome to university management system");
	System.out.print("[1]Login [2]Apply [3]Quit");
	choice = sc.nextInt();
	
	if(choice==1){
		System.out.println("[1]admin [2]MAC");
		choice = sc.nextInt();
		System.out.print("UserName? ");
		String uName = sc.next();
		System.out.print("Password? ");
		String password = sc.next();

	try{
			String role = uService.getRole(uName, password) ;
			System.out.println(role);
			if("admin".equals(role)){
				AdminConsole ac = new AdminConsole(uName);
				ac.start();
			}else{
				MacConsole mc = new MacConsole(uName);
				mc.start();
			}		

	}catch(UMSExceptions e){
		System.err.println(e.getMessage());
	}
}
	sc.close();
}
}

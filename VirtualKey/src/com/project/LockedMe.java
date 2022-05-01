package com.project;
import com.project.FileOperations;
import java.util.*;
public class LockedMe {

	public static void main(String[] args) {
		welcomeScreen();
		menuDriven();
	}

	public static void welcomeScreen() {
		System.out.println("!!!!! Welcome to LockedMe.com !!!!!");
		System.out.println("Developed by Akhila Myana");
		System.out.println("*******************************************");
	}

public static void menuDriven()  {
		Scanner sc = new Scanner(System.in);
		FileOperations obj = new FileOperations();
		int option;
		do {
				System.out.println("Enter choice");
				System.out.println("\t1. Display all files");
				System.out.println("\t2. Perform File Operations");
				System.out.println("\t3. Exit");
		
				option=sc.nextInt();
				switch(option) {
				case 1:obj.showFiles();
					   break;
				case 2:int ch;
					   do {
						   	System.out.println("Enter choice for File Operations");
						   	System.out.println("\t1. Add a file");
						   	System.out.println("\t2. Delete a file ");
						   	System.out.println("\t3. Search a file");
						   	System.out.println("\t4. Return to dashboard");
						   	ch=sc.nextInt();
						   	switch(ch) 
						   	{
						   		case 1:obj.addFile();
						   			   break;
						   		case 2:obj.deleteFile();
						   			   break;
						   		case 3:obj.searchFile();
						   			   break;
						   		case 4:System.out.println("Exited Sucessfully");
						   			   System.out.println("---------------------------------\n");
						   			   break;
						   		default:System.out.println("Enter a valis Input");
						   				break;
						   	}
					   	  }while(ch!=4);
					   break;
				case 3:System.out.println("Exited Scuessfully. Visit us again!!!");
					   break;
				default:System.out.println("Invalid choice");
			}
		}while(option!=3);
		sc.close();;
	}
}



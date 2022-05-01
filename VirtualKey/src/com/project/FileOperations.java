package com.project;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileOperations{
	List<String> list= new ArrayList<String>();
	File directoryPath = new File("C:\\Users\\Akhila TO Monkey\\eclipse-workspace\\VirtualKey");
	
	public void showFiles() 
	{
		String filesList[] = directoryPath.list();
		for(int i=0;i<filesList.length;i++) 
		{
			System.out.println(filesList[i]);
			
		}
	}

	public void addFile() {
	   boolean success = false;
		System.out.println("Enter the filename to be added:");
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File f= new File(filename);
		try 
		{
			if(f.exists()) {
				System.out.println("File already exists");
			}
			else
			{
				System.out.println("No such file exists, creating now");
				success =f.createNewFile();
				if(success) {
					System.out.println("Successfully created new file");
				}
				else
				{
					System.out.println("Failed to create new file");
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the filename to delete:");	
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		File f= new File(filename);
		if(f.delete())
			System.out.println("File Deleted Successfully");
		else
			System.out.println("Failed to delete the file");
		}

	public void searchFile() {	
			Scanner scan= new Scanner(System.in);
			File directory = new File("C:\\Users\\Akhila TO Monkey\\eclipse-workspace\\VirtualKey");
			System.out.println("Enter the filename to search:");
			String fileName=scan.nextLine();
			String flist[] = directory.list();
            int flag=0;
            if(flist == null) {
            	System.out.println("Empty Directory");
            }
            else
            {
            	for(int i=0;i<flist.length;i++)
            	{
            		String filenm= flist[i];
            		if(filenm.equalsIgnoreCase(fileName)) {
            			System.out.println(filenm + " found at index "+i );
            			flag =1;
            		}
            	}
            }
        if(flag==0) {
        	System.out.println("File not found");
        }
        	
		
		
	}

}


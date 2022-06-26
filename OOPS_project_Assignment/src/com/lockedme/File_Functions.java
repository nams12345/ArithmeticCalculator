package com.lockedme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class File_Functions {

	static File f=null;
	static Scanner sc=null;
	static {
		 f=new File("D:\\Java");
		sc=new Scanner(System.in);
	}

	static void returnCurrentFilesInAscendingOrder() {
		List<String> file_name=new ArrayList<String>();
		
		String[] s=f.list();
		int cnt=0;
		int count=0;
		for(String s1:s) {
			File f1=new File(f,s1);
			if(f1.isFile()) {
				count++;
			}	
		}
		String []temp=new String[count];
		for(String s1:s) {
			File f1=new File(f,s1);
			if(f1.isFile()) {
				
				temp[cnt++]=s1;
			}	
		}
		for(int i=0;i<temp.length-1;i++) {
			for(int j=i+1;j<temp.length;j++) {
				if(temp[i].toLowerCase().charAt(0)>temp[j].toLowerCase().charAt(0)) {
					String a=temp[i];
					temp[i]=temp[j];
					temp[j]=a;
				}
			}
		}
		Collections.addAll(file_name, temp);
		Iterator i=file_name.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
	
	static void addNewFile() {
		System.out.println("Enter file name with format(Eg: abc.txt/abc.class etc): ");
		String name=null;
		try {
		name=sc.next();
		}catch(InputMismatchException e) {
			System.out.println("Invalid inputs are given, please give correct input");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		name="D:\\Java\\"+name;
		File newFile=new File(name);
		
			Boolean b=null;
			try {
				b = newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(b==false) {
				System.out.println("File already exists !!!");
			}else {
				System.out.println("File has been created in root folder succesfully !!!");
			}
			String[] s=f.list();
			System.out.println(s.length);
		}
	

	static void deleteFile() throws FileNotFoundException, IOException {
		System.out.println("Enter file name to delete: ");
		String name=sc.next();
		name="D:\\Java\\"+name;
		File newFile=new File(name);
		
			Boolean b=null;
			b = newFile.delete();
			if(b==true) {
				System.out.println("File Deleted Successfully !!!");
			}else {
				throw new FileNotFoundException();
			}
	}
	
	static void searchFileName() {
		
		System.out.println("Enter file name you want to search: ");
		String name=sc.next();
		String[] s=f.list();
		
		for(String s1:s) {
			File f1=new File(f,s1);
			if(f1.isFile()) {
				if(s1.equals(name)){
					System.out.println(name+" File found succesfully.\n ");
					return;
				}
			  }	else {
				System.out.println(name+" File not found ");
				}
			} 
	}
}

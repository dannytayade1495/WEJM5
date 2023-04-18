package com.jspiders.filehandling.info;

import java.io.File;
import java.io.IOException;

public class FileInfo {
	
	public static void main(String[] args) {
		
		File file = new File("wejm5sample.txt");
		
		if (file.exists()) {
			System.out.println("File already exists..!!");
		} else {
			try {
				file.createNewFile();
				System.out.println("File created successfully..!!");
			} catch (IOException e) {
				System.out.println("File not created");
			}
			
		}
		System.out.println("Name of the file : " + file.getName());
		System.out.println("Path of the file : " 
										+ file.getAbsolutePath());
		System.out.println("Length of file : " + file.length());
		if (file.canRead()) {
			System.out.println("File is readable");
		} else {
			System.out.println("File is not readable");
		}
		if (file.canWrite()) {
			System.out.println("File is writable");
		} else {
			System.out.println("File is not writable");
		}
		if (file.canExecute()) {
			System.out.println("File is executable");
		} else {
			System.out.println("File is not executable");
		}
	}

}

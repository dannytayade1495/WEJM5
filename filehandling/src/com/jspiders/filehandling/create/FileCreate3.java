package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate3 {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Dhananjay"
				+ "\\Desktop\\FileHandling\\wejm5.txt");
		if (file.exists()) {
			System.out.println("File already exists..!!");
		} else {
			try {
				file.createNewFile();
				System.out.println("File created successfully..!!");
			} catch (IOException e) {
				System.out.println("File not created..!!");
			}
		}
	}

}

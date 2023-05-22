package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharRead {
	
	public static void main(String[] args) {
		
		File file = new File("Char.txt");
		
		if (file.exists()) {
			try {
				
				FileReader fileReader = new FileReader(file);
				System.out.println(fileReader.read());
				fileReader.close();
				
				Scanner scanner = new Scanner(file);
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File does not exist..!!");
		}
		
	}

}

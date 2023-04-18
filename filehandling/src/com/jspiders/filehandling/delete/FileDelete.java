package com.jspiders.filehandling.delete;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		File file = new File("wejm5sample.txt");
		
		if (file.exists()) {
			file.delete();
			System.out.println("File deleted successfully..!!");
		} else {
			System.out.println("File does not exist..!!");
		}

	}

}

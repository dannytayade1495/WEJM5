package com.jspiders.serializationdeserialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.jspiders.serializationdeserialization.object.User;

public class UserDeserialization {

	public static void main(String[] args) {
		try {
			File file = new File("User.txt");

			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

				System.out.println("Reading object from file..!!");
				User user = (User) objectInputStream.readObject();
				System.out.println(user);

				fileInputStream.close();
				objectInputStream.close();
			} else {
				System.out.println("File does not exist..!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

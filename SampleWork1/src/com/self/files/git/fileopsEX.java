package com.self.files.git;

import java.io.File;

public class fileopsEX {

	public static void main(String[] args) {
//this will add a txt file in samplework1 folder in c drive
		File myFile = new File("file1.txt");
		
				try {
					myFile.createNewFile();
					System.out.println("created this file");
				} catch (Exception e) {
					System.out.println("Unable to create this file");
					e.printStackTrace();
				}

	}

}

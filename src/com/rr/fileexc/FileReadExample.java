package com.rr.fileexc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {

	
	public static void main(String[] args) {

		FileInputStream br = null;

		try {

			String sCurrentLine = "";

			File in = new File("newfile.txt");
			br = new FileInputStream(in);
			int temp;
			while (( temp = br.read()) > 0) {
				sCurrentLine = sCurrentLine+(char)temp;
			}
			System.out.println(sCurrentLine);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}

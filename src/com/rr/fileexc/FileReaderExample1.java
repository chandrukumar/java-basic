package com.rr.fileexc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample1 {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			String sCurrentLine;

			FileReader in = new FileReader("newfile.txt");
			br = new BufferedReader(in);

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

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

package com.rr.fileexc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingExample {

	
	public static void main(String[] args) {

		FileOutputStream fop = null;
		File file;
		String content = "This is the text content";

		try {

			file = new File("newfile.txt");
			fop = new FileOutputStream(file);

			// if file doesnt exists, then create it
/*			if (!file.exists()) {
				file.createNewFile();
			}
*/
			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

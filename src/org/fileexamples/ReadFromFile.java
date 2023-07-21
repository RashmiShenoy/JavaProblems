package org.fileexamples;

import java.io.FileOutputStream;

public class ReadFromFile {
	public static void main(String[] args)
    {
		FileOutputStream fis = new FileOutputStream(new File("test.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(); 
    }
}

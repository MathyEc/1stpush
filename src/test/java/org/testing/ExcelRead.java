package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException  {
		//Locate
		File f =new File("D:\\JAVA SELENIUM\\eclipse-committers-oxygen-3a-win32-x86_64\\MavenIntro\\target\\TestData\\Excel.xlsx");
		//read
		FileInputStream fin = new FileInputStream(f);
		//Type of workbook
		Workbook w = new XSSFWorkbook(fin);
		//sheet
		Sheet s = w.getSheet("Sheet1");
		//row
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String string1 = cell.getStringCellValue();
					System.out.println(string1);
					
				}
				else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d = cell.getDateCellValue();
						SimpleDateFormat sim=new SimpleDateFormat("dd,MMMM,yyyy");
						String format = sim.format(d);
						 System.out.println(format);
						
					}
					else {
						double nv = cell.getNumericCellValue();
						long l=(long)nv;
						String l1 = String.valueOf(l);
						System.out.println(l1);
					}
					
				}
			}
			
		}
	
	}
}

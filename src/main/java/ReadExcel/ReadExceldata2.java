package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExceldata2 {

	public static Object[][] getExceldata2() {
		// TODO Auto-generated method stub

	 
		String fis = "./data/maven.xlsx";
		XSSFWorkbook  wbook = null;
	try {
		wbook = new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
		
		XSSFSheet ws = wbook.getSheetAt(0);
		int RowNum = ws.getLastRowNum();
		 int cellNum = ws.getRow(0).getLastCellNum();
		 
		 Object[][] data = new Object [RowNum][cellNum];   
		 for(int i = 1 ; i<=RowNum; i++ ) {
		
			   XSSFRow row = ws.getRow(i);
			   
			
		for(int j = 0 ; j< cellNum ; j++ ) {
		                       
			         XSSFCell cell = row.getCell(j);
			   DataFormatter dft = new DataFormatter();
			  Object formatCellValue = dft.formatCellValue(cell);
		// Object stringCellValue = cell.getStringCellValue();
		 //System.out.println(stringCellValue);
		 data[i-1][j]= formatCellValue;
		 
		}
		}
	   
	try {
		wbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
	
}

}

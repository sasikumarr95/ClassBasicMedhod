package seleniumstandalone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testxl {
	public static void main(String[] args) throws Exception{
		
		File f = new File("C:\\Users\\logesh radhakrishnan\\Desktop\\test.xlsx");
		FileInputStream fis = new  FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s= wb.getSheetAt(0);
		
		int rowCount = s.getLastRowNum() - s.getFirstRowNum();
		for(int i=0;i<rowCount+1;i++){
			Row row = s.getRow(i);                                                                                                                                                                                                         
			for(int j=0;j<row.getLastCellNum();j++){
				
				if(row.getCell(j).getCellType()==CellType.STRING){
					System.out.println(row.getCell(j).getStringCellValue());
				}
				else if(row.getCell(j).getCellType()==CellType.NUMERIC)
	            {
	                String cellValue  = String.valueOf(row.getCell(j).getNumericCellValue());
				 System.out.println(cellValue);
			
			}
		}
	}

	
	}
}


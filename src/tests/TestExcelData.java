package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestExcelData {

	
	static Map<Double ,String> list = new TreeMap<Double,String>() ;
	
	@Test
	public static void testExcelData() throws Exception, IOException {
		// TODO Auto-generated method stub

		String datafile = "E://CustData_updated.xls" ;
		FileInputStream file = new FileInputStream ("E://CustData_new.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook(file);
		
		HSSFSheet sh = wb.getSheetAt(0);
		
		Iterator<Row> rowitr = sh.iterator();
			
		
		while(rowitr.hasNext())
		{
			
			
			Row row = rowitr.next();
			
			Iterator<Cell> cellitr = row.cellIterator();
			
			
			String cellString ;
			String cellNumeric ;
			
			
			while(cellitr.hasNext())
			{
				
				Cell cell = cellitr.next();
				
				//Cell writecell = cell;
				
				 //Cell ce = r.createCell(cellcount++) ;
				
				//list.put(cell.getNumericCellValue(),cell.getStringCellValue()) ;
				
				switch (cell.getCellType()) 
                {
                    case Cell.CELL_TYPE_NUMERIC:
                    	
                        System.out.print(cell.getNumericCellValue()+"\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                    	
                     System.out.print(cell.getStringCellValue()+"\t" );
                        break;
                }
				 
				
			}
			
			
			System.out.println(" ");
			System.out.println("\n");
			
		}
		
	//**********************************
		
	}

}

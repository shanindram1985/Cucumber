package Javapoint.com.Cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class GetData {
	
	public static void main(String args[]) throws IOException
	{
	
		int sheetCount = 0;
		int columnCount = 0, rowCount = 0;
		XSSFSheet sheet=null;
		String loginPage[][] = new String[1][2];
		
		
		FileInputStream fis = new FileInputStream ("C:\\Users\\shanindram\\eclipse\\Data.xlsx");
		XSSFWorkbook workbook  = new XSSFWorkbook(fis);
		sheetCount = workbook.getNumberOfSheets();
		
		for (int i=0;i<sheetCount;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("LoginPage"))
			{
				sheet = workbook.getSheetAt(i);
				break;
			}
		}
		
		Iterator<Row> rows = sheet.iterator();
		Row row  = rows.next();
		
		while(rows.hasNext())
		{
			columnCount = 0;
			row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			
			while(cells.hasNext())
			{
				Cell cell = cells.next();
				if(cell.getCellType() == CellType.STRING)
				{
					loginPage[rowCount][columnCount] = cell.getStringCellValue();
				}
				else
				{
					loginPage[rowCount][columnCount] = NumberToTextConverter.toText(cell.getNumericCellValue());
				}
				
				columnCount=columnCount+1;
			}
			
			rowCount = rowCount+1;
			
		}
		
		
		
		for (int i = 0;i<loginPage.length;i++)
		{
			Row wrow = sheet.createRow(i);
			for(int j = 0; j< loginPage[i].length;j++)
			{
				Cell wcell = wrow.createCell(j);
				if(i==0)
				{
					wcell.setCellValue("UserName");
				}
				else
				{
					wcell.setCellValue(loginPage[i-1][j]);
				}

			}
		}
		
		System.out.println("SHAN");
		FileOutputStream fos = new FileOutputStream ("C:\\Users\\shanindram\\eclipse\\Data.xlsx");
		System.out.println("SHAN");
		workbook.write(fos);
		System.out.println("SHAN");
		workbook.close();	
		System.out.println("SHAN");
	
	}

}

package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {
	public String getDataFromExcel(String sheetName,int rowNum,int celNum) throws Throwable{
		FileInputStream fis=new FileInputStream("./DATA/book12.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		String data=row.getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}
	
public int getRowCount(String sheetName) throws Throwable{
	FileInputStream fis=new FileInputStream("./DATA/book12.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	
	
	wb.close();
	return sh.getLastRowNum();
    	}
public void setDataExcel(String sheetName,int rowNum,int celNum,String data)throws Throwable{
	FileInputStream fis=new FileInputStream("./DATA/book12.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row row=sh.createRow(rowNum);
	Cell cel = row.createCell(celNum);
	cel.setCellValue(data);
	 FileOutputStream fis2=new FileOutputStream("./DATA/book12.xlsx");
	wb.write(fis2);
	wb.close();
	
}




}














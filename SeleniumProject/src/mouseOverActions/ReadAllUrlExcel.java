package mouseOverActions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllUrlExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./Excelsheet/Fliplink.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Links");
		int LrowNum =sheet.getLastRowNum();
		System.out.println(LrowNum);
		for(int i=0;i<=LrowNum;i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String value=cell.getStringCellValue();
			System.out.println(i+" "+value);
		}
		book.close();
		fis.close();
		}

}

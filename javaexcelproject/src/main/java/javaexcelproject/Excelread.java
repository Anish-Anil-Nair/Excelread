package javaexcelproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	static FileInputStream f;//DATA BITE READ

	static XSSFWorkbook wb;

	static XSSFSheet th;

	public static String readStringData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\ANISH\\Desktop\\Java Project Excel.xlsx");

		wb = new XSSFWorkbook(f);
		th = wb.getSheet("Sheet1");

		XSSFRow r = th.getRow(row);

		XSSFCell c = r.getCell(col);

		return c.getStringCellValue();

	}

	public static String readIntegerData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\ANISH\\Desktop\\Java Project Excel.xlsx");
		wb = new XSSFWorkbook(f);
		th = wb.getSheet("Sheet1");
		XSSFRow r = th.getRow(row);
		XSSFCell c = r.getCell(col);
		int val = (int) c.getNumericCellValue();//DEFAULT VALUE IS DOUBLE.TO CONVERT INT IS USED.
		return String.valueOf(val);

	}
}

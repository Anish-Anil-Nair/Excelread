package javaexcelproject;

import java.io.IOException;

public class ExcelMain{
public static void main(String[] args)throws IOException {
String s=Excelread.readStringData(1,1);
System.out.println(s);
String s1=Excelread.readIntegerData(1,0);
System.out.println(s1);
}
}

package primer1;

import org.apache.commons.math3.exception.InsufficientDataException;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Primer1 {
    public static void main(String[] args) {
//        String relativePath = "Itbootcamp.xlsx";
        try {
            realData("itbootcamp");
        } catch (FileNotFoundException exception){
            System.out.println("Nevalidna putanja");
        }   catch (IOException exception){
            System.out.println("Nevalidan excel fajl");
        }



    }
public static void realData(String relativePath) throws FileNotFoundException, IOException {
    FileInputStream inputStream = new FileInputStream(relativePath);
    XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
    XSSFSheet sheet = workbook.getSheet("Test");

    CellReference cellReference = new CellReference("C2");
    System.out.println(cellReference.getRow());

    XSSFRow row = sheet.getRow(cellReference.getRow());

}
{

}

}

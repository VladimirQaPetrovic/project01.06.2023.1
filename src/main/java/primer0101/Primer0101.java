package primer0101;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Primer0101 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("test.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                Cell usernameCell = row.getCell(0);
                Cell passwordCell = row.getCell(1);
                Cell resultCell = row.createCell(2);

                String username = usernameCell.getStringCellValue();
                String password = passwordCell.getStringCellValue();

                if (username.equals(password)) {
                    resultCell.setCellValue("INVALID");
                } else {
                    resultCell.setCellValue("VALID");
                }
            }


            FileOutputStream outFile = new FileOutputStream(new File("test.xlsx"));
            workbook.write(outFile);
            outFile.close();
            workbook.close();
            file.close();

            System.out.println("Provera završena.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



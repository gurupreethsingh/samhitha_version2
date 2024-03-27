package rohith_Patil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fatch_all_Links {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://samhithasoftware.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			int count = allLinks.size();
			System.out.println("Total links in--->" + driver.getTitle() + "-Page title-" + driver.getCurrentUrl()
					+ "-This page url is- " + count);

			HashMap<String, String[]> unqLinks = new HashMap<>();

			for (int i = 0; i < allLinks.size(); i++) {
				WebElement link = allLinks.get(i);
				String LinkAddress = link.getAttribute("href");
				String LinkText = link.getText();
				if (LinkAddress == null || LinkAddress.isEmpty()) {
					LinkAddress = "No Address provided Broken Link";
				}
				if (LinkText == null || LinkText.isEmpty()) {
					LinkText = "No LinkText Pvovided";
				}

				unqLinks.put(Integer.toString(i), new String[] { LinkAddress, LinkText });

			}

			System.out.println("Index\tURL\t\t\t\t\ttLink Text");
			for (String Index : unqLinks.keySet()) {

				String[] data = unqLinks.get(Index);
				System.out.println(Index + "\t" + data[0] + "\t" + data[1]);

			}
			FileInputStream fs = new FileInputStream("./Excel/Data.xlsx");
			
			XSSFWorkbook Workbook = new XSSFWorkbook(fs);
			
			
			XSSFSheet sheet = Workbook.createSheet("Home Page2");
			
			int rowNum = 0;
			for (String Index : unqLinks.keySet()) {
				String[] data = unqLinks.get(Index);
				XSSFRow row = sheet.createRow(rowNum++);
				row.createCell(0).setCellValue(Index);
				row.createCell(1).setCellValue(data[0]);
				row.createCell(2).setCellValue(data[1]);
			}

			FileOutputStream FOS = new FileOutputStream("./Excel/Data.xlsx");
			Workbook.write(FOS);
			Workbook.close();
			FOS.close();
			System.out.println("Succesfully Data Copied to Excel");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		driver.quit();

	}

}

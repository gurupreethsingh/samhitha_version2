package rohith_Patil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.TreeMap;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remove_dublicate_LInks {

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

			TreeMap<String, String> unqLinks = new TreeMap<String, String>();

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

				unqLinks.put(LinkText, LinkAddress);

			}

			for (String TextName : unqLinks.keySet()) {

				String link = unqLinks.get(TextName);

				System.out.println(TextName + "\t\t" + link);

			}

			XSSFWorkbook Workbook = new XSSFWorkbook();
			XSSFSheet sheet = Workbook.createSheet("Home Page Links");
			int rowNum = 0;
			for (String TextName : unqLinks.keySet()) {
				String link = unqLinks.get(TextName);
				XSSFRow row = sheet.createRow(rowNum++);
				row.createCell(0).setCellValue(TextName);
				row.createCell(1).setCellValue(link);
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

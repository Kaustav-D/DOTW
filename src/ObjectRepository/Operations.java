package ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Operations {
    public static final By newBooking = By.xpath(".//*[@id='MenuBar_212']/div[2]/ul[1]/li[2]/a");
    public static final By AccomBook = By.xpath(".//*[@id='MenuBar_212']/div[2]/ul[1]/li[2]/ul/li[1]/a");
    public static final By city = By.id("cityName");
    public static final By chooseCust = By.xpath("//*[@id='mainContainer']/form/div[1]/div/table/tbody/tr[1]/td[10]/a[1]");
    public static final By company = By.xpath("//*[@id='companyName']");
    public static final By chooseCustbook = By.xpath("//*[@id='mainContainer']/form/div[1]/div/table/tbody/tr/td[7]/a");
    
}

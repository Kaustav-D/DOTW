package ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewAccoBooking {

    public static final By destCity = By.id("City");
    public static final By AccomUnit = By.id("Hotel");
    public static final By inDate = By.xpath("//*[@id='fromDate']");
    public static final By outDate = By.xpath("//*[@id='toDate']");
    public static final By searchButton = By.xpath("//*[@id='searchForm']/div/div[3]/button");
    public static final By resultHotel = By.xpath("//*[@id='searchResults']/div[3]/h4");
    public static final By roomtypes =By.xpath("//*[@id='searchResults']/div[3]/div[3]/button");
    public static final By child = By.id("children_0");
    public static final By childage =By.xpath("//*[@id='addRoomsHere']/tr[2]/td[3]/select[1]");
    public static final By roomselection = By.xpath("//*[@id='roomtype_84722_0_0_0']");
    public static final By allcheckbox = By.xpath("//*[@id='roomtype_84722_0_0_0']");
    public static final By procedetoBook = By.xpath("//*[@id='roomList_84722']/div[4]/div[3]/button");
    
    public static final By paxtitle = By.xpath("//*[@id='passengerDetails']/div[1]/div/div[1]/select");

    public static final By paxFname = By.xpath("//*[@id='passengerDetails']/div[1]/div/div[2]/input");

    public static final By paxLname = By.xpath("//*[@id='passengerDetails']/div[1]/div/div[3]/input");

    public static final By acceptChkBX = By.xpath("//*[@id='acceptRateNotes_0']");
    
    public static final By bookBtn = By.xpath("//*[@id='continueToBook']");

    public static final By confirmBook = By.xpath("//*[@id='table_bookItinerary']/form/div[2]/div[2]/a");

}

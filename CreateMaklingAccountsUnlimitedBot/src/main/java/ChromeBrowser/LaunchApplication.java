package ChromeBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;



public class LaunchApplication {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        int number = 1;


        String url = "https://protonmail.com";
        String password = "passwordpassword123123";
        String username = "";
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random();
        int length = 8;





       while (number > 0){

           //Create an random string for the user name:
           // video of how to make string randomicer https://www.youtube.com/watch?v=CZYeTblcOU8 check it out
           char[] text = new char[length];
           for(int i = 0; i < length; i++){
               text[i] = characters.charAt(rand.nextInt(characters.length()));
           }

           for(int i = 0; i < text.length; i++){
               username += text[i];
           }
           System.out.println(username);
           Thread.sleep(2000);

           //Program starting: video to make it all work https://www.youtube.com/watch?v=QY0iQpX0LDU
           driver.get(url);
           System.out.println(driver.getTitle());
           Thread.sleep(2000);

           driver.findElement(By.linkText("SIGN UP")).click();
           Thread.sleep(5000);

           driver.findElement(By.className("panel-heading")).click();
           Thread.sleep(2000);

           driver.findElement(By.id("freePlan")).click();
           Thread.sleep(5000);
           System.out.println("Here");
           Thread.sleep(5000);
           System.out.println("Here");


           driver.findElement(By.id("username")).click();
           driver.findElement(By.name("password")).sendKeys(password);
           System.out.println("Here");
           driver.findElement(By.name("passwordc")).sendKeys(password);
           System.out.println("Here");

           number = number-1;
        }





    }
}

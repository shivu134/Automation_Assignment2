package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;



public class Base {
	
	public static org.apache.logging.log4j.Logger log;
	@BeforeSuite
	public void Bsuite() throws FileNotFoundException, IOException {
	String log4jConfigFile=("C:\\Users\\Qualitest\\Documents\\Assessment\\QT_Reg\\src\\main\\java\\Resources\\Log4j.xml");
	ConfigurationSource source=new ConfigurationSource(new FileInputStream(log4jConfigFile));
	Configurator.initialize(null,source);
	log=LogManager.getLogger(Base.class.getName());

	}
	
    public WebDriver driver;
    public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Qualitest\\Documents\\Assessment\\QT_Reg\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Qualitest\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
	
}

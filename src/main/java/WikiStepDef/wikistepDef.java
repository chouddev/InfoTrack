package WikiStepDef;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wikistepDef {
	
	 public WebDriver pd;
	 @Given("^I Navigate to Wikipedia Home page$")
	    public void i_navigate_to_wikipedia_home_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DEVDOCS\\Applications\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
			pd = new ChromeDriver();
			pd.manage().window().maximize();
		    Thread.sleep(2000);
		    // Navigating to URL
		    pd.get("https://en.wikipedia.org/wiki/Main_Page");
		    Thread.sleep(5000);
	    }

	    @When("^I search for \"([^\"]*)\" in the search bar$")
	    public void i_search_for_something_in_the_search_bar(String strArg1) throws Throwable {
	    	pd.findElement(By.xpath("//input[@name='search']")).sendKeys("Shane");
	    	
	    }

	    @Then("^Search results are displayed$")
	    public void search_results_are_displayed() throws Throwable {
	    	String name = pd.findElement(By.xpath("//h1[@class='firstHeading mw-first-heading']")).getText();
    		System.out.println(name);

	    	if(name.equals("Shane"))
	    	{
	    		System.out.println("Search bar worked");
	    	}
	    	else 
	    	{
	    		System.out.println("Search bar didn't worked");
	    	}
	    }

	    @And("^I click on the Search icon$")
	    public void i_click_on_the_search_icon() throws Throwable {
	    	pd.findElement(By.xpath("//input[@class='searchButton']")).click();
	    }
	    @Then("^I search for In the news section$")
	    public void i_search_for_in_the_news_section() throws Throwable {
	    String tab=	pd.findElement(By.xpath("//span[@id='In_the_news']")).getText();
	    if(tab.equals("In the news"))
    	{
    		System.out.println("In the news section is present");
    	}
    	else 
    	{
    		System.out.println("In the news section is not present");
    	}
	    }
	    @When("^I capture the welcome home page$")
	    public void i_capture_the_welcome_home_page() throws Throwable {
	    	Boolean test=pd.findElement(By.xpath("//span[@id='Welcome_to_Wikipedia']")).isDisplayed();
	    	if (test =true)
	    	{
	    		System.out.println("Home page logo is there ");
	    	}
	    	else
	    	{
	    		System.out.println("Home page logo doesnot exist");
	    	}
	    }

	    @Then("^I check Wikipedia link is clickable$")
	    public void i_check_wikipedia_link_is_clicable() throws Throwable {
	    	pd.findElement(By.linkText("Wikipedia")).click();
	    	String heading =pd.findElement(By.xpath("//h1[@id='firstHeading']")).getText();
	    	if (heading.equals("Wikipedia"))
	    	{
	    		System.out.println("Logo is clickable");
	    	}
	    	else 
	    		{
	    		System.out.println("Logo is not clickable");
	    		}
	
	    	
	    }
	    @Then("^I check that the count of sister projects is \"([^\"]*)\"$")
	    public void i_check_that_the_count_of_sister_projects_is_something(String strArg1) throws Throwable{
	    List<WebElement>tm= pd.findElements(By.xpath("//ul[@id='sister-projects-list']/li"));
	    int count=tm.size();
	    System.out.println("Count is"+count);
	    if (count==12)
    	{
    		System.out.println("All the sister projects are visible");
    	}
    	else 
    		{
    		System.out.println("All the sister projects are not visible");
    		}	    
	    
	    }   
	    @And("^Browser is closed$")
	    public void browser_is_closed() throws Throwable {
	    	pd.close();
	    }

	}



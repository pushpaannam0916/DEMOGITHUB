package PUSHTOGITHUB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LOGINPAGE {
	@FindBy(id="email")//Annotation
	private WebElement Email;//Encapsulation
	
	@FindBy(id="password")
	private WebElement Password; //

}

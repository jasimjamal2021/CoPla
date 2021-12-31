package CoPla.Test;

import org.testng.annotations.Test;

public class tc_8 extends bs {
	@Test
	public void loginTest() throws InterruptedException {
		page lp = new page(driver);
		driver.get(baseURL);
		Thread.sleep(3000);
		lp.setUserName(username);
		Thread.sleep(3000);
		lp.clickbutton();
		Thread.sleep(3000);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.submit();
		lp.checkbox();
		lp.clickbuttonid();
		Thread.sleep(6000);
		
	}

}



package com.quantum.steps;

import org.openqa.selenium.By;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.quantum.utils.DriverUtils;

public class EriBankLoginTestStepDefs {
	
	@QAFTestStep(description="User is already on Login Page")
	public void userAlreadyOnLoginPage() {
		DriverUtils.getAppiumDriver().findElement(By.xpath("//*[@id='usernameTextField']"));
	}
	
	@QAFTestStep(description="User enters username and password")
	public void userEntersUsername() {
		DriverUtils.getAppiumDriver().findElement(By.xpath("xpath=//*[@id='usernameTextField']")).sendKeys("company");
		DriverUtils.getAppiumDriver().findElement(By.xpath("xpath=//*[@id='passwordTextField']")).sendKeys("company");
		DriverUtils.getAppiumDriver().findElement(By.xpath("xpath=//*[@id='loginButton']")).click();
	}

	@QAFTestStep(description="User is on home page")
	public void userIsOnHomePage() {
		DriverUtils.getAppiumDriver().findElement(By.xpath("//*[@id='makePaymentButton']"));
	}

}

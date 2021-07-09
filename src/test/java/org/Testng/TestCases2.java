package org.Testng;

import org.testng.annotations.Test;

public class TestCases2 {
@Test
public void setupBrowser() {
	String browserName=System.getProperty("browser");
	System.out.println(browserName);
}
}

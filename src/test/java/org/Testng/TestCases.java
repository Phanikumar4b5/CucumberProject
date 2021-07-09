package org.Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases {
@Parameters("Browser")
	@Test
public void setup(String browserName) {
	System.out.println(browserName);
}

}

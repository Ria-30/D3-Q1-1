package com.sample;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.*;

@SuppressWarnings("unused")
public class MainTest {
  @Test
  public void f() {
	  String name = "@Test-Sanghamitra";
	  System.out.println(name);
  }
  @Test(priority = 1)
  public void f2() {
	  System.out.println("@Test2-Sanghamitra");
  }
  @BeforeTest
  public void beforeTest() {
	  String name = "@BeforeTest-Sanghamitra";
	  System.out.println(name);
  }

  @AfterTest
  public void afterTest() {
	  String name = "@AfterTest-Sanghamitra";
	  System.out.println(name);
  }

}

package com.eca.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test(priority =1)
  public void f() {
    
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

}

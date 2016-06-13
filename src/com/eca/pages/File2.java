package com.eca.pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.apache.log4j.Logger;

public class File2 {
	static Robot robot = null;

	File2(){
		try {
			robot = new Robot();
		} catch (AWTException e) {
			System.out.println("oops");
		}
	}
 
	
	public static void test(){
	System.out.println("in 2nd");
 }
	
	
}

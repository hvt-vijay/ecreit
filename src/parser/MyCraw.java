package parser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class MyCraw {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://dhruphost.com/mysite/dhmay2016_413/contact.html").get();  
				// test comment updated
		org.jsoup.select.Elements inputElements = doc.getElementsByTag("form");  
	    for (Element inputElement : inputElements) {  
	    	Element loginform = doc.getElementById(inputElement.id());
	    	org.jsoup.select.Elements inputEle = loginform.getElementsByTag("input"); 
	    	 for (Element inputEle11 : inputEle) {  
	    if(inputEle11.attr("placeholder").length()>0){
	    	System.out.println("PLACEHOLDER  :"+inputEle11.attr("placeholder")+ " &&  "+inputEle11.attr("type"));}
	    
	    else if (inputEle11.attr("title").length()>0){
	    	System.out.println("TITLE  :"+inputEle11.attr("title")+ " &&  "+inputEle11.attr("type"));}
	    
	    else if (inputEle11.attr("name").length()>0){
	    	System.out.println("NAME  :"+inputEle11.attr("name")+ " &&  "+inputEle11.attr("type"));}
	    
	    else if (inputEle11.attr("id").length()>0){
	    	System.out.println("ID  :"+inputEle11.attr("id")+ " &&  "+inputEle11.attr("type"));}
	    
	    else if (inputEle11.className().length()>0){
	    	System.out.println("CLASSNAME  :"+inputEle11.className()+ " &&  "+inputEle11.attr("type"));}
	    		
	    else{
	    	System.out.println("NOT FOUND");
	    }	 
	    		 
	    	    }  
	    }  
	    System.out.println("DONE");

	}

}

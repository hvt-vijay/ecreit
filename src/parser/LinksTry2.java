package parser;

import java.io.IOException;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class LinksTry2 {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://dhruphost.com/mysite/dhmay2016_413/contact.html").get();

		org.jsoup.select.Elements inputElements = doc.getElementsByTag("input");
	//	org.jsoup.select.Elements textEle = doc.getElementsByTag("textarea");
		//org.jsoup.select.Elements select = doc.getElementsByTag("select");
		for (Element inputEle11 : inputElements) {
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
		System.out.println("DONE");
		/*org.jsoup.select.Elements links = doc.select("a[href]");  
		for (Element link : links) {  
		    System.out.println("\nlink : " + link.attr("href"));  
		    System.out.println("text : " + link.text());  
		} */
	}

}

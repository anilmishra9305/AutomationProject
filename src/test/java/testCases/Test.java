package testCases;

import util.CommonFunction;
import util.TestMethodSetup;

public class Test {

	public static void main(String[] args) {

		
		TestMethodSetup te=new TestMethodSetup();
		
		te.openBrowser();
		CommonFunction com=new CommonFunction();
		
		String urlname=com.readPropertyFile("url");
		
		
		com.openUrl(urlname);
		
		
	}

}

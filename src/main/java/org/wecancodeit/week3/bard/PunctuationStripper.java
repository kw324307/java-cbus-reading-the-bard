package org.wecancodeit.week3.bard;
//import java.util.regex.*;

public class PunctuationStripper {

	public String strip(String testString) {//was testString
		
		return testString.replaceAll("[^\\w\\s]","").trim();
	}//confused about the logic needed for test 2
	

	/*public String stripNoPunctuation(String testString) {
		// TODO Auto-generated method stub
		String emptyString = testString;
		return emptyString;
	}*/



}

package com.prathyusha.MethodsChapter;
/**
 * Methods perform some action (void type)
 * @author prathyusha
 *
 */
public class Method_Example1
{
	public void printsummary(String somevalue) {
		String str = getRepeatString(somevalue);
		System.out.println("Here is my output!!! " + str);
	}
	
	private String getRepeatString(String something) {
		String result = something + " " + something + " " + something;
		return getDoubleRepeatString(result);
	}
	
	private String getDoubleRepeatString(String somevalue) {
		return somevalue + " " + somevalue;
	}
}

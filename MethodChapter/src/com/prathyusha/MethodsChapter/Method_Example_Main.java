package com.prathyusha.MethodsChapter;

import java.util.Scanner;

public class Method_Example_Main
{
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		Method_Example1 example = new Method_Example1();
		example.printsummary(str);
	}

}

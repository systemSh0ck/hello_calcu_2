package com.schocktopia.systemshock.hellocalcu2;

import java.text.DecimalFormat;

/**
 * Created by systemshock on 28/10/2015.
 */
public class MathHandler {

	public static String Calculate(String x, String y, String op){
		DecimalFormat df = new DecimalFormat("###.#");
		switch(op){
			case "+":
				return String.valueOf(Double.parseDouble(x) + Double.parseDouble(y));
			case "-":
				return String.valueOf(Double.parseDouble(x) - Double.parseDouble(y));
			case "*":
				return String.valueOf(Double.parseDouble(x) * Double.parseDouble(y));
			case "/":
				return String.valueOf(Double.parseDouble(x) / Double.parseDouble(y));
			case "^":
				return String.valueOf(Double.parseDouble(y) * Double.parseDouble(y));
			case "sqrt":
				return String.valueOf(Math.sqrt(Double.parseDouble(x)));
			default:
				return "";
		}
	}
}

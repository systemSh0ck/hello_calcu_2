package com.schocktopia.systemshock.hellocalcu2;

/**
 * Created by systemshock on 12/11/2015.
 */
public class Number {
	private String result = "";
	private String number = "";

	public Number(){
		this.setResult("");
		this.setNumber("");
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public static String calculateNumber(String num, String res, String op){
		switch(op){
			case "+":
				return String.valueOf(
						Double.parseDouble(num) +
						Double.parseDouble(res)
				);
			case "-":
				return String.valueOf(
						Double.parseDouble(num) -
						Double.parseDouble(res)
				);
			case "*":
				return String.valueOf(
						Double.parseDouble(num) *
						Double.parseDouble(res)
				);
			case "/":
				return String.valueOf(
						Double.parseDouble(num) /
						Double.parseDouble(res)
				);
			default:
				return "";
		}
	}
}

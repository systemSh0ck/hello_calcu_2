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
		//TODO: fix var types
		switch(op){
			case "+":
				return String.valueOf(
						Double.parseDouble(convertNumber(num))
								+ Double.parseDouble(convertNumber(res))
						);
			case "-":
				return String.valueOf(
						Double.parseDouble(convertNumber(num))
								- Double.parseDouble(convertNumber(res))
				);
			case "*":
				return String.valueOf(
						Double.parseDouble(convertNumber(num))
								* Double.parseDouble(convertNumber(res))
				);
			case "/":
				return String.valueOf(
						Double.parseDouble(convertNumber(num))
								/ Double.parseDouble(convertNumber(res))
				);
			default:
				return "";
		}
	}

	public static String calculateSquare(String num, String op){
		if(op.equals("^")){
			return String.valueOf(Double.parseDouble(num) * Double.parseDouble(num));
		}else if(op.equals("sqrt")){
			return String.valueOf(Math.sqrt(Double.parseDouble(num)));
		}else{
			return "";
		}
	}

	private static String convertNumber(String num){
		double dbl = Double.parseDouble(num);

		if(dbl == (long) dbl){
			return String.format("%d", (long)dbl);
		}else{
			return String.format("%s", dbl);
		}
	}
}

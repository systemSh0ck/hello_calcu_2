package com.schocktopia.systemshock.hellocalcu2;

/**
 * Created by systemshock on 12/11/2015.
 */
public class Number {
	private String operator1;
	private String operator2;
	private String result;

	public Number(){
		this.setOperator1("");
		this.setOperator2("");
		this.setResult("");
	}

	public String getOperator1() {
		return operator1;
	}

	public void setOperator1(String operator1) {
		this.operator1 = operator1;
	}

	public String getOperator2() {
		return operator2;
	}

	public void setOperator2(String operator2) {
		this.operator2 = operator2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void appendNumber(String digit, boolean firstNum){
		if(firstNum){
			operator1 += digit;
		}else{
			operator2 += digit;
		}
	}
}

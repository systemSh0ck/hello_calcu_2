package com.schocktopia.systemshock.hellocalcu2;

import android.widget.TextView;


/**
 * Created by systemshock on 11/11/2015.
 */
public class OperationButton {
	private TextView tv;

	public TextView getTv() {
		return tv;
	}

	public void setTv(TextView tv) {
		this.tv = tv;
	}

	public void writeOperator(TextView tv, String operator){
		tv.append(" "+operator+" ");
	}

	public static double calculate(double op1, double op2, String operator){
		switch(operator){
			case "+":
				return op1 + op2;
			case "-":
				return op1 - op2;
			case "*":
				return op1 * op2;
			case "/":
				return op1 / op2;
			case "^":
				return op1 * op1;
			case "sqrt":
				return Math.sqrt(op1);
			default:
				return 0.0;
		}
	}
}

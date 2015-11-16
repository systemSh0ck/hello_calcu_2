package com.schocktopia.systemshock.hellocalcu2;

import android.widget.TextView;


/**
 * Created by systemshock on 11/11/2015.
 */
public class OperationButton {
	private TextView tv;
	private String op = "";

	public TextView getTv() {
		return tv;
	}

	public void setTv(TextView tv) {
		this.tv = tv;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public void writeOperator(TextView tv, String operator){
		tv.append(" "+operator+" ");
	}
}

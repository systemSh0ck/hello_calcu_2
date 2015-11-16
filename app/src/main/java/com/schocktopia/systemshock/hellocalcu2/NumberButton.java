package com.schocktopia.systemshock.hellocalcu2;

import android.widget.TextView;

/**
 * Created by systemshock on 11/11/2015.
 */
public class NumberButton {
	private TextView tv;

	public TextView getTv() {
		return tv;
	}

	public void setTv(TextView tv) {
		this.tv = tv;
	}

	public void writeNumber(TextView tv, String num){
		tv.append(num);
	}

	public void buildNumber(String numberToAdd, Number num){
		num.setResult(num.getResult() + numberToAdd);
	}
}

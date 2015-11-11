package com.schocktopia.systemshock.hellocalcu2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	String firstOperand = "";
	String secondOperand = "";
	String operator = "";
	String result = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button number1 = (Button)findViewById(R.id.number1);
		number1.setOnClickListener(this);
		Button number2 = (Button)findViewById(R.id.number2);
		number2.setOnClickListener(this);
		Button number3 = (Button)findViewById(R.id.number3);
		number3.setOnClickListener(this);
		Button number4 = (Button)findViewById(R.id.number4);
		number4.setOnClickListener(this);
		Button number5 = (Button)findViewById(R.id.number5);
		number5.setOnClickListener(this);
		Button number6 = (Button)findViewById(R.id.number6);
		number6.setOnClickListener(this);
		Button number7 = (Button)findViewById(R.id.number7);
		number7.setOnClickListener(this);
		Button number8 = (Button)findViewById(R.id.number8);
		number8.setOnClickListener(this);
		Button number9 = (Button)findViewById(R.id.number9);
		number9.setOnClickListener(this);
		Button number0 = (Button)findViewById(R.id.number0);
		number0.setOnClickListener(this);

		Button operationPlus = (Button)findViewById(R.id.operation_plus);
		operationPlus.setOnClickListener(this);
		Button operationMinus = (Button)findViewById(R.id.operation_minus);
		operationMinus.setOnClickListener(this);
		Button operationMultiply = (Button)findViewById(R.id.operation_mult);
		operationMultiply.setOnClickListener(this);
		Button operationDivide = (Button)findViewById(R.id.operation_div);
		operationDivide.setOnClickListener(this);
		Button operationSquare = (Button)findViewById(R.id.operation_sqare);
		operationSquare.setOnClickListener(this);
		Button operationSqrt = (Button)findViewById(R.id.operation_sqrt);
		operationSqrt.setOnClickListener(this);
		Button operationEquals = (Button)findViewById(R.id.operation_equals);
		operationEquals.setOnClickListener(this);
		Button operationClear = (Button)findViewById(R.id.operation_clear);
		operationClear.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		switch (v.getId()) {
			case R.id.number1:
				PressNumber("1");
				break;
			case R.id.number2:
				PressNumber("2");
				break;
			case R.id.number3:
				PressNumber("3");
				break;
			case R.id.number4:
				PressNumber("4");
				break;
			case R.id.number5:
				PressNumber("5");
				break;
			case R.id.number6:
				PressNumber("6");
				break;
			case R.id.number7:
				PressNumber("7");
				break;
			case R.id.number8:
				PressNumber("8");
				break;
			case R.id.number9:
				PressNumber("9");
				break;
			case R.id.number0:
				PressNumber("0");
				break;
			case R.id.operation_plus:
				if (operator.equals("")) {
					operator = "+";
				}
				//checking to see whether operator was hit more than once
				if(operationsTV.getText().length() > 2 && (String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("/")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("*")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("-")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("+")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("^")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("sqrt"))){
					break;
				}else{
					operationsTV.append(" + ");
				}
				//
				if(firstOperand.length() <= 0){
					firstOperand = secondOperand;
					secondOperand = "";
					resultTV.setText("");
				}else if(firstOperand.length() > 0 && secondOperand.length() > 0){
					result = MathHandler.Calculate(firstOperand, secondOperand, operator);
					resultTV.setText(result);
					firstOperand = result;
					secondOperand = "";
				}else{
					break;
				}
				operator = "+";
				break;
			case R.id.operation_minus:
				if (operator.equals("")) {
					operator = "-";
				}
				//checking to see whether operator was hit more than once
				if(operationsTV.getText().length() > 2 && (String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("/")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("*")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("-")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("+")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("^")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("sqrt"))){
					break;
				}else{
					operationsTV.append(" - ");
				}
				//
				if(firstOperand.length() <= 0){
					firstOperand = secondOperand;
					secondOperand = "";
					resultTV.setText("");
				}else if(firstOperand.length() > 0 && secondOperand.length() > 0){
					result = MathHandler.Calculate(firstOperand, secondOperand, operator);
					resultTV.setText(result);
					firstOperand = result;
					secondOperand = "";
				}else{
					break;
				}
				operator = "-";
				break;
			case R.id.operation_mult:
				if (operator.equals("")) {
					operator = "*";
				}
				//checking to see whether operator was hit more than once
				if(operationsTV.getText().length() > 2 && (String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("/")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("*")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("-")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("+")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("^")
						|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("sqrt"))){
					break;
				}else{
					operationsTV.append(" * ");
				}
				//
				if(firstOperand.length() <= 0){
					firstOperand = secondOperand;
					secondOperand = "";
					resultTV.setText("");
				}else if(firstOperand.length() > 0 && secondOperand.length() > 0){
					result = MathHandler.Calculate(firstOperand, secondOperand, operator);
					resultTV.setText(result);
					firstOperand = result;
					secondOperand = "";
				}else{
					break;
				}
				operator = "*";
				break;
			case R.id.operation_div:
				if (operator.equals("")) {
					operator = "/";
				}
				//checking to see whether operator was hit more than once
				if(operationsTV.getText().length() > 2 && (String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("/")
							|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("*")
							|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("-")
							|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("+")
							|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("^")
							|| String.valueOf(operationsTV.getText().charAt(
						operationsTV.getText().length() - 2)).equals("sqrt"))){
					break;
				}else{
					operationsTV.append(" / ");
				}
				//
				if(firstOperand.length() <= 0){
					firstOperand = secondOperand;
					secondOperand = "";
					resultTV.setText("");
				}else if(firstOperand.length() > 0 && secondOperand.length() > 0){
					result = MathHandler.Calculate(firstOperand, secondOperand, operator);
					resultTV.setText(result);
					firstOperand = result;
					secondOperand = "";
				}else{
					break;
				}
				operator = "/";
				break;
			case R.id.operation_sqare:
				if(operator.equals("")){
					operator = "^";
				}
				if(secondOperand.length() > 0){
					result = MathHandler.Calculate(firstOperand, secondOperand, operator);
					firstOperand = result;
					resultTV.setText(result);
					secondOperand = "";
				}else if(result.length() > 0){
					result = MathHandler.Calculate(firstOperand, result, operator);
					resultTV.setText(result);
					firstOperand = result;
					secondOperand = "";
				}
				operator = "^";
				break;
			case R.id.operation_sqrt:

				break;
			case R.id.operation_equals:

				break;
			case R.id.operation_clear:
				firstOperand = "";
				secondOperand = "";
				operator = "";
				result = "";
				resultTV.setText("");
				operationsTV.setText("");
		}
	}

	private void PressNumber(String str){
		secondOperand += str;
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);
		TextView resultTV = (TextView)findViewById(R.id.result_view);
		operationsTV.append(str);
		if(result.length() > 0){
			resultTV.setText("");
			firstOperand = result;
			result = "";
		}
		resultTV.append(str);
	}
}

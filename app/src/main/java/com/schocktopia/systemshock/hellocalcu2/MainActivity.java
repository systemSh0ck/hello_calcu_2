package com.schocktopia.systemshock.hellocalcu2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	NumberButton numButton = new NumberButton();
	OperationButton opButton = new OperationButton();
	Number num = new Number();
	String op = "";
	boolean firstNumber = true;

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
	public void onStop(){
		super.onStop();
	}

	@Override
	public void onDestroy(){
		super.onDestroy();
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
			case R.id.number1:
				pressNumber("1");
				break;
			case R.id.number2:
				pressNumber("2");
				break;
			case R.id.number3:
				pressNumber("3");
				break;
			case R.id.number4:
				pressNumber("4");
				break;
			case R.id.number5:
				pressNumber("5");
				break;
			case R.id.number6:
				pressNumber("6");
				break;
			case R.id.number7:
				pressNumber("7");
				break;
			case R.id.number8:
				pressNumber("8");
				break;
			case R.id.number9:
				pressNumber("9");
				break;
			case R.id.number0:
				pressNumber("0");
				break;
			case R.id.operation_plus:
				pressOperation("+");
				break;
			case R.id.operation_minus:
				pressOperation("-");
				break;
			case R.id.operation_mult:
				pressOperation("*");
				break;
			case R.id.operation_div:
				pressOperation("/");
				break;
			case R.id.operation_sqare:
				pressSquare();
				break;
			case R.id.operation_sqrt:
				//TODO: sqrt
				pressOperation("sqrt");
				break;
			case R.id.operation_equals:
				pressEquals();
				break;
			case R.id.operation_clear:
				pressClear();
				break;
		}
	}

	public void pressNumber(String pressedNumber){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		numButton.writeNumber(operationsTV, pressedNumber);
		if (num.getResult().length() > 0) {
			resultTV.setText(num.getResult());
		} else {
			numButton.writeNumber(resultTV, pressedNumber);
		}
		num.appendNumber(pressedNumber, firstNumber);
	}

	public void pressOperation(String operation){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		/*first-level 'if' -> checks to see if the last button hit is an operation
		*	and skips if true
		*second-level 'if's -> checks to see which operand the user is inputting
		*/
		if (operationsTV.getText().length() > 0 &&
				operationsTV.getText().toString().charAt(
				operationsTV.getText().toString().length() - 1) != ' ') {
			opButton.WriteOperator(operationsTV, operation);
			if(firstNumber){
				resultTV.setText("");
				firstNumber = false;
			}else if (!firstNumber) {
				num.setResult(String.valueOf(opButton.Calculate(
						Double.parseDouble(num.getOperator1()),
						Double.parseDouble(num.getOperator2()),
						op
				)));
				num.setOperator1(num.getResult());
				num.setOperator2("");
				resultTV.setText("");
				resultTV.setText(num.getResult());
			}
		}
		op = operation;
	}

	public void pressClear(){
		num.setResult("");
		num.setOperator1("");
		num.setOperator2("");
		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);
		resultTV.setText("");
		operationsTV.setText("");
		firstNumber = true;
	}

	public void pressEquals(){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		if (operationsTV.getText().toString().charAt(
				operationsTV.getText().toString().length() - 1) != ' ') {
			num.setResult(String.valueOf(
					opButton.Calculate(Double.parseDouble(num.getOperator1()),
							Double.parseDouble(num.getOperator2()),
							op)
			));
			resultTV.setText(num.getResult());
		}
	}

	public void pressSquare(){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		if(firstNumber){
			num.setResult(String.valueOf(
					opButton.CalculateSquare(Double.parseDouble(num.getOperator1()))));
			resultTV.setText(num.getResult());
			operationsTV.append(" ^ ");
			num.setOperator1(num.getResult());
		}else{
			if (num.getResult().length() > 0) {
				num.setOperator2(num.getResult());
				num.setResult(String.valueOf(
						opButton.CalculateSquare(Double.parseDouble(num.getOperator2()))));
				resultTV.setText(num.getResult());
				operationsTV.append(" ^ ");
			}
		}
	}
}

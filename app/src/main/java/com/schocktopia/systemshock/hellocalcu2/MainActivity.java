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
				pressSquare("^");
				break;
			case R.id.operation_sqrt:
				pressSquare("sqrt");
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

		numButton.buildNumber(pressedNumber, num);
		resultTV.setText("");
		numButton.writeNumber(resultTV, num.getResult());
		numButton.writeNumber(operationsTV, pressedNumber);
	}

	public void pressOperation(String operation){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		if (operationsTV.getText().length() > 0 &&
				operationsTV.getText().charAt(
				operationsTV.getText().length() - 1) != ' ') {
			if(opButton.getOp().length() > 0){
				num.setResult(num.calculateNumber(
						num.getNumber(),
						num.getResult(),
						opButton.getOp()
				));
				num.setNumber(num.getResult());
				resultTV.setText(num.getResult());
				num.setResult("");
			}else{
				num.setNumber(num.getResult());
				num.setResult("");
				resultTV.setText("");
			}
			opButton.setOp(operation);

			opButton.writeOperator(operationsTV, operation);
		}
	}

	public void pressSquare(String op){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		if (operationsTV.getText().length() > 0 &&
				operationsTV.getText().charAt(
				operationsTV.getText().length() - 1) != ' ') {
			if(opButton.getOp().length() == 0) {
				num.setResult(num.calculateSquare(num.getResult(), op));
				opButton.setOp("");
			}else{
				pressOperation(opButton.getOp());
				num.setResult(num.calculateSquare(num.getNumber(), op));
				opButton.setOp("");
			}
			resultTV.setText(num.getResult());
		}
	}

	public void pressEquals(){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		if (operationsTV.getText().length() > 0 &&
				operationsTV.getText().charAt(
				operationsTV.getText().length() - 1) != ' ') {
			num.setResult(num.calculateNumber(
					num.getNumber(),
					num.getResult(),
					opButton.getOp()
			));
			num.setNumber(num.getResult());
			resultTV.setText(num.getResult());
			opButton.setOp("");
			operationsTV.setText("");
		}
	}

	public void pressClear(){

		TextView resultTV = (TextView)findViewById(R.id.result_view);
		TextView operationsTV = (TextView)findViewById(R.id.operations_view);

		num.setResult("");
		num.setNumber("");
		resultTV.setText("");
		operationsTV.setText("");
	}
}

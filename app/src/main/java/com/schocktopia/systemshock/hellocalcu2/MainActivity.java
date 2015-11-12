package com.schocktopia.systemshock.hellocalcu2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


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
				break;
			case R.id.number2:
				break;
			case R.id.number3:
				break;
			case R.id.number4:
				break;
			case R.id.number5:
				break;
			case R.id.number6:
				break;
			case R.id.number7:
				break;
			case R.id.number8:
				break;
			case R.id.number9:
				break;
			case R.id.number0:
				break;
			case R.id.operation_plus:
				break;
			case R.id.operation_minus:
				break;
			case R.id.operation_mult:
				break;
			case R.id.operation_div:
				break;
			case R.id.operation_sqare:
				break;
			case R.id.operation_sqrt:
				break;
			case R.id.operation_equals:
				break;
			case R.id.operation_clear:
				break;
		}
	}
}

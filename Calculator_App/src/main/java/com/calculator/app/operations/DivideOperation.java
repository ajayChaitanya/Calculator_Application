package com.calculator.app.operations;

import com.calculator.app.operations.Operations;

public class DivideOperation implements Operations {

	private double no1;
	private double no2;

	public DivideOperation(double no1, double no2) {
		this.no1 = no1;
		this.no2 = no2;
	}

	public double getResult() {

		if (no2 == 0)
			try {
				throw new Exception("Divide By Zero Error");
			} catch (Exception e) {
				System.out.println("Divide By Zero Error");
				System.exit(0);
			}
		return no1 / no2;
	}

}

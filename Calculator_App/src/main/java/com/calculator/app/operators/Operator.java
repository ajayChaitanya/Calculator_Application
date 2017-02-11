package com.calculator.app.operators;

import com.calculator.app.util.Priority;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operator {

	// Priority should be either 1 or 2

	PLUS('+', Priority.LOW_PRIORITY), MINUS('-', Priority.LOW_PRIORITY), DIVIDE(
			'/', Priority.HIGH_PRIORITY), MULTIPLY('*', Priority.HIGH_PRIORITY), MODULO(
			'%', Priority.HIGH_PRIORITY), DOLLAR('$', Priority.HIGH_PRIORITY); // User
																				// Defined
																				// Operation

	public Character sign;
	public int priority;
	private static final List<String> operators;

	static {
		operators = Stream.of(values()).map(Operator::getSign)
				.collect(Collectors.toList());

	}

	Operator(Character sign, int priority) {
		this.sign = sign;
		this.priority = priority;
	}

	public static List<String> getValues() {
		return Collections.unmodifiableList(operators);
	}

	private String getSign() {
		return Character.toString(sign);
	}
}
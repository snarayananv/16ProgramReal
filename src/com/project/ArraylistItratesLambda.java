package com.project;

import java.util.ArrayList;

public class ArraylistItratesLambda {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Samsung");
		a.add("Lenovo");
		System.out.println("ArrayList: " );
		a.forEach((e) -> {
			System.out.print(e + ",");
		});
	}
}

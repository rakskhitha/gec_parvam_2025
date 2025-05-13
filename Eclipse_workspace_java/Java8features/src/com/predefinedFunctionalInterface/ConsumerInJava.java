package com.predefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInJava {
	public static void main(String[] args) {
		/*
		 * consumer:
		 * =========
		 * it will consume the value but won't return anything
		 * */
		Consumer<String> c = (s)->System.out.println(s);
		c.accept("Hello world");
	}
}

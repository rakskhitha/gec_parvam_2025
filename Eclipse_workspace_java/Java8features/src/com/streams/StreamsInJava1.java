package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,13,45,23,67,56);
		Stream<Integer> stream =  list.stream().filter(x->x>10);
		Long res = stream.count();
		System.out.println(res);
		List<Integer> result = stream.collect(Collectors.toList());// we cannot re use it
		System.out.println(result);
		
		Long res1 =stream.count();
		System.out.println(res1);
		
	}
}

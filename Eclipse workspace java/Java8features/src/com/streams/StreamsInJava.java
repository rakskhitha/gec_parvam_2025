package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(34);
		list.add(67);
		list.add(78);
		//1. i need to filter based on the odd numbers and generate a list
//		Stream<Integer> stream=list.stream();
//		List<Integer> numnbers = stream.filter((i)->i%2!=0).collect(Collectors.toList());
//		System.out.println(numnbers);
		List<Integer> numnbers = list.stream().filter((i)->i%2!=0).collect(Collectors.toList());
		System.out.println(numnbers);
	}
}

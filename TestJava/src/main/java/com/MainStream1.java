package main.java.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.out.println("Hello");
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

		listOfIntegers.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				/*.forEach((k,v) -> {
					System.out.printf("Key ::"+k+" Values ::"+v);
				}); */
		String str = "swiss";
		Map.Entry<Character, Long> characterLongEntry = str.chars()
				.mapToObj(value -> (char) value)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				//.forEach((k,v) -> {
				//	System.out.println("Key "+k+" Value "+v);
				//});
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.findFirst()
				.get();
		//.findFirst()
				//.forEach(entry -> {
				//	System.out.println("Key "+entry.getKey()+" value "+entry.getValue());
				//});
		//System.out.println(characterLongEntry.getKey()+" "+characterLongEntry.getValue());

		//How do you remove duplicate elements from a list using Java 8 streams?

		List<String> listString = List.of("A","B","C","D","E","J","A","B","C","D");
		listString.stream()
				.distinct()
				.collect(Collectors.toList())
				.forEach(s->System.out.println(s));

		System.out.println("========================================");

		listString.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() >1)
				.forEach(entry -> System.out.println(entry.getKey()+":::"+entry.getValue()));

		System.out.println("=================================How do you sort the given list of decimals in reverse order====================================");
		// How do you sort the given list of decimals in reverse order?

		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimalList.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
		
		
	}

}

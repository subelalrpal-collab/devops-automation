package main.java.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		listOfIntegers
		.stream()
		.collect(Collectors.partitioningBy(num ->num%2 == 0))
		.forEach((k,v) -> {
			if(k) {
				System.out.println("This is the even number ::"+v);
			}else {
				System.out.println("This is the odd number ::"+v);
			}
		});
		System.out.println("=====================================================================================================");
		//Frequency of each character in string 
		String str = "This is from my ex employee from capgemini ";
		
		Map<Character, Long> frequencyOfChar = str.replace("\\s", "").chars()
		.mapToObj(value-> (char)value)
		.collect(Collectors
				.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(frequencyOfChar);
		System.out.println("======================================================================================================");
		
		//remove duplicate from given string 
		List<String> listOfString = List.of("subelal","ABC","CDE","EFG","EKS","ABC","CDE","AAA","AAA","DAG","DAG");
		
		List<String> distinctString = listOfString
		.stream()
		.distinct()
		.toList();
		
		System.out.println(distinctString);
		
		System.out.println("========================================================================================================");
		
		// find duplicate String  in the given list of String 
		
		Map<String, Long> stringValueisGreaterThan1 = listOfString
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry -> entry.getValue()>1)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(stringValueisGreaterThan1);
		
		System.out.println("============================================================================");
		
		
	}

}

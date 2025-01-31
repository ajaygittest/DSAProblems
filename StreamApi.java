package Sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
class employee{
	
	public String name;
	public int salary;
	
	public employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
}
public class StreamApi {
	
	
	public static void main(String args[]) {
		
		stream();
	}
	
	public static void stream() {
		 List < Integer > nums = Arrays.asList(2,2,2,2);
		 //average value finds
		 double value=nums.stream().mapToDouble(Integer::intValue).average().orElse(0);
		// System.out.println(value);
		  List < String > colors = Arrays.asList("BED", "BrEEn", "white", "Orange", "pink");
		  
		  List < String > result=colors.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		  
		  
		  //System.out.println(result);
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		  
		  int oddSum=numbers.stream().filter(c->c%2!=0).mapToInt(Integer::intValue).sum();
		  int evenSum=numbers.stream().filter(c->c%2==0).mapToInt(Integer::intValue).sum();
		  	 // System.out.println(oddSum+" | "+evenSum);
		  
		  List < Integer > number = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		  
		  List < Integer > finals = number.stream().distinct().collect(Collectors.toList());
		  
		 // System.out.println(finals);
		  
		long count=  colors.stream().filter(f->f.startsWith("B")).count();
		
		List<String> val=colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//System.out.println(val);
		
		//System.out.println(count);
		
		int max = numbers.stream().min(Integer::compare).orElseGet(null);
		//System.out.println(max);
		int secondLarger=numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(0);
		
		int large=numbers.stream().sorted((a,b)->Integer.compare(b, a)).skip(1).findFirst().orElse(null);
		System.out.println(large);
		 List<String> words = Arrays.asList("apple", "baa", "apple", "orangewwwwww", "banana", "apple");
		Map<Object, Long> map=words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		String word =words.stream().min(Comparator.comparingInt(String::length)).get();
		//System.out.println(word);44
		
	List<Integer> va=number.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream()
	.filter(f->f.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		
	
	//System.out.println(va);
	List<String> names = Arrays.asList("john", "paul", "george", "ringo");
	
	String gh=names.stream().map(String::toLowerCase).collect(Collectors.joining(","));
	//System.out.println(gh);
	
	//partionedBy
	Map<Boolean, List<Integer>> even=number.stream().collect(Collectors.partitioningBy(n->n%2==0));
	

	System.out.println(	even.get(false));
	
	List<employee> project= Arrays.asList(new employee("ajay",12000),
			new employee("raja",18000),
			new employee("kumar",50000),
			new employee("killer",70000));
	
	List<employee> dd=project.stream().filter(f->f.salary>50000).collect(Collectors.toList());
	//System.out.println(d);
	 String input = "swiss";
	 Character firstNonRepeating = input.chars()
     .mapToObj(c -> (char) c)
     .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
     .entrySet().stream()
     .filter(entry -> entry.getValue() == 1)
     .map(Map.Entry::getKey).skip(1)
     .findFirst().orElse(null);
	 
	 System.out.println(firstNonRepeating);
	 
	}

}

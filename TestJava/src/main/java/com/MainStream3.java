package main.java.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Student {
	private String name;
	private int id;
	private String subject;
	private double percentage;
	public Student(String name, int id, String subject, double percentage) {
		super();
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.percentage = percentage;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subject=" + subject + ", percentage=" + percentage + "]";
	}
	
	
}
public class MainStream3 {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
        
		studentList.add(new Student("Paul", 11, "Economics", 78.9));
		studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student("Harish", 13, "History", 83.7));
		studentList.add(new Student("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student("Soumya", 15, "Economics", 77.5));
		studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
		studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
		studentList.add(new Student("Mitshu", 18, "History", 73.5));
		studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
		studentList.add(new Student("Harry", 20, "History", 71.9));
		
		
		// Collecting top 3 performing students into List
		
		/*
		 * List<Student> top3Student = studentList .stream()
		 * .sorted(Comparator.comparingDouble(Student::getPercentage)) .limit(3)
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(top3Student);
		 */
		
		// Collecting subjects offered into Set.
		/*
		 * Set<String> distinctSubject = studentList .stream() .map(Student::getSubject)
		 * .collect(Collectors.toSet());
		 * 
		 * System.out.println(distinctSubject);
		 */
		
		
		//  Collecting name and percentage of each student into a Map
		
		/*
		 * Map<String, Double> studentNameAndPercent = studentList .stream()
		 * .collect(Collectors.toMap(Student::getName, Student::getPercentage));
		 * 
		 * System.out.println(studentNameAndPercent);
		 */
		
		//  Collecting first 3 students into LinkedList
		/*
		 * LinkedList<Student> top3StudentIntoLinkedList = studentList .stream()
		 * .limit(3) .collect(Collectors.toCollection(LinkedList::new));
		 * 
		 * System.out.println(top3StudentIntoLinkedList);
		 */
		
		//studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));
		
		// Collecting the names of all students joined as a string
		
		/*
		 * String namewithJoining = studentList .stream() .map(Student::getName)
		 * .collect(Collectors.joining(","));
		 * 
		 * System.out.println(namewithJoining);
		 */
		
		//  Collecting highest percentage.
		/*
		 * Optional<Student> max = studentList .stream()
		 * .max(Comparator.comparingDouble(s-> s.getPercentage()));
		 * 
		 * System.out.println(max.get());
		 */
		
		//  Collecting lowest percentage.
		Optional<Student> min = studentList.stream().min(Comparator.comparingDouble(s->s.getPercentage()));
		
		System.out.println(min.get());
	}

}

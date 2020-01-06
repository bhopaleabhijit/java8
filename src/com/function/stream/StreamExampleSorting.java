package com.function.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.funtion.model.Person;

public class StreamExampleSorting {
public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "John", 28, "IT", 5000));
		persons.add(new Person(2, "David", 23, "Account", 15000));
		persons.add(new Person(3, "Sam", 25, "Admin", 55000));
		persons.add(new Person(4, "Richard", 27, "IT", 16000));
		persons.add(new Person(5, "Travis", 20, "IT", 50000));
		persons.add(new Person(6, "Sharlin", 25, "Admin", 6000));
		persons.add(new Person(7, "Joy", 38, "IT", 7000));
		persons.add(new Person(8, "Mac", 58, "Account", 8000));
		persons.add(new Person(9, "Kevin", 36, "IT", 9000));
		persons.add(new Person(10, "Roy", 38, "HR", 10000));
		persons.add(new Person(11, "Sheldon", 68, "HR", 11000));
		persons.add(new Person(12, "Merry", 18, "IT", 12000));
		persons.add(new Person(13, "Lio", 33, "Admin", 13000));
		persons.add(new Person(14, "Gilfoy", 66, "IT", 15000));
		persons.add(new Person(15, "Henry", 19, "HR", 99000));
		
		System.out.println(persons);
		System.out.println("================================================");
		List<Person> sortedBySalary =persons.stream().sorted(Comparator.comparing(Person::getSalary)).collect(Collectors.toList());
		
		sortedBySalary.forEach(System.out::println);
		
		
}
}

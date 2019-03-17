package com.assignment.oflambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Student {
	String name;
	int marks;

	Student(String name, int marks) {

		this.name = name;
		this.marks = marks;
	}

	public static void average(List<Student> list) {
		OptionalDouble li = list.stream().mapToInt(list1 -> list1.marks).average();
		System.out.println(li.getAsDouble());
	}
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("govind", 99));
		students.add(new Student("rahul", 86));
		students.add(new Student("arjun", 92));
		students.add(new Student("nitish", 98));

		Student.average(students);
	}

}

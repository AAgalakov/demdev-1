package homework6.model;

import java.util.List;

public class Student {

	private final String name;
	private final String surname;
	private int numberOfCourse;
	private List<Integer> marks;

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Student(String name, String surname, int numberOfCourse, List<Integer> marks) {
		this.name = name;
		this.surname = surname;
		this.numberOfCourse = numberOfCourse;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getNumberOfCourse() {
		return numberOfCourse;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", numberOfCourse="
			+ numberOfCourse + ", marks=" + marks + '}';
	}
}

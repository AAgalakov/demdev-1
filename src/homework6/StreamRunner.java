package homework6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class StreamRunner {

	public static void main(String[] args) {
		List<Student> students = chat();
		taskOne(students).forEach((integer, aDouble) -> System.out.println(integer + " - > " + aDouble));
		System.out.println();
		taskOneSecond(students).forEach((integer, aDouble) -> System.out.println(integer + " - > " + aDouble));
		System.out.println();
		taskTwo(students).forEach((integer, students1) -> System.out.println(integer + " -> " + students1));
		System.out.println();
		taskTwoTwo(students).forEach((integer, students1) -> System.out.println(integer + " -> " + students1));
		System.out.println();
		taskThree(students).forEach((integer, students1) -> System.out.println(integer + " -> " + students1));
	}

	private static List<Student> chat() {
		return Arrays.asList(new Student("Иван", "Иванов", 1, Arrays.asList(5, 4, 3, 4)),
							 new Student("Петр", "Петров", 2, Arrays.asList(4, 5, 5, 4)),
							 new Student("Анна", "Смирнова", 1, Arrays.asList(3, 4, 5, 5)),
							 new Student("Ольга", "Сидорова", 2, Arrays.asList(4, 3, 4, 3)),
							 new Student("Сергей", "Сергеев", 3, Arrays.asList(5, 5, 5, 5)),
							 new Student("Мария", "Марьина", 3, Arrays.asList(4, 4, 4, 4)));
	}

	private static Map<Integer, Double> taskOne(List<Student> students) {
		return students.stream().filter(student -> student.getMarks().size() > 3)
			.collect(groupingBy(Student::getNumberOfCourse)).entrySet().stream().collect(
				Collectors.toMap(Map.Entry::getKey, integerListEntry -> integerListEntry.getValue().stream()
					.flatMap(student -> student.getMarks().stream()).mapToInt(Integer::intValue).summaryStatistics()
					.getAverage()));
	}

	private static Map<Integer, Double> taskOneSecond(List<Student> students) {
		return students.stream().filter(student -> student.getMarks().size() > 3).collect(
			groupingBy(Student::getNumberOfCourse, Collectors.averagingDouble(
				student -> student.getMarks().stream().mapToDouble(Integer::doubleValue).summaryStatistics()
					.getAverage())));
	}

	private static Map<Integer, List<String>> taskTwo(List<Student> students) {

		return students.stream().collect(groupingBy(Student::getNumberOfCourse)).entrySet().stream().collect(
			Collectors.toMap(Map.Entry::getKey, integerListEntry -> integerListEntry.getValue().stream()
				.map(student -> student.getName() + " " + student.getSurname()).sorted().collect(Collectors.toList())));
	}

	private static Map<Integer, List<String>> taskTwoTwo(List<Student> students) {

		return students.stream().sorted(Comparator.comparing(Student::getName)).collect(
			groupingBy(Student::getNumberOfCourse,
					   mapping(student -> student.getName() + " " + student.getSurname(), toList())));
	}

	private static Map<Integer, Result> taskThree(List<Student> students) {

		return students.stream().collect(groupingBy(Student::getNumberOfCourse)).entrySet().stream()
			.collect(toMap(Map.Entry::getKey, integerListEntry -> new Result(integerListEntry.getValue())));
	}
}

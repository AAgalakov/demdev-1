package homework6;

import java.util.List;
import java.util.stream.Collectors;

public class Result {

	private final List<Student> students;
	private final Double average;

	public Result(List<Student> students) {
		this.students = students.stream()
			.map(student -> new Student(student.getName(), student.getSurname()))
			.collect(Collectors.toList());
		this.average = students.stream().flatMap(student -> student.getMarks().stream()).mapToDouble(Integer::doubleValue).summaryStatistics().getAverage();
	}

	public Result(List<Student> students, Double average) {
		this.students = students;
		this.average = average;
	}

	public List<Student> getStudents() {
		return students;
	}

	public Double getAverage() {
		return average;
	}

	@Override
	public String toString() {
		return "Result{" + "students=" + students + ", average=" + average + '}';
	}
}

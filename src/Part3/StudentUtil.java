package Part3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public final class StudentUtil {
    public static StudentUtil INSTANCE = new StudentUtil();

    private StudentUtil() {
    }

    public static StudentUtil getInstance() {
        return INSTANCE;
    }

    public Map<Integer, Double> getAverageMarks(List<Student> students) {
        return students.stream().filter(student -> student.getMarks().size() > 0)
                .collect(Collectors.groupingBy(
                        student -> student.getCourse(),
                        Collectors.averagingDouble(student -> student.getMarks().stream().collect(Collectors.averagingDouble(mark -> (double) mark)))));
    }

    public Map<Integer, TreeSet<Student>> getStudents(List<Student> students) {
        return students.stream()
                .map(student -> new Student(student.getName(), student.getSurname(), student.getCourse()))
                .collect(Collectors.groupingBy(
                        student -> student.getCourse(),
                        Collectors.toCollection(() ->
                                new TreeSet<Student>(Comparator.comparing(
                                        student -> student.getName() + student.getSurname())))));
    }
}

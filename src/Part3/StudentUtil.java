package Part3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
                        Student::getCourse,
                        Collectors.averagingDouble(student -> student.getMarks().stream().collect(Collectors.averagingDouble(mark -> (double) mark)))));
    }

    public Map<Integer, List<Student>> getStudents(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(student -> student.getName() + student.getSurname()))
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                        Collectors.toList()));
    }

    public Map<Integer, List<StudentIdentity>> getStudentsIdentities(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(student -> student.getName() + student.getSurname()))
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                                Collectors.collectingAndThen(Collectors.toList(),
                                        this::studentsListToStudentIdentityList
                                )
                        )
                );

    }

    public Map<Integer, List<StudentIdentity>> getStudentsIdentities2(List<Student> students) {
         return students.stream()
                .sorted(Comparator.comparing(student -> student.getName() + student.getSurname()))
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.mapping(student -> new StudentIdentity(student.getName(), student.getSurname()), Collectors.toList())));

    }

    public Map<Integer, StudentStatistic> getStudentsStatistic(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(student -> student.getName() + student.getSurname()))
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                                Collectors.collectingAndThen(Collectors.toList(),
                                         (List<Student> list) -> {
                                            List<StudentIdentity> studentIdentityList = list.stream().map(
                                                    student -> new StudentIdentity(student.getName(), student.getSurname())
                                            ).collect(Collectors.toList());
                                    double avrMark = list.stream().flatMap(student -> student.getMarks().stream())
                                            .collect(Collectors.averagingDouble(Mark->Mark));
                                    return new StudentStatistic(studentIdentityList, avrMark);
                                        }
                                )
                        )
                );
    }

    private List<StudentIdentity> studentsListToStudentIdentityList(List<Student> students) {
        List<StudentIdentity> studentIdentities = new ArrayList<>();
        for (Student student : students
        ) {
            studentIdentities.add(new StudentIdentity(student.getName(), student.getSurname()));
        }
        return studentIdentities;
    }



}




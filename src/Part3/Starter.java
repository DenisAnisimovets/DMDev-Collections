package Part3;

import java.util.ArrayList;
import java.util.List;


public class Starter {



    public static void main(String[] args) {
        StudentUtil studentUtil = StudentUtil.getInstance();

        List<Student> studentList = List.of(
                new Student("Ivan6", "Ivanov3", 1, new ArrayList<>(List.of(3, 5, 5, 3))),
                new Student("Ivan6", "Ivanov2", 1, new ArrayList<>(List.of(4, 4, 5, 3))),
                new Student("Ivan3", "Ivanov3", 2, new ArrayList<>(List.of(1, 5, 5, 3))),
                new Student("Ivan4", "Ivanov4", 2, new ArrayList<>(List.of(3, 3, 3, 3))),
                new Student("Ivan5", "Ivanov5", 1, new ArrayList<>(List.of(2, 5, 3, 3)))
        );

        System.out.println(studentUtil.getAverageMarks(studentList));
        System.out.println();
        System.out.println(studentUtil.getStudents(studentList));
        System.out.println();
        System.out.println();

    }
}


package Part3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    String name;
    String surname;
    int course;
    List<Integer> marks;

    public Student(String name, String surname, int course, List<Integer> marks) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.marks = marks;
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}

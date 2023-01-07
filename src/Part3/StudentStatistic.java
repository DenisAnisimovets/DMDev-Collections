package Part3;

import java.util.List;

public class StudentStatistic {
    List<StudentIdentity> studentList;
    double mark;

    public StudentStatistic(List<StudentIdentity> studentList, double mark) {
        this.studentList = studentList;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "StudentStatistic{" +
                "studentList=" + studentList +
                ", mark=" + mark +
                '}';
    }

    public List<StudentIdentity> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentIdentity> studentList) {
        this.studentList = studentList;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}

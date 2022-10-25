package com.project.xml;
import java.util.List;

public class Class {

    public Class() {}

    public Class(int _number, String _section, String _classroom, List<Student> _students) {
        number = _number;
        section = _section;
        classroom = _classroom;
        students = _students;
    }

    private int number;
    private String section;
    private String classroom;
    private List<Student> students;

    public void setNumber(int _number) { number = _number; }
    public void setSection(String _section) { section = _section; }
    public void setClassroom(String _classroom) { classroom = _classroom; }
    public void setStudents(List<Student> _students) { students = _students; }

    public int getNumber() { return number; }
    public String getSection() { return section; }
    public String getClassroom() { return classroom; }
    public List<Student> getStudents() { return students; }
}

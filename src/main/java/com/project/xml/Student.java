package com.project.xml;

import java.util.Date;

class Student {

    public Student() {}
    
    public Student(String _name, String _surname, Date _birth) {
        name = _name;
        surname = _surname;
        birth = _birth;
    }

    private String name;
    private String surname;
    private Date birth;

    public void setName(String _name) { name = _name; }
    public void setSurname(String _surname) { surname = _surname; }
    public void setDate(Date _birth) { birth = _birth; }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public Date getDate() { return birth; }
}

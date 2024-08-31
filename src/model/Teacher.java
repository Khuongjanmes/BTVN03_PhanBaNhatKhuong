package model;

public class Teacher {
    String ID;
    String nameTeacher;
    String major;
    int age;

    public Teacher(String ID, String nameTeacher, String major, int age) {
        this.ID = ID;
        this.nameTeacher = nameTeacher;
        this.major = major;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ID='" + ID + '\'' +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", major='" + major + '\'' +
                ", age=" + age +
                '}';
    }
}
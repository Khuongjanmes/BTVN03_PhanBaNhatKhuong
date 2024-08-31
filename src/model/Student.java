package model;

public class Student {
    String ID;
    String nameStudent;
    String dob;
    String Lop;
    int weight;
    int height;
    int age;

    public Student(String ID, String nameStudent, String dob, String Lop, int age) {
        this.ID = ID;
        this.nameStudent = nameStudent;
        this.dob = dob;
        this.Lop = Lop;
        this.age = age;
    }

    public Student(int weight, int height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        this.Lop = lop;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", dob='" + dob + '\'' +
                ", lop='" + Lop + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public String printValue(int age){
        return "Tuoi la " + this.age;
    }
    public String printValue(int age, String name){
        return name + ":" + age;
    }
}







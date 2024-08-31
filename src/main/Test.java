package main;

import model.Student;

public class Test {
    public static void main(String[] args) {
        Student khuong = new Student("DE190572","Quyen","29112005", "SE19B02", 19 );
        Student khuong1 = new Student(57,165,19);

        khuong.setID("DE190366");
        System.out.println(khuong.getID());

        khuong.setNameStudent("Phan Ba Nhat Khuong");
        System.out.println(khuong.getNameStudent());

        khuong.setDob("20072005");
        System.out.println(khuong.getDob());

        khuong.setLop("SE19B04");
        System.out.println(khuong.getLop());

        khuong.setWeight(58);
        System.out.println(khuong.getWeight());

        khuong.setHeight(166);
        System.out.println(khuong.getHeight());

        khuong.setAge(18);
        System.out.println(khuong.getAge());

        System.out.println(ChucNang.calculateBMIOfStudent(166, 58));

        System.out.println(khuong1.printValue(khuong1.getAge()));

        System.out.println(khuong.printValue(khuong.getAge(),khuong.getNameStudent()));
    }
}

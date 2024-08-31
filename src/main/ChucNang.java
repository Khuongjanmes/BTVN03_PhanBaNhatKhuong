package main;

public class ChucNang {
    public static int parseStringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static int calculateBMIOfStudent(int height, int weight) {
        double heightInMeters = height / 100.0;
        return (int) (weight / (heightInMeters * heightInMeters));
    }
}

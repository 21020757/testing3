import java.util.Scanner;

public class Main {
    public static String BMICategory(double w, double h) {
        if ((w < 10 || w > 500) || (h < 0.5 || h > 2.60)) {
            return "Input error";
        }
        String res;
        double bmi;
        bmi = (w) / Math.pow(h, 2);
        if (bmi < 18.5) {
            res = "Underweight";
        } else if (bmi < 25) {
            res = "Normal";
        } else if (bmi < 30) {
            res = "Overweight";
        } else if (bmi < 35) {
            res = "Obese";
        } else if (bmi < 40) {
            res = "Severely Obese";
        } else {
            res = "Morbidly Obese";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height;
        System.out.println("Enter your weight(kg): ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height(m): ");
        height = scanner.nextDouble();

        String res = BMICategory(weight, height);
        System.out.println(res);
    }
}
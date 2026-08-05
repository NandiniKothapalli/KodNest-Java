
public class SI_BIM_MARKS {

    public static void main(String[] args) {
        double Principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        double simpleinterest = Principal * rate * time / 100.0;
        System.out.println("Simple Interest: " + simpleinterest);
        double ta = Principal + simpleinterest;
        double bmi = weight / (height * height);
        int m1 = 78;
        int m2 = 84;
        int m3 = 69;
        int m4 = 91;
        int m5 = 88;
        int totalmarks = m1 + m2 + m3 + m4 + m5;
        float persentage = totalmarks * 100 / 500;
        System.out.println("Total Amount: " + ta);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage: " + persentage);

        // write your code here
    }
}

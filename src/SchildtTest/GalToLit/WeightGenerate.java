package SchildtTest.GalToLit;


import java.util.Scanner;

@SuppressWarnings("ALL")
public class WeightGenerate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();
        getWeight(weight);
        System.out.println("Your weight on the Moon are: " + getWeight(weight));


    }

    private static double getWeight(double weight) {
        double earthWeight = weight * 0.17;
        return earthWeight;
    }


}

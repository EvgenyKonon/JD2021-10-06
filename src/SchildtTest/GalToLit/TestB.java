package SchildtTest.GalToLit;

public class TestB {
    public static void main(String[] args) {
        int count = 0;
        for (double gallons = 1; gallons <100; gallons++) {
            double liters = gallons * 3.7854;
            System.out.println(gallons + " gallons are equal " + liters + " L");
            count++;
            if(count == 10){
                System.out.println();
                count=0;
            }

        }
    }
}

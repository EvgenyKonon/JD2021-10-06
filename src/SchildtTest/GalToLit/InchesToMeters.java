package SchildtTest.GalToLit;

public class InchesToMeters {

    public static void main(String[] args) {
        int count = 0;
        for (double inches = 1; inches < 144; inches++) {
            double inchToMeter = inches / 39.37;
            System.out.println(" In " + inches + " inches " + inchToMeter + " meters ");
            count++;
            if (count == 12) {
                System.out.println();
                count = 0;
            }


        }

    }
}

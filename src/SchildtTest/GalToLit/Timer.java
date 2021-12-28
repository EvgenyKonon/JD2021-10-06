package SchildtTest.GalToLit;

import java.util.Scanner;


public class Timer extends Thread {
    public static void main(String[] args) {
        int seconds;
        int minutes;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the counter time please: (minutes) ");
        minutes = sc.nextInt();
        System.out.println("Enter the counter time please: (seconds) ");
        seconds = sc.nextInt();
        System.out.println("Timer started with " + minutes + " mins " + seconds + " sec");
        for (; ; ) {

            while (seconds > 0) {
                System.out.println(seconds + " sec left");
                try {
                    //noinspection BusyWait
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                seconds--;
                if (seconds == 0 && minutes > 0) {
                    minutes--;
                    seconds = 60;
                    System.out.println(minutes + " min " + seconds + " sec left");
                    seconds--;
                } else if (minutes == 0 && seconds == 0) {
                    System.out.println("Countdown ended!");
                    System.exit(0);
                }
            }
        }
    }
}


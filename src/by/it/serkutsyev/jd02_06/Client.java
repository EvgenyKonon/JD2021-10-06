package by.it.serkutsyev.jd02_06;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {

                Log logger = Logger.getLogger();
                logger.error("error found");
                logger.info("info found");
            }).start();

    }
}
}
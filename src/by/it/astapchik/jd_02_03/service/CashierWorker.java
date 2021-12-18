package by.it.astapchik.jd_02_03.service;

import by.it.astapchik.jd_02_03.entity.Cashier;
import by.it.astapchik.jd_02_03.entity.Customer;
import by.it.astapchik.jd_02_03.entity.Store;
import by.it.astapchik.jd_02_03.helper.GenerateRandomNumbers;
import by.it.astapchik.jd_02_03.helper.Timeout;

public class CashierWorker implements Runnable{

    private final Cashier cashier;
    private final Store store;

    public CashierWorker(Cashier cashier, Store store) {
        this.cashier = cashier;
        this.store = store;
    }


    @Override
    public void run() {
        System.out.println(cashier+ " is in Progress.");
        while (!store.getManager().isClosedStore()){
            Customer customer = store.getQueue().extract();
            if (customer != null) {
                synchronized (customer.getMonitor()){
                    System.out.println(cashier+ " is working.");
                    int timeout = GenerateRandomNumbers.get(2000, 5000);
                    Timeout.sleep(timeout);
                    System.out.println(cashier+ " is To Do Service.");
                    customer.setFlagWait(false);
                    customer.getMonitor().notify();
                }
            } else {
                Object monitor = CashierWorker.class;
                synchronized (monitor) {
                    try {
                        monitor.wait(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(cashier+ " is finished.");
    }
}

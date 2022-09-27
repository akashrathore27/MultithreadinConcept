package org.example;

//creating our thread using runnable interface
public class ThreadDemoUsingRunnable implements Runnable{


    @Override
    public void run()
    {

        //task for thread
        for (int i = 1; i <=3 ; i++) {

            System.out.println("value of i is "+i);
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            try {
//
////            Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
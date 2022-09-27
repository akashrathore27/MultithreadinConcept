package org.example;

public class ThreadDemoUsingExtendThread extends  Thread{


    public void run()
    {
        for (int i = 3; i>=1 ; i--)
        {
            System.out.println("value of i descending order "+i
            );
            try {
                Thread.sleep(2000);
                wait(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}

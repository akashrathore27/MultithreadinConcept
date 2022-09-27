package org.example;

public class ThreadOperation
{
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program started");
        int x=10+20;
        System.out.println("sum is: "+x);



        Thread th=Thread.currentThread();
        String threadName=th.getName();
        System.out.println("Current running thread is "+threadName);

        //how we can set the name of thread
        th.setName("My Thread");

        //getName method give the name of Thread
        System.out.println("New Thread name is :"+th.getName());


//        Thread.sleep(2000);




        //it give the id of the threa
        System.out.println(th.getId());


        //wait for a thread to end
//        th.join()



        System.out.println("Program ended");
        System.out.println("Second thread is started");
        ThreadDemoUsingExtendThread threadDemoUsingExtendThread=new ThreadDemoUsingExtendThread();
        threadDemoUsingExtendThread.start();

        System.out.println("New Thread name is :"+threadDemoUsingExtendThread.getName());
        System.out.println(threadDemoUsingExtendThread.getId());

    }
}

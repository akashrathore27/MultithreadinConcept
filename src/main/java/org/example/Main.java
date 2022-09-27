package org.example;

import org.example.company.Company;
import org.example.company.Consumer;
import org.example.company.Producer;

public class Main {
    public static void main(String[] args) {

        Company company=new Company();
        Producer producer=new Producer(company);
        producer.start();

        Consumer consumer=new Consumer(company);
        consumer.start();





//        ThreadDemoUsingRunnable threadDemo=new ThreadDemoUsingRunnable();
//        Thread th=new Thread(threadDemo);
////        th.join(2000);
//        th.start();
//        ThreadDemoUsingExtendThread threadDemoUsingExtendThread=new ThreadDemoUsingExtendThread();
//        threadDemoUsingExtendThread.start();

     }
}
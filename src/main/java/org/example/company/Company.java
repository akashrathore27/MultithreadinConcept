package org.example.company;

public class Company
{
    int n;
   static boolean f=false;

    //f=false so this time to chance for Producer
    //f=true so this time to chance for Consumer

    synchronized public void produce_item(int n) throws InterruptedException {
       if(f)
       {
           //wait is used for pause the current thread
           wait();
       }
        this.n=n;
        System.out.println("Produced Completed: "+this.n);
        f=true;

        //give the notification for another thread
        notify();
        System.out.println("Now Consumer Your turn");
    }
    synchronized public int consume_item() throws InterruptedException {
        if(!f)
        {
            wait();
        }

        System.out.println("Consumed Completed "+this.n);
        f=false;
        notify();
        System.out.println("Now Producer Your turn");
        return this.n;
    }
}

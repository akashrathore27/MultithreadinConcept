package org.example.company;

public class Producer extends Thread{

    Company company;
    public Producer(Company company)
    {
       this.company=company;
    }
    public void run()
    {
        int i=1;

        while (true)
        {

            try {
                this.company.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //it is always run whether exception is occured or not

                i++;

        }
    }
}

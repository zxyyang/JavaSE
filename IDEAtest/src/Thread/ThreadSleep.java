package Thread;

public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10 ; i++)
        {

            System.out.println(getName()+":"+i);
            //sleep 等待
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

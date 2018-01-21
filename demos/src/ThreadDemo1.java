import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo1 {

    AtomicInteger sharedOutput = new AtomicInteger(0);

    public static void main(String args[]) throws InterruptedException {

    	ThreadDemo1 t = new ThreadDemo1();

        ThreadTasks t1 = t.new ThreadTasks(0);
        ThreadTasks t2 = t.new ThreadTasks(1);
        ThreadTasks t3 = t.new ThreadTasks(2);
        t1.start();
        t2.start();
        t3.start();
        /*t1.join();
        t2.join();
        t3.join();*/
        

    }

    private class ThreadTasks extends Thread {

          int threadPosition;


        public ThreadTasks(int threadPosition) {
            super();

            this.threadPosition = threadPosition;
        }

        @Override
         public void run() {

            while (sharedOutput.get() < 10) {

                if (sharedOutput.get() % 3 == this.threadPosition) {
                	int value = this.threadPosition + 1;
                	if(value<10)
                    System.out.println("Printing output for Thread: "
                            + this.threadPosition + "  "
                            + value);
                    sharedOutput.incrementAndGet();
                }
            }

        }
    }

}
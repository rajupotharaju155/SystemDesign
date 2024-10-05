package thread_safety_example;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCounter {
    AtomicInteger count = new AtomicInteger();
    // HashMap<Integer, Integer> log = new HashMap<>();
    void  increment(){count.incrementAndGet();}
    int getCount() {return count.get();}
    public static void main(String[] args)  throws Exception{
        LocalDateTime startTime = LocalDateTime.now();
        ThreadCounter ts = new ThreadCounter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=4000; i++){
                    ts.increment();
                    // System.out.println("In t1 run");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {  
            @Override
            public void run() {
                for(int i=1; i<=4000; i++){
                    ts.increment();
                    // System.out.println("In t2 run");
                }
            }
        });
        
        // for(int i=1; i<=2000; i++){
        //     ts.increment();
        // }
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println(ts.getCount());
        System.out.println(Duration.between(startTime, endTime).toNanos());

    }
}

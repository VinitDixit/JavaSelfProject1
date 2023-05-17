package TestLearn.Thread;

import java.util.concurrent.*;

public class ThreadTestClient {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //lambdas can be assign to a variable/reference
        Runnable r1= ()->{
            System.out.println("Thread by runnnable: r1::"+Thread.currentThread().getName());
            System.out.println("Running thread r1");
        };
        //lambdas can be passed as method arguments
        Thread tr2=new Thread(()->{
            System.out.println("Thread by runnnable: r2::"+Thread.currentThread().getName());
            System.out.println("Running thread r2");
        });

        Callable call1=()->{
            System.out.println("Thread by runnnable: call1::"+Thread.currentThread().getName());
            System.out.println("Running thread call1");
            return "Call1";
        };
        Thread tr1=new Thread(r1);
        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();

        System.out.println("Using executors*********");
        ExecutorService service= Executors.newFixedThreadPool(2);
        Future futureObj = service.submit(call1);
        System.out.println("Call1 return object::"+(String)futureObj.get());
        service.submit(r1);

    }

}

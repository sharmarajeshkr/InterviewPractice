package com.sharma.threads;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.*;

public class CopyFilesUsingExecutor {
    private final Collection<Runnable> tasks = new ArrayList<Runnable>();
    public void add(Runnable task){
        tasks.add(task);
    }

    public void go() throws InterruptedException{
       final ExecutorService thread = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try{
            final CountDownLatch latch = new CountDownLatch(tasks.size());
            for(Runnable task : tasks){
                thread.execute(
                        new Runnable() {
                            @Override
                            public void run() {
                                try{
                                    task.run();
                                }finally {
                                    latch.countDown();
                                }
                            }
                        }
                );
                latch.await();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            thread.shutdown();
        }
    }

    public static void main(String[] args) {
        long l1 = 0;
        try {
            CopyFilesUsingExecutor tasks = new CopyFilesUsingExecutor();
            File folder = new File("/media/sweta/New Volume/Video/Sweta/Complete SAP OSDB Migration");
            // returns the current time in milliseconds
            System.out.print("Current Time in milliseconds = ");
            l1 = System.currentTimeMillis();

            for (File file : folder.listFiles()) {
                tasks.add(new CopyFileTask(file.getAbsolutePath(), "/Documents/testingPurpose/" + file.getName()));
            }
            tasks.go();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.print("Current Time in milliseconds = ");
        long l2 = System.currentTimeMillis();
        System.out.println(l1-l2);
    }

}

class CopyFileTask implements Runnable{
    private String fromPath;
    private String toPath;

    CopyFileTask(String fromPath,String toPath){
        this.fromPath = fromPath;
        this.toPath = toPath;
    }

    public void run(){
        try {
            Path to =Paths.get(toPath);
            Path from =Paths.get(fromPath);
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}

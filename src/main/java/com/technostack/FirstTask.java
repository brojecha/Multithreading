package com.technostack;

import java.util.concurrent.TimeUnit;

public class FirstTask extends Thread{
    @Override
    public void run() {
        for(int i = 10;i>=0;i--){
            System.out.println("TICK TICK "+i);
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

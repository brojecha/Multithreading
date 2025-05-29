package com.technostack;

public class MultithreadingFirstTechnique {
    public static void main(String[] args) {
        FirstTask talk = new FirstTask();
        Thread thread = new Thread(talk);
        thread.start();
    }
}



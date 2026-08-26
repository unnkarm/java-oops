/*
Multithreading teaches you how multiple tasks can run concurrently.

without it:
Task 1
  ↓
Task 2
  ↓
Task 3

with it:
           ┌── Task 1
Program ───┼── Task 2
           └── Task 3

Thread
  ↓
A unit of execution

start()
  ↓
Starts a new thread

run()
  ↓
Contains the thread's task

sleep()
  ↓
Temporarily pauses thread

join()
  ↓
Wait for another thread to finish

Runnable
  ↓
Represents a task that can run in a thread

synchronized
  ↓
Controls access to shared data      


*/


class MyThread extends Thread {

    String name;

    MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " : " + i);
        }
    }
}


public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.start();
        t2.start();
    }
}

 
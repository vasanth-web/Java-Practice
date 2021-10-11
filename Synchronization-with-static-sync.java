package com.company;

class SyncExample {
    public static synchronized void display(String name)  {
            for(int i=1;i<=5;i++) {
                System.out.println("Hello World "+name);
                try { Thread.sleep(1000); }
                catch (InterruptedException exception) {}
            }
    }
}
class MyThread extends Thread {
    String name;
    SyncExample example;
    public MyThread(SyncExample example, String name) {
        this.name = name;
        this.example = example;
    }
    public void run() {
        example.display(name);
    }
}
class Main extends Thread{
    public static void main(String []args){
        SyncExample example1 = new SyncExample();
        SyncExample example2 = new SyncExample();
        MyThread thread1 = new MyThread(example1,"Ricky");
        MyThread thread2 = new MyThread(example2,"Lauda");
        thread1.start();
        thread2.start();
    }
}
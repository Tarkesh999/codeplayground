package com.lld.designpatterns.creational.singleton;

public class SingletonTestApplication {

    public static void main(String[] args) throws InterruptedException {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadBar.start();
        Thread.sleep(10);
        threadFoo.start();

    }

    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        }
    }
}

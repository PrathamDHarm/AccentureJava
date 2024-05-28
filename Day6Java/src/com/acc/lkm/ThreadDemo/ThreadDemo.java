package com.acc.lkm.ThreadDemo;

//public class ThreadDemo extends Thread{
public class ThreadDemo implements Runnable{
	public void run() {
		System.out.println("Thread is running.....");
	}

	public static void main(String[] args) {
		ThreadDemo threadDemo=new ThreadDemo();
		//ThreadDemo threadDemo2=new ThreadDemo();
		Thread thread=new Thread(threadDemo);
	    thread.start();
	    //threadDemo2.start();

	}

}

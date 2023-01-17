package com.threadingExample;

import java.util.List;

public class ListTester implements Runnable {

	private List<String> a;
	private String message;

    public ListTester(List<String> a,String message) {
    	this.message=message;
        this.a = a;
    }

    public void run() {
    	try{
    		this.add();
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
        
    }
    synchronized void add() throws InterruptedException {
    	for (int i = 0; i < 20; ++i) {
		    a.add("I am inside "+message+" and the value is "+i);
		    Thread.sleep(10);
		}
    }
}

package com.threadingExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Implementation {

	public static void main(String[] args)throws Exception {
		List<String> a = Collections.synchronizedList(new ArrayList<String>()); 
						// new ArrayList<String>();

		    Thread t1 = new Thread(new ListTester(a,"class 1"));
		    Thread t2 = new Thread(new ListTester(a,"class 2"));

		    t1.start();
		    t2.start();
		    t1.join();
		    t2.join();
		    System.out.println(a.size());
		    for (int i = 0; i < a.size(); ++i) {
		        System.out.println(i + "  " + a.get(i));
		    }

	}

}

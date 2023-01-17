package com.reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionImpl {

	 public static void main(String args[]) throws Exception {
		 Test obj = new Test(); 
		  // Creating class object from the object using 
	      // getClass method 
	     Class<?> cls = obj.getClass(); 
	     System.out.println("The name of class is " + cls.getName()); 
	     
	     // Getting the constructor of the class through the 
	     // object of the class 
	     Constructor<?> constructor = cls.getConstructor(); 
	     System.out.println("The name of constructor is " + constructor.getName());
	     
	     System.out.println("All methods of class are");
	       Method[] methods2=cls.getDeclaredMethods();
	       for(Method method:methods2) {
	    	   System.out.println(method.toString());
	       } 
	       
	       
	     System.out.println("The public methods of class are : "); 
	     // Getting methods of the class through the object 
	     // of the class by using getMethods 
	     Method[] methods = cls.getMethods(); 
	  
	     // Printing method names 
	     for (Method method:methods) {
	     System.out.println(method.getName()); }
	     
	     System.out.println("The public fields of class are");
	       Field[] fields= cls.getFields();
	       for(Field field1:fields) {
	    	   System.out.println(field1.toString());
	       }
	       
	       System.out.println("All fields fields of class are");
	       Field[] fields1= cls.getDeclaredFields();
	       for(Field field1:fields1) {
	    	   System.out.println(field1.toString());
	       }
	     
	     
	  // creates object of desired method by providing the 
	  // method name and parameter class as arguments to 
	  // the getDeclaredMethod 
	     Method methodcall1 = cls.getDeclaredMethod("method2",int.class); 
	  
	        // invokes the method at runtime 
	   methodcall1.invoke(obj, 19);
	   
	   Field field = cls.getDeclaredField("name"); 
	   
       // allows the object to access the field irrespective 
       // of the access specifier used with the field 
       field.setAccessible(true); 
 
       // takes object and the new value to be assigned 
       // to the field as arguments 
       field.set(obj, "JAVA");
       System.out.println(field.get(obj));
      
       
       // Creates object of desired method by providing the 
       // method name as argument to the getDeclaredMethod 
       Method methodcall2 = cls.getDeclaredMethod("method1"); 
 
       // invokes the method at runtime 
       methodcall2.invoke(obj); 
 
       // Creates object of the desired method by providing 
       // the name of method as argument to the  
       // getDeclaredMethod method 
       Method methodcall3 = cls.getDeclaredMethod("method3"); 
 
       // allows the object to access the method irrespective  
       // of the access specifier used with the method 
       methodcall3.setAccessible(true); 
 
       // invokes the method at runtime 
       methodcall3.invoke(obj); 
	 }
}

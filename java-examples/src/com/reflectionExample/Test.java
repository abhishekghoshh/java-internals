package com.reflectionExample;

public class Test {
	// creating a private field 
    private String name;
    private int age;
    public int id;
    public String surname;
  
    // creating a public constructor 
    public Test()  {  
    	name = "Abhishek Ghosh"; 
    	age=22;
    	} 
  
    public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Creating a public method with no arguments 
    public void method1()  { 
        System.out.println("The string is " + name); 
    } 

    // Creating a public method with int as argument 
    public void method2(int n)  { 
        System.out.println("The number is " + n); 
    } 
  
    // creating a private method 
    @SuppressWarnings("unused")
	private void method3() { 
        System.out.println("Private method invoked"); 
    }

	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + "]";
	}
    
}

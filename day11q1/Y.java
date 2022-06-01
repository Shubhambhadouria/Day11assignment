package day11q1;

public interface Y {

	public abstract void fun1(); 
	default void fun2() {
		System.out.println("Inside fun2 of interface Y");
	}
	public static void fun3() {
		System.out.println("Inside fun3 of interface Y");
	}
	
}

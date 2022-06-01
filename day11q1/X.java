package day11q1;

public interface X {

	public abstract void funA(); 
	default void funB() {
		System.out.println("Inside funB of interface X");
	}
	public static void funC() {
		System.out.println("Inside funC of interface X");
	}
	
}

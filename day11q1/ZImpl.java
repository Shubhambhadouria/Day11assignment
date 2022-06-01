package day11q1;

public class ZImpl implements Z{

	@Override
	public void funA() {
		// TODO Auto-generated method stub
		System.out.println("Inside funA of X");
		
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("Inside fun1 of Y");
		
	}

	@Override
	public void funa() {
		// TODO Auto-generated method stub
		System.out.println("Inside funa of Z");
	}
	
	public void funB() {
		System.out.println("Inside funB of X");
	}
	
	public static void main(String[] args) {
		
		Z obj = new ZImpl();
		obj.funA();
		obj.funB();
		X.funC();
		obj.fun1();
		obj.fun2();
		Y.fun3();
		obj.funa();
		
		
		

	}

}

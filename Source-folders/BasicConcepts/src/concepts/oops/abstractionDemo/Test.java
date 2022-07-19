package concepts.oops.abstractionDemo;


public class Test extends T2 {
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
	}

	@Override
	void m1() {
		System.out.println("Hello");
	}
	
//	@Override
//	void m2() {
//		System.out.println("Hello123 overriden");
//	}
	
}

abstract class T2 {
	abstract void m1();
	void m2() {
		System.out.println("Hello123");
	}
}
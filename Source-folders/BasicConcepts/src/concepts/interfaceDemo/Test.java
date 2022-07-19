package concepts.interfaceDemo;

public class Test implements I1 {
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m3();
		
		//without override(comment m4() in class Test - line 21 to 24)
		//t.m4();
		
		//with override(uncomment m4() in class Test - line 21 to 24)
		t.m4();
	}

	@Override
	public void m3() {
		System.out.println("Hello345");
	}
	
//	@Override
//	public void m4() {
//		System.out.println("Default from child");
//	}
	
}

interface I1 {
	void m3();
	default void m4() {
		System.out.println("Default");
	}
}
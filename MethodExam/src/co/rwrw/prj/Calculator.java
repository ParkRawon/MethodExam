package co.rwrw.prj;

public class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}

	public void sub(int a, int b) {	//다형성(오버로딩)
		System.out.println(a-b);
	}
	
	public void sub(float f, int b) {	//다형성(오버로딩)
		System.out.println(f-b);
	}
	
	public long sub(long l, long m) {
		return l-m;
	}

}

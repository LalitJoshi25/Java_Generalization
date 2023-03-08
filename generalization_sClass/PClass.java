package generalization_sClass;

public class PClass {
	public static void m() {
		System.out.println("static member of parent class");
	}
	public void m1(int x) {
		System.out.println("non static member pclass");
		System.out.println("x "+x);
	}
	public void m11(int d) {
		System.out.println("non static member pclass");
		System.out.println("d "+d);
	}
}

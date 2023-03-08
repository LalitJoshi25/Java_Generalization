package generalization_mClass;
import generalization_sClass.*;

public class DemoGeneralization1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PClass ob = new CClass();//generalization syntax
//		ob.m();//static member correct calling syntax is PClass.m();
		PClass.m();
		ob.m1(546);
		ob.m11(11);
//		ob.m2();//error because m2 is child class method
	}

}

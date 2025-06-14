package p2;

import p1.P;

public class P2 {
	public static void main(String[] args) {
		P firstObj = new P();
		firstObj.a = 1; // public: is accessible everywhere
		// firstObj.b = 2;
		// if we use in the same package then it is equal to public
		// But if we use different package -> equal to Private
		// firstObj.c = 3;
		// firstObj.d = 4;
	}
}

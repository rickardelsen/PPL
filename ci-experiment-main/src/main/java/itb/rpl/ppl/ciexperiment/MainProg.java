package itb.rpl.ppl.ciexperiment;

import java.util.Vector;

/**
 * Hello world!
 *
 */
public class MainProg implements X {

	public static void main(String[] args) {
		int N = 10;
		ABB a = new ABB();
		
		MainProg mainProg = new MainProg();
		ABB a2 = new ABB(mainProg.w());
		
		Q q = new Q();
		
		a.f();
		Vector<Integer> v = new Vector<>(N);
		v.add(a.getX());
		v.add(a2.getX());
		System.out.println("Isi Vector:");
		for (Integer i: v) {
			System.out.println(i);
		}
	}

	@Override
	public int w() {
		return 2;
	}
}

package itb.rpl.ppl.ciexperiment;

/**
 *
 * @author Ginan
 */
public class ABB extends AB implements B {

	private int x;

	public ABB() {
		x = 0;
		System.out.println("ctor-ABB");
	}

	public ABB(int x) {
		this.x = x;
		System.out.println("ctor-ABB (x = " + x + ")");
	}

	@Override
	public void v() {
		System.out.println("ABB.v()");
	}

	@Override
	public void f() {
		System.out.println("ABB.f()");
	}

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "" + x;
	}
}

package itb.rpl.ppl.ciexperiment;

/**
 *
 * @author Ginan
 */
public class AB extends A implements B, C {

	public AB() {
		System.out.println("ctor-AB");
	}

	@Override
	public void f() {
		System.out.println("AB.f()");
	}
	
	@Override
	public void v() {
		System.out.println("AB.v()");
	}

	@Override
	public void g() {
		System.out.println("AB.g()");
	}
	
}

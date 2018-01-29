package ex.aaronfae.pattern.proxy;

/**
 * ≤‚ ‘¿‡
 * 
 * @author AaronFae
 *
 */
public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
	}
}

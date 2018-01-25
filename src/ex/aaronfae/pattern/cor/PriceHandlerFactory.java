package ex.aaronfae.pattern.cor;

public class PriceHandlerFactory {

	public static PriceHandler getPriceHandler() {
		PriceHandler sales = new Sales();
		PriceHandler manager = new Manager();
		PriceHandler director = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		sales.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		return sales;
	}
}

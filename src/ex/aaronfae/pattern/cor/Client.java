package ex.aaronfae.pattern.cor;

import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 30; i++) {
			Customer customer = new Customer();
			customer.setPriceHandler(PriceHandlerFactory.getPriceHandler());
			System.out.print("¿Í»§" + (i + 1) + "£¬");
			customer.requestDiscount(Math.round(random.nextFloat() * 100) / 100f);
		}
	}
}

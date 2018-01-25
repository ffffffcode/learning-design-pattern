package ex.aaronfae.pattern.cor;

/**
 * 销售总监，可以批准30%以内的折扣
 * 
 * @author AaronFae
 *
 */
public class Director extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.305) {
			System.out.println("Director批准了你的折扣：" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

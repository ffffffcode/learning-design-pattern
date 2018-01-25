package ex.aaronfae.pattern.cor;

/**
 * 销售经理，可以批准20%以内的折扣
 * 
 * @author AaronFae
 *
 */
public class Manager extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.205) {
			System.out.println("Manager批准了你的折扣：" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

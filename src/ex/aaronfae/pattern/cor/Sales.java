package ex.aaronfae.pattern.cor;

/**
 * 销售人员，可以批准5%以内的折扣
 * 
 * @author AaronFae
 *
 */
public class Sales extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.0505) {
			System.out.println("Sales批准了你的折扣：" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

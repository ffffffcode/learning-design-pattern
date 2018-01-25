package ex.aaronfae.pattern.cor;

/**
 * 销售副总，可以批准40%以内的折扣
 * 
 * @author AaronFae
 *
 */
public class VicePresident extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.405) {
			System.out.println("VP批准了你的折扣：" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

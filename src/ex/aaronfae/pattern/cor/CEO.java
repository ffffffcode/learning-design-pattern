package ex.aaronfae.pattern.cor;

/**
 * CEO，可以批准55%以内的折扣
 * 
 * @author AaronFae
 *
 */
public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.5505) {
			System.out.println("CEO批准了你的折扣：" + discount);
		} else {
			System.out.println("CEO拒绝了你的折扣：" + discount);
		}
	}

}

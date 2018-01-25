package ex.aaronfae.pattern.cor;

/**
 * �����ܼ࣬������׼30%���ڵ��ۿ�
 * 
 * @author AaronFae
 *
 */
public class Director extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.305) {
			System.out.println("Director��׼������ۿۣ�" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

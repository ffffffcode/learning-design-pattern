package ex.aaronfae.pattern.cor;

/**
 * ���۸��ܣ�������׼40%���ڵ��ۿ�
 * 
 * @author AaronFae
 *
 */
public class VicePresident extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.405) {
			System.out.println("VP��׼������ۿۣ�" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

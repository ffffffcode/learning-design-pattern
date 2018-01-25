package ex.aaronfae.pattern.cor;

/**
 * ������Ա��������׼5%���ڵ��ۿ�
 * 
 * @author AaronFae
 *
 */
public class Sales extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.0505) {
			System.out.println("Sales��׼������ۿۣ�" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

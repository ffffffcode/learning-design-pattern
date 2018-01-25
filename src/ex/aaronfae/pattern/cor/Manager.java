package ex.aaronfae.pattern.cor;

/**
 * ���۾���������׼20%���ڵ��ۿ�
 * 
 * @author AaronFae
 *
 */
public class Manager extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.205) {
			System.out.println("Manager��׼������ۿۣ�" + discount);
		} else {
			successor.processDiscount(discount);
		}
	}

}

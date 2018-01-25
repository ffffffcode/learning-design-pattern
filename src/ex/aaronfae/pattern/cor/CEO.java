package ex.aaronfae.pattern.cor;

/**
 * CEO��������׼55%���ڵ��ۿ�
 * 
 * @author AaronFae
 *
 */
public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.5505) {
			System.out.println("CEO��׼������ۿۣ�" + discount);
		} else {
			System.out.println("CEO�ܾ�������ۿۣ�" + discount);
		}
	}

}

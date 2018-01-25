package ex.aaronfae.pattern.cor;

/**
 * �ͻ��࣬���������ۿ�
 * 
 * @author AaronFae
 *
 */
public class Customer {

	// ÿһλ�ͻ�����PriceHandler�Ӵ�
	private PriceHandler priceHandler;

	// PriceHandler֮��Ҫ����
	public PriceHandler getPriceHandler() {
		return priceHandler;
	}

	// PriceHandlerǰ���Ӵ�Customer
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	// ÿһλ�ͻ����������ۿ۵�Ȩ��
	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}
}

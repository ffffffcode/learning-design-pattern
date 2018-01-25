package ex.aaronfae.pattern.cor;

/**
 * 客户类，用于申请折扣
 * 
 * @author AaronFae
 *
 */
public class Customer {

	// 每一位客户都有PriceHandler接待
	private PriceHandler priceHandler;

	// PriceHandler之间要交接
	public PriceHandler getPriceHandler() {
		return priceHandler;
	}

	// PriceHandler前来接待Customer
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	// 每一位客户都有申请折扣的权利
	public void requestDiscount(float discount) {
		priceHandler.processDiscount(discount);
	}
}

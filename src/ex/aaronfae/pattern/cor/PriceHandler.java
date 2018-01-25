package ex.aaronfae.pattern.cor;

/**
 * 抽象的价格处理人，负责处理客户的折扣申请
 * 
 * @author AaronFae
 *
 */
public abstract class PriceHandler {
	/*
	 * 直接后继，用于传递请求
	 */
	protected PriceHandler successor;

	public PriceHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}

	/**
	 * 处理折扣申请
	 * 
	 * @param discount
	 */
	public abstract void processDiscount(float discount);

}

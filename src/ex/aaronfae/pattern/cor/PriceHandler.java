package ex.aaronfae.pattern.cor;

/**
 * ����ļ۸����ˣ�������ͻ����ۿ�����
 * 
 * @author AaronFae
 *
 */
public abstract class PriceHandler {
	/*
	 * ֱ�Ӻ�̣����ڴ�������
	 */
	protected PriceHandler successor;

	public PriceHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}

	/**
	 * �����ۿ�����
	 * 
	 * @param discount
	 */
	public abstract void processDiscount(float discount);

}

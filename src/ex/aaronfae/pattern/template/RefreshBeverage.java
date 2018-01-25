package ex.aaronfae.pattern.template;

/**
 * ������࣬Ϊ���������ṩһ���㷨���
 * 
 * ��������
 * 
 * @author AaronFae
 *
 */
public abstract class RefreshBeverage {

	/**
	 * �Ʊ����ϵ�ģ�巽��
	 * 
	 * ��װ���������๲ͬ��ѭ���㷨���
	 * 
	 * final ���������ิд���ǵ�ģ�巽��
	 */
	public final void prepareBeverageTemplate() {
		// ����1 ��ˮ���
		boilWater();
		// ����2 ��������
		brew();
		// ����3 �����ϵ��뱭��
		pourInCup();
		if (isWantsCondiments()) {
			// ����4 �����ζ��
			addCondiments();
		}
		System.out.println("��������������");
	}

	/**
	 * Hook�����Ӻ������ṩһ��Ĭ�ϻ�յ�ʵ��
	 * 
	 * ���������������о����Ƿ�ҹ��Լ���ιҹ�
	 * 
	 * ѯ�ʿͻ��Ƿ���������
	 * 
	 * @return
	 */
	protected boolean isWantsCondiments() {
		return true;
	}

	/**
	 * ������������ˮ���
	 */
	private void boilWater() {
		System.out.println("��ˮ���");
	}

	protected abstract void brew();

	/**
	 * ���������������ϵ��뱭��
	 */
	private void pourInCup() {
		System.out.println("�����ϵ��뱭��");
	}

	protected abstract void addCondiments();
}

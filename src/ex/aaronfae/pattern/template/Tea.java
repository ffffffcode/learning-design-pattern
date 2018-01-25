package ex.aaronfae.pattern.template;

/**
 * �������࣬�̳�RefreshBeverage
 * 
 * �ṩ�˲��Ʊ��ľ���ʵ��
 * 
 * @author AaronFae
 *
 */
public class Tea extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("��80�ȵ�ˮ���ݲ�Ҷ5����");
	}

	@Override
	protected void addCondiments() {
		System.out.println("��������");
	}

	@Override
	/*
	 * ����ͨ�����ǵ���ʽѡ����ڹ��Ӻ���
	 * 
	 * @see ex.aaronfae.learn.pattern.template.RefreshBeverage#isWantsCondiments()
	 */
	protected boolean isWantsCondiments() {
		return false;
	}

}

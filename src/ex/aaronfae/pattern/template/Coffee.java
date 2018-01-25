package ex.aaronfae.pattern.template;

/**
 * �������࣬�̳�RefreshBeverage
 * 
 * �ṩ�˿����Ʊ��ľ���ʵ��
 * 
 * @author AaronFae
 *
 */
public class Coffee extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("���ݿ���");
	}

	@Override
	protected void addCondiments() {
		System.out.println("����ţ�̺���");
	}

}

package ex.aaronfae.pattern.adapter;

/**
 * �������ࣨ����������
 * 
 * ʵ���������ͷ�����̳ж������
 * 
 * ʵ�������ͷ����Ϊ�˽����������������ͷ
 * 
 * �̳ж����������Ϊ���ö������Ϊ�����ͷ����
 * 
 * ���������ͷת�����ͷ
 * 
 * @author AaronFae
 *
 */
public class ThreeForTwoAdapterByExtends extends TwoPhaseSocket implements ThreePhasePlug {

	// ��д�����ȡ�緽��
	@Override
	public void getPower() {
		System.out.println("����ת��");
		super.getPower();
	}

}

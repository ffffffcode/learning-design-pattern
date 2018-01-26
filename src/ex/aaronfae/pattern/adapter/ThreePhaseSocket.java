package ex.aaronfae.pattern.adapter;

/**
 * �����������ʵ���������ͷ�ĵ�Դ������ӿ�
 * 
 * ΪʲôҪʵ�ֽӿڣ�����Ϊ������Ҫ����ͷ���
 * 
 * @author AaronFae
 *
 */
public class ThreePhaseSocket implements ThreePhasePlug {

	// ��������
	public void powerWithThree() {
		System.out.println("��ʹ�������������");
	}

	// ����ʵ���������ͷ��ȡ����Ϊ���������������
	@Override
	public void getPower() {
		powerWithThree();
	}
}

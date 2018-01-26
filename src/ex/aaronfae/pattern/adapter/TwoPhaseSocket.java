package ex.aaronfae.pattern.adapter;

/**
 * �����������ʵ���˶����ͷ�ĵ�Դ������ӿ�
 * 
 * ΪʲôҪʵ�ֽӿڣ�����Ϊ������Ҫ����ͷ���
 * 
 * @author AaronFae
 *
 */
public class TwoPhaseSocket implements TwoPhasePlug {

	// ��������
	public void powerWithTwo() {
		System.out.println("��ʹ�ö����������");
	}

	// ����ʵ���˶����ͷ��ȡ����Ϊ���������������
	@Override
	public void getPower() {
		powerWithTwo();
	}
}

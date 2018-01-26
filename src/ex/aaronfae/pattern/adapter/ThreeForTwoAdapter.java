package ex.aaronfae.pattern.adapter;

/**
 * �������ࣨ������������
 * 
 * ʵ���������ͷ�ӿ�
 * 
 * ���������ͷת�����ͷ
 * 
 * @author AaronFae
 *
 */
public class ThreeForTwoAdapter implements ThreePhasePlug {

	// ������Ҫӵ�ж�������������ö������Ϊ�����ͷ����
	private TwoPhaseSocket twoPhaseSocket;

	public ThreeForTwoAdapter(TwoPhaseSocket socket) {
		this.twoPhaseSocket = socket;
	}

	// ����ʵ���������ͷ��ȡ����Ϊ���ö������Ϊ�����ͷ����
	@Override
	public void getPower() {
		System.out.println("����ת��");
		twoPhaseSocket.powerWithTwo();
	}

}

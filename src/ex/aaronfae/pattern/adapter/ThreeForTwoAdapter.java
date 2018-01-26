package ex.aaronfae.pattern.adapter;

/**
 * ��������
 * 
 * ʵ�������ͷת�����ͷ���Ա��������ͷ����������
 * 
 * @author AaronFae
 *
 */
public class ThreeForTwoAdapter implements ThreePhasePlug {

	// ������Ҫӵ�ж�������������ö������Ϊ�乩��
	private TwoPhaseSocket twoPhaseSocket;

	public ThreeForTwoAdapter(TwoPhaseSocket socket) {
		this.twoPhaseSocket = socket;
	}

	// ����ʵ���������ͷ��ȡ����Ϊ�������������Ϳ��ö������Ϊ�����ͷ����
	@Override
	public void getPower() {
		System.out.println("����ת��");
		twoPhaseSocket.powerWithTwo();
	}

}

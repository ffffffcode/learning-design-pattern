package ex.aaronfae.pattern.adapter;

/**
 * ������
 * 
 * @author AaronFae
 *
 */
public class Client {
	public static void main(String[] args) {
		// ������ֻ�ж������
		TwoPhaseSocket socket = new TwoPhaseSocket();
		// ӵ�������ͷ�ıʼǱ���Ҫʹ������������ʹ�ö���������
		ThreePhasePlug power = new ThreeForTwoAdapter(socket);

		// �����иպ������������ֱ��ʹ�������������
		// ThreePhaseSocket socket = new ThreePhaseSocket();
		// ThreePhasePlug power = socket;

		Laptop laptop = new Laptop(power);
		// �ñʼǱ����
		laptop.charge();
	}
}

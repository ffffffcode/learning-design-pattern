package ex.aaronfae.pattern.adapter;

/**
 * �ʼǱ��ࣺ�����ҽ���һ�������ͷ�ĵ�Դ������ӿ�
 * 
 * @author AaronFae
 *
 */

public class Laptop {

	// �ʼǱ�ӵ�е������ͷ�ĵ�Դ������ӿ�
	private ThreePhasePlug power;

	public Laptop(ThreePhasePlug power) {
		this.power = power;
	}

	// �ʼǱ������Ϊ���õ�Դ�����ȥȡ��
	public void charge() {
		System.out.println("�˱ʼǱ��������ͷ");
		power.getPower();
	}
}

package ex.aaronfae.pattern.observer;
import java.util.Observable;
import java.util.Observer;

/**
 * ����Ĺ۲��߶���
 * 
 * @author AaronFae
 *
 */
public class ConcreteObserver implements Observer {
	// �۲��ߵ����֣���˭�յ��������Ϣ
	private String observerName;

	@Override
	public void update(Observable arg0, Object arg1) {
		// �Ƶķ�ʽ
		System.out.println("��ģ�ͣ�"+observerName +"�յ�����Ϣ��Ŀ�괫��������"+ arg1);
		// ���ķ�ʽ
		System.out.println("��ģ�ͣ�"+observerName +"�յ�����Ϣ��Ŀ�괫��������"+ arg0);
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}

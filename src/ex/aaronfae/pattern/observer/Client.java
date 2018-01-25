package ex.aaronfae.pattern.observer;
/**
 * ������
 * 
 * @author AaronFae
 *
 */
public class Client {
	public static void main(String[] args) {
		// 1����Ŀ��
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		// 2�����۲���
		ConcreteObserver observer = new ConcreteObserver();
		observer.setObserverName("������Ů����");
		// 3ע��۲���
		subject.addObserver(observer);
		// 4Ŀ�귢������
		subject.setWeatherContent("�����������ʣ������������28��");
	}
}

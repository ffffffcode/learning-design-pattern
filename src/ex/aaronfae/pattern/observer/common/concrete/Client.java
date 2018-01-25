package ex.aaronfae.pattern.observer.common.concrete;

public class Client {
	public static void main(String[] args) {
		// 1����Ŀ��
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		// 2�����۲���
		ConcreteObserver observerGirlF = new ConcreteObserver();
		observerGirlF.setObserverName("������Ů����");
		observerGirlF.setRemindThing("���ǵĵ�һ��Լ�ᣬ�ص㣺���Ĺ�԰��������ɢŶ");
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("����������");
		observerMum.setRemindThing("�����Ǹ�����ĺ�����");

		// 3ע��۲���
		subject.attach(observerGirlF);
		subject.attach(observerMum);
		// 4Ŀ�귢������
		subject.setWeatherContent("�����������ʣ������������28��");
	}
}

package ex.aaronfae.pattern.observer.common.concrete;

public class Client {
	public static void main(String[] args) {
		// 1创建目标
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		// 2创建观察者
		ConcreteObserver observerGirlF = new ConcreteObserver();
		observerGirlF.setObserverName("黄明的女朋友");
		observerGirlF.setRemindThing("我们的第一次约会，地点：街心公园，不见不散哦");
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("黄明的妈妈");
		observerMum.setRemindThing("明天是个购物的好天气");

		// 3注册观察者
		subject.attach(observerGirlF);
		subject.attach(observerMum);
		// 4目标发表天气
		subject.setWeatherContent("明天天气晴朗，蓝天白云气温28度");
	}
}

package ex.aaronfae.pattern.observer;
/**
 * 测试类
 * 
 * @author AaronFae
 *
 */
public class Client {
	public static void main(String[] args) {
		// 1创建目标
		ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
		// 2创建观察者
		ConcreteObserver observer = new ConcreteObserver();
		observer.setObserverName("黄明的女朋友");
		// 3注册观察者
		subject.addObserver(observer);
		// 4目标发表天气
		subject.setWeatherContent("明天天气晴朗，蓝天白云气温28度");
	}
}

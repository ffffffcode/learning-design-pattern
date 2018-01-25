package ex.aaronfae.pattern.observer.common.concrete;
/**
 * 这是一个观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * 
 * @author AaronFae
 *
 */
public class ConcreteObserver implements Observer {
	// 观察者的名字，是谁收到的这个信息
	private String observerName;

	// 天气内容的情况，这个消息从目标处获取
	private String weatherContent;

	// 提醒的内容：（提醒约会？提醒逛街？）
	private String remindThing;

	/**
	 * 获取目标类的状态同步到观察者的状态
	 */
	@Override
	public void updata(WeatherSubject subject) {
		weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
		System.out.println(observerName + "收到了" + weatherContent + "," + remindThing);
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

}

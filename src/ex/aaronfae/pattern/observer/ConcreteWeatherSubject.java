package ex.aaronfae.pattern.observer;
import java.util.Observable;

/**
 * 天气目标的具体实现类
 * 
 * @author AaronFae
 *
 */
public class ConcreteWeatherSubject extends Observable {
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		// 天气情况有了，就要通知所以的观察者
		// 注意在通知之前，要先调用setChanged()方法
		this.setChanged();
		// 发生通知，这里是推模型
		this.notifyObservers(weatherContent);
		// 发生通知，这里是拉模型（subject这个对象的引用会被传到observer对象中）
		// this.notifyObservers();
	}
}

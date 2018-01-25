package ex.aaronfae.pattern.observer;
import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者对象
 * 
 * @author AaronFae
 *
 */
public class ConcreteObserver implements Observer {
	// 观察者的名字，是谁收到的这个信息
	private String observerName;

	@Override
	public void update(Observable arg0, Object arg1) {
		// 推的方式
		System.out.println("推模型："+observerName +"收到了消息，目标传过来的是"+ arg1);
		// 拉的方式
		System.out.println("拉模型："+observerName +"收到了消息，目标传过来的是"+ arg0);
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}

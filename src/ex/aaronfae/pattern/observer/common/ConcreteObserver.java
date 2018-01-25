package ex.aaronfae.pattern.observer.common;
/**
 * 这是一个观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * 
 * @author AaronFae
 *
 */
public class ConcreteObserver implements Observer {
	// 观察者的状态
	private String observerState;

	/**
	 * 获取目标类的状态同步到观察者的状态
	 */
	@Override
	public void updata(Subject subject) {
		observerState = ((ConcreteSubject) subject).getSubjectState();
	}

}

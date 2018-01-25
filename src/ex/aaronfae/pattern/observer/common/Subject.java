package ex.aaronfae.pattern.observer.common;
import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩע�ᣨ��ӣ���ɾ���۲��ߵĽӿ�
 * 
 * @author AaronFae
 *
 */
public class Subject {
	// ��������ע��Ĺ۲��߶���
	private List<Observer> observers = new ArrayList<Observer>();

	// attach detach notifyObservers

	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * ɾ��������ָ���Ĺ۲���
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * ֪ͨ����ע��Ĺ۲��߶���
	 */
	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.updata(this);
		}
	}
}

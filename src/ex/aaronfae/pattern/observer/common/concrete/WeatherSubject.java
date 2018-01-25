package ex.aaronfae.pattern.observer.common.concrete;
import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������֪���۲����Ĺ۲��ߣ����ṩע�ᣨ��ӣ���ɾ���۲��ߵĽӿ�
 * 
 * @author AaronFae
 *
 */
public class WeatherSubject {
	// ��������ע��Ĺ۲��߶���
	private List<Observer> observers = new ArrayList<Observer>();

	// attach detach notifyObservers

	// �Ѷ�������������ӵ��������б���
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * ɾ��������ָ���Ķ�����������
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * ֪ͨ�����Ѿ���������������
	 */
	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.updata(this);
		}
	}
}

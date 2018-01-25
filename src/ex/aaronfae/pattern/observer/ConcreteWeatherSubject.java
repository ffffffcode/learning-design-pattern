package ex.aaronfae.pattern.observer;
import java.util.Observable;

/**
 * ����Ŀ��ľ���ʵ����
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
		// ����������ˣ���Ҫ֪ͨ���ԵĹ۲���
		// ע����֪֮ͨǰ��Ҫ�ȵ���setChanged()����
		this.setChanged();
		// ����֪ͨ����������ģ��
		this.notifyObservers(weatherContent);
		// ����֪ͨ����������ģ�ͣ�subject�����������ûᱻ����observer�����У�
		// this.notifyObservers();
	}
}

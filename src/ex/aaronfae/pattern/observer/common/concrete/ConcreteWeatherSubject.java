package ex.aaronfae.pattern.observer.common.concrete;
/**
 * �����Ŀ����󣬸�����й�״̬���뵽��Ӧ�Ĺ۲��߶�����
 * 
 * @author AaronFae
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {
	// ��ȡ������������Ϣ
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		// �������ˣ�˵�����������ˣ�֪ͨ���Զ�������������
		this.notifyObservers();
	}

}

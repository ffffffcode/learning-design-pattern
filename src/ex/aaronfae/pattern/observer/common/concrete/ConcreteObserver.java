package ex.aaronfae.pattern.observer.common.concrete;
/**
 * ����һ���۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 * 
 * @author AaronFae
 *
 */
public class ConcreteObserver implements Observer {
	// �۲��ߵ����֣���˭�յ��������Ϣ
	private String observerName;

	// �������ݵ�����������Ϣ��Ŀ�괦��ȡ
	private String weatherContent;

	// ���ѵ����ݣ�������Լ�᣿���ѹ�֣���
	private String remindThing;

	/**
	 * ��ȡĿ�����״̬ͬ�����۲��ߵ�״̬
	 */
	@Override
	public void updata(WeatherSubject subject) {
		weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
		System.out.println(observerName + "�յ���" + weatherContent + "," + remindThing);
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

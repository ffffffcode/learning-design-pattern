package ex.aaronfae.pattern.observer.common.concrete;
/**
 * ����һ���۲��߽ӿڣ�����һ�����µĽӿڸ���Щ��Ŀ�귢���ı��ʱ��֪ͨ�Ķ���
 * 
 * @author AaronFae
 *
 */
public interface Observer {
	/**
	 * ���µĽӿ�
	 * @param subject ����Ŀ����󣬷�������Ӧ��Ŀ������״̬
	 */
	public void updata(WeatherSubject subject);

}

package ex.aaronfae.pattern.singleton;

/**
 * ����ģʽSingleton�еĸ����ŵķ�����ö�ٷ�
 * 
 * ʹ��ö�ٳ����̰߳�ȫ�ͷ�ֹ����ǿ�е��ù�����֮�⣬���ṩ���Զ����л����ƣ���ֹ�����л���ʱ�򴴽��µĶ���
 * 
 * ��ˣ�Effective Java�Ƽ������ܵ�ʹ��ö����ʵ�ֵ�����
 * 
 * @author AaronFae
 *
 */
public enum Singleton {

	INSTANCE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

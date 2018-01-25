package ex.aaronfae.pattern.singleton;

/**
 * ����ģʽSingleton�еĶ���ģʽ
 * 
 * Ӧ�ó��ϣ���Щ����ֻ��Ҫһ�����㹻�ˣ���Ŵ��ʵۣ�����
 * 
 * ���ã���֤����Ӧ�ó�����ĳ��ʵ������ֻ��һ��
 * 
 * ���ͣ�����ģʽ���̰߳�ȫ��������ģʽ���̲߳���ȫ��
 * 
 * @author AaronFae
 *
 */
public class HungrySingleton {

	// 1.�����췽��˽�л����������ⲿֱ�Ӵ�������
	private HungrySingleton() {

	}

	// 2.�������Ψһʵ����ʹ��private static����
	private static HungrySingleton instance = new HungrySingleton();

	// 3.�ṩһ����ȡʵ���ķ�����ʹ��public static����
	public static HungrySingleton getInstance() {
		return instance;
	}

}

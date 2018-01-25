package ex.aaronfae.pattern.singleton;

/**
 * ����ģʽSingleton�е�����ģʽ
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
public class LazySingleton {

	// 1.�����췽��˽�л����������ⲿֱ�Ӵ�������
	private LazySingleton() {

	}

	// 2.�������Ψһʵ����ʹ��private static����
	private static LazySingleton instance;

	// 3.�ṩһ����ȡʵ���ķ�����ʹ��public static����
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}

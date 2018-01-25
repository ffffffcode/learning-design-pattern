package ex.aaronfae.pattern.singleton;

/**
 * ����ģʽSingleton�еļ���̰߳�ȫ��Ч�ʵĽ��������˫�ؼ�����
 * 
 * volatile�ؼ�����jdk1.5�Ժ������ȷʹ��
 * 
 * @author AaronFae
 *
 */
public class DoubleCheckSingleton {

	private DoubleCheckSingleton() {
	}

	private volatile static DoubleCheckSingleton instance;

	public static DoubleCheckSingleton getInstance() {
		// ���һ��ʼ���ж�instance == null����ôÿ�ν��뺯������synchronized����������ģʽ������
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				// ���ж���߳����Ŷӽ���������ʱ��û�еڶ����ж�instance == null�Ļ�����ôʵ���ر���δ�����Υ������ģʽ���ԭ��
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}

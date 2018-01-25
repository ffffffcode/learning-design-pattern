package ex.aaronfae.pattern.singleton;

/**
 * ����ģʽSingleton�еĶ���ģʽ�Ľ�����̬�ڲ��෨
 * 
 * ���ǿ��԰�Singletonʵ���ŵ�һ����̬�ڲ����У������ͱ����˾�̬ʵ����Singleton����ص�ʱ��ʹ������󣬲������ھ�̬�ڲ���ֻ�ᱻ����һ�Σ���������д��Ҳ���̰߳�ȫ��
 * 
 * @author AaronFae
 *
 */
public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {

	}

	private static class Holder {
		private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
	}

	public static StaticInnerClassSingleton getInstance() {
		return Holder.instance;
	}
}

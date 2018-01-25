package ex.aaronfae.pattern.singleton;

/**
 * 单例模式Singleton中的兼顾线程安全和效率的解决方案：双重检查加锁
 * 
 * volatile关键字在jdk1.5以后才能正确使用
 * 
 * @author AaronFae
 *
 */
public class DoubleCheckSingleton {

	private DoubleCheckSingleton() {
	}

	private volatile static DoubleCheckSingleton instance;

	public static DoubleCheckSingleton getInstance() {
		// 如果一开始不判断instance == null，那么每次进入函数遇到synchronized锁，与懒汉模式无区别
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				// 当有多个线程在排队进入锁区的时候，没有第二次判断instance == null的话，那么实例回被多次创建，违反单例模式设计原则
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}
}

package ex.aaronfae.pattern.singleton;

/**
 * 单例模式Singleton中的饿汉模式
 * 
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝，老婆
 * 
 * 作用：保证整个应用程序中某个实例有且只用一个
 * 
 * 类型：饿汉模式（线程安全），懒汉模式（线程不安全）
 * 
 * @author AaronFae
 *
 */
public class HungrySingleton {

	// 1.将构造方法私有划，不允许外部直接创建对象
	private HungrySingleton() {

	}

	// 2.创建类的唯一实例，使用private static修饰
	private static HungrySingleton instance = new HungrySingleton();

	// 3.提供一个获取实例的方法，使用public static修饰
	public static HungrySingleton getInstance() {
		return instance;
	}

}

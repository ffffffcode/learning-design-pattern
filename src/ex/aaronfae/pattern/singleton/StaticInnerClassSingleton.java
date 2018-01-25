package ex.aaronfae.pattern.singleton;

/**
 * 单例模式Singleton中的饿汉模式改进：静态内部类法
 * 
 * 我们可以把Singleton实例放到一个静态内部类中，这样就避免了静态实例在Singleton类加载的时候就创建对象，并且由于静态内部类只会被加载一次，所以这种写法也是线程安全的
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

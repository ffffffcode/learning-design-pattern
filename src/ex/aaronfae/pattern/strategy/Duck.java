package ex.aaronfae.pattern.strategy;

/**
 * 超类，所有的鸭子都要继承此类————抽象了鸭子的行为：显示、鸣叫和飞行
 * 
 * @author AaronFae
 *
 */
public abstract class Duck {

	/**
	 * 由于不同种类的鸭子鸣叫方式也有所不同，这里引入一个鸣叫策略，便于应对各式各样的鸣叫方式
	 */
	private QuackStrategy quackStrategy;

	/**
	 * 该方式用于实例设置它自己的鸣叫策略quackStrategy
	 * 
	 * @param quackStrategy
	 */
	protected void setQuackStrategy(QuackStrategy quackStrategy) {
		this.quackStrategy = quackStrategy;
	}

	public void quack() {
		quackStrategy.quack();
	}

	/**
	 * 显示鸭子的外观 鸭子的外观各有不同，声明为abstract，由子类实现
	 */
	public abstract void display();

	/**
	 * 由于不同种类的鸭子飞行方式也有所不同，这里引入一个飞行策略，便于应对各式各样的飞行方式
	 */
	private FlyingStrategy flyingStrategy;

	/**
	 * 该方式用于实例设置它自己的飞行策略flyingStrategy
	 * 
	 * @param flyingStrategy
	 */
	protected void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}

	public void fly() {
		flyingStrategy.fly();
	}
}

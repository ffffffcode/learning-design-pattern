package ex.aaronfae.pattern.template;

/**
 * 抽象基类，为所有子类提供一个算法框架
 * 
 * 提神饮料
 * 
 * @author AaronFae
 *
 */
public abstract class RefreshBeverage {

	/**
	 * 制备饮料的模板方法
	 * 
	 * 封装了所欲子类共同遵循的算法框架
	 * 
	 * final 不允许子类复写我们的模板方法
	 */
	public final void prepareBeverageTemplate() {
		// 步骤1 将水煮沸
		boilWater();
		// 步骤2 泡制饮料
		brew();
		// 步骤3 将饮料倒入杯中
		pourInCup();
		if (isWantsCondiments()) {
			// 步骤4 加入调味料
			addCondiments();
		}
		System.out.println("饮料制作好拉！");
	}

	/**
	 * Hook，钩子函数，提供一个默认或空的实现
	 * 
	 * 具体的子类可以自行决定是否挂钩以及如何挂钩
	 * 
	 * 询问客户是否加入调里料
	 * 
	 * @return
	 */
	protected boolean isWantsCondiments() {
		return true;
	}

	/**
	 * 基本方法，将水煮沸
	 */
	private void boilWater() {
		System.out.println("将水煮沸");
	}

	protected abstract void brew();

	/**
	 * 基本方法，将饮料倒入杯中
	 */
	private void pourInCup() {
		System.out.println("将饮料倒入杯中");
	}

	protected abstract void addCondiments();
}

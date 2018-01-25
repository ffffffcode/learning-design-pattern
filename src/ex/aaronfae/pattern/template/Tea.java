package ex.aaronfae.pattern.template;

/**
 * 具体子类，继承RefreshBeverage
 * 
 * 提供了茶制备的具体实现
 * 
 * @author AaronFae
 *
 */
public class Tea extends RefreshBeverage {

	@Override
	protected void brew() {
		System.out.println("用80度的水浸泡茶叶5分钟");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");
	}

	@Override
	/*
	 * 子类通过覆盖的形式选择挂在钩子函数
	 * 
	 * @see ex.aaronfae.learn.pattern.template.RefreshBeverage#isWantsCondiments()
	 */
	protected boolean isWantsCondiments() {
		return false;
	}

}

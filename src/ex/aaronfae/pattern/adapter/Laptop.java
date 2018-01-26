package ex.aaronfae.pattern.adapter;

/**
 * 笔记本类：它有且仅有一个三相插头的电源充电器接口
 * 
 * @author AaronFae
 *
 */

public class Laptop {

	// 笔记本拥有的三相插头的电源充电器接口
	private ThreePhasePlug power;

	public Laptop(ThreePhasePlug power) {
		this.power = power;
	}

	// 笔记本充电行为：让电源充电器去取电
	public void charge() {
		System.out.println("此笔记本是三相插头");
		power.getPower();
	}
}

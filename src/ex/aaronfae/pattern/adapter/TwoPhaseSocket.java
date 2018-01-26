package ex.aaronfae.pattern.adapter;

/**
 * 二相插座：它实现了二相插头的电源充电器接口
 * 
 * 为什么要实现接口，是因为插座是要被插头插的
 * 
 * @author AaronFae
 *
 */
public class TwoPhaseSocket implements TwoPhasePlug {

	// 插座给电
	public void powerWithTwo() {
		System.out.println("在使用二相插座供电");
	}

	// 具体实现了二相插头的取电行为：靠二相插座供电
	@Override
	public void getPower() {
		powerWithTwo();
	}
}

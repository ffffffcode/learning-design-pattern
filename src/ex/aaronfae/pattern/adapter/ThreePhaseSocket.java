package ex.aaronfae.pattern.adapter;

/**
 * 三相插座：它实现了三相插头的电源充电器接口
 * 
 * 为什么要实现接口，是因为插座是要被插头插的
 * 
 * @author AaronFae
 *
 */
public class ThreePhaseSocket implements ThreePhasePlug {

	// 插座给电
	public void powerWithThree() {
		System.out.println("在使用三相插座供电");
	}

	// 具体实现了三相插头的取电行为：靠三相插座供电
	@Override
	public void getPower() {
		powerWithThree();
	}
}

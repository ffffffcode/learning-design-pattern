package ex.aaronfae.pattern.adapter;

/**
 * 适配器类（对象适配器）
 * 
 * 实现了三相插头接口
 * 
 * 用于三相插头转二相插头
 * 
 * @author AaronFae
 *
 */
public class ThreeForTwoAdapter implements ThreePhasePlug {

	// 适配器要拥有二相插座，才能让二相插座为三相插头供电
	private TwoPhaseSocket twoPhaseSocket;

	public ThreeForTwoAdapter(TwoPhaseSocket socket) {
		this.twoPhaseSocket = socket;
	}

	// 具体实现了三相插头的取电行为：让二相插座为三相插头供电
	@Override
	public void getPower() {
		System.out.println("经过转换");
		twoPhaseSocket.powerWithTwo();
	}

}

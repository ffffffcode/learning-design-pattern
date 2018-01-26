package ex.aaronfae.pattern.adapter;

/**
 * 测试类
 * 
 * @author AaronFae
 *
 */
public class Client {
	public static void main(String[] args) {
		// 生活中只有二相插座
		TwoPhaseSocket socket = new TwoPhaseSocket();
		// 拥有三相插头的笔记本需要使用适配器才能使用二相插座充电
		ThreePhasePlug power = new ThreeForTwoAdapter(socket);

		// 生活中刚好有三相插座，直接使用三相插座供电
		// ThreePhaseSocket socket = new ThreePhaseSocket();
		// ThreePhasePlug power = socket;

		Laptop laptop = new Laptop(power);
		// 让笔记本充电
		laptop.charge();
	}
}

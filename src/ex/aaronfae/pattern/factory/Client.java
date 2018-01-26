package ex.aaronfae.pattern.factory;

/**
 * 测试类
 * 
 * @author AaronFae
 *
 */
public class Client {

	public static void main(String[] args) {

		// 创建一个女生：小杨
		Person p = new Person("小杨");
		// 这时可怜的小杨还是单身，没人陪她去剪发
		System.out.print("可怜的" + p.getName() + "没人陪她去剪头发，于是乎她就自己");
		// 她自己想要什么发型
		p.setHair(new RightHair());
		// 就自己剪了
		p.getHair().draw();

		// 慢慢的你喜欢上了小杨，决定追求她，哈哈哈，追到了
		// 现在你陪她去剪头发
		// 去到理发店，问她喜欢剪什么发型，她说左偏发型，于是你就跟发型师说，帮她剪个左偏发型
		p.setHair(new HairFactory().getHair("left"));
		// 如果发型师能满足你女朋友小样的要求，就给她剪了
		if (p.getHair() != null) {
			System.out.print("发型师给" + p.getName());
			p.getHair().draw();
		} else {
			// 发型师剪不了的话，你就破口大骂
			System.out.println("辣鸡发型师，剪不出女朋友小杨想要的发型，我们还是去第二间吧");
		}

	}

}

package ex.aaronfae.pattern.adapter;

/**
 * 适配器类（类适配器）
 * 
 * 实现了三相插头，并继承二相插座
 * 
 * 实现三相插头，是为了将适配器接入三相插头
 * 
 * 继承二相插座，是为了让二相插座为三相插头供电
 * 
 * 用于三相插头转二相插头
 * 
 * @author AaronFae
 *
 */
public class ThreeForTwoAdapterByExtends extends TwoPhaseSocket implements ThreePhasePlug {

	// 重写父类的取电方法
	@Override
	public void getPower() {
		System.out.println("经过转换");
		super.getPower();
	}

}

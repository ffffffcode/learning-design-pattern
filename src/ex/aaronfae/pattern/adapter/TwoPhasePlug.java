package ex.aaronfae.pattern.adapter;

/**
 * 二相插头的电源充电器接口
 * 
 * @author AaronFae
 *
 */
public interface TwoPhasePlug {

	/**
	 * 定义了取电行为，但具体怎么取电就交由子类实现
	 * 
	 * 因为具体用什么插座取电是未知的
	 */
	public void getPower();
}

package ex.aaronfae.pattern.strategy;

/**
 * ���࣬���е�Ѽ�Ӷ�Ҫ�̳д��ࡪ������������Ѽ�ӵ���Ϊ����ʾ�����кͷ���
 * 
 * @author AaronFae
 *
 */
public abstract class Duck {

	/**
	 * ���ڲ�ͬ�����Ѽ�����з�ʽҲ������ͬ����������һ�����в��ԣ�����Ӧ�Ը�ʽ���������з�ʽ
	 */
	private QuackStrategy quackStrategy;

	/**
	 * �÷�ʽ����ʵ���������Լ������в���quackStrategy
	 * 
	 * @param quackStrategy
	 */
	protected void setQuackStrategy(QuackStrategy quackStrategy) {
		this.quackStrategy = quackStrategy;
	}

	public void quack() {
		quackStrategy.quack();
	}

	/**
	 * ��ʾѼ�ӵ���� Ѽ�ӵ���۸��в�ͬ������Ϊabstract��������ʵ��
	 */
	public abstract void display();

	/**
	 * ���ڲ�ͬ�����Ѽ�ӷ��з�ʽҲ������ͬ����������һ�����в��ԣ�����Ӧ�Ը�ʽ�����ķ��з�ʽ
	 */
	private FlyingStrategy flyingStrategy;

	/**
	 * �÷�ʽ����ʵ���������Լ��ķ��в���flyingStrategy
	 * 
	 * @param flyingStrategy
	 */
	protected void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}

	public void fly() {
		flyingStrategy.fly();
	}
}

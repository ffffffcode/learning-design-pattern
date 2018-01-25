package ex.aaronfae.pattern.strategy;

import ex.aaronfae.pattern.strategy.impl.FlyWithWind;
import ex.aaronfae.pattern.strategy.impl.QuackGagaga;

public class RadheadDuck extends Duck {

	public RadheadDuck() {
		super();
		this.setFlyingStrategy(new FlyWithWind());
		this.setQuackStrategy(new QuackGagaga());
	}

	@Override
	public void display() {
		System.out.println("��ͷѼ���ҵ�ͷ�Ǻ�ɫ��");
	}

}

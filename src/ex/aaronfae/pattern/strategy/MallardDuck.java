package ex.aaronfae.pattern.strategy;

import ex.aaronfae.pattern.strategy.impl.FlyWithWind;
import ex.aaronfae.pattern.strategy.impl.QuackGagaga;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		this.setFlyingStrategy(new FlyWithWind());
		this.setQuackStrategy(new QuackGagaga());
	}

	@Override
	public void display() {
		System.out.println("绿脖鸭：我的脖子是绿色的");
	}

}

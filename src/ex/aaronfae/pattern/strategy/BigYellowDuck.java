package ex.aaronfae.pattern.strategy;

import ex.aaronfae.pattern.strategy.impl.FlyNoWay;
import ex.aaronfae.pattern.strategy.impl.QuackNoWay;

public class BigYellowDuck extends Duck {

	public BigYellowDuck() {
		super();
		this.setFlyingStrategy(new FlyNoWay());
		this.setQuackStrategy(new QuackNoWay());
	}

	@Override
	public void display() {
		System.out.println("大黄鸭：我身体很大，全是黄黄");
	}

}

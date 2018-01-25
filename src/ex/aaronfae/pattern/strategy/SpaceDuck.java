package ex.aaronfae.pattern.strategy;

import ex.aaronfae.pattern.strategy.impl.FlyWithRocket;
import ex.aaronfae.pattern.strategy.impl.QuackWithWireless;

public class SpaceDuck extends Duck {

	public SpaceDuck() {
		super();
		this.setFlyingStrategy(new FlyWithRocket());
		this.setQuackStrategy(new QuackWithWireless());
	}

	@Override
	public void display() {
		System.out.println("ÎÒÍ·´÷Óîº½Í·¿ø");
	}

}

package ex.aaronfae.pattern.strategy.impl;

import ex.aaronfae.pattern.strategy.FlyingStrategy;

public class FlyWithWind implements FlyingStrategy {

	@Override
	public void fly() {
		System.out.println("Õñ³á¸ß·É");
	}

}

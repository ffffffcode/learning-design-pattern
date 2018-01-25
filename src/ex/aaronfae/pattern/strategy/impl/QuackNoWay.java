package ex.aaronfae.pattern.strategy.impl;

import ex.aaronfae.pattern.strategy.QuackStrategy;

public class QuackNoWay implements QuackStrategy {

	@Override
	public void quack() {
		System.out.println("�Ҳ���е�~�� ��ɬ��");
	}

}

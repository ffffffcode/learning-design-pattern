package ex.aaronfae.pattern.strategy.impl;

import ex.aaronfae.pattern.strategy.QuackStrategy;

public class QuackWithWireless implements QuackStrategy {

	@Override
	public void quack() {
		System.out.println("�������ߵ�����ͨ��");
	}

}

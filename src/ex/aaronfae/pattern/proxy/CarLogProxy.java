package ex.aaronfae.pattern.proxy;

public class CarLogProxy implements Moveable {

	private Moveable m;

	public CarLogProxy(Moveable m) {
		this.m = m;
	}

	@Override
	public void move() {
		System.out.println("��ʼ��¼��־...");
		m.move();
		System.out.println("��¼��־����...");
	}

}

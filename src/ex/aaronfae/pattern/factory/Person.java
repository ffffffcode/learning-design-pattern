package ex.aaronfae.pattern.factory;

/**
 * 人类
 * 
 * 拥有众多属性，如：姓名，发型等等。。。
 * 
 * @author AaronFae
 *
 */
public class Person {

	private String name = null;
	private HairInterface hair = null;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HairInterface getHair() {
		return hair;
	}

	public void setHair(HairInterface hair) {
		this.hair = hair;
	}

}

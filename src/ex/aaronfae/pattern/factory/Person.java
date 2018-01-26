package ex.aaronfae.pattern.factory;

/**
 * ����
 * 
 * ӵ���ڶ����ԣ��磺���������͵ȵȡ�����
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

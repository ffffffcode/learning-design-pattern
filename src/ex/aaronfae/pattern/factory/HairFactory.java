package ex.aaronfae.pattern.factory;

/**
 * ���͹����ࣺ����
 * 
 * @author AaronFae
 *
 */
public class HairFactory {
	/**
	 * ����Ů���ѵĻ����߷���ʦҪ��ʲô����
	 * 
	 * @param hairType
	 * @return
	 */
	public HairInterface getHair(String hairType) {
		if ("left".equals(hairType)) {
			return new LeftHair();
		} else if ("right".equals(hairType)) {
			return new RightHair();
		} else {
			return null;
		}
	}

}

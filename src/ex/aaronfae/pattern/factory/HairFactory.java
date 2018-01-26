package ex.aaronfae.pattern.factory;

/**
 * 发型工厂类：理发店
 * 
 * @author AaronFae
 *
 */
public class HairFactory {
	/**
	 * 根据女朋友的话告诉发型师要剪什么发型
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

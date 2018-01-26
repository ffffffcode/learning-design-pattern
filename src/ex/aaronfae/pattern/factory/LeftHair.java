package ex.aaronfae.pattern.factory;

/**
 * 左偏发型类：实现发型接口HairInterface
 * 
 * @author AaronFae
 *
 */
public class LeftHair implements HairInterface {

	@Override
	public void draw() {
		System.out.println("剪了个左偏发型");
	}

}

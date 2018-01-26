package ex.aaronfae.pattern.factory;

/**
 * 右偏发型类：实现发型接口HairInterface
 * 
 * @author AaronFae
 *
 */
public class RightHair implements HairInterface {

	@Override
	public void draw() {
		System.out.println("剪了个右偏发型");
	}

}

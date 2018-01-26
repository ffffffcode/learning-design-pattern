package ex.aaronfae.pattern.factory;

/**
 * ������
 * 
 * @author AaronFae
 *
 */
public class Client {

	public static void main(String[] args) {

		// ����һ��Ů����С��
		Person p = new Person("С��");
		// ��ʱ������С��ǵ���û������ȥ����
		System.out.print("������" + p.getName() + "û������ȥ��ͷ�������Ǻ������Լ�");
		// ���Լ���Ҫʲô����
		p.setHair(new RightHair());
		// ���Լ�����
		p.getHair().draw();

		// ��������ϲ������С�����׷��������������׷����
		// ����������ȥ��ͷ��
		// ȥ�����꣬����ϲ����ʲô���ͣ���˵��ƫ���ͣ�������͸�����ʦ˵������������ƫ����
		p.setHair(new HairFactory().getHair("left"));
		// �������ʦ��������Ů����С����Ҫ�󣬾͸�������
		if (p.getHair() != null) {
			System.out.print("����ʦ��" + p.getName());
			p.getHair().draw();
		} else {
			// ����ʦ�����˵Ļ�������ƿڴ���
			System.out.println("��������ʦ��������Ů����С����Ҫ�ķ��ͣ����ǻ���ȥ�ڶ����");
		}

	}

}

package ex.aaronfae.pattern.observer.common;
/**
 * ����һ���۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 * 
 * @author AaronFae
 *
 */
public class ConcreteObserver implements Observer {
	// �۲��ߵ�״̬
	private String observerState;

	/**
	 * ��ȡĿ�����״̬ͬ�����۲��ߵ�״̬
	 */
	@Override
	public void updata(Subject subject) {
		observerState = ((ConcreteSubject) subject).getSubjectState();
	}

}

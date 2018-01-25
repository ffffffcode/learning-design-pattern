package ex.aaronfae.pattern.template;

public class Client {

	public static void main(String[] args) {
		RefreshBeverage coffee = new Coffee();
		RefreshBeverage tea = new Tea();
		coffee.prepareBeverageTemplate();
		System.out.println("*******************");
		tea.prepareBeverageTemplate();
	}

}

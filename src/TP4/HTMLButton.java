package TP4;

public class HTMLButton implements Button {

	@Override
	public void render() {
		System.out.println("<Button> Test Button </Button>");
		onClick();
	}

	@Override
	public void onClick() {
		System.out.println("Vous avez cliqué sur le bouton");
		
	}

}

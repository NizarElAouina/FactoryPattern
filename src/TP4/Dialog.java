package TP4;

public abstract class Dialog {
	public void render() {
		Button okButton =  createButton();
		okButton.render();
	};
	public abstract Button createButton();
}
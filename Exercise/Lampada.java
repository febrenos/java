package exercicio2;

public class Lampada {
	boolean lampada;
	
	public void turnOn() {
		lampada = true;
		System.out.println("Você ligou a lâmpada");
	}
	
	public void turnOff() {
		lampada = false;
		System.out.println("Você desligou a lâmpada");
	}
	
	public boolean state() {
		System.out.println("A lâmpada está: " + lampada);
		return lampada;
	}
	
	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		
		lampada1.turnOn();
		lampada1.turnOff();
		lampada1.state();
	}
}
package Composed;

public class Circulo implements Formato {

	@Override
	public void desenhar(String cor) {
		System.out.print("Círculo " + cor + "\n");
	}
}

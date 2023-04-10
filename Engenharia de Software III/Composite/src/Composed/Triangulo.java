package Composed;

public class Triangulo implements Formato {

	@Override
	public void desenhar(String cor) {
		System.out.print("Triangulo " + cor + "\n");
	}
}

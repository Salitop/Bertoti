package Composed;

public class Quadrado implements Formato {

	@Override
	public void desenhar(String cor) {
		System.out.print("Quadrado " + cor + "\n");
	}
}

package Composed;

public class main {

	public static void main(String[] args) {
		
		Formato tri = new Triangulo();
		Formato cir = new Circulo();
		Formato quad = new Quadrado();
		
		Desenhar desenhar = new Desenhar();
		
		desenhar.adicionarFormato(tri);
		desenhar.adicionarFormato(quad);
		desenhar.adicionarFormato(cir);
		desenhar.desenhar("Azul");
		
		desenhar.removerTodosFormatos();
		
		desenhar.adicionarFormato(tri);
		desenhar.adicionarFormato(cir);
		desenhar.desenhar("Preto");

		desenhar.removerTodosFormatos();
		
		desenhar.adicionarFormato(quad);
		desenhar.adicionarFormato(cir);
		desenhar.desenhar("Roxo");
	}

}

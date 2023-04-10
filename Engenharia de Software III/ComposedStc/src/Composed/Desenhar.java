package Composed;

import java.util.ArrayList;
import java.util.List;

public class Desenhar implements Formato {

	private List<Formato> formatos = new ArrayList<Formato>();
	
	@Override
	public void desenhar(String cor) {
		for (Formato f : formatos) {
			f.desenhar(cor);
		}
	}
	
	public void adicionarFormato(Formato f) {
		this.formatos.add(f);
	}
	
	public void removerFormato(Formato f) {
		this.formatos.remove(f);
	}
	
	public void removerTodosFormatos() {
		System.out.print("A lista de formatos foi limpa \n");
		this.formatos.clear();
	}
	
}

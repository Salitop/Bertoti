package Observer;

public class Usuario implements TarefaListener{
	private String nome;
	private boolean status;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public void update(boolean status) {
		if(status == true)
			System.out.println("Tarefa adicionada");
		
		if(status == false)
			System.out.println("Tarefa finalizada");
	}
}

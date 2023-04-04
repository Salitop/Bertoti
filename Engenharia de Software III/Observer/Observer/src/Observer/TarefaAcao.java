package Observer;

import java.util.ArrayList;
import java.util.List;

public class TarefaAcao {	
	
	private static int lancamento = 1;
	private static int finalizar = 2;
	private List<String> listenersProfessor = new ArrayList<>();
	private List<String> listenersAluno = new ArrayList<>();
	private boolean status;
	
	Usuario usuario = new Usuario();
	
	public void LancamentoTarefa(String tituloTarefa, boolean status){
	    this.status = status;
		Notificar(lancamento);
	}
	public void FinalizarTarefa() {
		Notificar(finalizar);
	}
	
    public void Subscribe(String listener, int identificador) {
    	if(identificador == 1)
    		listenersProfessor.add(listener);
    	if(identificador == 2)
    	    listenersAluno.add(listener);
    }
    
    public void Unsubscribe(String listener, int identificador) {
    	if(identificador == 1)
    		listenersProfessor.remove(listener);
    	if(identificador == 2)
    	    listenersAluno.remove(listener);
    }
	
	public void Notificar(int tipoNotificacao) {
		if(tipoNotificacao == lancamento) {
			for(int i = 0; i <= listenersAluno.size(); i++) {
				usuario.update(true);
			}
		}
		if(tipoNotificacao == finalizar) {
			for(int i = 0; i <= listenersProfessor.size(); i++) {
				usuario.update(false);
			}
		}
	}
}

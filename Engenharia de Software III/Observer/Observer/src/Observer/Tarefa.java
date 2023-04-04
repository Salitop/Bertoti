package Observer;
import java.util.Scanner;


public class Tarefa {
	private static String titulo;
	private static String conteudo;
	private static boolean status;
	private static int acao;
	
	
	public static void main(String[] args) {
		
		TarefaAcao tarefaAcao = new TarefaAcao();		
		tarefaAcao.Subscribe("PauloP",1);
		tarefaAcao.Subscribe("PedroP",1);
		tarefaAcao.Subscribe("PauloA",2);
		tarefaAcao.Subscribe("PedroA",2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1) Cadastrar tarefa /n"
						 + "(2) Finalizar tarefa /n"
						 + "Ação: "	);
		acao = sc.nextInt();
		
		if(acao == 1) {
			System.out.println("Digite o titulo da tarefa: ");
			titulo = sc.next();
			status = true;
			tarefaAcao.LancamentoTarefa(titulo, status);
		}
		else if(acao == 2){
			tarefaAcao.FinalizarTarefa();
		}
		
		

	}

}

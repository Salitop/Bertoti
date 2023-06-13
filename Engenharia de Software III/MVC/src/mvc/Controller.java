package mvc;

public class Controller implements controllerInterface{

	View view;
	Subject model;
	
	public Controller(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaobtnCancelar();
		
	}
	
	public void btnRegistrar(){
		
		model.registerObserver(view);
		System.out.println("O relatorio com os valores atualizados foram registrados");
		view.desabilitarBotaobtnRegistrar();
		view.habilitarBotaobtnCancelar();
		
	}
	
	public void btnCancelar(){
		
		model.removeObserver(view);
		System.out.println("Assinatura cancelada");
		view.desabilitarBotaobtnCancelar();
		view.habilitarBotaobtnRegistrar();
		
	}
	
}
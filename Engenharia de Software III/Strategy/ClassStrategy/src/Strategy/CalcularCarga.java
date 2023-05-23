package Strategy;


public class CalcularCarga{

	
	public double PossuiCarga(double qtdCarga) {		
	    double porcTaxa = qtdCarga * 1.5;
	    return porcTaxa;
	}
	
	public double NaoPossuiCarga(double qtdCarga) {
		System.out.println("Seu veículo está isento da taxa de carga.");
		return 0;
	}
}

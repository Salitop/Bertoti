package Strategy;

public class Veiculo {
	CalcularCarga verificaCarga = new CalcularCarga();
	CalcularRodas verificaRoda = new CalcularRodas();
	
	public void VerificarVeiculo(int qtdRodas, double pesoCarga) {
		double valorPedagio, valorCarga, total;
		
		if(qtdRodas <= 4)
			valorPedagio = verificaRoda.VeiculoComum(qtdRodas);
		else
			valorPedagio = verificaRoda.VeiculoGrande(qtdRodas);
		
		if(pesoCarga <= 5) {
			valorCarga = verificaCarga.NaoPossuiCarga(pesoCarga);
		}
		else {
			valorCarga = verificaCarga.PossuiCarga(pesoCarga);
		}
		
		total = valorCarga + valorPedagio;
		System.out.print("Valor da taxa da carga: " + valorCarga + "\n"
						  + "Valor do pedágio: " + valorPedagio + "\n"
						  + "Valor total: " + total);
	}
}

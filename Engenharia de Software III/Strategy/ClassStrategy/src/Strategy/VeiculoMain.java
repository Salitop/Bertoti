package Strategy;
import java.util.Scanner;

public class VeiculoMain {
	
	private static double pesoCarga;
	private static int qtdRodas;
	private String display;
	private static double valorPedagio;
	private static double valorCarga;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CalcularCarga calcCarga = new CalcularCarga();
		CalcularRodas roda = new CalcularRodas();
		double total;
		
		System.out.println("Digite quantas rodas seu veículo está utilizando: ");
		qtdRodas = sc.nextInt();
		if(qtdRodas <= 4)
			valorPedagio = roda.VeiculoComum(qtdRodas);
		else
			valorPedagio = roda.VeiculoGrande(qtdRodas);
		
		System.out.println("Digite o peso da carga que está portando no veículo: ");
		pesoCarga = sc.nextDouble();
		if(pesoCarga <= 5) {
			valorCarga = calcCarga.NaoPossuiCarga(pesoCarga);
		}
		else {
			valorCarga = calcCarga.PossuiCarga(pesoCarga);
		}
		total = valorCarga + valorPedagio;
		System.out.print("Valor da taxa da carga: " + valorCarga + "\n"
						  + "Valor do pedágio: " + valorPedagio + "\n"
						  + "Valor total: " + total);

	}
}

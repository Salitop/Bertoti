package Strategy;
import java.util.Scanner;

public class VeiculoMain {
	
	private static double pesoCarga;
	private static int qtdRodas;
	static Veiculo veiculo = new Veiculo();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas rodas seu veículo está utilizando: ");
		qtdRodas = sc.nextInt();
		
		System.out.println("Digite o peso da carga que está portando no veículo: ");
		pesoCarga = sc.nextDouble();

		veiculo.VerificarVeiculo(qtdRodas, pesoCarga);
	}
}

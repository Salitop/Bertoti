package Strategy;

public class CalcularRodas {
	public double VeiculoComum(int qtdRodas) {
		if(qtdRodas <= 3 && qtdRodas >= 1) {
			return 5;
		}
		else {
			if(qtdRodas == 4) {
				return 10;
			}
			else {
				System.out.println("Seu veículo precisa de ao menos 2 rodas");
				return 0;
			}
		}
	}
	public double VeiculoGrande(int qtdRodas) {
		if(qtdRodas <= 6) {
			return 15;
		}
		else {
				return 25;
			}
		}
	}

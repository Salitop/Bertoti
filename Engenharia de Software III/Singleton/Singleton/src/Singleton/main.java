package Singleton;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Login");
            System.out.println("2. Logout");
            System.out.println("3. Verificar usuário logado");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome de usuário: ");
                    String username = scanner.next();
                    System.out.print("Senha: ");
                    String password = scanner.next();
                    singleton.login(username, password);
                    break;
                case 2:
                    singleton.logout();
                    break;
                case 3:
                    singleton.verificarUsuarioLogado();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();

	}

}

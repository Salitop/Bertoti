package Facade;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessageServiceFacade messageService = new MessageServiceFacade();
        String email, mensagem;
        
        System.out.println("Digite seu email: ");
        email = scanner.next();
        
        System.out.println("Digite uma mensagem: ");
        mensagem = scanner.next();
        
        messageService.enviarMensagem(email,mensagem);
    }

}

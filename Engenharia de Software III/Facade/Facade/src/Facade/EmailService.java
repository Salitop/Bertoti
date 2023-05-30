package Facade;

public class EmailService {
    public void enviarEmail(String destinatario, String mensagem) {
        System.out.println("Enviando email para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
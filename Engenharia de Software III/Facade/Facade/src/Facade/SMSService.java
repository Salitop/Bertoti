package Facade;

public class SMSService {
    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para: " + numero);
        System.out.println("Mensagem: " + mensagem);
    }
}

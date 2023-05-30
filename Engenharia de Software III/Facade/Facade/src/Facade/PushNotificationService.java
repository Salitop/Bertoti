package Facade;

public class PushNotificationService {
    public void enviarNotificacao(String dispositivo, String mensagem) {
        System.out.println("Enviando notificação push para: " + dispositivo);
        System.out.println("Mensagem: " + mensagem);
    }
}

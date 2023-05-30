package Facade;

public class MessageServiceFacade {
    private EmailService emailService;
    private SMSService smsService;
    private PushNotificationService pushNotificationService;
    
    public MessageServiceFacade() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
        this.pushNotificationService = new PushNotificationService();
    }
    
    public void enviarMensagem(String destinatario, String mensagem) {
        emailService.enviarEmail(destinatario, mensagem);
        smsService.enviarSMS(destinatario, mensagem);
        pushNotificationService.enviarNotificacao(destinatario, mensagem);
    }
}
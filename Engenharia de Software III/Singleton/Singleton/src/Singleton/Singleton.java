package Singleton;

public class Singleton{
    private static Singleton instanse;
    private String loggedInUser;
    private Singleton() {}

    public static Singleton getInstance(){

        synchronized (Singleton.class){
            if(instanse == null){
                instanse = new Singleton();
            }
        }
        return instanse;
    }
    
    public void verificarUsuarioLogado() {
        if (loggedInUser != null) {
            System.out.println("Usuário logado: " + loggedInUser);
        } else {
            System.out.println("Nenhum usuário logado.");
        }
    }
    
    public void login(String username, String password) {
        if (authenticate(username, password)) {
            loggedInUser = username;
            System.out.println("Login bem-sucedido. Usuário logado: " + loggedInUser);
        } else {
            System.out.println("Login falhou. Usuário ou senha inválidos.");
        }
    }
    
    public void logout() {
        loggedInUser = null;
        System.out.println("Logout realizado com sucesso.");
    }
    
    private boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("senha");
    }
}
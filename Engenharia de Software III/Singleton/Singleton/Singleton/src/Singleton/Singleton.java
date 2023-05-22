package Singleton;

public class Singleton{
    private static Singleton instanse;
    private Usuario user;
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
        if (user != null) {
            System.out.println("Usuário logado: " + user.getUsername());
        } else {
            System.out.println("Nenhum usuário logado.");
        }
    }
    
    public void login(String username, String password) {
        Usuario usuario = new Usuario(username, password);
        if (authenticate(usuario)) {
            user = usuario;
            System.out.println("Login bem-sucedido. Usuário logado: " + user.getUsername());
        } else {
            System.out.println("Login falhou. Usuário ou senha inválidos.");
        }
    }
    
    public void logout() {
        user = null;
        System.out.println("Logout realizado com sucesso.");
    }
    
    private boolean authenticate(Usuario usuario) {
        String username = usuario.getUsername();
        String password = usuario.getPassword();
        
        return username.equals("admin") && password.equals("senha");
    }
}
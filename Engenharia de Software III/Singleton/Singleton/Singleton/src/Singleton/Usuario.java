package Singleton;

public class Usuario implements UsuarioInterface{
    private String username;
    private String password;
    
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}
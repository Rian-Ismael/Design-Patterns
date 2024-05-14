package Doc;

public class Usuario {

    private Boolean user;
    public boolean isAdmin() {
        // Lógica para verificar se o usuário é um administrador
        return this.user; // ou false, dependendo da sua implementação
    }

    public void setAdmin(boolean b) {
        this.user = b;
    }
}

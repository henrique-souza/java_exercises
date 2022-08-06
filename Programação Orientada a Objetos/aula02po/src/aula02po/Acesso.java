package aula02po;

public class Acesso {

    private String usuario;
    private int senha;

    public void setUsuario(String u) {
        usuario = u;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(int s) {
        senha = s;
    }

    public int getSenha() {
        return senha;
    }

    public void cadastrar(String u, int s) {
        setUsuario(u);
        setSenha(s);
    }

    public void verificarSenha() {
        if (getUsuario().equals("Carlos") && getSenha() == 1234) {
            System.out.println("Bem vindo Carlos!");
        } else {
            System.out.println("Você não foi autenticado!");
        }
    }
}

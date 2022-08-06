package Primeira_Aula_POO;

public class Humano { //Classe Humano

    String nome; //Atributo nome
    String sexo; //Atributo sexo
    int idade; //Atributo idade
    double peso, altura; //Atributos peso e altura

    public void setNome(String n) { //método de acesso setter que atribui o nome
        nome = n;
    }

    public String getNome() { //método de acesso getter para recuperar o nome
        return nome;
    }

    public void setIdade(int id) { //setter que atribui idade
        idade = id;
    }

    public int getIdade() { //getter que recupera idade
        return idade;
    }

    public void setSexo(String s) { //setter que atribui sexo
        sexo = s;
    }

    public String getSexo() { //getter que recupera sexo
        return sexo;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public double getAltura() {
        return altura;
    }

    public void imprimir() {
        System.out.println("\nSeu nome é: " + getNome());
        System.out.println("Sua idade é: " + getIdade());
        System.out.println("Seu sexo é: " + getSexo());
        System.out.println("Seu peso é: " + getPeso());
        System.out.println("Sua altura é: " + getAltura());
    }
}

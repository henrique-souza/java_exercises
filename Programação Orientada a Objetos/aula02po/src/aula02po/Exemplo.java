package aula02po;

public class Exemplo {

    //Atributos
    int a, b;

    //Metodos de Acesso
    //Setters a
    public void setA(int v) {
        a = v;
    }

    //Getters a
    public int getA() {
        return a;
    }

    //Setters b
    public void setB(int v) {
        b = v;
    }

    public int getB() {
        return b;
    }

    public int somar() {
        return a + b;
    }

    public int somar(int v1, int v2) {
        return v1 + v2;
    }
}

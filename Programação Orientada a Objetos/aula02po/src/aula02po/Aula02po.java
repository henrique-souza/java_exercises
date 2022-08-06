package aula02po;

public class Aula02po {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Resultado: " + (7.0 + (2 + 5) + ++x)); // '++x' é um incremento
        // isso faz com que o ++x seja 1(incremento)+10(x), e o resultado será 25.0

        Exemplo ex = new Exemplo();
        ex.setA(4);
        ex.setB(6);
        System.out.println("Soma: " + ex.somar());
        System.out.println("Soma: " + ex.somar(12, 8));
    }
}

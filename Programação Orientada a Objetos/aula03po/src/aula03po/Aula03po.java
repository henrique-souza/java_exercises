package aula03po;

public class Aula03po {

    public static void main(String[] args) {
        //criando os objetos
        ClasseA cA = new ClasseA();
        ClasseB cB = new ClasseB();
        ClasseC cC = new ClasseC();
        //chamando os métodos
        cA.cadastrar("", 0, 0);
        cB.cadastrar("", 0, 0);
        cC.cadastrar("", 0, "");

        cA.entrada();
        cB.entrada();
        cC.entrada();

        cA.imprimir();
        cB.imprimir();
        cC.imprimir();
    }
}

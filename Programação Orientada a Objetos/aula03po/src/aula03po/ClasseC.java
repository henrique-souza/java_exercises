package aula03po;

import java.util.Scanner;

public class ClasseC extends SuperClasse {
    //atributo unico da classe C
    String atributo5;

    //Construtores
    public ClasseC() {
    }

    //Métodos de Acesso
    //-------
    //Setter
    public void setAtributo5(String atr5) {
        atributo5 = atr5;
    }

    //Getter
    public String getAtributo5() {
        return atributo5;
    }

    //Métodos extras - entradaDeDados, cadastrar, imprimir
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entradaDeDados();
        System.out.print("Caracteres qualquer para Classe C: ");
        setAtributo5(ent.nextLine());
    }

    public void imprimir() {
        super.imprimir();
        System.out.print("Caracteres da Classe C: " + getAtributo5());
    }

    public void cadastrar(String atr1, double atr2, String atr5) {
        super.cadastrar(atr1, atr2);
        setAtributo5(atr5);
    }
}

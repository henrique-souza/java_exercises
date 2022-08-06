package aula03po;

import java.util.Scanner;

public class ClasseA extends SuperClasse{
    //atributo unico da classe A
    double atributo3;
    
    //Construtores
    public ClasseA(){
    }

    //Métodos de Acesso
    //-------
    //Setter
    public void setAtributo3(double atr3){
        atributo3 = atr3;
    }
    //Getter
    public double getAtributo3(){
        return atributo3;
    }
    
    //Métodos extras - entradaDeDados, cadastrar, imprimir
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entradaDeDados();
        System.out.print("Número real qualquer para Classe A: ");
        setAtributo3(Double.parseDouble(ent.nextLine()));
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.print("Número Real da Classe A: " +getAtributo3());
    }
    
    public void cadastrar(String atr1, double atr2, double atr3){
        super.cadastrar(atr1, atr2);
        setAtributo3(atr3);
    }
}

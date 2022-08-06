package aula03po;

import java.util.Scanner;

public class ClasseB extends SuperClasse{
    //atributo unico da classe B
    int atributo4;
        
    //Construtores
    public ClasseB(){
    }
    
    public ClasseB(int atr4){
        setAtributo4(atr4);
    }
    
    public ClasseB(String atr1, double atr2){
        super(atr1, atr2);
    }
    
    public ClasseB(String atr1, double atr2, int atr4){
        super(atr1, atr2);
        setAtributo4(atr4);
    }
    
    //Métodos de Acesso
    //-------
    //Setter
    public void setAtributo4(int atr4){
        atributo4 = atr4;
    }
    //Getter
    public int getAtributo4(){
        return atributo4;
    }
    
    //Métodos extras - entradaDeDados, cadastrar, imprimir
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entradaDeDados();
        System.out.print("Número Inteiro qualquer para Classe B: ");
        setAtributo4(Integer.parseInt(ent.nextLine()));
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.print("Número Inteiro da Classe B: " +getAtributo4());
    }
    
    public void cadastrar(String atr1, double atr2, int atr4){
        super.cadastrar(atr1, atr2);
        setAtributo4(atr4);
    }
}

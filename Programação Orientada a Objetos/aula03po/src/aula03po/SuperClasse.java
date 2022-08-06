package aula03po;

import java.util.Scanner;

public class SuperClasse {

    //Atributos globais
    String atributo1;
    double atributo2;

    //Construtores globais
    public SuperClasse() {
    }
    
    public SuperClasse(String atr1){
        setAtributo1(atr1);
    }
    
    public SuperClasse(double atr2){
        setAtributo2(atr2);
    }

    public SuperClasse(String atr1, double atr2) {
        setAtributo1(atr1);
        setAtributo2(atr2);
    }
    public SuperClasse(double atr2, String atr1) {
        setAtributo1(atr1);
        setAtributo2(atr2);
    }

    //Métodos de Acesso
    //Setters
    public void setAtributo1(String atr1) {
        atributo1 = atr1;
    }

    public void setAtributo2(double atr2) {
        atributo2 = atr2;
    }

    //Getters
    public String getAtributo1() {
        return atributo1;
    }

    public double getAtributo2() {
        return atributo2;
    }

    //Métodos extras - Imprimir(), EntradaDeDados() Cadastrar()
    
    //Metodo que entra com os dados pelo Teclado
    public void entradaDeDados(){
        Scanner ent = new Scanner(System.in);
        System.out.print("\nDigite os Caracteres do Atributo 1: ");
        setAtributo1(ent.nextLine());
        System.out.print("Digite os Numeros Reais do Atributo 2: ");
        setAtributo2(Double.parseDouble(ent.nextLine()));
    }
    //Metodo que cadastra os dados
    public void cadastrar(String atr1, double atr2) {
        setAtributo1(atr1);
        setAtributo2(atr2);
    }
    //Metodo para imprimir resultado
    public void imprimir(){
        System.out.println("\n\nCaracteres qualquer: " +getAtributo1());
        System.out.println("Números reais qualquer: " +getAtributo2());
    }
}
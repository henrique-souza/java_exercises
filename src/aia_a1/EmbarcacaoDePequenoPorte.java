package aia_a1;

import java.util.Scanner;

public class EmbarcacaoDePequenoPorte extends Embarcacao {

    // atributos exclusivos da classe Lancha
    String tipoDeCasco;
    int potenciaDoMotor;

    // Construtores
    public EmbarcacaoDePequenoPorte() {
    }

    public EmbarcacaoDePequenoPorte(String t) {
        setTipoDeCasco(t);
    }

    public EmbarcacaoDePequenoPorte(int pot) {
        setPotenciaDoMotor(pot);
    }

    public EmbarcacaoDePequenoPorte(int pot, String t) {
        setPotenciaDoMotor(pot);
        setTipoDeCasco(t);
    }

    public EmbarcacaoDePequenoPorte(String m, String mod, String c, String i, double n, int v, double p, double a) {
        super(m, mod, c, i, n, v, p, a);
    }

    public EmbarcacaoDePequenoPorte(String m, String mod, String c, String i, double n, int v, double p, double a, String t, int pot) {
        super(m, mod, c, i, n, v, p, a);
        setTipoDeCasco(t);
        setPotenciaDoMotor(pot);
    }

    public EmbarcacaoDePequenoPorte(String m, String mod, String c, String i) {
        super(m, mod, c, i);
    }

    public EmbarcacaoDePequenoPorte(double n, int v) {
        super(n, v);
    }

    public EmbarcacaoDePequenoPorte(double p, double a) {
        super(p, a);
    }

    public EmbarcacaoDePequenoPorte(String t, int pot, boolean b) {
        setTipoDeCasco(t);
        setPotenciaDoMotor(pot);
    }

    // Métodos de Acesso
    // -----------
    // Setter
    public void setTipoDeCasco(String t) {
        tipoDeCasco = t;
    }

    public void setPotenciaDoMotor(int pot) {
        potenciaDoMotor = pot;
    }

    // Getter
    public String getTipoDeCasco() {
        return tipoDeCasco;
    }

    public int getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void entradaDeDados() {
        Scanner entrada = new Scanner(System.in);
        super.entradaDeDados();
        System.out.print("\nTipo do Casco da Embarcação de Pequeno Porte: ");
        setTipoDeCasco(entrada.nextLine());
        System.out.print("\nQual a potência do Motor da Embarcação de Pequeno Porte? ");
        setPotenciaDoMotor(Integer.parseInt(entrada.nextLine()));
    }

    public void imprimir() {
        super.imprimir();
        System.out.print("\nTipo de Casco da Embarcação de Pequeno Porte: " + getTipoDeCasco());
        System.out.print("\nPotência do Motor da Embarcação de Pequeno Porte: " + getPotenciaDoMotor() + " hp.");
    }

    public void cadastrar(String m, String mod, String c, String i, double n, int v, double p, double a, String t,
            int pot) {
        super.cadastrar(m, mod, c, i, n, v, p, a);
        setTipoDeCasco(t);
        setPotenciaDoMotor(pot);
    }
}
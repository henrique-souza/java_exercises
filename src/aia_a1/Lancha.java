package aia_a1;

import static aia_a1.Embarcacao.preco;
import java.util.Scanner;

public class Lancha extends EmbarcacaoDePequenoPorte {

    // atributos exclusivos da classe Lancha
    boolean banheiro;
    static double desconto = 0.12;

    // Construtores
    public Lancha() {
    }

    public Lancha(boolean b) {
        setBanheiro(b);
    }

    public Lancha(String m, String mod, String c, String i, double n, int v, double p, double a) {
        super(m, mod, c, i, n, v, p, a);
    }

    public Lancha(String m, String mod, String c, String i, double n, int v, double p, double a, String t, int pot,
            boolean b) {
        super(m, mod, c, i, n, v, p, a, t, pot);
        setBanheiro(b);
    }

    public Lancha(String m, String mod, String c, String i) {
        super(m, mod, c, i);
    }

    public Lancha(double n, int v) {
        super(n, v);
    }

    public Lancha(double p, double a) {
        super(p, a);
    }

    public Lancha(String t, int pot, boolean b) {
        super(pot, t);
        setBanheiro(b);
    }

    public Lancha(int v, int pot) {
        super(pot, v);
    }

    public Lancha(int pot, double p, boolean b) {
        super(pot, p);
        setBanheiro(b);
    }

    // Métodos de Acesso
    // -----------
    // Setter
    public void setBanheiro(boolean b) {
        banheiro = b;
    }

    // Getter
    public boolean getBanheiro() {
        return banheiro;
    }

    public void entradaDeDados() {
        Scanner entrada = new Scanner(System.in);
        super.entradaDeDados();
        System.out.print("\nExiste banheiro na Lancha? 1 - Sim / 2 - Não : ");
        int escolha = Integer.parseInt(entrada.nextLine());
        if (escolha == 1) {
            setBanheiro(true);
        } else {
            setBanheiro(false);
        }
    }

    public void imprimir() {
        super.imprimir();
        if (getBanheiro()) {
            System.out.print("\nExiste banheiro na Lancha.");
        } else {
            System.out.print("\nNão existe banheiro na Lancha.");
        }
        System.out.print("\nValor da Lancha com Desconto de 12% - R$ " + valorDeDesconto() + "\n\n");
    }

    public void cadastrar(String m, String mod, String c, String i, double n, int v, double p, double a, String t,
            int pot, boolean b) {
        super.cadastrar(m, mod, c, i, n, v, p, a, t, pot);
        setBanheiro(b);
    }

    public static double valorDeDesconto() {
        return preco - (preco * desconto);
    }
}
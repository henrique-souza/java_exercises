package aia_a1;

import static aia_a1.Embarcacao.preco;
import java.util.Scanner;

public class Jetski extends EmbarcacaoDePequenoPorte {

    // atributos exclusivos da classe Lancha
    boolean reboque;
    static double desconto = 0.15;

    // Construtores
    public Jetski() {
    }

    public Jetski(boolean reb) {
        setReboque(reb);
    }

    public Jetski(String m, String mod, String c, String i, double n, int v, double p, double a) {
        super(m, mod, c, i, n, v, p, a);
    }

    public Jetski(String m, String mod, String c, String i, double n, int v, double p, double a, String t, int pot,
            boolean reb) {
        super(m, mod, c, i, n, v, p, a, t, pot);
        setReboque(reb);
    }

    public Jetski(String m, String mod, String c, String i) {
        super(m, mod, c, i);
    }

    public Jetski(double n, int v) {
        super(n, v);
    }

    public Jetski(double p, double a) {
        super(p, a);
    }

    public Jetski(String t, int pot, boolean reb) {
        super(pot, t);
        setReboque(reb);
    }

    public Jetski(int v, int pot) {
        super(pot, v);
    }

    public Jetski(int pot, double p, boolean reb) {
        super(pot, p);
        setReboque(reb);
    }

    // Métodos de Acesso
    // -----------
    // Setter
    public void setReboque(boolean reb) {
        reboque = reb;
    }

    // Getter
    public boolean getReboque() {
        return reboque;
    }

    public void entradaDeDados() {
        Scanner entrada = new Scanner(System.in);
        super.entradaDeDados();
        System.out.print("\nA compra do Jest Ski virá com um Reboque para transporte? 1 - Sim / 2 - Não : ");
        int escolha = Integer.parseInt(entrada.nextLine());
        if (escolha == 1) {
            setReboque(true);
        } else {
            setReboque(false);
        }
    }

    public void imprimir() {
        super.imprimir();
        if (getReboque()) {
            System.out.print("\nA compra do Jest Ski virá com um Reboque para transporte.");
        } else {
            System.out.print("\nNão será adicionado Reboque para o Jet Ski nesta compra.");
        }
        System.out.print("\nValor do Jet Ski com Desconto de 15% - R$ " + valorDeDesconto() + "\n\n");
    }

    public void cadastrar(String m, String mod, String c, String i, double n, int v, double p, double a, String t, int pot,
            boolean reb) {
        super.cadastrar(m, mod, c, i, n, v, p, a, t, pot);
        setReboque(reb);
    }

    public static double valorDeDesconto() {
        return preco - (preco * desconto);
    }
}
package aia_a1;

import static aia_a1.Embarcacao.numeroDePassageiros;
import static aia_a1.Embarcacao.preco;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Iate extends Embarcacao {

    //atributos exclusivos da classe Lancha
    double peso;
    int numeroDeTripulantes;
    double numeroDeCabines;
    boolean piscina;
    static double desconto = 0.10;

    //Construtores
    public Iate() {
    }

    public Iate(int nt) {
        setNumeroDeTripulantes(nt);
    }

    public Iate(int nt, float nc) {
        setNumeroDeTripulantes(nt);
        setNumeroDeCabines(nc);
    }

    public Iate(double ps) {
        setPeso(ps);
    }

    public Iate(boolean pis) {
        setPiscina(pis);
    }

    public Iate(String m, String mod, String c, String i, double n, int v,
            double p, double a) {
        super(m, mod, c, i, n, v, p, a);
    }

    public Iate(String m, String mod, String c, String i, double n, int v,
            double p, double a, int nt, float nc, double ps, boolean pis) {
        super.cadastrar(m, mod, c, i, n, v, p, a);
        setNumeroDeTripulantes(nt);
        setNumeroDeCabines(nc);
        setPeso(ps);
        setPiscina(pis);
    }

    public Iate(String m, String mod, String c, String i) {
        super(m, mod, c, i);
    }

    public Iate(double p, double a, double ps) {
        super(p, a);
        setPeso(ps);
    }

    public Iate(int nt, float nc, boolean pis) {
        setNumeroDeTripulantes(nt);
        setNumeroDeCabines(nc);
        setPiscina(pis);
    }

    //Métodos de Acesso
    //
    //Setter
    public void setNumeroDeTripulantes(int nt) {
        numeroDeTripulantes = nt;
    }

    public void setNumeroDeCabines(double nc) {
        numeroDeCabines = nc;
    }

    public void setPeso(double ps) {
        peso = ps;
    }

    public void setPiscina(boolean pis) {
        piscina = pis;
    }

    //Getter
    public int getNumeroDeTripulantes() {
        return numeroDeTripulantes;
    }

    public double getNumeroDeCabines() {
        return numeroDeCabines;
    }

    public double getPeso() {
        return peso;
    }

    public boolean getPiscina() {
        return piscina;
    }

    public void entradaDeDados() {
        Scanner entrada = new Scanner(System.in);
        super.entradaDeDados();
        System.out.print("\nDigite o número de Tripulantes do Iate: ");
        setNumeroDeTripulantes(Integer.parseInt(entrada.nextLine()));
        System.out.printf("\nQuantas cabines o Iate tem? ");
        setNumeroDeCabines(Double.parseDouble(entrada.nextLine()));
        System.out.print("\nDigite o peso do Iate: ");
        setPeso(Double.parseDouble(entrada.nextLine()));
        System.out.print("\nExiste Piscina no Iate? 1 - Sim / 2 - Não : ");
        int escolha = Integer.parseInt(entrada.nextLine());
        if (escolha == 1) {
            setPiscina(true);
        } else {
            setPiscina(false);
        }
    }

    public void imprimir() {
        super.imprimir();
        System.out.print("\nTotal de Tripulantes do Iate: "
                + getNumeroDeTripulantes() + " tripulantes.");
        System.out.print("\nTotal de Cabines do Iate: "
                + getNumeroDeCabines() + " cabines.");
        System.out.print("\nPeso do Iate: "
                + getPeso() + " kg.");
        if (getPiscina()) {
            System.out.print("\nO Iate tem Piscina para os Tripulantes.");
        } else {
            System.out.print("\nO Iate não tem Piscina.");
        }
        System.out.print("\nValor do Iate com um Desconto de 10% - R$ "
                + valorDeDesconto());
        System.out.printf(new DecimalFormat("\nNúmero de pessoas por cabine dentro Iate: 0.0").format(pessoasPorCabine()) + " pessoas.\n\n");
    }

    public void cadastrar(String m, String mod, String c, String i, double n, int v,
            double p, double a, int nt, int nc, double ps, boolean pis) {
        super.cadastrar(m, mod, c, i, n, v, p, a);
        setNumeroDeTripulantes(nt);
        setNumeroDeCabines(nc);
        setPeso(ps);
        setPiscina(pis);
    }

    public static double valorDeDesconto() {
        return preco - (preco * desconto);
    }

    public double pessoasPorCabine() {
        return numeroDePassageiros /= numeroDeCabines;
    }
}
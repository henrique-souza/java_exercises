package aia_a1;

import java.util.Scanner;

public class Embarcacao {

    // atributos globais das embarcações
    String marca, modelo, cor, identificacao;
    static double numeroDePassageiros;
    int velocidadeMaxima;
    double alturaDoCalado;
    static double preco;

    // construtores globais
    public Embarcacao() {
    }

    public Embarcacao(String m, String mod, String c, String i) {
        setMarca(m);
        setModelo(mod);
        setCor(c);
        setIdentificacao(i);
    }

    public Embarcacao(double n, int v) {
        setNumeroDePassageiros(n);
        setVelocidadeMaxima(v);
    }

    public Embarcacao(double p, double a) {
        setPreco(p);
        setAlturaDoCalado(a);
    }

    public Embarcacao(String m, String mod, String c, String i, double n, int v, double p, double a) {
        setMarca(m);
        setModelo(mod);
        setCor(c);
        setIdentificacao(i);
        setNumeroDePassageiros(n);
        setVelocidadeMaxima(v);
        setPreco(p);
        setAlturaDoCalado(a);
    }

    public Embarcacao(String m) {
        setMarca(m);
    }

    public Embarcacao(int v) {
        setVelocidadeMaxima(v);
    }

    public Embarcacao(double p) {
        setPreco(p);
    }

    public Embarcacao(String m, String mod, String c, String i, double n, int v, double p) {
        setMarca(m);
        setModelo(mod);
        setCor(c);
        setIdentificacao(i);
        setNumeroDePassageiros(n);
        setVelocidadeMaxima(v);
        setPreco(p);
    }

    public Embarcacao(String m, String mod, String c, String i, double p) {
        setMarca(m);
        setModelo(mod);
        setCor(c);
        setIdentificacao(i);
        setPreco(p);
    }

    // Métodos de Acesso
    // Setters
    public void setMarca(String m) {
        if (!m.isEmpty()) {
            marca = m;
        }
    }

    public void setModelo(String mod) {
        modelo = mod;
    }

    public void setCor(String c) {
        cor = c;
    }

    public void setIdentificacao(String i) {
        identificacao = i;
    }

    public void setNumeroDePassageiros(double n) {
        numeroDePassageiros = n;
    }

    public void setVelocidadeMaxima(int v) {
        velocidadeMaxima = v;
    }

    public void setPreco(double p) {
        if (p > 0) {
            preco = p;
        }
    }

    public void setAlturaDoCalado(double a) {
        alturaDoCalado = a;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public double getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getPreco() {
        return preco;
    }

    public double getAlturaDoCalado() {
        return alturaDoCalado;
    }

    // Métodos extras - Imprimir(), EntradaDeDados() Cadastrar()
    // Método que entra com os dados pelo Teclado
    public void entradaDeDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite a Marca da Embarcação: ");
        setMarca(entrada.nextLine());
        System.out.print("\nDigite o Modelo da Embarcação: ");
        setModelo(entrada.nextLine());
        System.out.print("\nDigite a Cor da Embarcação: ");
        setCor(entrada.nextLine());
        System.out.print("\nDigite a Identificação da Embarcação: ");
        setIdentificacao(entrada.nextLine());
        System.out.printf("\nDigite o Número de Passageiros da Embarcação: ");
        setNumeroDePassageiros(Double.parseDouble(entrada.nextLine()));
        System.out.print("\nDigite a Velocidade Máxima da Embarcação: ");
        setVelocidadeMaxima(Integer.parseInt(entrada.nextLine()));
        System.out.print("\nDigite o Preço da Embarcação: R$ ");
        setPreco(Double.parseDouble(entrada.nextLine()));
        System.out.print("\nDigite a Altura do Calado Marca da Embarcação: ");
        setAlturaDoCalado(Double.parseDouble(entrada.nextLine()));
    }

    // Método que cadastra os dados solicitados
    public void cadastrar(String m, String mod, String c, String i, double n, int v, double p, double a) {
        setMarca(m);
        setModelo(mod);
        setCor(c);
        setIdentificacao(i);
        setNumeroDePassageiros(n);
        setVelocidadeMaxima(v);
        setPreco(p);
        setAlturaDoCalado(a);
    }

    // Método para imprimir os resultados
    public void imprimir() {
        System.out.print("\n\nMarca da Embarcação: " + getMarca());
        System.out.print("\nModelo da Embarcação: " + getModelo());
        System.out.print("\nCor da Embarcação: " + getCor());
        System.out.print("\nIdentificação da Embarcação: " + getIdentificacao());
        System.out.printf("\nNúmero de Passageiros da Embarcação: " + getNumeroDePassageiros() + " passsageiros.");
        System.out.print("\nVelocidade Máxima da Embarcação: " + getVelocidadeMaxima() + " Km/h");
        System.out.print("\nPreço da Embarcação - R$ " + getPreco());
        System.out.print("\nAltura do Calado da Embarcação: " + getAlturaDoCalado() + " m");
    }
}
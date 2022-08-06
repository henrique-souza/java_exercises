package Primeira_Aula_POO;

import java.util.Scanner;

public class Telefone {

    //Atributos (Caracteristicas do Telefone)
    String numero, marca, cor;
    double preco;
    int capacidade;
    //Métodos de Acesso

    //Setters e Getters
    public void setNumero(String numeroDoTelefone) {
        if (!numeroDoTelefone.isEmpty()) {
            this.numero = numeroDoTelefone;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setMarca(String marcaDoTelefone) {
        if (!marcaDoTelefone.isEmpty()) {
            this.marca = marcaDoTelefone;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String corDoTelefone) {
        if (!corDoTelefone.isEmpty()) {
            cor = corDoTelefone;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setPreco(double precoDoTelefone) {
        if (precoDoTelefone > 0) {
            preco = precoDoTelefone;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setCapacidade(int capacidadeDoTelefone) {
        if (capacidadeDoTelefone > 0) {
            capacidade = capacidadeDoTelefone;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void imprimir() {
        System.out.println("\nNúmero: " + getNumero());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Preço: " + getPreco() + "reais");
        System.out.println("Capacidade: " + getCapacidade() + "GB.");
    }

    public void entradaDosDados() {
        Scanner entradaDoDado = new Scanner(System.in);
        try {
            System.out.print("\nQual é o número? ");
            setNumero(entradaDoDado.nextLine());
            System.out.print("\nQual é a marca? ");
            setMarca(entradaDoDado.nextLine());
            System.out.print("\nQual é o preço? ");
            setPreco(Double.parseDouble(entradaDoDado.nextLine()));
            System.out.print("\nQual é a capacidade? ");
            setCapacidade(Integer.parseInt(entradaDoDado.nextLine()));
            System.out.print("\nQual é a cor? ");
            setCor(entradaDoDado.nextLine());
        } catch (Exception exception) {
            System.out.print("\nAlgo deu errado!");
            System.out.print("\nPor favor, tente novamente teclando 'Enter'.");
            entradaDoDado.nextLine();
        }
    }
}

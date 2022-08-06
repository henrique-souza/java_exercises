package Primeira_Aula_POO;

public class Caneta { //Classe: Caneta

    //Atributos
    private String cor, tipo;
    private double preco;
    private int quantidade;
    //Explicação: O comando 'private' protegem os Atributos contra alterações futuras.

    //Métodos de acesso
    //Para cada atributo (Ex: cor) teremos dois método de acesso, Setter e Getter.
    //Setters
    public void setPreco(double precoDaCaneta) {
        if (precoDaCaneta > 0) {
            this.preco = precoDaCaneta;
        }
    }

    public void setCor(String corDaCaneta) {
        if (!corDaCaneta.isEmpty()) {
            this.cor = corDaCaneta;
        }
    }

    public void setTipo(String tipoDeCaneta) {
        if (!tipoDeCaneta.isEmpty()) {
            tipo = tipoDeCaneta;
        }
    }

    public void setQuantidade(int quantidadeDeCanetas) {
        if (quantidadeDeCanetas > 0) {
            this.quantidade = quantidadeDeCanetas;
        }
    }

    //Getters
    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibir() {
        System.out.println("\n\nA cor da Caneta é: " + getCor());
        System.out.println("O tipo da Caneta é: " + getTipo());
        System.out.println("O preço da Caneta é: R$ " + getPreco());
        System.out.println("A quantidade da Caneta é: " + getQuantidade());
    }
}

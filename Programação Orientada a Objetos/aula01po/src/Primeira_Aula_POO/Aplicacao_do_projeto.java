package Primeira_Aula_POO;

//import java.util.Scanner;

public class Aplicacao_do_projeto {

    public static void main(String[] args) {

        /*Scanner ent = new Scanner(System.in);
        //CLASSE CANETA
        Caneta color1 = new Caneta(); //Objeto 1
        Caneta color2 = new Caneta(); //Objeto 2
        Caneta color3 = new Caneta(); ////Objeto 3
        //Objeto: Só existirá se caso exista uma classe (Caneta.java)
        
        color1.cor = "Amarela"; 
        color2.cor = "Verde";
        color3.cor = "Laranja"; //Não faz parte da "boa prática de programação"
        color1.setCor("Amarela");
        color1.setTipo("Marcadora");
        color1.setPreco(3.0);
        color1.setQuantidade(10);

        color2.setCor("Verde");
        color2.setTipo("Desenho");
        color2.setPreco(2.0);
        color2.setQuantidade(2);

        color3.setCor("Laranja");
        color3.setTipo("Desenho");
        color3.setPreco(-5);
        color3.setQuantidade(-10);

        color1.exibir();
        color2.exibir();
        color3.exibir();*/
        //CLASSE TELEFONE
        System.out.println("Lista de Telefones\n ");
        Telefone a50 = new Telefone();//objeto a50
        Telefone galaxys20 = new Telefone(); // ** galaxy
        Telefone xperiaZ3 = new Telefone(); // ** xperia
        Telefone galaxyS7 = new Telefone(); // ** galaxy7
        Telefone motoG6 = new Telefone(); // ** motog6

        /*System.out.print("Qual é o número? ");
        a50.setNumero(ent.nextLine());
        System.out.print("\nQual é a marca? ");
        a50.setMarca(ent.nextLine());
        System.out.print("\nQual é o preço? ");
        a50.setPreco(Double.parseDouble(ent.nextLine()));
        System.out.print("\nQual é a capacidade? ");
        a50.setCapacidade(Integer.parseInt(ent.nextLine()));
        System.out.print("\nQual é a cor? ");
        a50.setCor(ent.nextLine());

        System.out.print("Qual é o número? ");
        galaxys20.setNumero(ent.nextLine());
        System.out.print("\nQual é a marca? ");
        galaxys20.setMarca(ent.nextLine());
        System.out.print("\nQual é o preço? ");
        galaxys20.setPreco(Double.parseDouble(ent.nextLine()));
        System.out.print("\nQual é a capacidade? ");
        galaxys20.setCapacidade(Integer.parseInt(ent.nextLine()));
        System.out.print("\nQual é a cor? ");
        galaxys20.setCor(ent.nextLine());

        System.out.print("Qual é o número? ");
        xperiaZ3.setNumero(ent.nextLine());
        System.out.print("\nQual é a marca? ");
        xperiaZ3.setMarca(ent.nextLine());
        System.out.print("\nQual é o preço? ");
        xperiaZ3.setPreco(Double.parseDouble(ent.nextLine()));
        System.out.print("\nQual é a capacidade? ");
        xperiaZ3.setCapacidade(Integer.parseInt(ent.nextLine()));
        System.out.print("\nQual é a cor? ");
        xperiaZ3.setCor(ent.nextLine());

        System.out.print("Qual é o número? ");
        galaxyS7.setNumero(ent.nextLine());
        System.out.print("\nQual é a marca? ");
        galaxyS7.setMarca(ent.nextLine());
        System.out.print("\nQual é o preço? ");
        galaxyS7.setPreco(Double.parseDouble(ent.nextLine()));
        System.out.print("\nQual é a capacidade? ");
        galaxyS7.setCapacidade(Integer.parseInt(ent.nextLine()));
        System.out.print("\nQual é a cor? ");
        galaxyS7.setCor(ent.nextLine());

        System.out.print("Qual é o número? ");
        motoG6.setNumero(ent.nextLine());
        System.out.print("\nQual é a marca? ");
        motoG6.setMarca(ent.nextLine());
        System.out.print("\nQual é o preço? ");
        motoG6.setPreco(Double.parseDouble(ent.nextLine()));
        System.out.print("\nQual é a capacidade? ");
        motoG6.setCapacidade(Integer.parseInt(ent.nextLine()));
        System.out.print("\nQual é a cor? ");
        motoG6.setCor(ent.nextLine());*/
        a50.entradaDosDados(); //Resumindo varias linhas de Setters em apenas 5
        galaxys20.entradaDosDados();
        xperiaZ3.entradaDosDados();
        galaxyS7.entradaDosDados();
        motoG6.entradaDosDados();

        // ECONOMIZANDO MAIS LINHAS QUE OS METODOS entrada() e imprimir()
        /*Telefone tels[] = new Telefone[20];
        for (int i = 0; i < 20; i++) {
            tels[i] = new  Telefone();
            tels[i].entrada();
        }
        
        tels[0].imprimir();*/
        a50.imprimir(); //Resumindo varias linhas de Getters em apenas 5
        galaxys20.imprimir();
        xperiaZ3.imprimir();
        galaxyS7.imprimir();
        motoG6.imprimir();

        //CLASSE HUMANO
        /*System.out.println("Criação de objetos Humanos\n ");
        Humano human1 = new Humano();
        Humano human2 = new Humano();
        human1.setNome("João"); //Setter de Nome para o objeto "humano 1"
        human2.setNome("Maria"); //Setter de Nome para o objeto "humano 2"

        human1.setIdade(30); //Setter de Idade para o objeto "humano 1"
        human2.setIdade(32); //Setter de Idade para o objeto "humano 2"

        human1.setSexo("Masculino"); //Setter de Sexo para o objeto "humano 1"
        human2.setSexo("Feminino"); //Setter de Sexo para o objeto "humano 2"

        human1.setPeso(75.00); //Setter de Peso para o objeto "humano 1"
        human2.setPeso(64.00); //Setter de Peso para o objeto "humano 2"

        human1.setAltura(1.74); //Setter de Nome para o objeto "humano 1"
        human2.setAltura(1.72); //Setter de Nome para o objeto "humano 2"
        
        human1.exibir();
        human2.exibir();
        
        /*A lista de comandos abaixo foi reduzida a apenas duas linhas, acima, colocando todos os getters para serem
        chamados de dentro da classe Humano, atribuindo aos objetos humano 1 e 2 aqui presentes*/
 /*System.out.println("Humano 1 -> Nome: " + human1.getNome()); //Getter de Nome
        System.out.println("Humano 2 -> Nome: " + human2.getNome()); //Getter de Nome
        
        System.out.println("\nHumano 1 -> Idade: " + human1.getIdade()); //Getter de Sexo
        System.out.println("Humano 2 -> Idade: " + human2.getIdade()); //Getter de Sexo
        
        System.out.println("\nHumano 1 -> Sexo: " + human1.getSexo()); //Getter de Nome
        System.out.println("Humano 2 -> Sexo: " + human2.getSexo()); //Getter de Nome
        
        System.out.println("\nHumano 1 -> Peso: " + human1.getPeso()); //Getter de Nome
        System.out.println("Humano 2 -> Peso: " + human2.getPeso()); //Getter de Nome
        
        System.out.println("\nHumano 1 -> Altura: " + human1.getAltura()); //Getter de Nome
        System.out.println("Humano 2 -> Altura: " + human2.getAltura()); //Getter de Nome*/
    }
}

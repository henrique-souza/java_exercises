package aia_a1;

/* Aluno: Henrique Souza dos Santos. Matricula: 20202101992*/
public class aplicacao_aia_a1 {

    public static void main(String[] args) {
        // criando os objetos da embarcação
        Lancha lancha1 = new Lancha();
        Lancha lancha2 = new Lancha();
        Lancha lancha3 = new Lancha();
        Lancha lancha4 = new Lancha();
        Lancha lancha5 = new Lancha();

        Iate iate1 = new Iate();
        Iate iate2 = new Iate();
        Iate iate3 = new Iate();
        Iate iate4 = new Iate();
        Iate iate5 = new Iate();

        Jetski jetski1 = new Jetski();
        Jetski jetski2 = new Jetski();
        Jetski jetski3 = new Jetski();
        Jetski jetski4 = new Jetski();
        Jetski jetski5 = new Jetski();

        // Chamando todos os parâmetros da SuperClasse para o Objeto Lancha
        
        //lancha1.cadastrar("NX Boats", "Lancha", "Verde", "Dark Green", 45, 150, 250000, 15, "Bi-convexo", 150, false);
        lancha1.entradaDeDados();
        lancha1.imprimir();

        lancha2.cadastrar("Coral", "Lancha", "Azul", "GaviÃ£o", 30, 100, 50000, 5, "Bi-convexo", 100, true);
        // lancha2.entradaDeDados();
        lancha2.imprimir();

        lancha3.cadastrar("Flexboat", "Lancha", "Vermelha", "Caminhos", 20, 110, 300000, 4, "Bi-convexo", 50, true);
        // lancha3.entradaDeDados();
        lancha3.imprimir();

        lancha4.cadastrar("Boston Whaler", "Lancha", "Branca", "Arauto", 35, 130, 5000000, 15, "Bi-concavo", 300, true);
        // lancha4.entradaDeDados();
        lancha4.imprimir();

        lancha5.cadastrar("Azov", "Lancha", "Cinza", "Flor do Mar", 25, 80, 500000, 7, "Bi-concavo", 125, false);
        // lancha5.entradaDeDados();
        lancha5.imprimir();

        // Chamando todos os parâmetros da SuperClasse para o Objeto Iate
        //iate1.cadastrar("Ferretti", "Iate", "Azul-marinho", "Grande 248", 1000, 300, 1000000, 30, 200, 310, 2000, true);
        iate1.entradaDeDados();
        iate1.imprimir();

        iate2.cadastrar("Pearl 95", "Iate", "Gelo", "Dante", 300, 250, 150000, 35, 155, 250, 1500, false);
        // iate2.entradaDeDados();
        iate2.imprimir();

        iate3.cadastrar("Custom Line", "Iate", "Vermelho", "Big 42", 500, 20, 1000000, 15, 100, 200, 20000, false);
        // iate3.entradaDeDados();
        iate3.imprimir();

        iate4.cadastrar("Navetta", "Iate", "Laranja", "Blade", 1500, 150, 1500000, 25, 150, 300, 25000, true);
        // iate4.entradaDeDados();
        iate4.imprimir();

        iate5.cadastrar("Azmut", "Iate", "Roxo", "Master", 600, 100, 1000000, 40, 255, 300, 5000, false);
        // iate5.entradaDeDados();
        iate5.imprimir();

        // Chamando todos os parâmetros da SuperClasse para o Objeto Jet_ski
        //jetski1.cadastrar("Yamaha-FX", "Jet Ski", "Preto e Vermelho", "1630 AC-3", 3, 115, 80000, 4, "Polytec", 300, true);
        jetski1.entradaDeDados();
        jetski1.imprimir();

        jetski2.cadastrar("Sea-Doo", "Jet Ski", "Preto e Azul", "264 Ez-5", 2, 80, 100000, 3.5, "ST-T3", 250, false);
        // jetski2.entradaDeDados();
        jetski2.imprimir();

        jetski3.cadastrar("SPARK TRIXX", "Jet Ski", "Laranja e Vermelho", "RTX-Xs", 2, 95, 90000, 3, "Polyvance", 200,
                true);
        // jetski3.entradaDeDados();
        jetski3.imprimir();

        jetski4.cadastrar("Kawasaki", "Jet Ski", "Verde e Cinza", "Ultra-310", 2, 107, 100000, 3.2, "Polytec", 315,
                true);
        // jetski4.entradaDeDados();
        jetski4.imprimir();

        jetski5.cadastrar("Belassi", "Jet Ski", "Branco e Azul", "B3R-Sport", 1, 100, 100000, 4.5, "ST-T4", 180, true);
        // jetski5.entradaDeDados();
        jetski5.imprimir();
    }
}

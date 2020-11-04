/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.program;

import model.entities.Batalhao;
import model.entities.Carro;
import model.entities.Endereco;
import model.entities.Moto;
import model.entities.Policial;
import model.entities.Telefone;
import model.entities.Utilizacao;


/**
 *
 * @author enzoappi
 */
public class ClienteSistemaViaturasPM {
    public static void main(String[] args) {
        Batalhao batalhao = new Batalhao("32o Batalhao de Policia Militar de Macae", "32", "PM", new Endereco("rua Hildebrando Alves Barbosa", "-", "-", "Barra de Macaé", "Macae", "Rio de Janeiro", "RJ", "27979-000"));
        Policial policial1 = new Policial("Nascimento", "1998200100", "100236580", "Capitão");
        Policial policial2 = new Policial("Neto", "1998200102", "101235687", "Aspirante");
        Policial policial3 = new Policial("Matías", "1998200105", "105389665", "Aspirante");
        Policial policial4 = new Policial("Fabio Barbosa", "1998200106", "175235674", "Capitão");
        batalhao.adicionarTelefone(new Telefone("022", "27623548"));
        Telefone telefone1 = new Telefone("022", "988655323");
        Telefone telefone2 = new Telefone("022", "974643108");
        Telefone telefone3 = new Telefone("022", "933644110");
        Telefone telefone4 = new Telefone("022", "996655329");
        Telefone telefone5 = new Telefone("022", "999655225");
        telefone1.setFonePrincipal(true);
        policial1.adicionarTelefone(telefone1);
        telefone5.setFonePrincipal(false);
        policial1.adicionarTelefone(telefone5);
        telefone2.setFonePrincipal(true);
        policial2.adicionarTelefone(telefone2);
        telefone3.setFonePrincipal(true);
        policial3.adicionarTelefone(telefone3);
        telefone4.setFonePrincipal(true);
        policial4.adicionarTelefone(telefone4);
        batalhao.adicionarPolicial(policial1);
        batalhao.adicionarPolicial(policial2);
        batalhao.adicionarPolicial(policial3);
        batalhao.adicionarPolicial(policial4);
        
        Carro viatura1 = new Carro("20201009", "LUT-5685", "325468751", "Wolksvagem", "Gol", "2010", "branco", 4, 2, "1.0", "4");
        viatura1.setBatalhao(batalhao);
        Moto viatura2 = new Moto("20201010", "RIP-0666", "456879562", "Honda", "Cg", "2013", "branca", "500", "500c");
        viatura2.setBatalhao(batalhao);
        Utilizacao utilizacao = new Utilizacao();
        utilizacao.adicionarViatura(viatura1);
        utilizacao.adicionarViatura(viatura2);
        
        Carro viatura3 = new Carro("20201011", "AND-0156", "435578002", "Wolksvagem", "Gol", "2010", "branco", 4, 2, "1.0", "4");
        viatura3.setBatalhao(batalhao);
        Moto viatura4 = new Moto("20201012", "BOC-8895", "456879003", "Honda", "Cg", "2013", "branca", "500", "500c");
        viatura4.setBatalhao(batalhao);
        Utilizacao utilizacao2 = new Utilizacao();
        utilizacao2.adicionarEndereco(new Endereco("rua W23", "-", "-", "Lagomar", "Macae", "Rio de Janeiro", "RJ", "-"));
        utilizacao2.adicionarViatura(viatura3);
        utilizacao2.adicionarViatura(viatura4);
        
        Carro viatura5 = new Carro("20201013", "TOT-0378", "598630114", "Wolksvagem", "Gol", "2015", "branco", 4, 2, "1.0", "4");
        viatura5.setBatalhao(batalhao);
        Utilizacao utilizacao3 = new Utilizacao();
        utilizacao3.adicionarViatura(viatura5);
        
        batalhao.adicionarViatura(viatura1);
        batalhao.adicionarViatura(viatura2);
        batalhao.adicionarViatura(viatura3);
        batalhao.adicionarViatura(viatura4);
        batalhao.adicionarViatura(viatura5);
        
        
        System.out.println("\n\nDados do Batalhão:");
        System.out.println("nome: " + batalhao.getNome());
        System.out.println("endereco: " + batalhao.getEndereco());
        batalhao.mostraTelefoneBatalhao();
        System.out.println("policiais do Batalhão: ");
        batalhao.mostraPoliciais();
        System.out.println("viaturas do Batalhão: ");
        batalhao.mostraViaturas();
        
        
        
        System.out.println("\n\n\nDados da viatura:\nBatalhao: " + viatura1.getBatalhao().toString() + "\nPatrimonio: " + viatura1.getCodPatrimonio() 
                + "\nPlaca: " + viatura1.getPlaca());
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Central, a viatura sofreu uma colisao, durante a perseguicao ao elemento, copiado?!");
        viatura1.acusarProblema();
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura1.acionarManutencao();
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura1.retornoManutencao();
        System.out.println(viatura1.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        
        System.out.println("\n\n\nDados da viatura:\nBatalhao: " + viatura2.getBatalhao().toString() + "\nPatrimonio: " + viatura2.getCodPatrimonio() 
                + "\nPlaca: " + viatura2.getPlaca());
        System.out.println(viatura2.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Central, a viatura sofreu uma colisao, durante a perseguicao ao elemento, copiado?!");
        viatura2.acusarProblema();
        System.out.println(viatura2.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura2.acionarManutencao();
        System.out.println(viatura2.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura2.retornoManutencao();
        System.out.println(viatura2.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Situacao atual: " + utilizacao.getEstadoUtilizacao().toString().toUpperCase());
        System.out.println("Central diz: [Recebemos um chamado, unidade(s) " + utilizacao.toStringViaturas() + ", copiado? (câmbio)]");
        System.out.println("Viatura(s) " + utilizacao.toStringViaturas() + " diz(em): [Copiado, Central! Estamos nos deslocando para o local do atendimento! (câmbio)]");
        utilizacao.iniciar();
        utilizacao.finalizar();
        utilizacao.aguardarProxima();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        
        System.out.println("\n\n\nDados da viatura:\nBatalhao: " + viatura3.getBatalhao().toString() + "\nPatrimonio: " + viatura3.getCodPatrimonio() 
                + "\nPlaca: " + viatura3.getPlaca());
        System.out.println(viatura3.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Central, a viatura sofreu uma colisao, durante a perseguicao ao elemento, copiado?!");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n\nDados da viatura:\nBatalhao: " + viatura4.getBatalhao().toString() + "\nPatrimonio: " + viatura4.getCodPatrimonio() 
                + "\nPlaca: " + viatura4.getPlaca());
        System.out.println(viatura4.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura1.acionarManutencao();
        System.out.println(viatura4.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura1.retornoManutencao();
        System.out.println(viatura4.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Situacao atual: " + utilizacao2.getEstadoUtilizacao().toString().toUpperCase());
        System.out.println("Central diz: [Recebemos um chamado, unidade(s) " + utilizacao2.toStringViaturas() + ", copiado? (câmbio)]");
        System.out.println("Viatura(s) " + utilizacao2.toStringViaturas() + " diz(em): [Copiado, Central! Estamos nos deslocando para o local do atendimento! (câmbio)]");
        utilizacao2.iniciar();
        System.out.println(utilizacao2.getEnderecos().toString());
        utilizacao2.finalizar();
        utilizacao2.aguardarProxima();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        System.out.println("\n\n\nDados da viatura:\nBatalhao: " + viatura5.getBatalhao().toString() + "\nPatrimonio: " + viatura5.getCodPatrimonio() 
                + "\nPlaca: " + viatura5.getPlaca());
        System.out.println(viatura5.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Central, a viatura sofreu uma colisao, durante a perseguicao ao elemento, copiado?!");
        viatura5.acusarProblema();
        System.out.println(viatura5.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura5.acionarManutencao();
        System.out.println(viatura5.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        viatura5.retornoManutencao();
        System.out.println(viatura5.getEstadoViatura().toString());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Situacao atual: " + utilizacao3.getEstadoUtilizacao().toString().toUpperCase());
        utilizacao3.finalizar();
        utilizacao3.aguardarProxima();
        System.out.println("----------------------------------------------------------------------------------------------------------");   
           
    }
}

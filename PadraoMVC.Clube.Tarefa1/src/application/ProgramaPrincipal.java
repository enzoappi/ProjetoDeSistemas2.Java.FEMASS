/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.CategoriaController;
import controller.DependenteController;
import controller.MensalidadeController;
import controller.SocioController;
import java.time.LocalDate;
import model.Categoria;
import model.Dependente;
import model.Mensalidade;
import model.Socio;
import view.CategoriaView;
import view.DependenteView;
import view.MensalidadeView;
import view.SocioView;

/**
 *
 * @author enzoappi
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        /*-------------------------------------------------------------------------------------
                                             BANCO DE DADOS
        --------------------------------------------------------------------------------------*/
        //Alimentar a base de dados
        Socio socio1 = new Socio();
        socio1.setCartao(108653212);
        socio1.setNome("Odair Hellmann");
        socio1.setEndereco("R. Álvaro Chaves, 41, Laranjeiras, Rio de Janeiro - RJ");
        socio1.setEmail("hellmann.odair@gmail.com");
        
        Dependente dependente1 = new Dependente();
        dependente1.setCartao(112834166);
        dependente1.setNome("Franz Hellmann");
        dependente1.setParentesco("filho");
        dependente1.setEmail("hellmann.franz@gmail.com");
        
        Mensalidade mensalidade = new Mensalidade();
        mensalidade.setDataMensalidade(LocalDate.now().minusDays(24));
        mensalidade.setValorMensalidade(150.00);
        mensalidade.setQuitacaoMensalidade(true);
        mensalidade.setDataPgtoMensalidade(LocalDate.now().minusDays(24));
        mensalidade.setValorPgto(150.00);
        mensalidade.calcJuros();
        
        Categoria categoria1 = new Categoria();
        categoria1.setDescricaoCategoria("socio ativo");
        
        /*-------------------------------------------------------------------------------------
                            VISUALIZACAO DAS INFORMACOES DO BANCO DE DADOS
        --------------------------------------------------------------------------------------*/
        
        //Gerarar a view Socio
        SocioView socioView1 = new SocioView();
        SocioController socioController = new SocioController(socio1, socioView1);
        socioController.atualizarViewSocio();
        
        //Gerarar a view Dependente
        DependenteView dependenteView1 = new DependenteView();
        DependenteController dependenteController = new DependenteController(dependente1, dependenteView1);
        dependenteController.atualizarViewDependente();
        
        //Gerarar a view Mensalidade
        MensalidadeView mensalidadeView = new MensalidadeView();
        MensalidadeController mensalidadeController = new MensalidadeController(mensalidade, mensalidadeView);
        mensalidadeController.atualizarViewMensalidade();
        
        //Gerarar a view Categoria
        CategoriaView categoriaView1 = new CategoriaView();
        CategoriaController categoriaController = new CategoriaController(categoria1, categoriaView1);
        categoriaController.atualizarViewCategoria();
        
        
        /*-------------------------------------------------------------------------------------
                               ATUALIZACAO E VISUALIZACAO DAS INFORMACOES
        ---------------------------------------------------------------------------------------
                                               SOCIO
        --------------------------------------------------------------------------------------*/
        
        //Atualizar os dados do model
        socioController.setCartaoSocio(132356465);
        socioController.setNomeSocio("Abel Ferreira");
        socioController.setEnderecoSocio("Rua Palestra Itália 1840, Perdizes, São Paulo - SP");
        socioController.setEmailSocio("ferreira.abel@gmail.com");
        socioController.atualizarViewSocio();
        
        /*-------------------------------------------------------------------------------------
                                             DEPENDENTE
        --------------------------------------------------------------------------------------*/

        //Atualizar os dados do model
        dependenteController.setCartaoDependente(133456782);
        dependenteController.setNomeDependente("Paloma Ferreira");
        dependenteController.setParentescoDependente("filha");
        dependenteController.setEmailDependente("ferreira.paloma@gmail.com");
        dependenteController.atualizarViewDependente();
        
        /*-------------------------------------------------------------------------------------
                                             MENSALIDADE
        --------------------------------------------------------------------------------------*/
        
        //Atualizar os dados do model
        mensalidadeController.setDataMensalidadeCtrl(LocalDate.now().minusDays(24));
        mensalidadeController.setValorMensalidadeCtrl(150.00);
        mensalidadeController.setQuitacaoMensalidadeCTRL(false);
        mensalidadeController.setDataPgtoMensalidadeCtrl(LocalDate.now());
        mensalidadeController.setValorPgtoCtrl(0.0);
        mensalidadeController.calcJurosCtrl();
        mensalidadeController.atualizarViewMensalidade();
        
        /*-------------------------------------------------------------------------------------
                                             CATEGORIA
        --------------------------------------------------------------------------------------*/
        
        //Atualizar os dados do model
        categoriaController.setCategoria("socio inativo");
        categoriaController.atualizarViewCategoria();
        
    }
}

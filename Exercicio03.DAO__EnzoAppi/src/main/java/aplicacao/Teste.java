/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Cliente;
import entidades.Fornecedor;
import entidades.Produto;

/**
 *
 * @author enzoappi
 */
public class Teste {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(123456, "Joao");
        Fornecedor fornecedor = new Fornecedor("205200001/30", "VoceSA");
        Produto produto = new Produto(23154, "Notebook Lenovo");
        
        System.out.println("Vamos inserir o cliente....");
        System.out.println("Cod. cliente: " + cliente.getCodigo()
                + " nome: " + cliente.getNome());
        cliente.inserir();
        System.out.println("");
        System.out.println("Serah que inseriu?");
        System.out.println("Cliente de codigo: " + cliente.getCodigo()); 
        cliente.localizar();
        System.out.println("");
        System.out.println("Vamos exclui-lo");
        cliente.excluir();
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("Vamos inserir o fornecedor....");
        System.out.println("CNPJ do fornecedor: " + fornecedor.getCnpj()
                + " razao social: " + fornecedor.getRazaoSocial());
        fornecedor.inserir();
        System.out.println("");
        System.out.println("Serah que inseriu?");
        System.out.println("CNPJ do fornecedor: " + fornecedor.getCnpj()); 
        fornecedor.localizar();
        System.out.println("");
        System.out.println("Vamos exclui-lo");
        fornecedor.excluir();
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("Vamos inserir o produto....");
        System.out.println("Num. do produto: " + produto.getNumero()
                + " descricao: " + produto.getDescricao());
        produto.inserir();
        System.out.println("");
        System.out.println("Serah que inseriu?");
        System.out.println("NUm. do produto: " + produto.getNumero()); 
        produto.localizar();
        System.out.println("");
        System.out.println("Vamos exclui-lo");
        produto.excluir();
        
    }
}

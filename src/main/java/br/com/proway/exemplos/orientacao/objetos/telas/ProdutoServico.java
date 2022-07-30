package br.com.proway.exemplos.orientacao.objetos.telas;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProdutoServico {

    // Lista onde será armazenado os produtos
    private ArrayList<Produto> produtos;

    public ProdutoServico() {
        produtos = lerProdutosEmArquivoJson();
    }

    public void adicionar(Produto produto) {
        produto.setCodigo(obterUltimoCodigo() + 1);

        produtos.add(produto);

        gravarProdutoEmArquivoJson();
    }

    public boolean editar(Produto produtoParaEditar) {
        // Percorrer a lista de produtos afim de encontrar o 
        // produto que deverá ser modificado
        for (var i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            // Verifica se o produto atual que está sendo percorrido,
            // possuí o mesmo código do produto desejado
            if (produto.getCodigo() == produtoParaEditar.getCodigo()) {
                produto.setNome(produtoParaEditar.getNome());
                produto.setPrecoUnitario(produtoParaEditar.getPrecoUnitario());
                produto.setQuantidade(produtoParaEditar.getQuantidade());
                
                gravarProdutoEmArquivoJson();
                
                // Retorna true pq o produto foi encontrado e alterado
                return true;
            }
        }
        // Retorna false pq não foi encontrado nenhum produto com o 
        // código desejado
        return false;
    }

    public boolean apagar(String nome) {
        // https://bit.ly/3yczoSz
        // Percorrer a lista de produtos, buscando o produto que contém o 
        // nome desejado e este produto será removido da lista de produtos
        for (int i = 0; i < produtos.size(); i++) {
            // Obtém o produto em determinado indice da lista de produtos
            Produto produtoAtual = produtos.get(i);
            // Verifica se o produto obtido da lista contém o nome desejado
            if (produtoAtual.getNome().equalsIgnoreCase(nome)) {
                // Remove o produto desejado da lista de produtos
                produtos.remove(produtoAtual);
                
                gravarProdutoEmArquivoJson();
                
                //Retorna true pois foi possível encontrar o produto com 
                // este nome
                return true;
            }
        }
        // Retorna false pois não foi possível encontrar o produto com 
        // este nome
        return false;
    }

    public ArrayList<Produto> obterTodosProdutos() {
        return produtos;
    }

    public int obterUltimoCodigo() {
        // Verificando se a lista de produtos está vazia
        if (produtos.isEmpty()) {
            return 0;
        }

        // Ultima posição é composta da quantidade de elementos da lista - 1
        var ultimaPosicao = produtos.size() - 1;

        var ultimoProduto = produtos.get(ultimaPosicao);

        return ultimoProduto.getCodigo();
    }

    public Produto obterProdutoPorCodigo(int codigo) {
        // Percorrer a lista de produtos procurando o produto com o código desejado
        for (int i = 0; i < produtos.size(); i++) {
            // Produto que está sendo percorrido
            Produto produto = produtos.get(i);
            // Verificar se o produto percorrido contém o código desejado
            if (produto.getCodigo() == codigo) {
                // Retorna o produto pois este produto contém o código desejado
                return produto;
            }
        }

        // Retorna null pois não foi possível encontrar o produto com o código desejado
        return null;
    }

    public void gravarProdutoEmArquivoJson() {
        // Deserialização (converter lista de produtos(objetos) em uma string contendo o JSON
        String produtoEmJson = new Gson().toJson(produtos);

        // https://bit.ly/3NWCiAy
        try {
            // Instanciando um objeto de FileWriter, classe que permite 
            // criar e escrever em arquivos.
            FileWriter escritorDeArquivo = new FileWriter("produtos.json");
            // Escreve o conteúdo da lista de produtos no formato JSON no arquivo
            // produtos.json
            escritorDeArquivo.write(produtoEmJson);
            escritorDeArquivo.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível escrever no arquivo");
        }
    }

    public ArrayList<Produto> lerProdutosEmArquivoJson() {
        try {
            // Instanciar um objeto do arquivo
            File arquivo = new File("produtos.json");
            Scanner scanner = new Scanner(arquivo);
            String texto = "";
            // Enquanto o scanner conter próxima linha
            while (scanner.hasNextLine()) {
                // ler linha do scanenr, adicionadndoi no texcto
                texto += scanner.nextLine();
            }
            
            // Validar se encontrou alguma linha no arquivo JSON
            if(texto.length() == 0){
                return new ArrayList<Produto>();
            }
            
            // Obtém o tipo da lista de produtos, para que seja possível converter
            // o json em lista de produtos.
            var typeToken = new TypeToken<ArrayList<Produto>>() {
            }.getType();
            // Faz a conversão do texto contendo o JSON para a lista de Produtos
            var produtos = (ArrayList<Produto>) new Gson()
                    .fromJson(texto, typeToken);
            // retorna a lista de produtos lidos do arquivo JSON
            return produtos;
        } catch (Exception e) {
            return new ArrayList<Produto>();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_gumbo;

import java.util.ArrayList;

/**
 *
 * @author dicasado
 */
public class Produto implements Cloneable {

    private TipoProduto tipo;
    private TipoPreco tipo2;
    private String nome;
    private String desc;
    private double preco;
    private double quantidade;

    private ArrayList<Stock> stocks;

    public Produto(TipoProduto tipo, TipoPreco tipo2, String nome, String desc, double preco, double quantidade) {
        this.tipo = tipo;
        this.tipo2 = tipo2;
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
        this.quantidade = quantidade;

        stocks = new ArrayList<>();
    }
    
    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    public TipoPreco getTipo2() {
        return tipo2;
    }

    public void setTipo2(TipoPreco tipo2) {
        this.tipo2 = tipo2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public ArrayList<Stock> getStock() {
        return stocks;
    }
    
        public ArrayList<Stock> getStocks() {
        return (ArrayList<Stock>)stocks.clone();
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setSaldoInicial(double saldo) {
        if (stocks.size() > 0) {
            throw new RuntimeException("Não se pode actualizar o saldo quando existem movimentos.");
        }
        this.quantidade = quantidade;
    }

    public void adicionarMovimento(Stock stock) {
        stocks.add(stock);
        if (stock.getMovimento() == TipoMovimento.ENTRADA) {
            quantidade += stock.getQuant();
        } else {
            quantidade -= stock.getQuant();
        }
    }

    @Override
    public String toString() {
        return nome + " (" + tipo.toString() + ")  -  " + preco + "€/" + tipo2.toString() + "  Stock: " + quantidade;
    }

    public void removerMovimento(Stock stock) {
        if (stocks.remove(stock)) {
            if (stock.getMovimento() == TipoMovimento.ENTRADA) {
                quantidade -= stock.getQuant();
            } else {
                quantidade += stock.getQuant();
            }
        }
    }

    public void actualizarSaldo(Stock antigo, Stock novo) {
        if (antigo.getMovimento() == TipoMovimento.SAIDA) 
            quantidade -= antigo.getQuant();
         else 
            quantidade += antigo.getQuant();
        
        if (novo.getMovimento() == TipoMovimento.ENTRADA) 
            quantidade += novo.getQuant();
         else 
            quantidade -= novo.getQuant();
        
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_gumbo;

/**
 *
 * @author dicasado
 */
public class Stock implements Cloneable {

    private Data data;
    private String lote;
    private double quant;
    private TipoPreco tipo;
    private TipoMovimento movimento;
    private Data validade;

    public Stock(Data data, String lote, double quant, TipoPreco tipo, TipoMovimento movimento, Data validade) {
        this.lote = lote;
        this.data = data;
        this.quant = quant;
        this.tipo = tipo;
        this.movimento = movimento;
        this.validade = validade;
    }

    public Stock(String lote, double quant, TipoPreco tipo, TipoMovimento movimento) {
        this(new Data(), lote, quant, tipo, movimento, new Data());
    }

    public Data getData() {
        return data;
    }

    public String getLote() {
        return lote;
    }

    public double getQuant() {
        return quant;
    }

    public TipoPreco getTipoPreco() {
        return tipo;
    }

    public Data getValidade() {
        return validade;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }

    public void setTipoPreco(TipoPreco tipo) {
        this.tipo = tipo;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public void setMovimento(TipoMovimento movimento) {
        this.movimento = movimento;
    }

    public TipoMovimento getMovimento() {
        return movimento;
    }
    
    
    @Override
    public String toString() {
        return "["+movimento+"] "+data.toString()+" - Lote: "+lote+"  - " +Double.toString(quant) + tipo.toString()+" ";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}

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
public class GestaoGumbo {

    private ArrayList<Produto> produtos;

    private static final GestaoGumbo instancia = new GestaoGumbo();

    public static GestaoGumbo getGumbo() {
        return instancia;
    }

    
    private GestaoGumbo() {
        produtos = new ArrayList<>();

    }

    public void adicionarProd(Produto p) {
        produtos.add(p);

    }

    public void removerProd(Produto p) {
        produtos.remove(p);
    }

    public ArrayList<Produto> getProd() {
        return (ArrayList<Produto>) produtos.clone();
    }
    /**
     * @param args the command line arguments
     */

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_gumbo;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Marco
 */
public class Data implements Cloneable{
    private int dia, mes, ano;

    public Data() {
        Calendar cal=new GregorianCalendar();
        this.dia=cal.get(Calendar.DAY_OF_MONTH);
        this.mes=cal.get(Calendar.MONTH)+1;
        this.ano=cal.get(Calendar.YEAR);
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    
    
}
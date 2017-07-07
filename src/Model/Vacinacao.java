/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author KHAICK O. BRITO
 */
public class Vacinacao {
    private static int add = 0;
    private int id;
    private Vacina vacina;
    private Date data;
    private Animal animal;
    private boolean aplicada; //Se ja foi aplicada ou não;
    
    public Vacinacao (Date date, Vacina vac, Animal animal){
        vacina = vac;
        data = date;
        this.animal = animal;
        id = ++add;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public Date getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isAplicacao() {
        return aplicada;
    }

    public void setAplicada() {
        aplicada = true;
    }
    
}

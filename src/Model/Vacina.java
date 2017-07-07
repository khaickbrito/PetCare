/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author KHAICK O. BRITO
 */
public class Vacina {
    private static int add = 0;
    private int id;
    private int dataCiclo;
    private String nome;
    private String tipo;
    private String posologia;
    private String descricao;

    public Vacina(String nome, String tipo, String posologia, String descricao, int dataCiclo) {
        this.nome = nome;
        this.tipo = tipo;
        this.posologia = posologia;
        this.descricao = descricao;
        this.dataCiclo = dataCiclo;
        id = ++add;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataCiclo(int dataCiclo) {
        this.dataCiclo = dataCiclo;
    }

    public int getId() {
        return id;
    }    
}

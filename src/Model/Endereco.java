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
public class Endereco {
    private static int add = 0;
    private int id;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String cep;
    private String numero;

    public Endereco(String estado, String cidade, String bairro, String rua, String cep, String numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        id = ++add;
    }

    
    
    public void EditarEndereco(String estado, String cidade, String bairro, String rua, String numero, String cep){
        setEstado(estado);
        setBairro(bairro);
        setCidade(cidade);
        setNumero(numero);
        setCep(cep);
        setRua(rua);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}

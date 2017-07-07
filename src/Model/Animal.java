/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author KHAICK O. BRITO
 */
public class Animal {
    private static int add = 0;
    private int id;
    private String nome;
    private String especie;
    private String raça;
    private String data_nascimento;
    private String sexo;
    private String registro; //Animais que são registrados nas associações.

    public Animal(String nome, String especie, String raça, String data_nascimento, String sexo, String registro) {
        this.nome = nome;
        this.especie = especie;
        this.raça = raça;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.registro = registro;
        id = ++add;
    }
    
    public void editarAnimal(String nome, String especie, String raça, String data_nascimento, String sexo, String registro){
        this.nome = nome;
        this.especie = especie;
        this.raça = raça;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.registro = registro;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    
}

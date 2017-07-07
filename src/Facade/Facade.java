/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Controller.Controller;
import Model.Animal;
import Model.Cliente;
import Model.Vacina;
import Model.Vacinacao;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author KHAICK O. BRITO
 */
public class Facade {
    private Controller control;
    private LinkedList<String> list;
    
    public Facade() {
        control = new Controller();
    }
    
    public Iterator vacinacoesDoDia(Date data){
        Iterator it = control.getVacinacoesDia(data);
        list = new LinkedList<>();
        while(it.hasNext()){
            Cliente c = (Cliente) it.next();
            String nome = c.getNome();
//            String cpf = c.getCpf();
//            int id = c.getId();
//            String form = id + "| " + nome + " | " + cpf;
//            list.add(form);
            list.add(nome);
        }
        return list.iterator();
    }
    
    public boolean cadastrarCliente(String nome, String cpf, String email, String data_nascimento, String estado, String cidade, String bairro, 
        String rua, String numero, String cep, LinkedList tele){
        return control.cadastrarCliente(nome,cpf,email,data_nascimento,estado,cidade,bairro,
                rua,numero,cep,tele);
    }
    public boolean removerCliente(int idCliente){
        return control.removerCliente(idCliente);
    }    
    public LinkedList buscarCliente(String nome){
        return control.buscarCliente(nome);
    }
    public boolean editarCliente(int idCliente, String nome, String cpf, String email, String estado, String cidade, String bairro, String rua, String numero, String cep){
        return control.editarCliente(idCliente, nome, cpf, email, estado, 
                cidade, bairro, rua, numero, cep);
    }
    public void adicionarTelefoneCliente(int idCliente, String tel){
        control.adicionarTelefoneCliente(idCliente, tel);
    }
    public void removerTelefoneCliente(){
        
    }
    public Animal cadastrarAnimalCliente(String nome,String especie,String raça,String sexo,String registro, String dnasc, int idCliente){
        return control.cadastrarAnimalCliente(nome, especie, raça, sexo, registro, dnasc, idCliente);
    }
    public void removerAnimalCliente(int idCliente, int idAnimal){
        control.removerAnimalCliente(idCliente, idAnimal);
    }
    public void editarAnimal(int idCliente, int idAnimal, String nome,String especie,String raça){
        control.editarAnimal(idCliente, idAnimal, nome, especie, raça);
    }
    public Vacina cadastrarVacina(String nome, String tipo, String posologia, String descricao, int dataCiclo){
        return control.cadastrarVacina(nome, tipo, posologia, descricao, dataCiclo);
    }
    public void editarVacina(int idVacina, String nome, String tipo, String posologia, String descricao){
        
    }
    public Vacina buscarVacina(String nome){
        return control.buscarVacina(nome);
    }
    public boolean removerVacina(int idVacina){
        return control.removerVacina(idVacina);
    }
    public Iterator verAnimaisCliente(int idCliente){
        return null;
    }
    public void criarVacinacao(int idVacina, int idCliente, int idAnimal, String dosagem){
        control.criarVacinacao(idVacina, idCliente, idAnimal, dosagem);
    }
    public Vacinacao excluirVacinacao(int idVacinacao){
        return control.excluirVacinacao(idVacinacao);
    }
    public Iterator getVacinacoesDia(Date data){
        return control.getVacinacoesDia(data);
    }  
    public Iterator buscarVacinacoesAnimal(){
        return control.buscarVacinacoesAnimal();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Facade.Facade;
import java.util.LinkedList;
import Model.*;
import java.util.Date;
import java.util.Iterator;
import Persistencia.*;
/**
 *
 * @author KHAICK O. BRITO
 */
public class Controller {
    private LinkedList<Cliente> clientes;
    private LinkedList<Vacina> vacinas;
    private LinkedList<Vacinacao> vacinacoes;
    
    public Controller(){
        clientes = new LinkedList<>();
        vacinas = new LinkedList<>();
        vacinacoes = new LinkedList<>();
    }
    
    public boolean cadastrarCliente(String nome, String cpf, String email, String data_nascimento, String estado, String cidade, String bairro, 
        String rua, String numero, String cep, LinkedList tele){
        ClienteDAO clienteDAO = new ClienteDAO();
        int idCliente = clienteDAO.cadastrarCliente(nome,cpf,email,data_nascimento,tele);
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.cadastrarEndereco(estado,cidade,bairro,rua,numero,cep,idCliente);
        return true;
    }   
    
    public boolean removerCliente(int idCliente){
        Cliente c = buscarCliente(idCliente);
        if(c!=null){
            clientes.remove(c);
            return true;
        }else
            return false;
    }   
    private Cliente buscarCliente(int idCliente){
        for(Iterator it = clientes.iterator();it.hasNext();){
            Cliente c = (Cliente) it.next();
            if(c.getId()==idCliente){
                return c;
            }
        }
        return null;
    }
    public LinkedList buscarCliente(String nome){
        LinkedList list = new LinkedList();
        for(Iterator it = clientes.iterator();it.hasNext();){
            Cliente c = (Cliente) it.next();
            if(c.getNome().equals(nome)){
                list.add(c);
                return list;
            }
        }
        return null;
    }
    public boolean editarCliente(int idCliente, String nome, String cpf, String email, String estado, String cidade, String bairro, String rua, String numero, String cep){
        Cliente c = buscarCliente(idCliente);
        if(c!=null){
            c.EditarCliente(nome, cpf, email,estado, cidade, bairro, rua, numero, cep);
            return true;
        }else
            return false;
    }
    public void adicionarTelefoneCliente(int idCliente, String tel){
        Cliente c = buscarCliente(idCliente);
        if(c!=null)
            c.addTelefone(tel);
    }
    public void removerTelefoneCliente(){
        
    }     
    public Animal cadastrarAnimalCliente(String nome,String especie,String raça,String sexo,String registro, String dnasc, int idCliente){
        Animal a = new Animal(nome, especie, raça, dnasc, registro, sexo);
        Cliente c = clientes.get(idCliente-1);
        c.addAnimal(a);
        return a;
    }
    public void removerAnimalCliente(int idCliente, int idAnimal){
        Cliente c = buscarCliente(idCliente);
 
    }
    public void editarAnimal(int idCliente, int idAnimal, String nome,String especie,String raça){
        Cliente c = buscarCliente(idCliente);
        
    }    
    public Vacina cadastrarVacina(String nome, String tipo, String posologia, String descricao, int dataCiclo){
        Vacina v = new Vacina(nome, tipo, posologia, descricao, dataCiclo);
        vacinas.add(v);
        return v;
    }    
    public void editarVacina(int idVacina, String nome, String tipo, String posologia, String descricao){
        
    }   
    private Vacina buscarVacina(int idVacina){
        for(Iterator it = vacinas.iterator();it.hasNext();){
            Vacina v = (Vacina) it.next();
            if(v.getId()== idVacina){
                return v;
            }
        }
        return null;
    }    
    public Vacina buscarVacina(String nome){
        for(Iterator it = vacinas.iterator();it.hasNext();){
            Vacina v = (Vacina) it.next();
            if(v.getNome().equals(nome)){
                return v;
            }
        }
        return null;
    }    
    public boolean removerVacina(int idVacina){
        Vacina v = buscarVacina(idVacina);
        if(v!=null){
            vacinas.remove(v);
            return true;
        }else
            return false;
    }    
    public Iterator verAnimaisCliente(int idCliente){
        Cliente c = buscarCliente(idCliente);
        LinkedList a = c.getAnimais();
        return a.iterator();
    }
    public void criarVacinacao(int idVacina, int idCliente, int idAnimal, String dosagem){
        Cliente cliente = buscarCliente(idCliente);
        Vacina vacina = buscarVacina(idVacina);
        
    }
    public Vacinacao excluirVacinacao(int idVacinacao){
        return null;
    }
    public Iterator getVacinacoesDia(Date data){
        return null;
    }  
    public Iterator buscarVacinacoesAnimal(){
        return null;
    }
    
}

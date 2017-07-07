    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author KHAICK O. BRITO
 */
public class Cliente {
    private static int add;
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String data_nascimento;
    private Endereco end;
    private LinkedList<String> telefones;
    private LinkedList<Animal> animais;

    public Cliente(String nome, String cpf, String email, String data_nascimento, String estado, String cidade, String bairro, String rua, String numero, String cep, LinkedList tele) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.data_nascimento = data_nascimento;
        end = new Endereco(estado, cidade, bairro, rua, cep, numero);
        telefones = new LinkedList();
        for(Iterator it = tele.iterator();it.hasNext();){
            String n = (String) it.next();
            telefones.add(n);
        }
        animais = new LinkedList<>();
        id = ++add;
    }
    
    public void EditarCliente(String nome, String cpf, String email, String estado, String cidade, String bairro, String rua, String numero, String cep){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        end.EditarEndereco(estado, cidade, bairro, rua, numero,cep);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public LinkedList<Animal> getAnimais() {
        return animais;
    }

    public LinkedList<String> getTelefones() {
        return telefones;
    }
    
    public String removerTelefone(int id){
        String tel = telefones.get(id);
        telefones.remove(id);
        return tel;
    }

    public void addTelefone(String tel){
        telefones.add(tel);
    }
    
    public void addAnimal(Animal animal){
        animais.add(animal);
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public boolean removerAnimal(int id){ //Mudar para exception
        Animal a;
        for (int i = 0; !animais.isEmpty(); i++) {
            a = (Animal) animais.get(i);
            if (a.getId() == id) {
                animais.remove(i);
                return true;
            }
        }
        return false;
    }
}

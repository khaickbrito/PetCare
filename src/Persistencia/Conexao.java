/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author KHAICK O. BRITO
 */
public class Conexao {

    Connection con;
    public Statement stm;
    public Connection conn;

    public Conexao() {

    }

    public Connection abrirBDConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jbdc:mysql://localhost:3306/petshop";
            con = DriverManager.getConnection(url,"root","a1b2c3d4");
            System.out.println("Conexao efetuada com sucesso");
            return con;
        }
        catch(Exception e){
            System.out.println("Erro ao abrir conexao com banco: ");
            e.printStackTrace();
            return null;
        }
    }
    
    public void fecharBDConn(){
        try{
            con.close();
            System.out.println("Conexao finalizada com sucesso");
        }catch(Exception e){
            System.out.println("Erro ao fechar conexao com banco" + e.getMessage());
        }
    }
    

}
 
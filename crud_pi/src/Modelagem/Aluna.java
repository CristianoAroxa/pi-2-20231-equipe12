/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm-2
 */
public class Aluna {

    private int ra;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    
    MergeSort sort = new MergeSort();
    Conexao con = new Conexao();
   
   
    
    
    public Aluna(){
        this(0,"","","","");
    }

    public Aluna(int ra, String nome, String telefone, String email, String senha) {
        this.ra = ra;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    
    
    
    public void cadastrarAluna(){
        
        String sql;
        sql = "Insert into alunas(ra,nome,telefone,email,senha)values"+"("+ getRa() +" ,'"+ getNome()+"' ,  '" + getTelefone() +"','" + getEmail() +"','"+getSenha()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!");
    }
    
     public void alterarAluno(){
        String sql;
        sql = "Update alunas set nome='" + getNome() +"', telefone='"+ getTelefone()
                +"',email='" + getEmail() + "',senha='"+getSenha()+"',where ra="+ getRa();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
    
    public void excluirAluna(){
        String sql;
        sql = "Delete from alunas where ra=" + getRa();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    }
    public ResultSet consultarAlunas(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from Alunas";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
      public ResultSet pesquisarAluna(){
        ResultSet tabela;
        tabela = null;
        
        try{
             String sql = "Select * from alunas where ra=" + getRa() +"";
             tabela = con.RetornarResultset(sql);
             
        }
        catch(Exception sqle){
            JOptionPane.showMessageDialog(null,"Atenção!!!" + sqle.getMessage());
        }
        return tabela;
  
       
  
    } 
    
    public ResultSet logarAluno(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from alunas where email='"+getEmail()+"' and senha='"+getSenha()+"'";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void ordenar(){
       ResultSet tabela = consultarAlunas();
       
       try{
          
           while (tabela.next()){ 
               int Ra = tabela.getInt("ra");
               int[] Aluno = new int[100];
               for(int i=0; i <= 1;i++){
                  Aluno[i] = tabela.getInt("ra");
               } 
               int[] temp = new int[Aluno.length];
               sort.mergeSort(Aluno);
               String nome = tabela.getString("nome");
               String telefone = tabela.getString("telefone");
               String email = tabela.getString("email");
               String senha = tabela.getString("senha");
           
            
               
           }
       }catch(SQLException e){
            e.printStackTrace();{
       }
       }
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   

    
}
   /*public void ordenar(){
       ResultSet tabela = consultarAlunos();
       
       try{
          
           while (tabela.next()){ 
               int Ra = tabela.getInt("Ra");
               int[] Aluna = new int[100];
               for(int i=0; i <= 10;i++){
                  Aluna[i] = tabela.getInt("Ra");
                  JOptionPane.showMessageDialog(null, Aluna[i]);
               }
               int[] temp = new int[Aluna.length];
               sort.mergeSort(Aluna);
               String Nome = tabela.getString("Nome");
               String Telefone = tabela.getString("Telefone");
               String Email = tabela.getString("Email");
               //Aluno aluno = new Aluna(Ra,Nome,Telefone,Email);
            
               
           }
       }catch(SQLException e){
            e.printStackTrace();{
       }*/

       
   



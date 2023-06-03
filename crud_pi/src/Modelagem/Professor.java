/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm-2
 */
public class Professor {
    private int rm;
    private String nomeProf;
    private String emailProf;
    private String telProf;
    private String senhaProf;
    private String titulacao;
    
    private Conexao con = new Conexao();
    MergeSort sort = new MergeSort();
    
    public Professor(){
        this(0,"","","","","");   
  
    }

    public Professor(int rm, String nomeProf, String emailProf, String telProf, String senhaProf, String titulacao) {
        this.rm = rm;
        this.nomeProf = nomeProf;
        this.emailProf = emailProf;
        this.telProf = telProf;
        this.senhaProf = senhaProf;
        this.titulacao = titulacao;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getEmailProf() {
        return emailProf;
    }

    public void setEmailProf(String emailProf) {
        this.emailProf = emailProf;
    }

    public String getTelProf() {
        return telProf;
    }

    public void setTelProf(String telProf) {
        this.telProf = telProf;
    }

    public String getSenhaProf() {
        return senhaProf;
    }

    public void setSenhaProf(String senhaProf) {
        this.senhaProf = senhaProf;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

  
    
     public void cadastrarProfessor(){
        
        String sql;
        sql = "Insert into professores(rm,nomeProf,emailProf,telProf,titulacao)values"+"("+ getRm()+" ,'"+ getNomeProf()+"' , '" + getEmailProf() +"' ,  '" + getTelProf() +"','" + getTitulacao() +"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!");
    }
    
     public void alterarProfessor(){
        String sql;
        sql = "Update professores set nomeProf='"+ getNomeProf() +"',emailProf='"+getEmailProf()+"', telProf='"+ getTelProf()
                +"',Titulacao='" + getTitulacao() + "' where rm=" + getRm();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
    
    public void excluirProfessor(){
        String sql;
        sql = "Delete from professores where rm=" + getRm();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    }
    public ResultSet consultarProfessor(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from professores";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public ResultSet logarProf(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from professores where rm="+getRm()+" and emailprof='"+getEmailProf()+"'";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public ResultSet pesquisarProfessor(){
        ResultSet tabela;
        tabela = null;
        
        try{
             String sql = "Select * from professores where rm=" + getRm() +"";
             tabela = con.RetornarResultset(sql);
             
        }
        catch(Exception sqle){
            JOptionPane.showMessageDialog(null,"Atenção!!!" + sqle.getMessage());
        }
        return tabela;
  
    }
      
    public void ordenar(){
       ResultSet tabela = consultarProfessor();
       
       try{
          
           while (tabela.next()){ 
               int Rm = tabela.getInt("Rm");
               int[] Professor = new int[100];
               for(int i=0; i <= 1;i++){
                  Professor[i] = tabela.getInt("Rm");
               } 
               int[] temp = new int[Professor.length];
               sort.mergeSort(Professor);
               String nomeProf = tabela.getString("NomeProf");
               String emailProf = tabela.getString("EmailProf");
               String telProf = tabela.getString("TelProf");
               String titulacao = tabela.getString("Titulacao");
               
               //Aluno aluno = new Aluno(Ra,Nome,Telefone,Email);
            
               
           }
       }catch(SQLException e){
            e.printStackTrace();{
       }
       }
   }  
    
    
   
    
}

    

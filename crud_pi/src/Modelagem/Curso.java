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
public class Curso {
    private int codCurso;
    private String nomeCurso;
    private String cargaHorCurso;
    private double preco;
    
    private Conexao con = new Conexao();
    MergeSort sort = new MergeSort();
    
    public Curso(){
        this(0,"","",0.0);
    }

    public Curso(int codCurso, String nomeCruso, String cargaHorCurso, double preco) {
        this.codCurso = codCurso;
        this.nomeCurso = nomeCruso;
        this.cargaHorCurso = cargaHorCurso;
        this.preco = preco;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCargaHorCurso() {
        return cargaHorCurso;
    }

    public void setCargaHorCurso(String cargaHorCurso) {
        this.cargaHorCurso = cargaHorCurso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void cadastrarCurso(){
        String sql;
        sql = "Insert into cursos(codCurso,nomeCurso,preco,cargaHorCurso)values"+"("+ getCodCurso()+" ,'"+ getNomeCurso() +"' ," + getPreco() +" , '"+ getCargaHorCurso()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Curso cadastrado com sucesso!!"); 
    }
    
    public ResultSet consultarCursos(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from cursos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void alterarCurso(){
        String sql;
        sql = "Update cursos set nomeCurso='"+ getNomeCurso() +"',preco='" + getPreco() +  "',carga horária='"+ getCargaHorCurso() +"' where codCurso=" + getCodCurso();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
    public void excluirCurso(){
        String sql;
        sql = "Delete from cursos where codCurso=" + getCodCurso();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    }
    public ResultSet pesquisarCurso(){
        ResultSet tabela;
        tabela = null;
        
        try{
             String sql = "Select * from cursos where codCurso=" + getCodCurso()+"";
             tabela = con.RetornarResultset(sql);
             
        }
        catch(Exception sqle){
            JOptionPane.showMessageDialog(null,"Atenção!!!" + sqle.getMessage());
        }
        return tabela;
  
    }
      
    public void ordenar(){
       ResultSet tabela = consultarCursos();
       
       try{
          
           while (tabela.next()){ 
               int codCurso = tabela.getInt("CodCurso");
               int[] Professor = new int[100];
               for(int i=0; i <= 1;i++){
                  Professor[i] = tabela.getInt("CodCurso");
               } 
               int[] temp = new int[Professor.length];
               sort.mergeSort(Professor);
               String nomeCurso = tabela.getString("NomeCurso");
               String preco = tabela.getString("Preco");
               String cargaHorCurso = tabela.getString("CargaHorCurso");
           
            
               
           }
       }catch(SQLException e){
            e.printStackTrace();{
       }
       }
    }
    
}

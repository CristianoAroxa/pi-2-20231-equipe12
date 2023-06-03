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
public class Modulo {
    
    private int codModulo;
    private String nomeModulo;
    private String descricaoModulo;
    private String cargaHorModulo;
    private int codCurso;
    
    private Conexao con = new Conexao();
    MergeSort sort = new MergeSort();
     
    public Modulo(){
       this(0,"","","",0);  
    }

    public Modulo(int codModulo, String nomeModulo, String descricaoModulo, String cargaHorModulo, int codCurso) {
        this.codModulo = codModulo;
        this.nomeModulo = nomeModulo;
        this.descricaoModulo = descricaoModulo;
        this.cargaHorModulo = cargaHorModulo;
        this.codCurso = codCurso;
    }

    public int getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(int codModulo) {
        this.codModulo = codModulo;
    }

    public String getNomeModulo() {
        return nomeModulo;
    }

    public void setNomeModulo(String nomeModulo) {
        this.nomeModulo = nomeModulo;
    }

    public String getDescricaoModulo() {
        return descricaoModulo;
    }

    public void setDescricaoModulo(String descricaoModulo) {
        this.descricaoModulo = descricaoModulo;
    }

    public String getCargaHorModulo() {
        return cargaHorModulo;
    }

    public void setCargaHorModulo(String cargaHorModulo) {
        this.cargaHorModulo = cargaHorModulo;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }  
 
    public void cadastrarModulo(){
        String sql;
        sql = "Insert into modulos(codModulo,nomeModulo,cargaHorModulo,descricaoModulo)values"+"("+ getCodModulo() +" ,'"+ getNomeModulo() +"'  , '" + getCargaHorModulo() +"','"+ getDescricaoModulo()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Módulo cadastrado com sucesso!!");
    }    
     
    public void alterarModulo(){
        String sql;
        sql = "Update modulos set nomeModulo='"+ getNomeModulo() +"', carga horária='"+ getDescricaoModulo() + "', carga horária='"+ getCargaHorModulo() + "' where codModulo=" + getCodModulo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
     public ResultSet consultarModulos(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from modulos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    public void excluirModulo(){
        String sql;
        sql = "Delete from modulos where codModulo=" + getCodModulo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    } 
    
    public ResultSet pesquisarModulo(){
        ResultSet tabela;
        tabela = null;
        
        try{
             String sql = "Select * from modulos where codModulo=" + getCodModulo() +"";
             tabela = con.RetornarResultset(sql);
             
        }
        catch(Exception sqle){
            JOptionPane.showMessageDialog(null,"Atenção!!!" + sqle.getMessage());
        }
        return tabela;
  
    }
      
    public void ordenar(){
       ResultSet tabela = consultarModulos();
       
       try{
          
           while (tabela.next()){ 
               int codModulo = tabela.getInt("CodModulo");
               int[] Modulo = new int[100];
               for(int i=0; i <= 1;i++){
                  Modulo[i] = tabela.getInt("CodModulo");
               } 
               int[] temp = new int[Modulo.length];
               sort.mergeSort(Modulo);
               String nomeModulo = tabela.getString("NomeModulo");
               String cargaHorModulo = tabela.getString("CargahorModulo");
               String descricaoModulo = tabela.getString("Descricao");
           
            
               
           }
       }catch(SQLException e){
            e.printStackTrace();{
       }
       }
    }
        
    
}

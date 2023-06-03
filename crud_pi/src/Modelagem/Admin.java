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
public class Admin {
    private int codAdm;
    private String nomeAdm;
    private String telAdm;
    private String emailAdm;
    private String senhaAdm;
    private int rm;
    private String nomeProf;
    private String emailProf;
    private String telProf;
    private String titulacao;
    private String codModulo;
    private String nomeModulo;
    private String descricaoModulo;
    private String cargaHorModulo;
    private int codCurso;
    private String nomeCurso;
    private double preco;
    private String cargaHorCurso;
    private int codPgto;
    private String dataPgto; 
           
    
    private Conexao con = new Conexao();
    MergeSort sort = new MergeSort();
    
    public Admin(){
        this(0,"","","","",0,"","","","","","","","",0,"",0.0,"",0,"");
    }

    public Admin(int codAdm, String nomeAdm, String telAdm, String emailAdm, String senhaAdm, int rm, String nomeProf, String emailProf, String telProf, String titulacao, String codModulo, String nomeModulo, String descricaoModulo, String cargaHorModulo, int codCurso, String nomeCurso, double preco, String cargaHorCurso, int codPgto, String dataPgto) {
        this.codAdm = codAdm;
        this.nomeAdm = nomeAdm;
        this.telAdm = telAdm;
        this.emailAdm = emailAdm;
        this.senhaAdm = senhaAdm;
        this.rm = rm;
        this.nomeProf = nomeProf;
        this.emailProf = emailProf;
        this.telProf = telProf;
        this.titulacao = titulacao;
        this.codModulo = codModulo;
        this.nomeModulo = nomeModulo;
        this.descricaoModulo = descricaoModulo;
        this.cargaHorModulo = cargaHorModulo;
        this.codCurso = codCurso;
        this.nomeCurso = nomeCurso;
        this.preco = preco;
        this.cargaHorCurso = cargaHorCurso;
        this.codPgto = codPgto;
        this.dataPgto = dataPgto;
    }
     public int getCodAdm() {
        return codAdm;
    }

    public void setCodAdm(int codAdm) {
        this.codAdm = codAdm;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public String getTelAdm() {
        return telAdm;
    }

    public void setTelAdm(String telAdm) {
        this.telAdm = telAdm;
    }

    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
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

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(String codModulo) {
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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCargaHorCurso() {
        return cargaHorCurso;
    }

    public void setCargaHorCurso(String cargaHorCurso) {
        this.cargaHorCurso = cargaHorCurso;
    }

    public int getCodPgto() {
        return codPgto;
    }

    public void setCodPgto(int codPgto) {
        this.codPgto = codPgto;
    }

    public String getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(String dataPgto) {
        this.dataPgto = dataPgto;
    }  

   
 
    public void cadastrarAdm(){
        String sql;
        sql = "Insert into admins(codAdm,nomeAdm,telAdm,emailAdm,senhaAdm)values"+"("+ getCodAdm() +" ,'"+ getNomeAdm()+"' , '" + getTelAdm() +"' ,  '" + getEmailAdm() +"',  '" + getSenhaAdm() +"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Adm cadastrado com sucesso!!");
    }
    
    public void cadsatrarProfessor(){
        String sql;
        sql = "Insert into professores(rm,nomeProf,emailProf,telProf,titulacao)values"+"("+ getRm() +" ,'"+ getNomeProf()+"' , '" + getEmailProf() +"' ,  '" + getTelProf() +"', '" + getTitulacao() +"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Professor cadastrado com sucesso!!");
    }
    
    public void cadastrarCurso(){
        String sql;
        sql = "Insert into cursos(codCurso,nomeCurso,cargaHorCurso,preco)values"+"("+ getCodCurso() +",'"+ getNomeCurso() +"' ,'"+ getCargaHorCurso()+"' , " + getPreco() +")";
        JOptionPane.showMessageDialog(null,"Curso cadastrado com sucesso!!"); 
    }
    
    public void cadastrarModulo(){
        String sql;
        sql = "Insert into modulos(codModulo,nomeModulo,cargaHorModulo,descricaoModulo)values"+"("+ getCodModulo() +" ,'"+ getNomeModulo() +"' ,'"+ getCargaHorModulo()+"' , '" + getDescricaoModulo() +"')";
        JOptionPane.showMessageDialog(null,"Módulo cadastrado com sucesso!!");
    }
    
    public void excluirAdm(){
        String sql;
        sql = "Delete from admins where codAdm=" + getCodAdm();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    }
    
    public void excluirProfessor(){
        String sql;
        sql = "Delete from professores where rm=" + getRm();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    }
    
    public void excluirCurso(){
        String sql;
        sql = "Delete from cursos where codCurso=" + getCodCurso();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    }
    
    public void excluirModulo(){
        String sql;
        sql = "Delete from modulos where codModulo=" + getCodModulo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro excluído com sucesso!!");
    }
    
    public void alterarAdm(){
        String sql;
        sql = "Update admins set nome='"+ getNomeAdm() +"', telAdm='"+ getTelAdm()
                +"',email='" + getEmailAdm() + "' where codAdm=" + getCodAdm();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
    
    public void alterarProfessor(){
        String sql;
        sql = "Update professores set nomeProf='"+ getNomeProf() +"', emailProf='"+ getEmailProf()
                +"',telProf='" + getTelProf() + "',titulação='" +getTitulacao() + "'where rm=" + getRm();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
    
    public void alterarCruso(){
        String sql;
        sql = "Update cursos set nomeCurso='"+ getNomeCurso() +"', carga horária='"+ getCargaHorCurso() +"',preco='" + getPreco() + "' where codCurso=" + getCodCurso();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
    
    public void alterarModulo(){
        String sql;
        sql = "Update modulos set nomeModulo='"+ getNomeModulo() +"', carga horária='"+ getCargaHorModulo() + "' where codModulo=" + getCodModulo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro alterado com sucesso!!");           
    }
     
    public ResultSet consultarAdmins(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from Admins";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public ResultSet consultarProfessor(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from professores";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public ResultSet consultarCursos(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from cursos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    } 
    
     public ResultSet consultarModulos(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from modulos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    public ResultSet logarAdm(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from admins where emailAdm='"+getEmailAdm()+"' and senhaAdm='"+getSenhaAdm()+"'";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
          
    public ResultSet pesquisarAdm(){
        ResultSet tabela;
        tabela = null;
        
        try{
             String sql = "Select * from admins where CodAdm=" + getCodAdm() +"";
             tabela = con.RetornarResultset(sql);
             
        }
        catch(Exception sqle){
            JOptionPane.showMessageDialog(null,"Atenção!!!" + sqle.getMessage());
        }
        return tabela;  
    }
    public void ordenar(){
       ResultSet tabela = consultarAdmins();
       
       try{
          
           while (tabela.next()){ 
               int Rm = tabela.getInt("CodAdm");
               int[] Professor = new int[100];
               for(int i=0; i <= 1;i++){
                  Professor[i] = tabela.getInt("CodAdm");
               } 
               int[] temp = new int[Professor.length];
               sort.mergeSort(Professor);
               String nomeAdm = tabela.getString("NomeAdm");
               String emailAdm = tabela.getString("EmailAdm");
               String telAdm = tabela.getString("TelAdm");
               String senhaAdm = tabela.getString("SenhaAdm");
               
               //Aluno aluno = new Aluno(Ra,Nome,Telefone,Email);
            
               
           }
       }catch(SQLException e){
            e.printStackTrace();{
       }
       }
       
} 
}
     
    

   /* public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, temp, left, middle);
            mergeSort(arr, temp, middle + 1, right);
            merge(arr, temp, left, middle, right);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int middle, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

   /* public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6, 4, 3, 8};
        System.out.println("Array antes do Merge Sort: ");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Array depois do Merge Sort: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }*/

   

 
    


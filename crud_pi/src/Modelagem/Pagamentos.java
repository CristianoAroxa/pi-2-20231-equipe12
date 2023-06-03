/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

/**
 *
 * @author dsm-2
 */
public class Pagamentos {
    private int codPgto;
    private String dataPgto;
    
    public Pagamentos(){
        
        this(0,"");
    }

    public Pagamentos(int codPgto, String dataPgto) {
        this.codPgto = codPgto;
        this.dataPgto = dataPgto;
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
    
}

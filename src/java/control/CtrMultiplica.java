/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Roberto MuVe
 */
@Named(value = "referencia")
@RequestScoped
public class CtrMultiplica {
    private int numero1 = 0;
    private int numero2 = 0;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int multiplica(){
        int resp = 0;
        resp = (numero1 * numero2);
        return resp;
    }

    public void impMultiplicacion() {
        final String Multiplicacion = "La multiplicacion de\n"  +
                                  getNumero1() + " x " + getNumero2() + " es igual a: " + multiplica();
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(Multiplicacion));
    }
}

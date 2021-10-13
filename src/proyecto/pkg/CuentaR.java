/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg;

/**
 *
 * @author libreria6
 */
public class CuentaR {
     String Nombre;
    String Banco;
    String NoCuenta;
    String Codigo;

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public void setNoCuenta(String NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public String getCodigo() {
        return Codigo;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getBanco() {
        return Banco;
    }

    public String getNoCuenta() {
        return NoCuenta;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexiones;

import java.sql.Connection;

/**
 *
 * @author juanj
 */
public abstract class BD_Cliente implements ConectarBD {

    protected Connection conn = null;

    public BD_Cliente() {

    }
    
    public boolean validarCliente(String correo, String pass){
        return false;
    }

    protected Connection abrirConexion() {
        return null;
    }

    protected boolean cerrarConexion() {
        return false;
    }
}

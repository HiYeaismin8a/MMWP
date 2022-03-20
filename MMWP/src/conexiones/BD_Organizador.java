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
public abstract class BD_Organizador implements ConectarBD {

    protected Connection conn = null;

    public BD_Organizador() {
    }

    public boolean probarConexion(String pass) {
        return abrirConexion(pass) == null;
    }

    protected Connection abrirConexion(String pass) {
        return null;
    }

    protected boolean cerrarConexion() {
        return false;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conexiones;

import java.sql.Connection;

/**
 *
 * @author juanj
 */
public interface ConectarBD {

    public String[] consultar(Object[] datos);

    public boolean actualizar(Object[] datosNuevos);

    public boolean eliminar(int id);

    public boolean insertar(Object[] datos);
}

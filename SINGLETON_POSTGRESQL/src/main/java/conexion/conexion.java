/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author POXS44
 */
public class conexion {
    
    private conexion() {
    }
    
    public static conexion getInstance() {
        return conexionHolder.INSTANCE;
    }
    
    private static class conexionHolder {

        private static final conexion INSTANCE = new conexion();
    }
}

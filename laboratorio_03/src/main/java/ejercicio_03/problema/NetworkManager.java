/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.problema;

/**
 *
 * @author jacks
 */
public class NetworkManager {

    

    public void connect() {
        GameConfig config = GameConfig.getInstance();
        System.out.println("Conectando a: " + config.getDatabaseUrl());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}

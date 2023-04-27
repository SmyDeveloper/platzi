/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.cajero;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Operaciones {
    
    
    // Se crean las variables de la clase operaciones para que puedan ser llamadas en los diferentes métodos e intercambiar clases entre sí.
    protected int deposito, extraer;
    private static int saldo;
    
   

    

 
   
   
    
   // Metodo depositar sin párametros
    public void Depositar() {
       
       float deposito =  Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar"));
       
       JOptionPane.showConfirmDialog(null, "Estas seguro de depositar esta cantidad: ARS " + deposito);
       JOptionPane.showMessageDialog(null, "El deposito se realizó de forma exitosa");
       
    
          if (deposito >0 ) {
           
                this.saldo += deposito;
          }
       
         
          System.out.println(saldo);
       
    }
    
    public void Extraccion () {
        
        float extraer = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el monto a extraer"));
       JOptionPane.showConfirmDialog(null, "Estas seguro de extraer esta cantidad: ARS " + extraer);
       JOptionPane.showMessageDialog(null, "La Extraccion se realizó de forma exitosa");
       
       saldo -= extraer;
       
    }
    
    public void MostrarSaldo () {
         
        JOptionPane.showMessageDialog(null, "Su Saldo es " + saldo);
        
    }
   
}

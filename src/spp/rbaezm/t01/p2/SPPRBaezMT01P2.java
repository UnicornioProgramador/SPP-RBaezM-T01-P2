/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.t01.p2;
import java.util.Scanner;

/**
 *
 * @author Ruben Daniel Báez Muñiz A01411504
 */
public class SPPRBaezMT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Base, Altu, Per, Sup;
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Ingresa la base");
        Base= kb.nextDouble();
        System.out.println("Ingresa la altura");
        Altu= kb.nextDouble();
        
        Sup= Base * Altu;
        Per= Altu + Altu + Base + Base;
        
        System.out.println("La superficie es=" + Sup);
        System.out.println("El perímetro es=" + Per);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1.exercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author jwern
 */
public class Aula1Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1,numero2,soma;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"O resultado da soma é: " + soma);

    }
    
}

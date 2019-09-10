
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mfpasold
 */
public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Lutador lutador = new Lutador();
        
            System.out.println("Olá, bem vindo ao nosso sistema, por favor digite o nome do lutador: ");
            lutador.setNome(teclado.nextLine());
        try {
            System.out.println("Agora informe o peso do lutador: ");
            lutador.setPeso(Integer.parseInt(teclado.nextLine()));
        }catch(Exception e) {
            System.out.println("Valor inválido, por favor digite novamente: ");
            lutador.setPeso(Integer.parseInt(teclado.nextLine()));
        }
        
        System.out.println(lutador.imprimir());
        
    }
}


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
    
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        Lutador lutador = new Lutador();
        int opcao = 1;
        
        do {
            System.out.println("Digite 1 para adicionar um lutador e 2 para ver a característica desse lutador");
            opcao = Integer.parseInt(teclado.nextLine());
            
            switch(opcao) {
                case 1:
                    novoLutador(lutador, teclado);
                    break;
                case 2:
                    System.out.println(lutador.imprimir());
                    break;
            }
            
        }while(opcao == 1 || opcao == 2);
        
        System.out.println("Adeus");
    }

    private static void novoLutador(Lutador lutador, Scanner teclado) throws Exception{
        System.out.println("Olá, bem vindo ao nosso sistema, por favor digite o nome do lutador: ");
        lutador.setNome(teclado.nextLine());
        while(true) {
            try {
                System.out.println("Agora informe o peso do lutador: ");
                lutador.setPeso(Integer.parseInt(teclado.nextLine()));
                break;
            }catch(Exception e) {
                System.out.println("Valor inválido");
            }
        }
    }
}

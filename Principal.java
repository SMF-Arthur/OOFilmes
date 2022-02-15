package Numero3;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {        
        
        Scanner recebe = new Scanner(System.in); 
        Filme fm[] = new Filme[3];        
        
        System.out.println("Digite as Informações abaixo solicitadas....");
        
        for(int i = 0; i < fm.length; i++){
           fm[i] =  lerInformacacoes(recebe, i);        
        }
        
        for(int i = 0; i < fm.length; i++){
            mostraInfoFilme(fm[i], i);
        }        
    }
    
    public static Filme lerInformacacoes(Scanner leitor, int i){        
        Filme fm = new Filme(); 
        int j = i +1;   
        
        System.out.println("\n\nDigite as Informações relacionadas ao "+ j +"º Filme.... ");
        
        System.out.println("Digite o nome do Filme : ");
        fm.nomeFilme = leitor.nextLine();
        
        System.out.println("Digite o nome do Autor : ");
        fm.autor = leitor.nextLine();  
        
        System.out.println("Digite o Ano do filme : ");
        fm.ano = leitor.nextInt(); 
        
        System.out.println("Digite preço do filme : ");
        fm.preco = leitor.nextDouble();  
        
        clearBuffer(leitor);
        
        return fm;        
    }    
    
    public static void mostraInfoFilme(Filme fm , int i){
        int j = i+1;
        
        System.out.println("\n\n------- Mostrando As Informações do "+ j +"º -------");
        
        System.out.println("Nome Do Filme : " + fm.nomeFilme);
        System.out.println("Nome Do Autor : " + fm.autor);
        System.out.println("Ano Do Filme : " + fm.ano);
        System.out.println("Preço Do Filme : " + fm.preco);
    }
    
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
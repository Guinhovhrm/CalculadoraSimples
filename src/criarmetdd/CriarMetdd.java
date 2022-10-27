package criarmetdd;

import java.util.Scanner;

public class CriarMetdd {
    
    static int n1 = 0;
    static int n2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cont;
                    
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        
        //System.out.println("Sout de fora " + Nome(n1, n2));
        
        
        System.out.println("Quer iniciar uma conta? (S/N)");
        cont = sc.next();
        
        while("S".equalsIgnoreCase(cont)){
        
            System.out.println("Digite que tipo de conta você quer fazer: ");
        int SwT = sc.nextInt();
                        
        switch (SwT){
            case 1:
                System.out.println("Adição de " + n1 + " + " + n2 + " : " + Adic(n1, n2));             
                break;
            
            case 2:
                System.out.println("Subtração de " + n1 + " - " + n2 + " : " + Sub(n1, n2));
                break;
            
            case 3:  
                System.out.println("Multiplicação de " + n1 + " * " + n2 + " : " + Mult(n1, n2));
                break;
            
            case 4:
                System.out.println("Divisão de " + n1 + " / " + n2 + " : " + Divd(n1, n2));
                break;
            
            default: 
                System.out.println("Equação inexistente");
                System.out.println("Tente novamente!");
                break;
          }
        
            System.out.println("Quer fazer outra conta? (S/N)");
            cont = sc.next();
            
            if("S".equalsIgnoreCase(cont)){
            System.out.println("Digite o primeiro numero: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            n2 = sc.nextInt();
            }else{
                break;
            }
            
        }
        
        System.out.println("Bye bye!");
        
          
            
    }
    public static int Sub(int n1, int n2){
             
        return (n1 - n2);
    }
    
    public static int Adic (int n1, int n2){
        
        return (n1 + n2);
    }
    
    public static int Mult (int n1, int n2){
        
        return (n1 * n2);
    }
    public static int Divd (int n1, int n2){
        
        return (n1/n2);
    }
    
       
//    public static int Nome(int n1, int n2){
//        
//        
//        System.out.println("Sout do metodo " + n1 + n2);
//        
//        
//        return n1 + n2; 
//      
//        
//    }
}

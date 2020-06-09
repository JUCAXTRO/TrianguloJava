/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class TRIANGULO
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Num = new Scanner(System.in);
      
      System.out.println("Digite um número");
      double a = Num.nextDouble();
      System.out.println("Digite um número");
      double b = Num.nextDouble();
      System.out.println("Digite outro núemro");
      double c = Num.nextDouble();
      
      if ((a+b>c)||(a+c>b)||(b+c>a))
          if ((a==b) && (a==c)&&(b==c))
              System.out.println("Triângulo Equilátero");
          else
              if((a!=b)&&(a!=c)&&(b!=c))
                  System.out.println("Triângulo Escaleno");
              else
                  if (((a==b)||(a!=c))||((a==c)&&(a!=b))||((b==c)&&(b!=a)))
                      System.out.println("Triângulo Isóceles");
        else
           System.out.println("Os valores não formam um triângulo");
      
      
      
    }
    
}

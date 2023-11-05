/*
*@author Nathaly Gomes
*version 1.0
*/
package calculadora;

public class Divisao {
 /*
 * Variavel que armazena resultado
 */
   private int Divisao;
/*
* Metodo utilizado para realizar a verificacao de numero dividido por zero e divisao
*/
   public int Dividir (int n1, int n2){
       if (n2 == 0){
           System.out.println("Nao e possivel dividir um numero por zero!");
           return this.Divisao = 0;
       }
       else {
           this.Divisao = n1 / n2;
           return this.Divisao;
        }
    }
}  

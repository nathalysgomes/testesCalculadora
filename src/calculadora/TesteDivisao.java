package calculadora;

public class TesteDivisao {

    public static void main(String[] args) {
/*
*Cenário de teste 1: Divisao de dois valores
*/
    Divisao calc = new Divisao();
    int Divisao = calc.Dividir (12,6);
    System.out.println(Divisao);
   
/*
*Cenário de teste 2: Divisao de dois valores sendo um zero: Mensagem "Nao e possivel dividir um numero por zero!" e exibida
*/
    Divisao = calc.Dividir (12,0);
    System.out.println(Divisao);
        
/*
*Cenário de teste 3: Divisao de dois valores onde ambos são zero: Mensagem "Nao e possivel dividir um numero por zero!" e exibida
*/
    Divisao = calc.Dividir (0,0);
    System.out.println(Divisao);
        
/*
* Cenário de teste 4: Divisao de dois valores sendo um negativo
*/        
    Divisao = calc.Dividir (12,-4);
    System.out.println(Divisao);

    }    
}

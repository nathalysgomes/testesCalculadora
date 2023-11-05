package calculadora;

public class TesteMultiplicacao {

    public static void main(String[] args) {
/*
*Cenário de teste 1: Multiplicacao de dois valores
*/
        Multiplicacao calc = new Multiplicacao();
        int Multiplicacao = calc.Multiplicar (8,6);
        System.out.println(Multiplicacao);
   
/*
*Cenário de teste 2: Multiplicacao de dois valores sendo um zero
*/
        Multiplicacao = calc.Multiplicar (8,0);
        System.out.println(Multiplicacao);
        
/*
*Cenário de teste 3: Multiplicacao de dois valores onde ambos são zero
*/
        Multiplicacao = calc.Multiplicar (0,0);
        System.out.println(Multiplicacao);
        
/*
*Cenário de teste 4: Multiplicacao de dois valores sendo um negativo
*/
        Multiplicacao = calc.Multiplicar (8,-2);
        System.out.println(Multiplicacao);
    }
}


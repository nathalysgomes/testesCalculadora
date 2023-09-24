package calculadora;

public class TesteSubtracao {

    public static void main(String[] args) {
//Cenário de teste 1: Subtracao de dois valores
        Subtracao calc = new Subtracao();
        int Subtracao = calc.Subtrair (10,7);
        System.out.println(Subtracao);
   
//Cenário de teste 2: Subtracao de dois valores sendo um zero
        Subtracao = calc.Subtrair (10,0);
        System.out.println(Subtracao);
        
//Cenário de teste 3: Subtracao de dois valores onde ambos são zero
        Subtracao = calc.Subtrair (0,0);
        System.out.println(Subtracao);
        
//Cenário de teste 4: Subtracao de dois valores sendo um negativo
        Subtracao = calc.Subtrair (10,-1);
        System.out.println(Subtracao);
    }
}
   

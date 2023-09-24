package calculadora;

public class TesteSoma {

    public static void main(String[] args) {
//Cenário de teste 1: Soma de dois valores
        Soma calc = new Soma();
        int Soma = calc.Somar (3,7);
        System.out.println(Soma);
        
//Cenário de teste 2: Soma de dois valores sendo um zero
        Soma = calc.Somar (3,0);
        System.out.println(Soma);
        
//Cenário de teste 3: Soma de dois valores onde ambos são zero
        Soma = calc.Somar (0,0);
        System.out.println(Soma);
        
//Cenário de teste 4: Soma de dois valores sendo um negativo
        Soma = calc.Somar (3,-1);
        System.out.println(Soma);
    }
   
}

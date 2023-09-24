package calculadora;

public class CalculadoraJunitTest {

    //Cenário de teste 1: Soma de dois valores positivos

    public void SomarDoisNumerosPositivos()
        {
            Soma soma = new Soma();
            int resultado = soma.Somar(3,7);
            
        }
    
     //Cenário de teste 2: Soma de dois valores sendo um zero

    public void SomarDoisNumerosSendoZero()
        {
            Soma soma = new Soma();
            int resultado = soma.Somar(0,7);
        }
    
    //Cenário de teste 3: Soma de dois valores onde ambos são zero

    public void SomarDoisNumerosSendoDoisZeros()
        {
            Soma soma = new Soma();
            int resultado = soma.Somar(0,0);
        }
    
    //Cenário de teste 4: Soma de dois valores sendo um negativo

     public void SomarDoisNumerosSendoNegativo()
        {
            Soma soma = new Soma();
            int resultado = soma.Somar(3,-7);
        }
     
    //Cenário de teste 1: Subtracao de dois valores

    public void SubtracaoDoisNumeros()
        {
            Subtracao subtracao = new Subtracao();
            int resultado = subtracao.Subtrair(8,7);
            
        }
    
     //Cenário de teste 2: Subtracao de dois valores sendo um zero

    public void SubtracaoDoisNumerosSendoZero()
        {
            Subtracao subtracao = new Subtracao();
            int resultado = subtracao.Subtrair(8,0);
        }
    
    //Cenário de teste 3: Subtracao de dois valores onde ambos são zero

    public void SubtracaoDoisNumerosSendoDoisZeros()
        {
            Subtracao subtracao = new Subtracao();
            int resultado = subtracao.Subtrair(0,0);
        }
    
    //Cenário de teste 4: Sutracao de dois valores sendo um negativo

     public void SubtracaoDoisNumerosSendoNegativo()
        {
            Subtracao subtracao = new Subtracao();
            int resultado = subtracao.Subtrair(-8,-7);
        }
     
     //Cenário de teste 1: Multiplicacao de dois valores

    public void MultiplicacaoDoisNumeros()
        {
            Multiplicacao multiplicacao = new Multiplicacao();
            int resultado = multiplicacao.Multiplicar(9,10);           
        }
    
     //Cenário de teste 2: Multiplicacao de dois valores sendo um zero

    public void MultiplicacaoDoisNumerosSendoZero()
        {
            Multiplicacao multiplicacao = new Multiplicacao();
            int resultado = multiplicacao.Multiplicar(9,0);
        }
    
    //Cenário de teste 3: Multiplicacao de dois valores onde ambos são zero

    public void MultiplicacaoDoisNumerosSendoDoisZeros()
        {
            Multiplicacao multiplicacao = new Multiplicacao();
            int resultado = multiplicacao.Multiplicar(0,0);
        }
    
    //Cenário de teste 4: Multiplicacao de dois valores sendo um negativo

     public void MultiplicacaoDoisNumerosSendoNegativo()
        {
            Multiplicacao multiplicacao = new Multiplicacao();
            int resultado = multiplicacao.Multiplicar(-9,-10);
        }
    
    //Cenário de teste 1: Divisao de dois valores

    public void DivisaoDoisNumeros()
        {
            Divisao divisao = new Divisao();
            int resultado = divisao.Dividir (9,10);           
        }
    
    //Cenário de teste 2: Divisao de dois valores sendo um zero: Mensagem "Nao e possivel dividir um numero por zero!" e exibida

    public void DivisaoDoisNumerosSendoZero()
        {
            Divisao divisao = new Divisao();
            int resultado = divisao.Dividir (9,0);
        }
    
    //Cenário de teste 3: Divisao de dois valores onde ambos são zero: Mensagem "Nao e possivel dividir um numero por zero!" e exibida

    public void DivisaoDoisNumerosSendoDoisZeros()
        {
            Divisao divisao = new Divisao();
            int resultado = divisao.Dividir (0,0);
        }
    
    //Cenário de teste 4: Divisao de dois valores sendo um negativo

     public void DivisaoDoisNumerosSendoNegativo()
        {
            Divisao divisao = new Divisao();
            int resultado = divisao.Dividir (10,-7);
        }

    
      
}

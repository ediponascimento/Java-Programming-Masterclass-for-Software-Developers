public class Expressions {

    public static void main(String[] args) {

      /* formula para descobrir a circuferência de um círculo.
        C = πd

        C -> Circunferência do círculo.
        d -> Representa seu diâmetro.
        Para encontrar a circunferência de um círculo basta multiplicar o diâmetro D por π (3.14)    

        EXEMPLO:
          diâmetero da piscina  d = 3
          cerca que será construida = 2 metros de diâmetro em volta da banheira.
          log d = 3 + 2 + 2;
          agora d = 7

          Encontrando a circunferência.
          C = πd
          c = π X 7
          c = 21,9 metros.
       */

       double PI = 3.14d;
       double diametro = 7;
       double circunferencia = PI * diametro;
       System.out.println("A circunferência de um círculo de diâmetro " + diametro + " é " + circunferencia);

      
      /*
      
        Usando o raio r para encontrar o diâmtro de uma circunferência
      
        O raio é metade do comprimento do diâmetro, então o diâmetro pode ser encarado
        como 2π. Com isso em mente, você pode escrever a fórmula para encontrar a
        circunferência de um determinado raio: C = . Nesta fórmula, "r" representa o raio do
        círculo. Outra vez, você pode colocar o π na sua calculadora para ter o resultado do seu
        valor numérico (3,14)

        por ex: o já que o raio é metdade do comprimeto do diâmetro, faremos o seguinte
        diâmetro = 7 
        raio r = 7 / 2
        r = 3.5
        
        C = 2 X PI * r;
        C = 2 X 3.14 * 3.5
        r = 21.98 

      */

      double d, pi, r;
      pi = 3.14d;
      r = 3.5d;
      d = 2 * pi * r;
      System.out.println("A circunferência de um círculo de r " + r + " é " + d);
       
      
    }

}
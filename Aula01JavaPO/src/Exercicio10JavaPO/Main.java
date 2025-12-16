
package Exercicio10JavaPO;

public class Main {

   
    public static void main(String[] args) {
     Ponto ponto1 = new Ponto();
     ponto1.x = 1;
     ponto1.y = 3;
     
     Ponto ponto2 = new Ponto();
     ponto2.x = 4;
     ponto2.y = 6;
     
     double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distâcia entre os pontos é: "+distancia);
    }
    
}

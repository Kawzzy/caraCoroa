// classe para coisas randômicas (aleatórias)
import java.util.Random; // programa utiliza a classe Random

public class caraCoroa {
    // inicia o método main
    public static void main(String[] args) {

        // início do Random
        Random random = new Random();

        // o método nextBoolean() serve para obter um valor aleatório: true ou false
        boolean face = random.nextBoolean();

        // String que receberá o lado da moeda
        String lado;

        // Condição para cara ou coroa
        if(face == true){
            System.out.printf("Cara"); //Imprime o resultado na tela
        }else {
            System.out.printf("Coroa"); //Imprime o resultado na tela
        } //final da condição If
    }// fim do método main
}// fim da classe caraCoroa
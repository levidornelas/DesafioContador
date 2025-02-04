package Desafio2;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.println("Agora insira o segundo número: ");
        int segundo = scanner.nextInt();
        scanner.close();
        try {
            contar(primeiro, segundo);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Realiza a contagem do primeiro até o segundo número
     * @param primeiro número inicial da contagem
     * @param segundo número final da contagem
     * @throws ParametrosInvalidosException se o primeiro número for maior que o segundo
     */
    static void contar(int primeiro, int segundo) throws ParametrosInvalidosException{
        if (primeiro > segundo){
            throw new ParametrosInvalidosException();
        }

        for(int i = primeiro; i <= segundo; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}

import java.util.Scanner;

 class celsius {
    
    public static void main (String[] args) {

        double celsius;
        double fahrenheit;

        try(Scanner teclado = new Scanner (System.in)) {
            System.out.println("Digite a temperatura em fahrenheit:");

            fahrenheit = teclado.nextDouble();

            celsius = fahrenheit - 32 * 5 / 9;

            System.out.printf("A temperatura convertida para celsius é de:%.1f", celsius);

        }
    }
}

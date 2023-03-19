import java.util.Scanner;

class metros {

    public static void main (String[]args) {

        double centimetro;
        double metro;

        try (Scanner teclado = new Scanner (System.in)) {
            
                
                System.out.println("Valor de metro:");
                
                metro = teclado.nextDouble();


                centimetro = metro * 100;

                System.out.printf("O valor convertido para centimetros é:%.1f", centimetro);

            }
        }

    }

    

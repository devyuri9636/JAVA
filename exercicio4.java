import java.util.Scanner;

class salario {

    public static void main (String[] args) {

        double salariohora;
        double horatrabalhada;
        double salariomensal;

        try(Scanner teclado = new Scanner (System.in)){
            System.out.println("Quanto você ganha por hora?");
            

            salariohora = teclado.nextDouble();

            System.out.println("Quantas horas você trabalha no mês?");
            
            horatrabalhada = teclado.nextDouble();

            salariomensal = salariohora * horatrabalhada;

            System.out.printf("Seu sálario mensal é de:%.1f", salariomensal);



        }

    }
    
}

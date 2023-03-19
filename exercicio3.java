import java.util.Scanner;

class nome {

    public static void main (String[] args) {

        String nome;

        try(Scanner teclado = new Scanner (System.in)){

            System.out.println("Qual o seu nome?");

            nome= teclado.nextLine();

            System.out.printf("O seu nome é:%s", nome);
            
        }
    }

    
}

import java.util.Scanner;

 class media {

    public static void main (String[] args){

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double soma;
        double media;

        try(Scanner teclado = new Scanner (System.in)){
           System.out.println("Digite a nota 1:"); 

            nota1 = teclado.nextDouble();
            System.out.println("Digite a nota 2:"); 
            nota2 = teclado.nextDouble();
            System.out.println("Digite a nota 3:");
            nota3 = teclado.nextDouble();
            System.out.println("Digite a nota 4:");
            nota4 = teclado.nextDouble();

            soma = nota1 + nota2 + nota3 + nota4;

            System.out.printf("A soma das notas é:%.1f", soma);

            media = soma/4;

            System.out.printf("A média das notas é:%.1f", media);
            

        }

    }
    
}

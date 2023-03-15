import java.util.Scanner;

class imc {

    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;

       try (Scanner teclado = new Scanner (System.in)){
            peso = teclado.nextDouble();
            altura = teclado.nextDouble();}
        

        imc = peso / (altura * altura);

        System.out.println(imc);



    }

}
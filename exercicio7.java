import java.util.Scanner;

class tintas {
  public static void main(String[] args) {
    int metrosQuadrados;
    int litrosTinta;
    int latasTinta;
    double precoTotal;

    try(Scanner teclado = new Scanner(System.in)){
    
    System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
    metrosQuadrados = teclado.nextInt();

    litrosTinta = (int) Math.ceil(metrosQuadrados / 3.0); 
    latasTinta = (int) Math.ceil(litrosTinta / 18.0); 
    precoTotal = latasTinta * 80.0;

    System.out.printf("Você precisará comprar %d latas de tinta, com um total de R$%.2f.%n", latasTinta, precoTotal);
  }
}
}
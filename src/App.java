import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
        double area = teclado.nextDouble();
        teclado.close();
        
        double litros = area / 3.0;

        int latas = (int) Math.ceil(litros / 18.0);
        double preco = latas * 80.0;

        System.out.println(" ");
        System.out.printf("Você precisa de %d latas de tinta, que custarão R$ %.2f%n", latas, preco);
    }
}
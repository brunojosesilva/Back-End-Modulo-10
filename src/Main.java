import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota 4:");
        double nota4 = scanner.nextDouble();

        // Calcula a média
        double media = calcularMedia(nota1, nota2, nota3, nota4);

        // Exibe a média
        System.out.println("A média das notas é: " + media);

        if (media < 7) {
            System.out.println("Precisa de recuperação..." );
        } else {
            System.out.println("Não precisa de recuperação... Aprovado");
        }

        // Fecha o Scanner
        scanner.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
}
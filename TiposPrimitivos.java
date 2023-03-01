import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            String nome = entrada.nextLine();
            System.out.print("Digite a nota do aluno: ");
            float nota = entrada.nextFloat();
            System.out.printf("A nota de %s é %.2f",nome, nota);
        }
    }
}

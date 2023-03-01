import java.util.Scanner;

public class Pernas {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a quantidade de pernas: ");
        int pernas = t.nextInt();
        String tipo;
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Isso é um(a) "+tipo);
    }
}

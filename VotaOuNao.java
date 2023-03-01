import java.util.Calendar;
import java.util.Scanner;

public class VotaOuNao {
    public static void main(String[] args) {
        System.out.print("Digite o ano de Nascimento: ");
        try (Scanner t = new Scanner(System.in)) {
            int anoNasc = t.nextInt();
            Calendar cal = Calendar.getInstance();
            int anoAtual = cal.get(Calendar.YEAR);
            int i = anoAtual-anoNasc;
            if (i<16) {
                System.out.printf("A idade é %d então não Vota",i);
            }else if(i<18 || i>70){
                System.out.printf("A idade é %d e votar é opcional",i);
            }else{
                System.out.printf("A idade é %d e é obrigatório votar",i);
            }
            }
        }
    }


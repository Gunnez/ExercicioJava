import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VetorEFuncao {

    
    static void encheAleatorio(int[] v,int c){
        Random x = new Random();
        for (int i=0;i<c;i++) {
            v[i] = x.nextInt(100);
        }
        System.out.println("");
    }

    static void encheNumero(int x, int[]v ){
        Arrays.fill(v,x);
        System.out.println("");
    }

    static void mostraValor(int[] v, int c){
        for(int i = 0;i < c; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    static void organizaVetor(int[]v){
        Arrays.sort(v);
        System.out.println("");
    }
    public static void main(String[] args) {
        try (Scanner t = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do vetor: ");
            int c = t.nextInt();
            int v[] = new int[c];
            System.out.printf("O vetor possue %d espaços",c);
            while(true){
                System.out.println("Escolha oque quer fazer:");
                System.out.println("1. encher o vetor com numeros aleatórios \n2. encher o vetor com um numero \n3. Organizar o vetor em ordem crescente \n4. Mostrar Valores do vetor\n5. Sair");
                int m = t.nextInt();
                switch(m){
                    case 1:
                        encheAleatorio(v,c);
                        break;
                    case 2:
                        System.out.println("Com qual numero o vetor será preenchido?");
                        int x = t.nextInt();
                        encheNumero(x,v);
                        break;
                    case 3:
                        organizaVetor(v);
                        System.out.println("Vetor organizado");
                        break;
                    case 4:
                        mostraValor(v,c);
                        break;
                    default:
                        System.out.println("Finalizando");
                    }
                if(m>4){
                    break;
                }
            }
        }
    }
}

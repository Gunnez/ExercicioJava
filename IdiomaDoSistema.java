import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("o idioma do sistema é ");
        System.out.println(idioma.getDisplayLanguage());
    }
}

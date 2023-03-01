import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
         Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
         int larg = (int) tela.getWidth();
         int altu = (int) tela.getHeight();
         System.out.println("A resolução da tela é "+ larg +" X "+ altu);
    }
}

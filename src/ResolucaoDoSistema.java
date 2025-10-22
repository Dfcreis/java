import java.awt.Toolkit;
import java.awt.Dimension;
public class ResolucaoDoSistema {
    public static void main(String[] args) {
        Dimension screeSizes = Toolkit.getDefaultToolkit().getScreenSize();
    // Obtem a resoluçao da tela
        int width = screeSizes.width;
        int heigth = screeSizes.height;
    // Imprime a informaçao no terminal
        System.out.println("a resoluçao de sua tela e "+ width +"x" + heigth);

    }
}

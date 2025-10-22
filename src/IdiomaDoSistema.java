import java.util.Locale;
public class IdiomaDoSistema {
    static void main(String[]args) {
        System.out.println();
        String idioma = Locale.getDefault().getDisplayName();
        System.out.println("O dioma usado em seu sitema e "+ idioma);
    }
}

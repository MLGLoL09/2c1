import javax.swing.JOptionPane;

/**
 * Das Programm soll ausgeben,
 * @author Sebastian Weigl
 * @version 06-01-2024
 */
public class VektorTest {
    /**
     * Die Methode uebernummt
     */
    public static void main(String[] args) {
        int d2Int = VektorMathe.inneres(1, 2, 3, 4);
        int d3Int = VektorMathe.inneres(1, 2, 3, 4, 5, 6);
        double d2Double = VektorMathe.inneres(1.0, 2.0, 3.0, 4.0);
        double d3Double = VektorMathe.inneres(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        JOptionPane.showMessageDialog(null, "2d Int: " + d2Int + "\n3d Int: " + d3Int + "\n2d Double: " + d2Double + "\n3d Double: " + d3Double);
    }
}

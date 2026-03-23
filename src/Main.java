import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                GUI.main(args);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
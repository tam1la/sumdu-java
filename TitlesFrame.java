import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {

/**
 * TitlesFrame init
 */

   public TitlesFrame() {
      this.initUI();
   }

/**
 * initUI defaults
 */

   private void initUI() {
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(2);
      this.add(new TitlesPanel(17));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame
extends JFrame {
    public TitlesFrame() {
        this.initUI();
    }

    private enum Shape { 
        HEXAGON(1), STAR(3), SQUARE(5), TRIANGLE(7), CIRCLE(9); 
        private int value;

        private Shape(int value) {
            this.value = value; 
        }

        public int getValue(){
            return value;
        } 
    };
        
    private enum Line { 
        THIN(1), THICK(4), GRADIENT(7), RED(8);
        private int value;

        private Line(int value) {
            this.value = value; 
        }

        public int getValue(){
           return value;
        } 
    };

    private void initUI() {
        this.setTitle("Кривые фигуры");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(Shape.HEXAGON.getValue(), Line.RED.getValue()));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }

}
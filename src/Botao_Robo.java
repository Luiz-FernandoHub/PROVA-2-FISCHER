import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;



public class Botao_Robo extends JButton{
//    private static final long serialVersionUID = 1L;
//    private R_Andador robo_andador;

    public Botao_Robo(String txt, Color color, Icon icon) {
        setText(txt);
        setBackground(color);
        setBorderPainted(false);
        setIcon(icon); }


    }
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Tabuleiro extends JPanel {

	public Tabuleiro() {

        setLayout(new GridLayout(8, 8));
                //gerarBotoes();
        for (int linha = 1; linha <= 8; linha++) {
            for (int coluna = 1; coluna <= 8; coluna++) {

                Célula celula = new Célula (linha, coluna);

                celula.Botao.setPreferredSize(new Dimension (500,500));
                celula.Botao.setBorderPainted(false);
                add (celula.Botao);

//
                if((linha + coluna) % 2 == 0) {
                    celula.Botao.setBackground(new Color (0, 128, 0));
                } else {
                    celula.Botao.setBackground(new Color (112, 89, 75));
                }
            }
        }


    }
	
	
}

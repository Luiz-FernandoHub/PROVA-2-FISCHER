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
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Lateral extends JPanel {

	private JTextField text;
	
	public Lateral() {
		setLayout(new FlowLayout());
        setPreferredSize(new Dimension(400, 75));
        setBackground(new Color (45, 87, 44));
        
        adicionar();
        
        
	
	}
public void adicionar() {
	
	Painel_Pontuação PainelP = new Painel_Pontuação();
	add(PainelP, BorderLayout.SOUTH);
	
	Painel_Pontuação_Alunos PainelA = new Painel_Pontuação_Alunos();
	add(PainelA, BorderLayout.SOUTH);
	
	Pontuação_Robôs PontosR = new Pontuação_Robôs();
	add(PontosR, BorderLayout.SOUTH);
	
	Painel_Botao_Robôs BotaoR = new Painel_Botao_Robôs();
	add(BotaoR, BorderLayout.SOUTH);
	
	Botões_Laterais BotaoL = new Botões_Laterais();
	add(BotaoL, BorderLayout.SOUTH);
	
    
	
  }
}


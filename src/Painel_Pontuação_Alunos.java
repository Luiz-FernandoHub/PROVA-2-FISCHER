import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Painel_Pontuação_Alunos extends JPanel{

public Painel_Pontuação_Alunos() {
		
		super();
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(300, 120));
        setBackground(new Color (250, 255, 250));
        this.adicionarBotoes();

}
public void adicionarBotoes() {
	
	JLabel Total = new JLabel("Pontuação: ");
    add(Total);

    ImageIcon P_aluno = new ImageIcon ("Villagers.png");
    P_aluno.setImage(P_aluno.getImage().getScaledInstance(30, 50, Image.SCALE_SMOOTH));
    JLabel imagem_Aluno= new JLabel(P_aluno);
    JLabel pontuacao_Aluno = new JLabel("999"+"  X");
    add (imagem_Aluno);
    add (pontuacao_Aluno);

    ImageIcon P_Bug = new ImageIcon ("Zombie.png");
    P_Bug.setImage(P_Bug.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH));
    JLabel imagem_Bug= new JLabel(P_Bug);
    JLabel pontuacao_Bug = new JLabel("999");
    add (imagem_Bug);
    add (pontuacao_Bug);
}

}
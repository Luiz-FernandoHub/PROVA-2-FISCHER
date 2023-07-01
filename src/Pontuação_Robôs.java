import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
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

public class Pontuação_Robôs extends JPanel {

public Pontuação_Robôs() {
		
		super();
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(300, 180));
        setBackground(new Color (250, 255, 250));
        this.adicionarBotoes();

}

public void adicionarBotoes() {
	  Dimension tamanho_botao = new Dimension(250, 50);
	  Font fonte = new Font(getName(), 20, 20);

	  ImageIcon R_andador = new ImageIcon ("Villagers.png");
      R_andador.setImage(R_andador.getImage().getScaledInstance(60, 150, Image.SCALE_SMOOTH));
      JLabel imagem_Andador= new JLabel(R_andador);
      JLabel pontuacao_Andador = new JLabel("999");
      add (imagem_Andador);
      add (pontuacao_Andador);

      ImageIcon R_Cavalo = new ImageIcon ("Zombie.png");
      R_Cavalo.setImage(R_Cavalo.getImage().getScaledInstance(60, 150, Image.SCALE_SMOOTH));
      JLabel imagem_Cavalo= new JLabel(R_Cavalo);
      JLabel pontuacao_Cavalo = new JLabel("999");
      add (imagem_Cavalo);
      add (pontuacao_Cavalo);

      ImageIcon R_Bispo = new ImageIcon ("Creeper.png");
      R_Bispo.setImage(R_Bispo.getImage().getScaledInstance(60, 150, Image.SCALE_SMOOTH));
      JLabel imagem_Bispo= new JLabel(R_Bispo);
      JLabel pontuacao_Bispo = new JLabel("999");
      add (imagem_Bispo);
      add (pontuacao_Bispo);
	       

}


}


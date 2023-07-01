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
import javax.swing.ImageIcon;

public class Painel_Botao_Robôs extends JPanel{

	public Painel_Botao_Robôs() {
		
		super();
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(300, 180));
        setBackground(new Color (250, 255, 250));
        this.adicionarBotoes();
        
        
	
	}
	public void adicionarBotoes() {
		Dimension tamanho_botao = new Dimension(85, 130);

        JButton B_andador = new JButton("andador", new ImageIcon("Villagers.png"));
//        Icone icone_andador = new Icone("andador_molduraicon.png",30,30);
//        B_andador = new Botao_robo_secundario(icone_andador,1);
        B_andador.setForeground(Color.WHITE);
        B_andador.setPreferredSize(tamanho_botao);
        B_andador.setContentAreaFilled(false);
        B_andador.setBorderPainted(false);

        JButton B_cavalo = new JButton("cavalo", new ImageIcon("Zombie.png"));
//        Icone icone_cavalo = new Icone("moldura_cavaloicon.png",30,30);
//        B_cavalo = new Botao_robo_secundario(icone_cavalo,2);
        B_cavalo.setForeground(Color.WHITE);
        B_cavalo.setPreferredSize(tamanho_botao);
        B_cavalo.setContentAreaFilled(false);
        B_cavalo.setBorderPainted(false);

        JButton B_bispo = new JButton("bispo", new ImageIcon("Creeper.png"));
//        Icone icone_bispo = new Icone("bispo_molduraicon.png",30,30);
//        B_bispo = new Botao_robo_secundario(icone_bispo,3);
        B_bispo.setForeground(Color.WHITE);
        B_bispo.setPreferredSize(tamanho_botao);
        B_bispo.setContentAreaFilled(false);
        B_bispo.setBorderPainted(false);

        add (B_andador);
        add (B_cavalo);
        add (B_bispo);

        setVisible(true);
		       

	}
}
 

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



public class Botões_Laterais extends JPanel{

	Botao_Robo B_Verificar = new Botao_Robo("Verificar", new Color(54,54,54), null);
    Botao_Robo B_Jogar = new Botao_Robo("Próxima Jogada", new Color(54,54,54), null);
    Botao_Robo B_Sair = new Botao_Robo("Sair do Jogo", new Color(54,54,54), null);
	
	
	public Botões_Laterais() {
		
		super();
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(300, 180));
        setBackground(new Color (250, 255, 250));
        this.adicionarBotoes();
		
	
	}
	
    
public void adicionarBotoes() {
	  Dimension tamanho_botao = new Dimension(250, 50);
	  Font fonte = new Font(getName(), 20, 20);

	   
	        B_Verificar.setForeground(Color.WHITE);
	        B_Verificar.setPreferredSize(tamanho_botao);
	        B_Verificar.setFont(fonte);

	   
	        B_Jogar.setForeground(Color.WHITE);
	        B_Jogar.setPreferredSize(tamanho_botao);
	        B_Jogar.setFont(fonte);

	   
	        B_Sair.setForeground(Color.WHITE);
	        B_Sair.setPreferredSize(tamanho_botao);
	        B_Sair.setFont(fonte);

	        add (B_Verificar);
	        add (B_Jogar);
	        add (B_Sair);

}


}







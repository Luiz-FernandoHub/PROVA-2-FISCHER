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


public class Top extends JPanel {

	private JTextField text;
	private JTextField nomeJogador;
    private JButton botaoJogar;
    private JButton botaoRelatorio;
	
	public Top() {
		setLayout(new FlowLayout());
        setPreferredSize(new Dimension(400, 100));
        setBackground(new Color (45, 87, 44));
	
        JLabel nomeUsuario = new JLabel("Nome do Jogador: ");
        nomeUsuario.setForeground(Color.WHITE);

        nomeJogador = new JTextField();
        Dimension textFieldDimension = new Dimension(200, 30);
        nomeJogador.setPreferredSize(textFieldDimension);

        botaoJogar = new Botao_Robo("Jogar", new Color(54,54,54), null);
        botaoJogar.setForeground(Color.WHITE);
        Dimension tamanho_botao = new Dimension(130, 30);

        botaoJogar.setPreferredSize(tamanho_botao);
        botaoRelatorio = new Botao_Robo("Gerar Relatório", new Color(54,54,54), null);
        botaoRelatorio.setPreferredSize(tamanho_botao);
        botaoRelatorio.setForeground(Color.WHITE);

        add(nomeUsuario);
        add(nomeJogador);
        add(botaoJogar);
        add(botaoRelatorio);
        
        
//        text = new JTextField("Click here");
//        text.setBounds(100, 25, 300, 100);
//        text.setFont(new Font("Arial", Font.BOLD, 20));
//        text.setText("Texto");
//        add(text);
//        text.setVisible(true);
//        
//        
//      JButton JButton = new JButton("Jogar");
//      JButton.setBounds(575, 25, 300, 100);
//      JButton.setFont(new Font("Arial", Font.BOLD, 20));
//      JButton.setBackground(new Color (237, 251, 238));
//      JButton.setForeground(new Color(10, 10, 10));
//      setVisible(true);
//      add(JButton);
//      
//      JButton JButton2 = new JButton("Relatorio do Jogo");
//      JButton2.setBounds(875, 25, 300, 100);
//      JButton2.setFont(new Font("Arial", Font.BOLD, 20));
//      JButton2.setBackground(new Color (237, 251, 238));
//      JButton2.setForeground(new Color(10, 10, 10));
//      setVisible(true);
//      add(JButton2);
//	
    
//	
	
	
	
	}
}


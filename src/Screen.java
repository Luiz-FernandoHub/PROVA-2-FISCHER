import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;

import org.w3c.dom.Text;



public class Screen extends JFrame implements ActionListener {

	JTextField text;
	
	
	public Screen () {

    javax.swing.JFrame JFrame = new JFrame();
    setVisible(true);
    setSize(1200,900);
    setTitle("Tabuleiro Prova 2_Mine");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());
    
    
    
    
  
    
   //Primeiras tentativas do trabalho, acabei abandonando por não ficar
    
//    JButton JButton = new JButton("Jogar");
//    JButton.setBounds(575, 25, 300, 50);
//    JButton.setFont(new Font("Arial", Font.BOLD, 20));
//    JButton.setBackground(new Color (237, 251, 238));
//    JButton.setForeground(new Color(10, 10, 10));
//    
//    JButton JButton2 = new JButton("Relatorio do Jogo");
//    JButton2.setBounds(875, 25, 300, 50);
//    JButton2.setFont(new Font("Arial", Font.BOLD, 20));
//    JButton2.setBackground(new Color (237, 251, 238));
//    JButton2.setForeground(new Color(10, 10, 10));
//    
//    JButton JButton3 = new JButton("Verificar");
//    JButton3.setBounds(875, 500, 300, 100);
//    JButton3.setFont(new Font("Arial", Font.BOLD, 20));
//    JButton3.setBackground(new Color (237, 251, 238));
//    JButton3.setForeground(new Color(10, 10, 10));
//    
//    JButton JButton4 = new JButton("Próxima Jogada");
//    JButton4.setBounds(875, 600, 300, 100);
//    JButton4.setFont(new Font("Arial", Font.BOLD, 20));
//    JButton4.setBackground(new Color (237, 251, 238));
//    JButton4.setForeground(new Color(10, 10, 10));
//    
//    JButton JButton5 = new JButton("Sair do Jogo");
//    JButton5.setBounds(875, 700, 300, 100);
//    JButton5.setFont(new Font("Arial", Font.BOLD, 20));
//    JButton5.setBackground(new Color (237, 251, 238));
//    JButton5.setForeground(new Color(10, 10, 10));
//    
//    add(JButton);
//    add(JButton2);
//    add(JButton3);
//    add(JButton4);
//    add(JButton5); 
// 
//    JButton.addActionListener(this);
//    JButton2.addActionListener(this::Results);
//    JButton3.addActionListener(this::Verify);
//    JButton4.addActionListener(this::Next);
//    JButton5.addActionListener(this::Fuga);
// 
//          
//    text = new JTextField("Click here");
//    text.setBounds(100, 25, 300, 50);
//    text.setFont(new Font("Arial", Font.BOLD, 20));
//    text.setText("Texto");
//    add(text);
//    text.setVisible(true);
//    
//    JLabel Jlabel = new JLabel("Numero 1");
//    Jlabel.setBounds(75, 25, 300, 50);
//    Jlabel.setFont(new Font("Arial", Font.BOLD, 20));
//    	
//    add(Jlabel);
//    	Jlabel.setVisible(true);
//
//     JLabel Jlabel2 = new JLabel("Numero 2");
//     Jlabel2.setBounds(75, 25, 300, 50);
//     Jlabel2.setFont(new Font("Arial", Font.BOLD, 20));
//        Jlabel2.setVisible(true);	
//     add(Jlabel2);
        	
    	Top OnTop = new Top();
    	getContentPane().add(OnTop, BorderLayout.NORTH);
    	
    	OnTop.setVisible(true);
    	
    	Lateral Ladinho = new Lateral();
    	getContentPane().add(Ladinho, BorderLayout.EAST);
    	
    	Ladinho.setVisible(true);
    	
    	Tabuleiro Tabu = new Tabuleiro();
    	getContentPane().add(Tabu, BorderLayout.CENTER);
    	
    	setVisible(true);
	}

    
  
//        public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(null, "Jogar :D", "Titulo do Jogo", 
//        		JOptionPane.INFORMATION_MESSAGE);
//    }
//
//
//
//		private void Fuga(ActionEvent actionevent1) {
//			JOptionPane.showMessageDialog(null, "Fechando o Jogo :D",  "Titulo do Jogo", 
//	        		JOptionPane.WARNING_MESSAGE);
//		}
//
//
//
//		private void Results(ActionEvent actionevent1) {
//			JOptionPane.showMessageDialog(null, "RESULTADO 1 X RESULTADO 2", "Titulo do Jogo", 
//	        		JOptionPane.INFORMATION_MESSAGE);
//		}
//
//
//
//		private void Verify(ActionEvent actionevent1) {
//			JOptionPane.showMessageDialog(null, "Tudo Ok :D", "Titulo do Jogo", 
//	        		JOptionPane.INFORMATION_MESSAGE);
//		}
//
//
//
//		private void Next(ActionEvent actionevent1) {
//			JOptionPane.showMessageDialog(null, "Go Again :O", "Titulo do Jogo", 
//	        		JOptionPane.INFORMATION_MESSAGE);
//		}
    }







 


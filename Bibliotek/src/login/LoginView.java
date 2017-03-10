package login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel 	label1 = new JLabel("Mata in personnr (10 siffor) för att gå vidare: yymmdd-xxxx"),
					label2 = new JLabel("Personnr: ");
	private JTextField personField = new JTextField();
	private JButton sendBtn = new JButton("Gå vidare");
	
	public LoginView(){
		this.setPreferredSize(new Dimension(400, 200));
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		this.setDimensions();
		this.addComponents();
	}
	
	private void setDimensions(){
		label1.setBounds(10, 10, 400, 25);
		label2.setBounds(10, 50, 100, 25);
		personField.setBounds(80, 48, 160, 30);
	}
	
	private void addComponents(){
		this.add(label1);
		this.add(label2);
		this.add(personField);
		this.add(sendBtn);
	}
}

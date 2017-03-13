package exchange;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ItemsView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JPanel 	headerPanel = new JPanel();
	private JPanel libraryPanel = new JPanel();
	private JTextField searchField = new JTextField("Sökfält");
	private String[] comboString = { "Sök efter", "Media" , "Id" , "Författare" , 
									"Titel" , "Utgivningsår", "Skådespelare" };
	private JComboBox<String> searchOption =  new JComboBox<String>(comboString);
	private JButton searchButton = new JButton("Sök");
	private JTextArea area = new JTextArea("Library");
	
	
	public ItemsView(){
		this.setLayout(new BorderLayout());
		
		this.setDimensions();
		this.setActionListeners();
		this.addComponents();
	}
	
	private void setDimensions(){
		searchField.setPreferredSize(new Dimension(200,25));
		searchOption.setPreferredSize(new Dimension(150,25));
		searchButton.setPreferredSize(new Dimension(100,25));
		area.setPreferredSize(new Dimension(700,500));
		
	}
	
	private void setActionListeners(){
		searchButton.addActionListener(new AL());
	}
	
	private void addComponents(){
		headerPanel.add(searchField);
		headerPanel.add(searchOption);
		headerPanel.add(searchButton);
		libraryPanel.add(area);
		this.add(headerPanel, BorderLayout.NORTH);
		this.add(libraryPanel, BorderLayout.CENTER);
	}
	
	private class AL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//search(searchField.getText(), searchOption.getSelectedItem()); 
		}
		
	}
}


























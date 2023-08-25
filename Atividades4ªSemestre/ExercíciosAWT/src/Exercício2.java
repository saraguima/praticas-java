import java.awt.*;
import java.awt.GridBagLayout;


public class Exercício2 {

	public static void main(String[] args) {
		Frame frame = new Frame("Layout Básico");
		Panel panel = new Panel();
		
		//Adicionando o layout personalizado
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(new Button("Pressione"), gbc);
		
		gbc.gridx = 1;
		panel.add(new Button("Clique aqui"), gbc);
		
		gbc.gridx = 2;
		panel.add(new Button("Aperte aqui"), gbc);
		
		
		frame.add(panel);
		frame.setSize(400, 150);
		frame.setVisible(true);
	}

}

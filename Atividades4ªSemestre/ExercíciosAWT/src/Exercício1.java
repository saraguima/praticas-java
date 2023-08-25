import java.awt.*;


public class Exercício1 {

	public static void main(String[] args) {
		Frame frame = new Frame("Janela Simples com Texto");
		
		//Fonte personalizada
		Font customFont = new Font("Italic", Font.CENTER_BASELINE, 18);
				
		Label label = new Label("Aprendendo Frame e Label!");
		
		label.setFont(customFont);
		
		frame.add(label);
		frame.setSize(500, 200);
		frame.setVisible(true);

	}

}

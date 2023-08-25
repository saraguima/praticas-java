import java.awt.*;


public class Exercício4 {

	public static void main(String[] args) {
		Frame frame = new Frame("Componentes de Texto");
        Label label = new Label("Título");
        TextField textField = new TextField("         ");
        TextArea textArea = new TextArea("Digite...", 5, 30);

        frame.setLayout(new FlowLayout());
        frame.add(label); 
        frame.add(textField);
        frame.add(textArea);

        frame.setSize(700, 200);
        frame.setVisible(true);
    }
}

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Bloque  { 
	
	public Bloque() {
		Image image= new Image("spBL/bloque.PNG");
		ImageView entrada = new ImageView(image);
		entrada.setLayoutX(30);
		entrada.setLayoutY(30);
	}
	
}

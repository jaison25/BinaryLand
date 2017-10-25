
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Telarana { 
	
	public Image image;
	public ImageView telarana;
	public  int width;
	public int height;
	
	
	
	public Telarana(){
		this.image  = new Image("spBL/telarana.PNG");
		this.telarana = new ImageView(image);
		this.telarana.setLayoutX(30);
		this.telarana.setLayoutY(30);

	}
}
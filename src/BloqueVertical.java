
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BloqueVertical { 
	
	public Image image;
	public ImageView bloqueVertical;
	public  int width;
	public int height;
	
	
	
	public BloqueVertical(){
		this.image  = new Image("spBL/asterisco.PNG");
		this.bloqueVertical = new ImageView(image);
		this.bloqueVertical.setLayoutX(30);
		this.bloqueVertical.setLayoutY(30);

	}
	
}
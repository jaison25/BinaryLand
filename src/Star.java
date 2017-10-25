
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Star { 
	
	public Image image;
	public ImageView star;
	public  int width;
	public int height;
	
	
	
	public Star(){
		this.image  = new Image("spBL/backSlash.PNG");
		this.star = new ImageView(image);
		this.star.setLayoutX(90);
		this.star.setLayoutY(30);

	}
	
}
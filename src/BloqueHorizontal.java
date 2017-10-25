
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BloqueHorizontal { 
	
	public Image image;
	public ImageView BloqueHorizontal;
	public  int width;
	public int height;
	
	
	
	public BloqueHorizontal(){
		this.image  = new Image("spBL/menos.PNG");
		this.BloqueHorizontal = new ImageView(image);
		this.BloqueHorizontal.setLayoutX(30);
		this.BloqueHorizontal.setLayoutY(30);

	}
	
}

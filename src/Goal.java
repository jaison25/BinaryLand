
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goal { 
	
	public Image image;
	public ImageView goal;
	public  int width;
	public int height;
	
	
	
	public Goal(){
		this.image  = new Image("spBL/slach.PNG");
		this.goal = new ImageView(image);
		this.goal.setLayoutX(90);
		this.goal.setLayoutY(30);

	}
	
}
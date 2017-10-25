import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Tablero  extends Application {

		Round nivel = new Round();
		File file = new File("Round/round2.txt");
		Bloque bloque;
		BloqueHorizontal bloqueHorizontal;
		BloqueVertical bloqueVertical;
		Star inicio;
		Goal goal;
		Telarana telarana;
		
//-----------------------------------------------------------------------------//	
		
		public static final char PARED_VERTICAL = '*';
		public static final char PARED_HORIZONTAL = '-';
		public static final char GOAL = '/';
		public static final char STAR = '_' ;
		public static final char BLOQUE = '+';
		public static final char TELARANA = 'T';
		
//-----------------------------------------------------------------------------//		
		
		Pane pane = new Pane();
		
		public void Tablero() {
			
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			BorderPane principal = new BorderPane();
			pane.setFocusTraversable(true);
			principal.setCenter(pane);
			Scene scene = new Scene(principal, 900, 600);
			scene.setFill(Color.BLACK);
			primaryStage.setScene(scene);
			pane.requestFocus();
			primaryStage.setTitle("BinaryLand");
			primaryStage.setResizable(false);
			primaryStage.show();
			
			System.out.println(nivel.leerRound(file));
		}
	
}

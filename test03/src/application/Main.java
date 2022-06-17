package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {

			// stage -> scene -> container -> node
			
			Label text = new Label();
			text.setText("Hello JavaFX");
			//CSS
			text.setStyle("-fx-font-size: 80");		//css인거여~
			text.setStyle("-fx-font-size: 50; -fx-text-fill: red");				
			text.setStyle("-fx-font-size: 50; -fx-background-color: yellow");
			text.setStyle("-fx-font-size: 50; -fx-border-color: purple");
			
			StackPane pane = new StackPane(); 			// container
		
			pane.getChildren().add(text);
			
			Scene scene = new Scene(pane, 300, 500); 	//scene
			
			stage.setScene(scene);						//stage
			
			//여기까지 했지만 실행이 안되는 이유는? show가 없어서!
		//	stage.setResizable(false);  이거 실행하면 창이 사이즈가 움직이지 않아~
			stage.show();								//show가 있어야 창이 뜨는거얌
					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

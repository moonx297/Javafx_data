package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			// stage -> scene -> container -> node
			
			Label label = new Label();
			label.setText("test");
			label.setStyle("-fx-font-size:50");
			
			
			
			StackPane pane = new StackPane(); 			//container 
			pane.getChildren().add(label);
//			StackPane.setAlignment(label, Pos.TOP_CENTER);	//위치 위 가운데로
			StackPane.setAlignment(label, Pos.CENTER_LEFT);	//위치 가운데 왼쪽으로
	
			Scene scene = new Scene(pane, 150, 150); 	//scene
			
			stage.setScene(scene);						//stage
			
			//여기까지 했지만 실행이 안되는 이유는? show가 없어서!
		//	stage.setResizable(false);  				이거 실행하면 창이 사이즈가 움직이지 않아~
			stage.show();								//show가 있어야 창이 뜨는거얌
					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

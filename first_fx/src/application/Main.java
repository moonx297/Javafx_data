package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {

			// stage -> scene -> container -> node
			
			Pane pane = new Pane(); // container
			
			Scene scene = new Scene(pane, 300, 500);
			
			stage.setScene(scene);
			stage.show();
			stage.setTitle("My Windows");		//창에 타이틀 입력
			stage.setResizable(false);			//resizable(false)를 입력하면 창 사이즈를 바꿀 수 없다.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

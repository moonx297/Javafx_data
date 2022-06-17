package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			VBox root = new VBox();
			root.setPrefWidth(350);
			root.setPrefHeight(150);
			root.setAlignment(Pos.CENTER);
			root.setSpacing(20);
			
			Label label = new Label();
			label.setText("Hello JavaFx");
			label.setFont(new Font(50));
			
			Button button = new Button();
			button.setText("확인");
			button.setOnAction(event->Platform.exit()); //람다식. 확인버튼이라는 이벤트를 만나면 종료하라고 명령하는것
			
//			root.getChildren().add(label);
//			root.getChildren().add(button);
			root.getChildren().addAll(label, button);
			
			Scene scene = new Scene(root); //Scene에는 root를 놓오러
				
			primaryStage.setTitle("AppMain");
			primaryStage.setScene(scene);         //stage에는 신을 넣고 
			primaryStage.show();
		}
				
	public static void main(String[] args) {
		launch(args);
	}
}

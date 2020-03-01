package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	
		try {
			AnchorPane root = new AnchorPane();
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/basic_interface.fxml"));
		    root = fxmlLoader.load();
		    
			Scene scene = new Scene(root,1900,700);
			
			primaryStage.setTitle("Torpics");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Button addDeviceBtn = (Button) scene.lookup("#add_device_btn");
			addDeviceBtn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
					AnchorPane addDeviceDBox = new AnchorPane();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/add_device_DBox.fxml"));
				    try {
						addDeviceDBox = fxmlLoader.load();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					Scene scene = new Scene(addDeviceDBox,390,460);
					Stage addDevice = new Stage();
					addDevice.setTitle("Ajouter Capteur");
					addDevice.setScene(scene);
					addDevice.show();
					
					
				}
			});
		 
			Button addGwBtn = (Button) scene.lookup("#add_gw_btn");
			addGwBtn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
					AnchorPane addGwDBox = new AnchorPane();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/add_gw_DG.fxml"));
				    try {
				    	addGwDBox = fxmlLoader.load();
						System.out.print("hello there");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					Scene scene = new Scene(addGwDBox,390,250);
					Stage addGW = new Stage();
					addGW.setTitle("Ajouter Passerelle");
					addGW.setScene(scene);
					addGW.show();
				}
			});
			
			Button addBddBtn = (Button) scene.lookup("#add_bdd_btn");
			addBddBtn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
					AnchorPane addBddDBox = new AnchorPane();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/add_bdd_DBox.fxml"));
				    try {
				    	addBddDBox = fxmlLoader.load();
						System.out.print("hello there");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					Scene scene = new Scene(addBddDBox,390,460);
					Stage addBDD = new Stage();
					addBDD.setTitle("Ajouter Base de Donneés");
					addBDD.setScene(scene);
					addBDD.show();
					
					Button nxtBddBtn = (Button) scene.lookup("#bdd_next_btn");
					nxtBddBtn.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent event) {
							// TODO Auto-generated method stub
							
							AnchorPane nxtBddDBox = new AnchorPane();
							FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/add_bdd_DBox2.fxml"));
						    try {
						    	nxtBddDBox = fxmlLoader.load();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						    
							Scene scene = new Scene(nxtBddDBox,390,460);
							Stage nxtBDD = new Stage();
							nxtBDD.setTitle("Ajouter Base de Donneés");
							nxtBDD.setScene(scene);
							nxtBDD.show();
							addBDD.hide();					
						}
					});
					
					
				}
			});
			
			
			Button addCloudBtn = (Button) scene.lookup("#add_cloud_btn");
			addCloudBtn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
					AnchorPane addCloudDBox = new AnchorPane();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/add_cloud_DBox.fxml"));
				    try {
				    	addCloudDBox = fxmlLoader.load();
						System.out.print("hello there");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					Scene scene = new Scene(addCloudDBox,390,460);
					Stage addCloud = new Stage();
					addCloud.setTitle("Ajouter Cloud");
					addCloud.setScene(scene);
					addCloud.show();
					
					Button nxtCloudBtn = (Button) scene.lookup("#cloud_next_btn");
					nxtCloudBtn.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent event) {
							// TODO Auto-generated method stub
							
							AnchorPane nxtCloudDBox = new AnchorPane();
							FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/add_cloud_DBox2.fxml"));
						    try {
						    	nxtCloudDBox = fxmlLoader.load();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						    
							Scene scene = new Scene(nxtCloudDBox,390,460);
							Stage nxtCloud = new Stage();
							nxtCloud.setTitle("Ajouter Cloud");
							nxtCloud.setScene(scene);
							nxtCloud.show();
							addCloud.hide();						
						}
					});
				}
			});
			
			
			Button addLinkBtn = (Button) scene.lookup("#add_link_btn");
			addLinkBtn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
					AnchorPane addLinkDBox = new AnchorPane();
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../interfaces/add_link_DBox.fxml"));
				    try {
				    	addLinkDBox = fxmlLoader.load();
						System.out.print("hello there");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					Scene scene = new Scene(addLinkDBox,390,250);
					Stage addLink = new Stage();
					addLink.setTitle("Ajouter Lien");
					addLink.setScene(scene);
					addLink.show();
					
					
				}
			});
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

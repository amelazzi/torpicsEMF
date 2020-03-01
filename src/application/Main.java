package application;
	
import java.io.IOException;

import entities.Capteur;
import entities.impl.CapteurImpl;
import entities.impl.CloudImpl;
import entities.impl.DataBaseImpl;
import entities.impl.GateWayImpl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
					
					Button validateDeviceBtn = (Button) scene.lookup("#sensor_btn_validate");
					validateDeviceBtn.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent event) {
							// TODO Auto-generated method stub
							
							TextField sensorName = (TextField) scene.lookup("#sensor_name");
							TextField sensorId = (TextField) scene.lookup("#sensor_id");
							TextField sensorSendTime = (TextField) scene.lookup("#sensor_send_time");
						    CapteurImpl capteur = new CapteurImpl();
							capteur.setName(sensorName.getText());
							capteur.setId(Integer.valueOf(sensorId.getText()));
							capteur.setSendTime(Integer.valueOf(sensorSendTime.getText()));
							
							System.out.println("new Capteur Created: " + capteur.getName());
							addDevice.close();							
						}
					});										
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
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					Scene scene = new Scene(addGwDBox,390,250);
					Stage addGW = new Stage();
					addGW.setTitle("Ajouter Passerelle");
					addGW.setScene(scene);
					addGW.show();
					
					Button validateGwBtn = (Button) scene.lookup("#gw_btn_validate");
					validateGwBtn.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent event) {
							// TODO Auto-generated method stub
							
							TextField gwName = (TextField) scene.lookup("#gw_name");
							TextField gwId = (TextField) scene.lookup("#gw_id");
						    GateWayImpl gateway = new GateWayImpl();
						    gateway.setName(gwName.getText());
						    gateway.setId(Integer.valueOf(gwId.getText()));
							
							System.out.println("new GateWay Created: " + gateway.getName());
							addGW.close();							
						}
					});	
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
						    
						    TextField bddName = (TextField) scene.lookup("#bdd_name");
							TextField bddUrl = (TextField) scene.lookup("#bdd_url");
							TextField bddPort = (TextField) scene.lookup("#bdd_port");
							TextField bddUsername = (TextField) scene.lookup("#bdd_username");
							TextField bddPwd = (TextField) scene.lookup("#bdd_pwd");
							
						    DataBaseImpl database = new DataBaseImpl();
						    database.setName(bddName.getText());
						    database.setUrl(bddUrl.getText());
						    database.setPort(Integer.valueOf(bddPort.getText()));
						    database.setUserName(bddUsername.getText());
						    database.setPwd(bddPwd.getText());
							
						    
							Scene scene = new Scene(nxtBddDBox,390,460);
							Stage nxtBDD = new Stage();
							nxtBDD.setTitle("Ajouter Base de Donneés");
							nxtBDD.setScene(scene);
							nxtBDD.show();
							
							Button nxtBddBtn = (Button) scene.lookup("#bdd_btn_validate");
							nxtBddBtn.setOnAction(new EventHandler<ActionEvent>() {
								
								@Override
								public void handle(ActionEvent event) {
									// TODO Auto-generated method stub
									System.out.println("new D Created: " + database.getName());
									nxtBDD.close();
									
								}
							});
							
							addBDD.close();	
							
							
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
						    
						    TextField cloudUrl = (TextField) scene.lookup("#cloud_url");
							TextField cloudAPIKey = (TextField) scene.lookup("#cloud_api_key");
							TextField cloudChannelId = (TextField) scene.lookup("#cloud_channel_id");
							TextField cloudUsername = (TextField) scene.lookup("#cloud_username");
							TextField cloudPwd = (TextField) scene.lookup("#cloud_pwd");
							
						    CloudImpl cloud = new CloudImpl();
						    cloud.setUrl(cloudUrl.getText());
						    cloud.setAPIKey(cloudAPIKey.getText());
						    cloud.setChannelID(Integer.valueOf(cloudChannelId.getText()));
						    cloud.setUserName(cloudUsername.getText());
						    cloud.setPwd(cloudPwd.getText());
						    
							Scene scene = new Scene(nxtCloudDBox,390,460);
							Stage nxtCloud = new Stage();
							nxtCloud.setTitle("Ajouter Cloud");
							nxtCloud.setScene(scene);
							nxtCloud.show();
							
						    Button nxtCloudBtn = (Button) scene.lookup("#cloud_validate_btn");
							nxtCloudBtn.setOnAction(new EventHandler<ActionEvent>() {
								
								@Override
								public void handle(ActionEvent event) {
									// TODO Auto-generated method stub
									System.out.println("new Cloud Created: " + cloud.getUrl());
									nxtCloud.close();				
								}
							});
							addCloud.close();						
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

package GUI.Controller;

import PersonsTypes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LoginController {
    @FXML
    private PasswordField paswPassword;
    @FXML
    private TextField txtfUsername;
    @FXML
    private Button btnSignIn;
    @FXML
    private ImageView logoImgViewLogin;

    public void handleSignIn(ActionEvent actionEvent) {
    }
    public void setup() {
        logoImgViewLogin.setImage(new Image("Pictures/WuavLogo.png"));

        //PersonTypeChooser personTypeChooser=new PersonTypeChooser();
        //personTypeChooser.chooseType("Salesman");
        //System.out.println(personTypeChooser.getViewString());





    }
}

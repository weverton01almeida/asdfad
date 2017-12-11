package controle;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Usuario;
import application.MainMenu;
import dao.LoginDao;
public class ControleLogin implements Initializable {
	@FXML
	private Button BtnLogin;
	
	@FXML
	private TextField TxtFieldLogin;
	
	@FXML
	private PasswordField PassFieldSenha;
	
	@FXML
	void BtnLoginOnAction(ActionEvent event) throws SQLException {
		Usuario user = new Usuario();
		LoginDao LoginDao = new LoginDao();
		user.setSt_pv_Login(TxtFieldLogin.getText());
		user.setSt_pv_senha(PassFieldSenha.getText());
		if(LoginDao.Logar(user)){
		MainMenu menu = new MainMenu();
		Stage stage1 = (Stage) BtnLogin.getScene().getWindow();
		stage1.close();
		Stage stage = new Stage();
		menu.start(stage);
		}else{
			util.Util.mensagemInformacao("Usuario nao Cadastrado ou informaçoes incorretas!");
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
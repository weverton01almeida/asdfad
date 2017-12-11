package dao;

import java.sql.SQLException;

import modelo.Msg_banco;
import modelo.Usuario;

public class LoginDao {
	public boolean Logar(Usuario usuario) throws SQLException {
		if (usuario.getSt_pv_Login() == "joao" && usuario.getSt_pv_senha() == "123")
			return true;
		else
			return false;

	}
}

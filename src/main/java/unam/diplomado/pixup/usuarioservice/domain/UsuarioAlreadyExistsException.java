package unam.diplomado.pixup.usuarioservice.domain;

public class UsuarioAlreadyExistsException extends RuntimeException  {
	
	public UsuarioAlreadyExistsException(String email) {
		super("Ya exite el usuario con el email :" + email);
	}

}

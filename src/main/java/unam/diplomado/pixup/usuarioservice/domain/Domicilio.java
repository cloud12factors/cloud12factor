package unam.diplomado.pixup.usuarioservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Domicilio {
	
	@NotBlank(message="Calle no puede estar vacía")
	private String calle;
	@NotBlank(message="Número Exterior no puede estar vacío")
	@Size(min=3, max=30, message="Número exterior debe tener entre {min} y {max}")
	private String numExterior;
	private String numInterior;

}

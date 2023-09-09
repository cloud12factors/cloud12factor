package unam.diplomado.pixup.usuarioservice.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import unam.diplomado.pixup.usuarioservice.domain.Estado;

public interface EstadoRepository 
extends MongoRepository<Estado, String>{

}

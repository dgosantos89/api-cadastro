package com.cadastro.api.repositories;

import com.cadastro.api.document.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dssantos
 * @version $Revision: $<br/>
 * $Id: $
 * @since 21/07/18 14:36
 */
public interface ClienteRepository extends MongoRepository<Cliente, String> {

}

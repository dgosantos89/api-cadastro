package com.cadastro.api.services;

import java.util.List;
import java.util.Optional;

import com.cadastro.api.document.Cliente;

/**
 * @author dssantos
 * @version $Revision: $<br/>
 * $Id: $
 * @since 21/07/18 14:37
 */
public interface ClienteService {

    List<Cliente> listarTodos ();

    Optional<Cliente> listarPorId (String id);

    Cliente cadastrar (Cliente cliente);

    Cliente atualizar (Cliente cliente);

    void remover (String id);

}

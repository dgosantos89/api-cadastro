package com.cadastro.api.services.impl;

import java.util.List;
import java.util.Optional;

import com.cadastro.api.document.Cliente;
import com.cadastro.api.repositories.ClienteRepository;
import com.cadastro.api.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dssantos
 * @version $Revision: $<br/>
 * $Id: $
 * @since 21/07/18 14:39
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarTodos () {
        return this.clienteRepository.findAll();
    }

    public Optional<Cliente> listarPorId (final String id) {
        return this.clienteRepository.findById(id);
    }

    @Override
    public Cliente cadastrar (final Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente atualizar (final Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public void remover (final String id) {
        this.clienteRepository.deleteById(id);
    }
}

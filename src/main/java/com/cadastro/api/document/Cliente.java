package com.cadastro.api.document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author dssantos
 * @version $Revision: $<br/>
 * $Id: $
 * @since 21/07/18 14:25
 */

@Document
public class Cliente {

    @Id
    private String id;

    private String nome;

    private String email;

    private String cpf;

    public Cliente () {

    }

    public String getId () {
        return id;
    }

    public void setId (final String id) {
        this.id = id;
    }

    @NotEmpty(message = "Nome não pode ser vazio")
    public String getNome () {
        return nome;
    }

    public void setNome (final String nome) {
        this.nome = nome;
    }

    @NotEmpty(message = "Email não pode ser vazio")
    @Email(message = "Email inválido")
    public String getEmail () {
        return email;
    }

    public void setEmail (final String email) {
        this.email = email;
    }

    @NotEmpty(message = "CPF não pode ser vazio")
    @CPF(message = "CPF inválido")
    public String getCpf () {
        return cpf;
    }

    public void setCpf (final String cpf) {
        this.cpf = cpf;
    }
}

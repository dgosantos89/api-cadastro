package com.cadastro.api.responses;

import java.util.List;

/**
 * @author dssantos
 * @version $Revision: $<br/>
 * $Id: $
 * @since 21/07/18 15:13
 */
public class Response<T> {

    private T data;

    private List<String> erros;

    public Response (T data) {
        this.data = data;
    }

    public Response (List<String> erros) {
        this.erros = erros;
    }

    public T getData () {
        return data;
    }

    public void setData (final T data) {
        this.data = data;
    }

    public List<String> getErros () {
        return erros;
    }

    public void setErros (final List<String> erros) {
        this.erros = erros;
    }
}

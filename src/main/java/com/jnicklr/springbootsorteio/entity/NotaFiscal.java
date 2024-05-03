package com.jnicklr.springbootsorteio.entity;

import java.time.LocalDate;

public class NotaFiscal {
    private int _id;
    private int _usuarioId;
    private String _chave;
    private String _sequencial;
    private LocalDate _dataProcessamento;

    public NotaFiscal(int id, int usuarioId, String chave, String sequencial, LocalDate dataProcessamento) {
        this._id = id;
        this._usuarioId = usuarioId;
        this._chave = chave;
        this._sequencial = sequencial;
        this._dataProcessamento = dataProcessamento;
    }

    public int getId() {
        return _id;
    }

    public int getUsuarioId() {
        return _usuarioId;
    }

    public String getChave() {
        return _chave;
    }

    public String getSequencial() {
        return _sequencial;
    }

    public LocalDate getDataProcessamento() {
        return _dataProcessamento;
    }

    public void setId(int id) {
        this._id = id;
    }

    public void setUsuarioId(int usuarioId) {
        this._usuarioId = usuarioId;
    }

    public void setChave(String chave) {
        this._chave = chave;
    }

    public void setSequencial(String sequencial) {
        this._sequencial = sequencial;
    }

    public void setDataProcessamento(LocalDate dataProcessamento) {
        this._dataProcessamento = dataProcessamento;
    }
}


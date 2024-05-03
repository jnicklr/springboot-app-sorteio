package com.jnicklr.springbootsorteio.entity;

public class Bilhete {
    private int _id;
    private int _ano;
    private int _mes;
    private int _numero;
    private int _notaFiscalId;
    private int _usuarioId;

    public Bilhete(int id, int ano, int mes, int numero, int notaFiscalId, int usuarioId) {
        this._id = id;
        this._ano = ano;
        this._mes = mes;
        this._numero = numero;
        this._notaFiscalId = notaFiscalId;
        this._usuarioId = usuarioId;
    }

    public int getId(){
        return _id;
    }

    public int getAno(){
        return _ano;
    }

    public int getMes(){
        return _mes;
    }

    public int getNumero(){
        return _numero;
    }

    public int getNotaFiscalId(){
        return _notaFiscalId;
    }

    public int getUsuarioId(){
        return _usuarioId;
    }

    public void setId(int id){
        this._id = id;
    }

    public void setAno(int ano){
        this._ano = ano;
    }

    public void setMes(int mes){
        this._mes = mes;
    }

    public void setNumero(int numero){
        this._numero = numero;
    }

    public void setNotaFiscalId(int notaFiscalId){
        this._notaFiscalId = notaFiscalId;
    }

    public void setUsuarioId(int usuarioId){
        this._usuarioId = usuarioId;
    }
}

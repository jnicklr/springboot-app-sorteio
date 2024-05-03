package com.jnicklr.springbootsorteio.entity;

import java.util.ArrayList;
import java.util.List;

public class Sorteio {
    private int _id;
    private int _ano;
    private int _identificador;
    private int _mes;
    private double _valorPremio;
    private int _apresentador;
    private int _auditor;
    private int _premiado;
    private String _descricao;
    private String _tipo;
    private List<Bilhete> _bilhetes;

    public Sorteio(int id, int ano, int identificador, int mes, double valorPremio, int apresentador,
                   int auditor, int premiado, String descricao, String tipo) {
        this._id = id;
        this._ano = ano;
        this._identificador = identificador;
        this._mes = mes;
        this._valorPremio = valorPremio;
        this._apresentador = apresentador;
        this._auditor = auditor;
        this._premiado = premiado;
        this._descricao = descricao;
        this._tipo = tipo;
        this._bilhetes = new ArrayList<Bilhete>();
    }

    public int getId() {
        return _id;
    }

    public int getAno() {
        return _ano;
    }

    public int getIdentificador() {
        return _identificador;
    }

    public int getMes() {
        return _mes;
    }

    public double getValorPremio() {
        return _valorPremio;
    }

    public int getApresentador() {
        return _apresentador;
    }

    public int getAuditor() {
        return _auditor;
    }

    public int getPremiado() {
        return _premiado;
    }

    public String getDescricao() {
        return _descricao;
    }

    public String getTipo() {
        return _tipo;
    }

    public List<Bilhete> getBilhetes() {
        return _bilhetes;
    }

    // Setters
    public void setId(int id) {
        this._id = id;
    }

    public void setAno(int ano) {
        this._ano = ano;
    }

    public void setIdentificador(int identificador) {
        this._identificador = identificador;
    }

    public void setMes(int mes) {
        this._mes = mes;
    }

    public void setValorPremio(double valorPremio) {
        this._valorPremio = valorPremio;
    }

    public void setApresentador(int apresentador) {
        this._apresentador = apresentador;
    }

    public void setAuditor(int auditor) {
        this._auditor = auditor;
    }

    public void setPremiado(int premiado) {
        this._premiado = premiado;
    }

    public void setDescricao(String descricao) {
        this._descricao = descricao;
    }

    public void setTipo(String tipo) {
        this._tipo = tipo;
    }

    public void setBilhetes(List<Bilhete> bilhetes) {
        this._bilhetes = bilhetes;
    }

    public void addBilhete(Bilhete bilhete) {
        this._bilhetes.add(bilhete);
    }

    public void removerBilhete(int id) {
        this._bilhetes.removeIf(b -> b.getId() == id);
    }
}

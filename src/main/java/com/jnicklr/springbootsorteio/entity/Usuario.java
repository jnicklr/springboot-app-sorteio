package com.jnicklr.springbootsorteio.entity;

import java.time.LocalDate;

public class Usuario {
    private int _id;
    private boolean _consentimento;
    private LocalDate _dataNascimento;
    private String _nome;
    private String _cpf;
    private String _email;
    private String _perfil;
    private String _role;
    private String _senha;
    private String _telefone;
    private String _estado;
    private String _municipio;
    private String _cep;
    private String _bairro;
    private String _logradouro;
    private String _numero;
    private String _complemento;

    public Usuario(int id, boolean consentimento, LocalDate dataNascimento, String nome, String cpf,
                      String email, String perfil, String role, String senha,
                      String telefone, String estado, String municipio,
                      String cep, String bairro, String logradouro,
                      String numero, String complemento) {
        this._id = id;
        this._consentimento = consentimento;
        this._dataNascimento = dataNascimento;
        this._nome = nome;
        this._cpf = cpf;
        this._email = email;
        this._perfil = perfil;
        this._role = role;
        this._senha = senha;
        this._telefone = telefone;
        this._estado = estado;
        this._municipio = municipio;
        this._cep = cep;
        this._bairro = bairro;
        this._logradouro = logradouro;
        this._numero = numero;
        this._complemento = complemento;
    }

    public int getId() {
        return _id;
    }

    public boolean isConsentido() {
        return _consentimento;
    }

    public LocalDate getDataNascimento() {
        return _dataNascimento;
    }

    public String getNome() {
        return _nome;
    }

    public String getCpf() {
        return _cpf;
    }

    public String getEmail() {
        return _email;
    }

    public String getPerfil() {
        return _perfil;
    }

    public String getRole() {
        return _role;
    }

    public String getSenha() {
        return _senha;
    }

    public String getTelefone() {
        return _telefone;
    }

    public String getEstado() {
        return _estado;
    }

    public String getMunicipio() {
        return _municipio;
    }

    public String getCep() {
        return _cep;
    }

    public String getBairro() {
        return _bairro;
    }

    public String getLogradouro() {
        return _logradouro;
    }

    public String getNumero() {
        return _numero;
    }

    public String getComplemento() {
        return _complemento;
    }

    public void setId(int id) {
        this._id = id;
    }

    public void setConsentimento(boolean consentimento) {
        this._consentimento = consentimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this._dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    public void getCpf(String cpf) {
        this._cpf = cpf;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public void setPerfil(String perfil) {
        this._perfil = perfil;
    }

    public void setRole(String role) {
        this._role = role;
    }

    public void setSenha(String senha) {
        this._senha = senha;
    }

    public void setTelefone(String telefone) {
        this._telefone = telefone;
    }

    public void setEstado(String estado) {
        this._estado = estado;
    }

    public void setMunicipio(String municipio) {
        this._municipio = municipio;
    }

    public void setCep(String cep) {
        this._cep = cep;
    }

    public void setBairro(String bairro) {
        this._bairro = bairro;
    }

    public void setLogradouro(String logradouro) {
        this._logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this._numero = numero;
    }

    public void setComplemento(String complemento) {
        this._complemento = complemento;
    }
}

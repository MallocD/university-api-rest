package com.projectweb.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String password;
    private Integer serialVersionUID;

    public User(Long id, String nome, String email, String telefone, String password, Integer serialVersionUID) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.password = password;
        this.serialVersionUID = serialVersionUID;
    }

    public User() {
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(Integer serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(nome, user.nome) && Objects.equals(telefone, user.telefone) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, telefone, password);
    }

}

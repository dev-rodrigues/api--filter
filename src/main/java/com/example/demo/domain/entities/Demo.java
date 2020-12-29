package com.example.demo.domain.entities;

import java.util.UUID;

public class Demo {

    private UUID id;

    private String descricao;

    public Demo() {
    }

    public Demo(UUID id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}

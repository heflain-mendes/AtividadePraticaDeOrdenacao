/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author heflain
 */
public enum Ordem {
    CRESCENTE("crecente"), DECRESCENTE("decrescente");
    
    private final String nome;
    
    Ordem(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}

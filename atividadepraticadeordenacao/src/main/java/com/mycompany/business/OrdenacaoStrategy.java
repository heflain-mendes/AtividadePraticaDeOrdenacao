/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.business;

import com.mycompany.model.Ordem;
import java.util.List;

/**
 *
 * @author Heflain
 */
public interface OrdenacaoStrategy {
    public void ordenar(List<Double> numeros, Ordem ordem) throws Exception;
    public String toString();
}

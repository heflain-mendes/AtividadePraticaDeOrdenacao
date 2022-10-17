/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.model.Ordem;
import java.util.List;
import com.mycompany.business.OrdenacaoStrategy;

/**
 *
 * @author heflain
 */
public class ExecutaOrdenacaoService {
    public void calcular(List<Double> numeros, OrdenacaoStrategy ordenacao, Ordem ordem) throws Exception{
        ordenacao.ordenar(numeros, ordem);
    }
}

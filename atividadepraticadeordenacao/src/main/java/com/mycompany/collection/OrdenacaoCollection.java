/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collection;

import com.mycompany.business.BubbleSort;
import com.mycompany.business.Ordenacao;
import com.mycompany.business.SelectionSort;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heflain
 */
public class OrdenacaoCollection {
    private List<Ordenacao> ordenacaoCollection;
    
    public OrdenacaoCollection(){
        this.ordenacaoCollection = new ArrayList<Ordenacao>();
        
        //Poderia fazer uma factory para criar essa estrutura
        this.ordenacaoCollection.add(new BubbleSort());
        this.ordenacaoCollection.add(new SelectionSort());
    }
    
    public Ordenacao get(int index) throws Exception{
        if(index < 0 || index >= this.ordenacaoCollection.size()){
            throw new Exception("index invalido");
        }
        
        return this.ordenacaoCollection.get(index);
    }
}

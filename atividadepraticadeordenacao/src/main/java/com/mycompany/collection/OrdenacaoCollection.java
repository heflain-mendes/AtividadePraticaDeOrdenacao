/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collection;

import com.mycompany.business.BubbleSortStrategy;
import com.mycompany.business.SelectionSortStrategy;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.business.OrdenacaoStrategy;

/**
 *
 * @author heflain
 */
public class OrdenacaoCollection {
    private List<OrdenacaoStrategy> ordenacaoCollection;
    
    public OrdenacaoCollection(){
        this.ordenacaoCollection = new ArrayList<OrdenacaoStrategy>();
        
        //Poderia fazer uma factory para criar essa estrutura
        this.ordenacaoCollection.add(new BubbleSortStrategy());
        this.ordenacaoCollection.add(new SelectionSortStrategy());
    }
    
    public OrdenacaoStrategy get(int index) throws Exception{
        if(index < 0 || index >= this.ordenacaoCollection.size()){
            throw new Exception("index invalido");
        }
        
        return this.ordenacaoCollection.get(index);
    }
}

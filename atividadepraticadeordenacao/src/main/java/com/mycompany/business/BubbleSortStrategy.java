/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.business;

import com.mycompany.model.Ordem;
import java.util.List;

/**
 *
 * @author Heflain
 */
public class BubbleSortStrategy implements OrdenacaoStrategy {

    @Override
    public void ordenar(List<Double> numeros, Ordem ordem) throws Exception {
        if (numeros == null) {
            throw new Exception("O atributo numeros não pode ser null");
        }

        for (Double n : numeros) {
            if (n == null) {
                throw new Exception("O atributo numeros não pode conter elementos null");
            }
        }

        if (numeros == null) {
            throw new Exception("O atributo numeros não pode ser null");
        }

        for (Double n : numeros) {
            if (n == null) {
                throw new Exception("O atributo numeros não pode conter elementos null");
            }
        }

        Double aux;
        if (ordem.equals(Ordem.CRESCENTE)) {
            for (int i = 0; i < numeros.size(); i++) {
                for (int j = i + 1; j < numeros.size(); j++) {
                    if (numeros.get(i) > numeros.get(j)) {
                        aux = numeros.get(j);
                        numeros.set(j, numeros.get(i));
                        numeros.set(i, aux);
                    }
                }
            }
        } else {
            for (int i = 0; i < numeros.size(); i++) {
                for (int j = i + 1; j < numeros.size(); j++) {
                    if (numeros.get(i) < numeros.get(j)) {
                        aux = numeros.get(j);
                        numeros.set(j, numeros.get(i));
                        numeros.set(i, aux);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "bubble sort";
    }
}

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
public class SelectionSortStrategy implements OrdenacaoStrategy {

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

        if (ordem.equals(Ordem.CRESCENTE)) {
            for (int i = 0; i < numeros.size(); i++) {
                int posicaoMenor = i;
                for (int j = (i + 1); j < numeros.size(); j++) {
                    if (numeros.get(j) < numeros.get(posicaoMenor)) {
                        posicaoMenor = j;
                    }
                }
                if (posicaoMenor != i) {
                    Double temp = numeros.get(i);
                    numeros.set(i, numeros.get(posicaoMenor));
                    numeros.set(posicaoMenor, temp);
                }
            }
        } else {
            for (int i = 0; i < numeros.size(); i++) {
                int posicaoMaior = i;
                for (int j = (i + 1); j < numeros.size(); j++) {
                    if (numeros.get(j) > numeros.get(posicaoMaior)) {
                        posicaoMaior = j;
                    }
                }
                if (posicaoMaior != i) {
                    Double temp = numeros.get(i);
                    numeros.set(i, numeros.get(posicaoMaior));
                    numeros.set(posicaoMaior, temp);
                }
            }
        }

    }

    @Override
    public String toString() {
        return "selection sort";
    }
}

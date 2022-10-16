/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author heflain
 */
public class LeitorArquivoService {

    public List<Double> ler(String caminho) throws FileNotFoundException, IOException{
        File file = new File(caminho);
        try ( FileReader fr = new FileReader(file);  BufferedReader br = new BufferedReader(fr)) {
            List<Double> lista = new ArrayList<>();
            String linha;
            br.readLine(); //descatar a primeira linha
            while ((linha = br.readLine()) != null) {
                if(linha.isBlank()){
                    continue;
                }
                lista.add(Double.parseDouble(linha));
            }

            return lista;
        }catch(FileNotFoundException e){
            throw new FileNotFoundException("Não foi possivel abri o arquivo");
        }catch(IOException e){
            throw new IOException("Não foi possivel ler o arquivo");
        }
    }
}

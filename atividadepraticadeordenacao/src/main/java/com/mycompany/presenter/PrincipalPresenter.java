/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presenter;

import com.mycompany.business.Ordenacao;
import com.mycompany.collection.OrdenacaoCollection;
import com.mycompany.model.Ordem;
import com.mycompany.service.ExecutaOrdenacaoService;
import com.mycompany.service.LeitorArquivoService;
import com.mycompany.view.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author heflain
 */
public class PrincipalPresenter {

    private PrincipalView view;
    private OrdenacaoCollection ordenacoes;
    private List<Double> numerosDesordenados;

    public PrincipalPresenter() {
        this.view = new PrincipalView();
        this.ordenacoes = new OrdenacaoCollection();

        iniciarComponentes();

    }

    private void iniciarComponentes() {
        this.view.getCmdMetodo().removeAllItems();
        try {
            this.view.getCmdMetodo().addItem(this.ordenacoes.get(0).toString());
            this.view.getCmdMetodo().addItem(this.ordenacoes.get(1).toString());
        } catch (Exception ex) {
            this.exibirMensagemErro(ex.getMessage());
        }
        

        this.view.getBtnCarregarArquivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarArquivo();
            }
        });

        this.view.getBtnOrdenar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processarOrdenacao();
            }
        });

        this.view.setVisible(true);
    }

    private void carregarArquivo() {
        try {
            this.numerosDesordenados = new LeitorArquivoService().ler("arq/salarios.csv");
        } catch (Exception ex) {
            this.exibirMensagemErro(ex.getMessage());
        }

        this.carregarListaDesordenados();
    }

    private void carregarListaDesordenados() {
        DefaultListModel dlm = new DefaultListModel();
        dlm.addAll(numerosDesordenados);

        this.view.getLstSemOrdem().setModel(dlm);
        this.view.getLstSemOrdem().setVisible(true);
    }

    private void processarOrdenacao() {
        List<Double> numeros = new ArrayList<>();
        numeros.addAll(this.numerosDesordenados);
        Ordenacao ordena = this.obterMetodoOrdenacao();
        Ordem ordem = this.obterOrdem();

        Instant antes = Instant.now();
        try {
            new ExecutaOrdenacaoService().calcular(numeros, ordena, ordem);
        } catch (Exception ex) {
            this.exibirMensagemErro(ex.getMessage());
        }
        Instant depois = Instant.now();
        Duration d = Duration.between(antes, depois);
        
        this.carregarTempo(d);
        this.carregarListaOrdenados(numeros);
    }

    private Ordenacao obterMetodoOrdenacao() {
        try {
            return this.ordenacoes.get(this.view.getCmdMetodo().getSelectedIndex());
        } catch (Exception ex) {
            this.exibirMensagemErro(ex.getMessage());
        }
         return null;
    }

    private Ordem obterOrdem() {
        if (this.view.getRbtmCrescente().isSelected()) {
            return Ordem.CRESCENTE;
        } else {
            return Ordem.DECRESCENTE;
        }
    }

    private void carregarListaOrdenados(List<Double> numeros) {
        if (numeros == null) {
            throw new RuntimeException("numeros não pode ser null");
        }

        DefaultListModel dlm = new DefaultListModel();
        dlm.addAll(numeros);

        this.view.getLstOrdenados().setModel(dlm);
        this.view.getLstOrdenados().setVisible(true);
    }
    
    private void carregarTempo(Duration d){
        this.view.getLblTempo().setText(String.valueOf(d.toMillis()+"ms"));
    }
    
    private void exibirMensagemErro(String mensagem){
        JOptionPane.showMessageDialog(view, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

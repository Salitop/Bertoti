package mvc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
	private Subject model;
	private controllerInterface controller;
	private String relatorio = "0";
	private String relatorioDobro = "0";
	private String relatorioTriplo = "0";
	
	JFrame frame;
	JPanel pnlBotoes;
	JPanel pnlDados;
	JPanel pnlRel;
	JPanel pnlRel2;
	JPanel pnlRel3;
	JLabel lblRel;
	JLabel lblRel2;
	JLabel lblRel3;
	JLabel relText;
	JLabel rel2Text;
	JLabel rel3Text;
	JButton btnRegistrar;
	JButton btnCancelar;
	
	public View(Subject mo, controllerInterface co) {
		this.model = mo;
		this.controller = co;
	}
	
	
	public void createView(){
		
		frame = new JFrame("Sistema de Relatórios");
		pnlBotoes = new JPanel();
		pnlDados = new JPanel();
		pnlRel = new JPanel();
		pnlRel2 = new JPanel();
		pnlRel3 = new JPanel();
		btnRegistrar = new JButton("btnRegistrar Relatório");
		btnCancelar = new JButton("btnCancelar Registro");
		lblRel = new JLabel();
		lblRel2 = new JLabel();
		lblRel3 = new JLabel();
		relText = new JLabel("Padrão");
		rel2Text = new JLabel("Dobro");
		rel3Text = new JLabel("Triplo");
		
		btnRegistrar.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		pnlBotoes.add(btnRegistrar);
		pnlBotoes.add(btnCancelar);
		pnlRel.add(relText);
		pnlRel.add(lblRel);
		pnlRel2.add(rel2Text);
		pnlRel2.add(lblRel2);
		pnlRel3.add(rel3Text);
		pnlRel3.add(lblRel3);
		pnlDados.add(pnlRel);
		pnlDados.add(pnlRel2);
		pnlDados.add(pnlRel3);
		frame.getContentPane().add(BorderLayout.SOUTH, pnlBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, pnlDados);
		
		lblRel.setText(relatorio);
		lblRel2.setText(relatorioDobro);
		lblRel3.setText(relatorioTriplo);
		
		
		frame.setSize(350, 150);
		frame.setVisible(true);
		
	}

	public void update(String rel, String rel2, String rel3) {
        relatorio = rel;
        relatorioDobro = rel2;
		relatorioTriplo = rel3;
        
		display();
	}

	public void display() {
		
		lblRel.setText(relatorio);
		lblRel2.setText(relatorioDobro);
		lblRel3.setText(relatorioTriplo);
		
	}
	
	public void habilitarBotaobtnRegistrar(){
		
		btnRegistrar.setEnabled(true);
		
	}
	
	public void desabilitarBotaobtnRegistrar(){
		
		btnRegistrar.setEnabled(false);
		
	}
	
	
	public void habilitarBotaobtnCancelar(){
		
		btnCancelar.setEnabled(true);
		
	}
	
	public void desabilitarBotaobtnCancelar(){
		
		btnCancelar.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == btnRegistrar){
				controller.btnRegistrar();
		}
		if (event.getSource() == btnCancelar){
				controller.btnCancelar();
		}
	}
}
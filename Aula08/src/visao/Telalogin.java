package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.ManipulaBD;

public class Telalogin  extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //variavel de inicialização.
	JPanel painel2;     
	JLabel titulo2;
	JTextField campoNome,campoSenha;
	JButton btnEnviar;
	ManipulaBD mbd = new ManipulaBD();
	
	
	public void TelaLogin() {//metodo construtor.
	//super("janela de login");//titulo da janela
	this.setSize(100,100);//tamanho da janela.
	this.setLocationRelativeTo(null);// aparecer janela no meio da tela.
	this.setVisible(true);//janela ficar visivel.
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);//fechar o programa.	
	Adiciona();
	this.setContentPane(painel2);
	this.pack();
	

	}
	public void Adiciona() {
		painel2 = new JPanel();
		painel2.setBackground(Color.LIGHT_GRAY);
		painel2.setPreferredSize(new Dimension(400,200));
		painel2.setLayout(null);
		
		titulo2 = new JLabel("Nome: ");
		titulo2.setBounds(10, 10, 50, 20);//controle de margem
		campoNome = new JTextField(20);
		campoNome.setBounds(60,10,250,20);//60 continuação de 50 titulo
		painel2.add(titulo2);//adicionar titulo
		painel2.add(campoNome);
		
		titulo2 = new JLabel("Senha: ");
		titulo2.setBounds(10, 30, 50, 20);
		campoNome = new JTextField(20);
		campoSenha.setBounds(60,30,250,20);
		painel2.add(titulo2);
		painel2.add(campoSenha);
		
		btnEnviar = new JButton("login");
		btnEnviar.setBounds(140,60,80, 20);
		painel2.add(btnEnviar);
		
		/*btnEnviar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mbd.Cadastro(campoNome.getText(),campoEmail.getText());
			}
		});*/
		
		}
}
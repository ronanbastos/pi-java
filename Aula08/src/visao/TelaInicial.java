package visao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;//importa a biblioteca swing

import modelo.ManipulaBD;

public class TelaInicial extends JFrame { //comando para inicializar o extends

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //variavel de inicialização.
	JPanel painel;     
	JLabel titulo;
	JTextField campoNome,campoEmail;
	JButton btnEnviar;
	JButton btnlogin;
	ManipulaBD mbd = new ManipulaBD();
	
	
	public TelaInicial() {//metodo construtor.
	super("Aula 08 - Titulo Janela");//titulo da janela
	this.setSize(100,100);//tamanho da janela.
	this.setLocationRelativeTo(null);// aparecer janela no meio da tela.
	this.setVisible(true);//janela ficar visivel.
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);//fechar o programa.	
	Adiciona();
	this.setContentPane(painel);
	this.pack();
	

	}
	public void TelaNavegar() {//metodo construtor.
	
		this.setSize(100,100);//tamanho da janela.
		this.setLocationRelativeTo(null);// aparecer janela no meio da tela.
		this.setVisible(true);//janela ficar visivel.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//fechar o programa.	
		Adiciona();
		this.setContentPane(painel);
		this.pack();
		

		}
	
	//Metodo para  adicionar elementos window
	public void Adiciona() {
	painel = new JPanel();
	painel.setBackground(Color.LIGHT_GRAY);
	painel.setPreferredSize(new Dimension(400,200));
	painel.setLayout(null);
	
	titulo = new JLabel("Nome: ");
	titulo.setBounds(10, 10, 50, 20);//controle de margem
	campoNome = new JTextField(20);
	campoNome.setBounds(60,10,250,20);//60 continuação de 50 titulo
	painel.add(titulo);//adicionar titulo
	painel.add(campoNome);
	
	titulo = new JLabel("Email: ");
	titulo.setBounds(10, 30, 50, 20);
	campoEmail = new JTextField(20);
	campoEmail.setBounds(60,30,250,20);
	painel.add(titulo);
	painel.add(campoEmail);
	
	btnEnviar = new JButton("Enviar");
	btnEnviar.setBounds(140,60,80, 20);
	painel.add(btnEnviar);
	
	btnEnviar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			mbd.Cadastro(campoNome.getText(),campoEmail.getText());
		}
	});
	
	}
	
}

package visao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import modelo.ManipulaBD;

public class TelaLogin extends JFrame{

	private static final long serialVersionUID = 1L;
	JPanel pnlPainel;
	JLabel lblTitulo;
	JButton btnVoltar;
	JButton btnlogar;
	JButton btnlimpar;
	JTextField campousuario,camposenha;
	ManipulaBD mbd = new ManipulaBD();
	
	TelaMenu tM = new TelaMenu();

	public TelaLogin() {
		super("Sisteminha - v0.9");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		Adiciona();
		this.setContentPane(pnlPainel);
		this.pack();
	}
	
	public void Adiciona() {
		
		pnlPainel = new JPanel();
		pnlPainel.setBackground(new Color(255,255,255));
		pnlPainel.setPreferredSize(new Dimension(500, 400));
		pnlPainel.setLayout(null);
		
		lblTitulo = new JLabel("Login do Sistema");
		lblTitulo.setBounds(140, 20, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		
		lblTitulo = new JLabel("Usuario: ");
		lblTitulo.setBounds(10, 70, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD,  14));
		pnlPainel.add(lblTitulo);
		campousuario = new JTextField(25);
		campousuario.setBounds(100,80,220,20);//60 continua��o de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campousuario);
		
		lblTitulo = new JLabel("Senha: ");
		lblTitulo.setBounds(20,90, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(lblTitulo);
		camposenha = new JTextField(10);
		camposenha.setBounds(100,100,220,20);//60 continua��o de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(camposenha);

		
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 270, 100, 30);
		btnVoltar.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnVoltar);
		
		btnlimpar = new JButton("Limpar");
		btnlimpar.setBounds(10,270,100,30);
		btnlimpar.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnlimpar);
		
		btnlogar = new JButton("Logar");
		btnlogar.setBounds(100, 270, 100, 30);
		btnlogar.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnlogar);
		
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btnlogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					setVisible(false);
					mbd.Login(campousuario.getText(),camposenha.getText());
					if(mbd.logado == true)
					{
						tM.getClass();
						tM.setVisible(true);
					}
					
				}
			
		});
		
		
	}

}








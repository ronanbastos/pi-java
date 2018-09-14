package visao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaInicial extends JFrame{

	private static final long serialVersionUID = 1L;
	JPanel pnlPainel;
	JLabel lblTitulo;
	JButton btnLogin, btnCadastro;
	
	TelaLogin tL = new TelaLogin();
	TelaCadUsuario tC = new TelaCadUsuario();
	
	public TelaInicial() {
		super("Sisteminha - v0.9");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Adiciona();
		this.setContentPane(pnlPainel);
		this.pack();
	}
	
	public void Adiciona() {
		
		pnlPainel = new JPanel();
		pnlPainel.setBackground(new Color(255,255,255));
		pnlPainel.setPreferredSize(new Dimension(500, 300));
		pnlPainel.setLayout(null);
		
		lblTitulo = new JLabel("Tela Inicial");
		lblTitulo.setBounds(160, 20, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		
		btnLogin = new JButton("Logar");
		btnLogin.setBounds(80, 120, 150, 100);
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnLogin);
		
		btnCadastro = new JButton("Cadastre-se");
		btnCadastro.setBounds(290, 120, 150, 100);
		btnCadastro.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnCadastro);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tL.getClass();
				tL.setVisible(true);
			}
		});
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tC.getClass();
				tC.setVisible(true);
			}
		});
		
	}

}

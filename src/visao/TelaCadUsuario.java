package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaCadUsuario  extends JFrame{

	private static final long serialVersionUID = 1L;
	JPanel pnlPainel;
	JLabel lblTitulo;
	JButton btnVoltar;
	JButton btncadastrar;
	JButton btnlimpar;
	JTextField campoNome,campoEmail,campoUsuario,campoSenha;
	
	public TelaCadUsuario() {
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
		
		lblTitulo = new JLabel("Cadastro do Usuario");
		lblTitulo.setBounds(120, 20, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		

		lblTitulo = new JLabel("Nome: ");
		lblTitulo.setBounds(10, 70, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		campoNome = new JTextField(25);
		campoNome.setBounds(100,80,220,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campoNome);
		
		lblTitulo = new JLabel("Email: ");
		lblTitulo.setBounds(10,100, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		campoEmail = new JTextField(10);
		campoEmail.setBounds(100,110,220,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campoEmail);
		
		lblTitulo = new JLabel("Usuario: ");
		lblTitulo.setBounds(10,130, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		campoUsuario = new JTextField(10);
		campoUsuario.setBounds(130,140,220,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campoUsuario);
		
		lblTitulo = new JLabel("Senha: ");
		lblTitulo.setBounds(10,160, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		campoSenha = new JTextField(10);
		campoSenha.setBounds(110,170,220,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campoSenha);
		
		
		btnVoltar = new JButton("Voltar ");
		btnVoltar.setBounds(180, 270, 100, 30);
		btnVoltar.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnVoltar);
		
		btncadastrar = new JButton("Cadastrar ");
		btncadastrar.setBounds(10, 270, 150, 30);
		btncadastrar.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btncadastrar);
		
		btnlimpar = new JButton("Limpar");
		btnlimpar.setBounds(280, 270, 100, 30);
		btnlimpar.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnlimpar);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		
	}

}

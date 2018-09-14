package visao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import modelo.ManipulaBD;

public class TelaMenu extends JFrame{

	private static final long serialVersionUID = 1L;
	JPanel pnlPainel;
	JLabel lblTitulo;
	JButton btncadastrar, btnVoltar,btnlimpar,btncaixa;
	JTextField camponome,campostatus,campostadia,campocpf,campototal,campoplaca;
	ManipulaBD mbd = new ManipulaBD();

	

	
	
	public TelaMenu() {
		super("Sisteminha - v0.9");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Adiciona();
		this.setContentPane(pnlPainel);
		this.pack();
	}
	
	public void Adiciona() {
		
		pnlPainel = new JPanel();
		pnlPainel.setBackground(new Color(255,255,255));
		pnlPainel.setPreferredSize(new Dimension(500, 400));
		pnlPainel.setLayout(null);
		
		lblTitulo = new JLabel("Tela Inicial");
		lblTitulo.setBounds(160, 20, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		btnVoltar = new JButton("Logout ");
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
		
		btncaixa = new JButton("Caixa");
		btncaixa.setBounds(380, 270, 100, 30);
		btncaixa.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btncaixa);
		
		lblTitulo = new JLabel("Placa: ");
		lblTitulo.setBounds(10,70, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		campocpf = new JTextField(10);
		campocpf.setBounds(100,70,220,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campocpf);
		
		
		
		lblTitulo = new JLabel("cpf: ");
		lblTitulo.setBounds(10,100, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		campocpf = new JTextField(10);
		campocpf.setBounds(90,110,220,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campocpf);
		
		lblTitulo = new JLabel("nome: ");
		lblTitulo.setBounds(10,130, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		camponome = new JTextField(10);
		camponome.setBounds(100,140,220,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(camponome);
		
		lblTitulo = new JLabel("Stadia: ");
		lblTitulo.setBounds(10,160, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
	
		JComboBox box = new JComboBox();
		box.setBounds(110,160, 300, 30);	
		box.addItem("15 min");
		box.addItem("30 min");
		box.addItem("45 min");
		box.addItem("1 hora");
		pnlPainel.add(box);
		lblTitulo = new JLabel("Pgto: ");
		lblTitulo.setBounds(10,190, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		campostadia = new JTextField(10);
		campostadia.setBounds(90,200,200,20);//60 continuação de 50 titulo
		pnlPainel.add(lblTitulo);//adicionar titulo
		pnlPainel.add(campostadia);
		
		
		
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			///parameto cadastrar
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mbd.logado = false;
				if(mbd.logado == false)
				{
					
					setVisible(false);
				}
			}
		});
		
	}

}

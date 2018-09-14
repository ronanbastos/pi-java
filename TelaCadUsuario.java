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
		pnlPainel.setPreferredSize(new Dimension(500, 300));
		pnlPainel.setLayout(null);
		
		lblTitulo = new JLabel("Cadastro do Usuario");
		lblTitulo.setBounds(120, 20, 300, 30);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		pnlPainel.add(lblTitulo);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(180, 250, 150, 30);
		btnVoltar.setFont(new Font("Verdana", Font.BOLD, 14));
		pnlPainel.add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

}

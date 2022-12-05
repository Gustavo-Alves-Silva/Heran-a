package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.Classe;
import Controle.Filo;
import Controle.Ordem;

public class CadastroOrdem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					CadastroOrdem frame = new CadastroOrdem(null);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroOrdem(Classe classe) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/app_icon_small.png"));
		Color clRed = new Color(226, 0, 54);
		Color clDark = new Color(22, 22, 22);
		Color clLight = new Color(45, 45, 45);
		Color clLighter = new Color(197, 197, 197);

		Font poppins, pop10 = null, pop12 = null;

		try {

			poppins = Font.createFont(Font.TRUETYPE_FONT, new File("./font/Poppins-SemiBold.ttf"));
			pop10 = poppins.deriveFont(Font.TRUETYPE_FONT, 10);
			pop12 = poppins.deriveFont(Font.TRUETYPE_FONT, 12);

		} catch (Exception e) {
			e.printStackTrace();
		}

		setResizable(false);
		setTitle("Sistema de Vendas Ep\u00EDtome");
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 460);
		contentPane = new JPanel();
		contentPane.setBackground(clLight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(clDark);
		panel.setBounds(149, 111, 176, 190);
		panel.setBorder(new RoundBorder(Color.WHITE, 1, 10));
		contentPane.add(panel);
		panel.setLayout(null);


		JLabel lblCadastro = new JLabel("NOME");
		lblCadastro.setForeground(clLighter);
		lblCadastro.setFont(pop10);
		lblCadastro.setBounds(10, 36, 156, 14);
		panel.add(lblCadastro);

		RoundField txtCadastro = new RoundField();
		txtCadastro.setSelectedTextColor(clDark);
		txtCadastro.setSelectionColor(clRed);
		txtCadastro.setCaretColor(Color.WHITE);
		txtCadastro.setForeground(Color.WHITE);
		txtCadastro.setBackground(clLight);
		txtCadastro.setFont(pop12);
		txtCadastro.setBounds(10, 50, 156, 20);
		panel.add(txtCadastro);
		txtCadastro.setColumns(10);

		RoundButton btnCadastrar = new RoundButton("Cadastrar");
		btnCadastrar.setForeground(clRed);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
					
					String nomeOrdem = txtCadastro.getText();
					Ordem ordem = new Ordem(classe.getFilo().getReino().getNomeReino(),classe.getNomeFilo(), classe.getNomeClasse(),nomeOrdem);
					classe.getOrdens().add(ordem);
					TelaOrdemListar A = new TelaOrdemListar(classe);
					System.out.println("Ordem Cadastrado");
					A.setVisible(true);
					setVisible(false);


				
		}
		});
		btnCadastrar.setPressedBackgroundColor(Color.BLACK);
		btnCadastrar.setOpaque(false);
		btnCadastrar.setBackground(null);
		btnCadastrar.setBorder(new RoundBorder(clRed, 1, 10));
		btnCadastrar.setFont(pop12);
		btnCadastrar.setBounds(10, 156, 156, 23);
		panel.add(btnCadastrar);

		JLabel fakeBG = new JLabel("");
		fakeBG.setIcon(new ImageIcon("./img/bg.png"));
		fakeBG.setBounds(-495, -286, 1600, 861);
		contentPane.add(fakeBG);
		
		setLocationRelativeTo(null);
	}
}


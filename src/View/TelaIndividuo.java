package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Controle.Especie;
import Controle.Individuo;
import View.TelaIndividuoListar.RoundedBorder;

public class TelaIndividuo extends JFrame {
	private Individuo individuoG;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIndividuo frame = new TelaIndividuo(null);
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
	public TelaIndividuo(Individuo individuo) {
		individuoG = individuo;
		System.out.println(individuo.getEspecie().getFamilia().getOrdem().getClasse().getFilo().getReino());
		System.out.println(individuo.getEspecie().getFamilia().getOrdem().getClasse().getFilo());
		System.out.println(individuo.getEspecie().getFamilia().getOrdem().getClasse());
		System.out.println(individuo.getEspecie().getFamilia().getOrdem());
		System.out.println(individuo.getEspecie().getFamilia());
		System.out.println(individuo.getEspecie());
		System.out.println(individuo);
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
		setTitle("Individuo dados");
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 515, 460);
		contentPane = new JPanel();
		contentPane.setBackground(clLight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(clDark);
		panel.setBounds(149, 111, 176, 230);
		panel.setBorder(new RoundBorder(Color.WHITE, 1, 10));
		contentPane.add(panel);
		panel.setLayout(null);


		JLabel lblReino = new JLabel("Reino: "+individuo.getNomeReino());
		lblReino.setForeground(clLighter);
		lblReino.setFont(pop10);
		lblReino.setBounds(10, 7, 156, 14);
		panel.add(lblReino);
		
		JLabel lblFilo = new JLabel("Filo: "+ individuo.getNomeFilo());
		lblFilo.setForeground(clLighter);
		lblFilo.setFont(pop10);
		lblFilo.setBounds(10, 32, 156, 14);
		panel.add(lblFilo);
		
		JLabel lblClasse = new JLabel("Classe: "+ individuo.getNomeClasse());
		lblClasse.setForeground(clLighter);
		lblClasse.setFont(pop10);
		lblClasse.setBounds(10, 57, 156, 14);
		panel.add(lblClasse);
		
		JLabel lblOrdem = new JLabel("Ordem: "+individuo.getNomeOrdem());
		lblOrdem.setForeground(clLighter);
		lblOrdem.setFont(pop10);
		lblOrdem.setBounds(10,82, 156, 14);
		panel.add(lblOrdem);
		
		JLabel lblFamilia = new JLabel("Familia: "+individuo.getNomeFamilia());
		lblFamilia.setForeground(clLighter);
		lblFamilia.setFont(pop10);
		lblFamilia.setBounds(10, 107, 156, 14);
		panel.add(lblFamilia);
		
		JLabel lblGenero = new JLabel("Genero: "+individuo.getNomeGereno());
		lblGenero.setForeground(clLighter);
		lblGenero.setFont(pop10);
		lblGenero.setBounds(10, 132, 156, 14);
		panel.add(lblGenero);
		
		JLabel lblEspecie = new JLabel("Especie: "+ individuo.getNomeEspecie());
		lblEspecie.setForeground(clLighter);
		lblEspecie.setFont(pop10);
		lblEspecie.setBounds(10, 157, 156, 14);
		panel.add(lblEspecie);
		
		JLabel lblIndividuo = new JLabel("Individuo: "+individuo.getNomeIndiduo());
		lblIndividuo.setForeground(clLighter);
		lblIndividuo.setFont(pop10);
		lblIndividuo.setBounds(10, 182, 156, 14);
		panel.add(lblIndividuo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Voltar tela");
					TelaIndividuoListar telaClasse = new TelaIndividuoListar(individuo.getEspecie());
					telaClasse.setVisible(true);
					setVisible(false);          
			}
		});
		btnVoltar.setOpaque(false);
		btnVoltar.setBackground(null);
		Chisel(btnVoltar, new Color(255, 255, 255), 5);
		btnVoltar.setFont(pop12);
		btnVoltar.setBounds(10, 202, 156, 20);
		panel.add(btnVoltar);

		setContentPane(contentPane);
	}
	
	protected MaskFormatter def_mask(String envolucro, char substituto) {
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter(envolucro);
			mask.setPlaceholderCharacter(substituto);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return mask;
	}
	private static void Chisel(JButton button, Color color, int radius) {

		button.setFocusPainted(false);
		button.setForeground(color);
		RoundedBorder LineBorder = new RoundedBorder(color, radius);
		Border emptyBorder = BorderFactory.createEmptyBorder(button.getBorder().getBorderInsets(button).top,
				button.getBorder().getBorderInsets(button).left, button.getBorder().getBorderInsets(button).bottom,
				button.getBorder().getBorderInsets(button).right);
		button.setBorder(BorderFactory.createCompoundBorder(LineBorder, emptyBorder));
	}





	public static class RoundedBorder implements Border {

		private int radius = 10;
		private Color color;

		private RoundedBorder(Color color, int radius) {
			this.color = color;
			this.radius = radius;
		}

		@Override
		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 1, this.radius + 1);
		}

		@Override
		public boolean isBorderOpaque() {
			return true;
		}

		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.setColor(color);
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

}

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
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

	import javax.swing.JFrame;

	import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
	import javax.swing.border.EmptyBorder;
	import javax.swing.text.MaskFormatter;

import Controle.Classe;
import Controle.Especie;
import Controle.Familia;
import Controle.Filo;
import Controle.Genero;
import Controle.Ordem;
import Controle.Reino;

import javax.swing.ScrollPaneConstants;


	public class TelaEspecieListar extends JFrame {

		private JPanel contentPane;
		private Genero generoG;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TelaEspecieListar frame = new TelaEspecieListar(null);
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
		public TelaEspecieListar(Genero genero) {
			generoG = genero;
			System.out.println(genero.getFamilia().getOrdem().getClasse());
			setIconImage(Toolkit.getDefaultToolkit()
					.getImage("./img/app_icon_small.png"));
			Color clRed = new Color(226, 0, 54);
			Color clBlue = new Color(113, 206, 236);

			Font poppins, pop10 = null, pop12 = null;

			try {

				poppins = Font.createFont(Font.TRUETYPE_FONT, new File("./font/Poppins-SemiBold.ttf"));
				pop10 = poppins.deriveFont(Font.TRUETYPE_FONT, 10);
				pop12 = poppins.deriveFont(Font.TRUETYPE_FONT, 12);

			} catch (Exception e) {
				e.printStackTrace();
			}
			setResizable(false);
			setTitle("Especie");
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setBounds(200, 100, 453, 564);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(45, 45, 45));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane_1.setBounds(200, 11, 186, 514);
			contentPane.add(scrollPane_1);

			
			JButton btnCadastro = new JButton("Cadastrar Especie");
			btnCadastro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CadastroEspecie cadastro = new CadastroEspecie(genero);
					cadastro.setVisible(true);
					setVisible(false);
				}
			});
			btnCadastro.setOpaque(false);
			btnCadastro.setBackground(null);
			Chisel(btnCadastro, new Color(255, 255, 255), 5);
			btnCadastro.setFont(pop12);
			btnCadastro.setBounds(24, 61, 166, 42);
			contentPane.add(btnCadastro);
						
			JPanel panel = new JPanel();
			panel.setBackground(new Color(22, 22, 22));
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			
			int i = 10;
			for (Especie c : genero.getEspecies()) {
				
				Filo filo =genero.getFamilia().getOrdem().getClasse().getFilo();
				Reino reino  = genero.getFamilia().getOrdem().getClasse().getFilo().getReino();
				c.setGenero(genero);
				c.getGenero().setEspecies(genero.getEspecies());
				c.getGenero().setFamilia(genero.getFamilia());
				c.getGenero().getFamilia().setGeneros(genero.getFamilia().getGeneros());
				c.getGenero().getFamilia().setOrdem(genero.getFamilia().getOrdem());
				c.getGenero().getFamilia().getOrdem().setFamilias(genero.getFamilia().getFamilias());
				c.getGenero().getFamilia().getOrdem().getClasse().setFilo(filo);
				c.getGenero().getFamilia().getOrdem().getClasse().getFilo().getReino().setFilos(genero.getFamilia().getOrdem().getClasse().getFilo().getReino().getFilos());
				c.getGenero().getFamilia().getOrdem().setClasse(genero.getFamilia().getOrdem().getClasse());
				c.getGenero().getFamilia().getOrdem().getClasse().getFilo().setClasses(genero.getFamilia().getOrdem().getClasse().getFilo().getClasses());
				c.getGenero().getFamilia().getOrdem().getClasse().setOrdens(genero.getFamilia().getOrdens());

				c.getGenero().getFamilia().getOrdem().getClasse().getFilo().setReino(reino.getNomeReino());
				
			JButton btnEspecie = new JButton(c.getNomeEspecie());
			btnEspecie.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaIndividuoListar telaIndividuo = new TelaIndividuoListar(c);
					telaIndividuo.setVisible(true);
					setVisible(false);
				}
			});
			btnEspecie.setOpaque(false);
			btnEspecie.setBackground(null);
			Chisel(btnEspecie, new Color(255, 255, 255), 5);
			btnEspecie.setFont(pop12);
			btnEspecie.setBounds(10, i, 156, 34);
			panel.add(btnEspecie);
			i +=35;
					}
			JButton btnVoltar = new JButton("Voltar Para Genero");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("Voltar tela");
						TelaGeneroListar telaClasse = new TelaGeneroListar(generoG.getFamilia());
						telaClasse.setVisible(true);
						setVisible(false);          
				}
			});
			btnVoltar.setOpaque(false);
			btnVoltar.setBackground(null);
			Chisel(btnVoltar, new Color(255, 255, 255), 5);
			btnVoltar.setFont(pop12);
			btnVoltar.setBounds(24, 11, 166, 42);
			contentPane.add(btnVoltar);
			
			scrollPane_1.setViewportView(panel);

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

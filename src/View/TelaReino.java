package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Controle.Reino;
import View.TelaFilosListar.RoundedBorder;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class TelaReino extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaReino frame = new TelaReino();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the fram
	 */
	public TelaReino() {
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
		setTitle("Reinos");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(500, 150, 300, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(45, 45, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnReinoAnamalia = new JButton("Animalia");
		btnReinoAnamalia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reino reino = new Reino("Anamalia");
				TelaFilosListar A = new TelaFilosListar(reino);
				A.setVisible(true);
				setVisible(false);
			}
		});
		btnReinoAnamalia.setOpaque(false);
		btnReinoAnamalia.setBackground(null);
		Chisel(btnReinoAnamalia, new Color(255, 255, 255), 5);
		btnReinoAnamalia.setFont(pop12);
		btnReinoAnamalia.setBounds((int) 60, 112, 166, 42);
		contentPane.add(btnReinoAnamalia);
		
		JButton btnReinoPlantae = new JButton("Plantae");
		btnReinoPlantae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reino reino = new Reino("Plantae");
				TelaFilosListar A = new TelaFilosListar(reino);
				A.setVisible(true);
				setVisible(false);
			}
		});
		btnReinoPlantae.setOpaque(false);
		btnReinoPlantae.setBackground(null);
		Chisel(btnReinoPlantae, new Color(255, 255, 255), 5);
		btnReinoPlantae.setFont(pop12);
		btnReinoPlantae.setBounds((int) 60, 150, 166, 42);
		contentPane.add(btnReinoPlantae);

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





	private static class RoundedBorder implements Border {

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

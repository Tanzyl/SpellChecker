package PresentationLayer;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LogicLayer.Mutants_wajeeha;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontViewj_wajeeha extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontViewj_wajeeha frame = new FrontViewj_wajeeha();
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
	public FrontViewj_wajeeha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("GENERATE");
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mutants_wajeeha obj = new Mutants_wajeeha();
				Mutants_wajeeha.control();
			    JOptionPane.showMessageDialog(null,"Mutants generated successfully");
			}
		});
		btnNewButton.setBounds(148, 134, 138, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("MUTANT GENERATOR");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(128, 56, 180, 67);
		contentPane.add(lblNewLabel);
		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InsertingData frame = new InsertingData();
				frame.setVisible(true);
			}
		});
		backBtn.setBounds(319, 227, 89, 23);
		contentPane.add(backBtn);
	}
}

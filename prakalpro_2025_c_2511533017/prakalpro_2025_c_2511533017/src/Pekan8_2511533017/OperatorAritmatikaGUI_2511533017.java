package Pekan8_2511533017;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533017 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField textBil2;
	private JTextField txtHasil;
	
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void PesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan",JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533017 frame = new OperatorAritmatikaGUI_2511533017();
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
	public OperatorAritmatikaGUI_2511533017() {
		setTitle("OperatorAritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 10, 278, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(26, 81, 85, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(26, 110, 85, 19);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setBounds(26, 147, 85, 19);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setBounds(26, 211, 85, 19);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(145, 78, 96, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		textBil2 = new JTextField();
		textBil2.setHorizontalAlignment(SwingConstants.CENTER);
		textBil2.setColumns(10);
		textBil2.setBounds(145, 110, 96, 18);
		contentPane.add(textBil2);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(145, 211, 96, 18);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(145, 146, 96, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("HITUNG");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 Harus diisi");
				} else if (textBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 Harus diisi");
				}else
				{
					try {
				
				int a= Integer.valueOf(txtBil1.getText());
				int b= Integer.valueOf(textBil2.getText()); 
				int c= cbOperator.getSelectedIndex();
				if (c==0) {
					hasil=a+b;
				}
				if(c==1) {
					hasil=a-b;
				}
				if(c==2) {
					hasil=a*b;
				}
				if(c==3) {
					hasil=a/b;
				}
				if(c==4) {
					hasil=a%b;
				}
				txtHasil.setText(String.valueOf(hasil));
			} catch (NumberFormatException ex) {
				PesanEror("Bilangan 1 dan Bilangan 2 harus angka");
			}
				}
			}
		});
		btnNewButton.setBounds(277, 146, 84, 20);
		contentPane.add(btnNewButton);

	}
}

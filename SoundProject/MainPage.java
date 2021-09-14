package SoundProject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.text.*;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JTextField textUhi;
	private JTextField textUlow;
	private JTextField textBytes;
	public static DecimalFormat df = new DecimalFormat("#.####");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setTitle("Home Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUhi = new JTextField();
		textUhi.setHorizontalAlignment(SwingConstants.CENTER);
		textUhi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textUhi.setColumns(10);
		textUhi.setBounds(10, 148, 134, 36);
		contentPane.add(textUhi);
		
		textUlow = new JTextField();
		textUlow.setHorizontalAlignment(SwingConstants.CENTER);
		textUlow.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textUlow.setColumns(10);
		textUlow.setBounds(174, 148, 134, 36);
		contentPane.add(textUlow);
		
		textBytes = new JTextField();
		textBytes.setHorizontalAlignment(SwingConstants.CENTER);
		textBytes.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textBytes.setColumns(10);
		textBytes.setBounds(333, 148, 134, 36);
		contentPane.add(textBytes);
		
		JButton calButton = new JButton("Calculate!");
		calButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					double uhi, ulow, efsr, n, q, sqnr, sqnrB, efsrSqnr;
					String EFSR, N, Q, SQNR, SQNRB, EFSQ;
					byte b;
					uhi = Double.parseDouble(textUhi.getText());
					ulow = Double.parseDouble(textUlow.getText());
					b = Byte.parseByte(textBytes.getText());
					if(uhi>1.0 || ulow<-1.0 || uhi<-1.0 || ulow>1.0 )
						{JOptionPane.showMessageDialog(null, "Enter values between -1.0 and 1.0!");}
					else
					{
						n = Math.pow(2, b);
						efsr = uhi - ulow;
						q = efsr/(n-1);
						sqnr = 6.02*q;
						sqnrB = 6.02*b;
						efsrSqnr = efsr + sqnr;
												
						EFSR = df.format(efsr);
						N = String.valueOf((int)n);
						Q = df.format(q);
						SQNR = df.format(sqnr);
						SQNRB = String.valueOf(sqnrB);
						EFSQ = df.format(efsrSqnr);
						
						EFSR = EFSR.replaceAll("\\,", "\\.");
						Q = Q.replaceAll("\\,", "\\.");
						SQNR = SQNR.replaceAll("\\,", "\\.");
						EFSQ = EFSQ.replaceAll("\\,", "\\.");
						
						ResultPage p2 = new ResultPage();
						p2.textEFSR.setText(EFSR);
						p2.textN.setText(N);
						p2.textQ.setText(Q);
						p2.textSQNR.setText(SQNR);
						p2.textSQNRB.setText(SQNRB);
						p2.textEFSQ.setText(EFSQ);
						p2.setVisible(true);
						dispose();
						
					}
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Enter valid number!");
				}
			}
		});
		calButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		calButton.setBounds(174, 217, 134, 41);
		contentPane.add(calButton);
		
		JLabel lblUhi = new JLabel("URefHigh");
		lblUhi.setHorizontalAlignment(SwingConstants.CENTER);
		lblUhi.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUhi.setBounds(28, 119, 90, 29);
		contentPane.add(lblUhi);
		
		JLabel lblUlow = new JLabel("URefLow");
		lblUlow.setHorizontalAlignment(SwingConstants.CENTER);
		lblUlow.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUlow.setBounds(196, 119, 90, 29);
		contentPane.add(lblUlow);
		
		JLabel lblBytes = new JLabel("Bytes");
		lblBytes.setHorizontalAlignment(SwingConstants.CENTER);
		lblBytes.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblBytes.setBounds(355, 119, 90, 29);
		contentPane.add(lblBytes);
		
		JLabel lblMain = new JLabel("SOUND MEASURING");
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblMain.setBounds(105, 31, 262, 38);
		contentPane.add(lblMain);
		
		JLabel lblInfotext = new JLabel("Input values for URefHi, URefLow and the number of bytes.");
		lblInfotext.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfotext.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInfotext.setBounds(28, 70, 419, 41);
		contentPane.add(lblInfotext);
	}

}

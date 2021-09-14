package SoundProject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ResultPage extends JFrame {

	private JPanel contentPane;
	public JTextField textEFSR;
	public JTextField textN;
	public JTextField textQ;
	public JTextField textSQNR;
	public JTextField textSQNRB;
	public JTextField textEFSQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultPage frame = new ResultPage();
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
	public ResultPage() {
		setTitle("Results");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textEFSR = new JTextField();
		textEFSR.setHorizontalAlignment(SwingConstants.CENTER);
		textEFSR.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textEFSR.setColumns(10);
		textEFSR.setBounds(169, 82, 134, 36);
		contentPane.add(textEFSR);
		
		JLabel lblEFSR = new JLabel("EFSR:");
		lblEFSR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEFSR.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEFSR.setBounds(71, 90, 88, 18);
		contentPane.add(lblEFSR);
		
		JLabel lblN = new JLabel("N:");
		lblN.setHorizontalAlignment(SwingConstants.RIGHT);
		lblN.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblN.setBounds(71, 150, 88, 18);
		contentPane.add(lblN);
		
		textN = new JTextField();
		textN.setHorizontalAlignment(SwingConstants.CENTER);
		textN.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textN.setColumns(10);
		textN.setBounds(169, 142, 134, 36);
		contentPane.add(textN);
		
		JLabel lblQ = new JLabel("Q:");
		lblQ.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQ.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblQ.setBounds(71, 210, 88, 18);
		contentPane.add(lblQ);
		
		textQ = new JTextField();
		textQ.setHorizontalAlignment(SwingConstants.CENTER);
		textQ.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textQ.setColumns(10);
		textQ.setBounds(169, 202, 134, 36);
		contentPane.add(textQ);
		
		JLabel lblSqnr = new JLabel("SQNR:");
		lblSqnr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSqnr.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSqnr.setBounds(71, 270, 88, 18);
		contentPane.add(lblSqnr);
		
		textSQNR = new JTextField();
		textSQNR.setHorizontalAlignment(SwingConstants.CENTER);
		textSQNR.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textSQNR.setColumns(10);
		textSQNR.setBounds(169, 262, 134, 36);
		contentPane.add(textSQNR);
		
		JLabel lblEfsrSqnr = new JLabel("EFSR + SQNR:");
		lblEfsrSqnr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEfsrSqnr.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEfsrSqnr.setBounds(40, 390, 120, 18);
		contentPane.add(lblEfsrSqnr);
		
		textSQNRB = new JTextField();
		textSQNRB.setHorizontalAlignment(SwingConstants.CENTER);
		textSQNRB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textSQNRB.setColumns(10);
		textSQNRB.setBounds(169, 322, 134, 36);
		contentPane.add(textSQNRB);
		
		JLabel lblSqnrB = new JLabel("SQNR in bytes:");
		lblSqnrB.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSqnrB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSqnrB.setBounds(40, 330, 120, 18);
		contentPane.add(lblSqnrB);
		
		textEFSQ = new JTextField();
		textEFSQ.setHorizontalAlignment(SwingConstants.CENTER);
		textEFSQ.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textEFSQ.setColumns(10);
		textEFSQ.setBounds(169, 382, 134, 36);
		contentPane.add(textEFSQ);
		
		JLabel lblResults = new JLabel("RESULTS:");
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblResults.setBounds(128, 32, 196, 28);
		contentPane.add(lblResults);
	}

}

package creatingFrame2x;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn6;
	private JButton btn3;
	private JButton btneql;
	private JButton btnmynus;
	private JButton btn1;
	private JButton btn0;
	private JButton btn2;
	private JButton btnpoint;
	private JButton btnmul;
	private JButton btndiv;
	private JButton btn7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 272, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 229, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7;
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(129, 130, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn8;
		btneql = new JButton("=");
		btneql.setFont(new Font("Tahoma", Font.BOLD, 19));
		btneql.setBounds(129, 254, 50, 50);
		frame.getContentPane().add(btneql);
		
		JButton btn9;
		btndiv = new JButton("/");
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 24));
		btndiv.setBounds(189, 254, 50, 50);
		frame.getContentPane().add(btndiv);
		
		JButton btnplus;
		btnmynus = new JButton("-");
		btnmynus.setFont(new Font("Tahoma", Font.BOLD, 29));
		btnmynus.setBounds(189, 128, 50, 50);
		frame.getContentPane().add(btnmynus);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(10, 130, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5;
		btnpoint = new JButton(".");
		btnpoint.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnpoint.setBounds(70, 254, 50, 50);
		frame.getContentPane().add(btnpoint);
		
		
		JButton btn71 = new JButton("7");
		btn71.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn71.setBounds(10, 69, 50, 50);
		frame.getContentPane().add(btn71);
		
		JButton btn81 = new JButton("8");
		btn81.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn81.setBounds(70, 69, 50, 50);
		frame.getContentPane().add(btn81);
		
		JButton btn91 = new JButton("9");
		btn91.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn91.setBounds(129, 69, 50, 50);
		frame.getContentPane().add(btn91);
		
		JButton btnplus1 = new JButton("+");
		btnplus1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnplus1.setBounds(189, 69, 50, 50);
		frame.getContentPane().add(btnplus1);
		
		JButton btn41;
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(10, 254, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btn51 = new JButton("5");
		btn51.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn51.setBounds(70, 130, 50, 50);
		frame.getContentPane().add(btn51);
		
		JButton btn411;
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setBounds(10, 191, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn511;
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(70, 191, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn811;
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(129, 191, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn911;
		btnmul = new JButton("x");
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnmul.setBounds(189, 189, 50, 50);
		frame.getContentPane().add(btnmul);
		
		
	}
}

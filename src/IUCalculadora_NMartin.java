
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class IUCalculadora_NMartin {
	/**
	 * in: variable para guardad lo que el usuario introduce
	 * out: variable que guarda lo que se va adevolver por pantalla
	 */
	private String in = new String();
	private String out = new String();
	private Calculadora calc = new Calculadora();

	private JFrame frame;
	private JTextField textField;
	private JButton btnDelete;
	private JButton btnClear;
	private JButton btnCeros;
	private JButton btnAdd;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnSubtract;
	private JButton btnFour;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnMult;
	private JButton btnOne;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnDiv;
	private JButton btnEqual;
	private JButton btnZero;
	private JButton btnPoint;
	private JButton btnPrimo;
	private JButton btnFact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUCalculadora_NMartin window = new IUCalculadora_NMartin();
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
	public IUCalculadora_NMartin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.getContentPane().setForeground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 265, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Leelawadee", Font.BOLD, 12));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 229, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		btnCeros = new JButton("00");
		btnCeros.setForeground(Color.BLACK);
		btnCeros.setBackground(new Color(204, 204, 255));
		btnCeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "00";
				out += "00";
				textField.setText(out);
			}
		});
		btnCeros.setFont(new Font("Leelawadee", Font.BOLD, 12));
		btnCeros.setBounds(126, 71, 55, 40);
		frame.getContentPane().add(btnCeros);

		btnSeven = new JButton("7");
		btnSeven.setForeground(Color.BLACK);
		btnSeven.setBackground(Color.WHITE);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "7";
				out += "7";
				textField.setText(out);
			}
		});
		btnSeven.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnSeven.setBounds(10, 111, 55, 40);
		frame.getContentPane().add(btnSeven);

		btnEight = new JButton("8");
		btnEight.setForeground(Color.BLACK);
		btnEight.setBackground(Color.WHITE);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "8";
				out += "8";
				textField.setText(out);
			}
		});
		btnEight.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnEight.setBounds(68, 111, 55, 40);
		frame.getContentPane().add(btnEight);

		btnNine = new JButton("9");
		btnNine.setForeground(Color.BLACK);
		btnNine.setBackground(Color.WHITE);
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "9";
				out += "9";
				textField.setText(out);
			}
		});
		btnNine.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnNine.setBounds(126, 111, 55, 40);
		frame.getContentPane().add(btnNine);

		btnFour = new JButton("4");
		btnFour.setForeground(Color.BLACK);
		btnFour.setBackground(Color.WHITE);
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "4";
				out += "4";
				textField.setText(out);
			}
		});
		btnFour.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnFour.setBounds(10, 151, 55, 40);
		frame.getContentPane().add(btnFour);

		btnFive = new JButton("5");
		btnFive.setForeground(Color.BLACK);
		btnFive.setBackground(Color.WHITE);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "5";
				out += "5";
				textField.setText(out);
			}
		});
		btnFive.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnFive.setBounds(68, 151, 55, 40);
		frame.getContentPane().add(btnFive);

		btnSix = new JButton("6");
		btnSix.setForeground(Color.BLACK);
		btnSix.setBackground(Color.WHITE);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "6";
				out += "6";
				textField.setText(out);
			}
		});
		btnSix.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnSix.setBounds(126, 151, 55, 40);
		frame.getContentPane().add(btnSix);

		btnOne = new JButton("1");
		btnOne.setForeground(Color.BLACK);
		btnOne.setBackground(Color.WHITE);
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "1";
				out += "1";
				textField.setText(out);
			}
		});
		btnOne.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnOne.setBounds(10, 191, 55, 40);
		frame.getContentPane().add(btnOne);

		btnTwo = new JButton("2");
		btnTwo.setForeground(Color.BLACK);
		btnTwo.setBackground(Color.WHITE);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "2";
				out += "2";
				textField.setText(out);
			}
		});
		btnTwo.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnTwo.setBounds(68, 191, 55, 40);
		frame.getContentPane().add(btnTwo);

		btnThree = new JButton("3");
		btnThree.setForeground(Color.BLACK);
		btnThree.setBackground(Color.WHITE);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "3";
				out += "3";
				textField.setText(out);
			}
		});
		btnThree.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnThree.setBounds(126, 191, 55, 40);
		frame.getContentPane().add(btnThree);

		btnZero = new JButton("0");
		btnZero.setForeground(Color.BLACK);
		btnZero.setBackground(Color.WHITE);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in += "0";
				out += "0";
				textField.setText(out);
			}
		});
		btnZero.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnZero.setBounds(10, 231, 55, 40);
		frame.getContentPane().add(btnZero);

		btnPoint = new JButton(".");
		btnPoint.setForeground(Color.BLACK);
		btnPoint.setBackground(new Color(204, 204, 255));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] num = in.split(" ");
				String ult_num = num[num.length - 1];
				if (!ult_num.contains(".")) {
					in += ".";
					out += ".";
				}
				textField.setText(out);
			}
		});
		btnPoint.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnPoint.setBounds(68, 231, 55, 40);
		frame.getContentPane().add(btnPoint);

		btnDelete = new JButton("<-");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBackground(new Color(204, 204, 255));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!(out.startsWith("esPrimo") || out.startsWith("fact"))) {
						if (out.endsWith(" ")) {
							out = out.substring(0, out.length() - 3);
							in = in.substring(0, in.length() - 3);
						}

						else {
							out = out.substring(0, out.length() - 1);
							in = in.substring(0, in.length() - 1);
						}
					}
				} catch (StringIndexOutOfBoundsException sio) {
					out = "No hay valores para borrar, pulse C";
				}
				textField.setText(out);
			}
		});
		btnDelete.setFont(new Font("Leelawadee", Font.BOLD, 12));
		btnDelete.setBounds(10, 71, 55, 40);
		frame.getContentPane().add(btnDelete);

		btnClear = new JButton("C");
		btnClear.setForeground(Color.BLACK);
		btnClear.setBackground(new Color(204, 204, 255));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in = "";
				out = "";
				textField.setText(out);
			}
		});
		btnClear.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnClear.setBounds(68, 71, 55, 40);
		frame.getContentPane().add(btnClear);

		btnAdd = new JButton("+");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBackground(new Color(204, 204, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compruebaDobleOperacion(in, btnAdd.getText());
				textField.setText(out);
			}
		});
		btnAdd.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnAdd.setBounds(184, 71, 55, 40);
		frame.getContentPane().add(btnAdd);

		btnSubtract = new JButton("-");
		btnSubtract.setForeground(Color.BLACK);
		btnSubtract.setBackground(new Color(204, 204, 255));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compruebaDobleOperacion(in, btnSubtract.getText());
				textField.setText(out);
			}
		});
		btnSubtract.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnSubtract.setBounds(184, 111, 55, 40);
		frame.getContentPane().add(btnSubtract);

		btnMult = new JButton("*");
		btnMult.setForeground(Color.BLACK);
		btnMult.setBackground(new Color(204, 204, 255));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compruebaDobleOperacion(in, btnMult.getText());
				textField.setText(out);
			}
		});
		btnMult.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnMult.setBounds(184, 151, 55, 40);
		frame.getContentPane().add(btnMult);

		btnDiv = new JButton("/");
		btnDiv.setForeground(Color.BLACK);
		btnDiv.setBackground(new Color(204, 204, 255));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compruebaDobleOperacion(in, btnDiv.getText());
				textField.setText(out);
			}
		});
		btnDiv.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnDiv.setBounds(184, 191, 55, 40);
		frame.getContentPane().add(btnDiv);

		btnEqual = new JButton("=");
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setBackground(new Color(204, 204, 255));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procesarOperaciones(in);
				textField.setText(out);
			}
		});
		btnEqual.setFont(new Font("Leelawadee", Font.BOLD, 12));
		btnEqual.setBounds(10, 275, 229, 40);
		frame.getContentPane().add(btnEqual);

		btnPrimo = new JButton("primo");
		btnPrimo.setForeground(Color.BLACK);
		btnPrimo.setBackground(new Color(204, 204, 255));
		btnPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Boolean primo;
					procesarOperaciones(in);
					if (in.startsWith(" - ")) {
						String in_neg = in.substring(3, in.length());
						Integer n = tranformaStringInt(in_neg);
						primo = calc.esPrimo(-n);
					} else {
						Integer n = tranformaStringInt(in);
						primo = calc.esPrimo(n);
					}

					out = "esPrimo(" + in + ") = " + primo.toString();

				} catch (NoSuchElementException noe) {
					out = "Debe añadir el numero primero";
				} catch (IllegalArgumentException ia) {
					out = "No se puede operar con un numero tan grande";
				}
				textField.setText(out);
			}
		});
		btnPrimo.setFont(new Font("Leelawadee", Font.BOLD, 7));
		btnPrimo.setBounds(126, 231, 55, 40);
		frame.getContentPane().add(btnPrimo);

		btnFact = new JButton("fact");
		btnFact.setForeground(Color.BLACK);
		btnFact.setBackground(new Color(204, 204, 255));
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					procesarOperaciones(in);
					Integer n = tranformaStringInt(in);
					out = "factorial(" + in + ") = ";
					n = calc.fact(n);
					in = n.toString();
					out += in;

				} catch (NumberFormatException ex) {
					out = "No se puede calcular el factorial de negativos";
				} catch (NoSuchElementException noe) {
					out = "Debe añadir el numero primero";
				} catch (IllegalArgumentException ia) {
					out = "No se puede calcular el factorial de un numero mayor a 14 ni negativo";
				}
				textField.setText(out);
			}
		});
		btnFact.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnFact.setBounds(184, 231, 55, 40);
		frame.getContentPane().add(btnFact);

	}

	private void procesarOperaciones(String intro) {
		try {
			Double result, n2;
			String operacion, signo;
			Scanner sc = new Scanner(intro);
			sc.useDelimiter(sc.delimiter());
			String n = sc.next();
			if (n.equals("+") || n.equals("-")) {
				signo = n;
				n = signo + sc.next();
			}
			result = Double.parseDouble(n);
			while (sc.hasNext()) {
				operacion = sc.next();
				n = sc.next();
				if ((n.equals("+") || n.equals("-"))) {
					signo = n;
					n = signo + sc.next();
				}

				n2 = Double.parseDouble(n);
				if (operacion.equals("+"))
					result = calc.suma(result, n2);
				else if (operacion.equals("-"))
					result = calc.resta(result, n2);
				else if (operacion.equals("/")) {
					try {
						result = calc.divide(result, n2);
					} catch (ArithmeticException ae) {
						out = "No se puede dividir entre 0";
						break;
					}
				} else if (operacion.equals("*"))
					result = calc.mult(result, n2);
				out = result.toString();
				in = result.toString();
			}
			sc.close();
		} catch (ArithmeticException ae) {
			out = "No se puede operar con numeros tan grandes";
		} catch (NumberFormatException ne) {
			out = "Syntax error in " + in.toString() + ": reescriba correctamente";
		}
	}

	private void compruebaDobleOperacion(String intro, String text) {
		text = " " + text + " ";
		if (intro.endsWith(text)) {
			String num = intro.substring(0, in.length() - 2);
			out = intro + num;
			in = intro + num;
		} else {
			in += text;
			out += text;
		}
	}

	private Integer tranformaStringInt(String intro) {
		Double d = Double.parseDouble(intro);
		Integer n = d.intValue();
		in = n.toString();
		return n;
	}
}
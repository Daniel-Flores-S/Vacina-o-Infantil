package view;

import model.User;
import model.Vaccines;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Vacinar extends JDialog {
	private static final long serialVersionUID = 1L;
	private DefaultTableModel modelo;
	private DefaultListModel list = new DefaultListModel<Vaccines>();
	private JList searchList = new JList();
	private ArrayList<User> dados;
	ArrayList<String> vaci = new ArrayList<>();
	private JTextField userTextField;
	private JTable table;
	private JLabel nameTX;
	private int aux01 = 0;
	private int aux02 = -1;
	private int aux03 = -1;


	public ArrayList<User> getDados() {
		return dados;
	}

	public void setDados(ArrayList<User> dados) {
		this.dados = dados;
	}


	/**
	 * @wbp.parser.constructor
	 */
	public Vacinar(java.awt.Frame parent, boolean modal,ArrayList<User> dados) {
		super(parent, modal);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		initComponents();
		setDados(dados);
	}

	public Vacinar(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public void listPessoas() {
		list.removeAllElements();
		for (int i = 0; i < dados.size(); i++) {
			if (dados.get(i).getName().toLowerCase().indexOf(userTextField.getText()) != -1) {
				list.addElement(dados.get(i).getName());
				aux01++;
			}
		}
		if (aux01 >= 1) {
			searchList.setVisible(true);
		}
		else {
			searchList.setVisible(false);
		}
	}

	public void initComponents() {
		setSize(new Dimension(900, 662));
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 884, 66);
		panel.setBackground(Color.BLUE);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Vacina\u00E7\u00E3o");
		lblNewLabel.setBounds(353, 5, 178, 43);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 64, 864, 99);
		getContentPane().add(panel_1);

		JLabel labelPs = new JLabel("Pesquisar Crian\u00E7a: ");
		labelPs.setBounds(0, 15, 124, 25);
		labelPs.setFont(new Font("Tahoma", Font.BOLD, 13));

		userTextField = new JTextField();
		userTextField.setBounds(128, 11, 726, 29);
		userTextField.setColumns(10);
		userTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				listPessoas();
			}
		});

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(128, 46, 726, 62);
		searchList.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				for (int i = 0; i < dados.size(); i++) {
					if (dados.get(i).getName().equalsIgnoreCase(String.valueOf(searchList.getSelectedValue()))) {
						aux02 = i;
						aux03 = i;
					}
				}
				if (aux02 != -1) {
					nameTX.setText(dados.get(aux02).getName());
					searchList.setVisible(false);
				}
			}
		});

		searchList.setBackground(Color.LIGHT_GRAY);
		searchList.setBounds(0, 0, 716, 51);
		layeredPane.add(searchList);
		searchList.setVisible(false);
		searchList.setModel(list);
		panel_1.setLayout(null);
		panel_1.add(labelPs);
		panel_1.add(layeredPane);
		panel_1.add(userTextField);

		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 173, 46, 23);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblNewLabel_1);

		nameTX = new JLabel("");
		nameTX.setBounds(66, 174, 297, 22);
		nameTX.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(nameTX);
		modelo =new DefaultTableModel(
				new Object[][] {{"Idade", "BCG", "Hepatite B", "Penta/DTP", "VIP/VOP", "Meningoc?cica"},
						{"Ao Nascer", "", "", "", "", ""},
						{"2 Meses", "", "", "", "", ""},
						{"3 Meses", "", "", "", "", ""},
						{"4 Meses", "", "", "", "", ""},
						{"5 Meses", "", "", "", "", ""},
						{"6 Meses", "", "", "", "", ""},
						{"12 Meses", "", "", "", "", ""},

				},
				new String[] {
						"Idade", "BCG", "Hepatite B", "Penta/DTP", "VIP/VOP", "Meningoc\u00F3cica"
				}
		){
			boolean[] columnEditables = new boolean[] {
					false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		table = new JTable();
		table.setBounds(10, 198, 864, 378);
		table.setRowMargin(10);
		table.setRowHeight(47);
		table.setIntercellSpacing(new Dimension(6, 8));
		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setModel(modelo);
		getContentPane().add(table);

		JButton salvarBT = new JButton("Salvar");
		salvarBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					salvarDD();

			}
		});
		salvarBT.setBackground(SystemColor.textHighlight);
		salvarBT.setForeground(Color.WHITE);
		salvarBT.setFont(new Font("Tahoma", Font.BOLD, 17));
		salvarBT.setBounds(460, 580, 414, 32);
		getContentPane().add(salvarBT);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("fgfdgfdgfd");
			}
		});
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancelar.setBackground(SystemColor.textHighlight);
		btnCancelar.setBounds(10, 580, 414, 32);
		getContentPane().add(btnCancelar);
	}

	private void salvarDD() {
        if (aux03 >= 0) {
			for (int i = 0; i < 7; i++) {
				for (int l = 0; l < 6; l++) {
					dados.get(aux03).getVac()[i][l] = String.valueOf(modelo.getValueAt(i, l));
				}
			}
			int l = JOptionPane.showConfirmDialog(null, "Voltar a tela inicial", "Alerta",JOptionPane.YES_NO_OPTION);
			switch (l){
				case 0:
					setVisible(false);
			}

		}
	}
}



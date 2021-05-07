package view;

import model.User;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Main {
    private JFrame frame;
    private JTextField search;
    private JButton menuInit;
    private JTextField textField_1;
    private JTextField name;
    private JTextField textField_3;
    private JTextField status;
    private JTable tbLeft = new JTable();

    private ArrayList<User> dados= new ArrayList<User>();



    /**
     * Launch the application.
     */


    public ArrayList<User> getDados() {
        return dados;
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
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
    public Main() {
        initialize();

    }
    private void initialize() {
        frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("Nome");
                modelo.addColumn("CPF");
                if (dados.isEmpty()) {
                    modelo.addRow(new String[]{
                            "Sem informações", "Sem informações"
                    });
                }
                else {
                    for (int i = 0; i < dados.size(); i++)  {
                        modelo.addRow(new String[]{
                                dados.get(i).getName(), dados.get(i).getCpf()
                        });
                    }
                }
                tbLeft.setModel(modelo);
            }
        });

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Meu Computador\\Pictures\\vacina (1).png"));
        frame.setExtendedState(6);
        frame.setSize(950,620);
        frame.setLocationRelativeTo(null);		frame.getContentPane().setBackground(new Color(153, 153, 153));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setBackground(new Color(0, 0, 255));
        JPanel panel_1 = new JPanel();



        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Meu Computador\\Pictures\\foto (1).jpg"));

        JPanel panel_2 = new JPanel();
        panel_2.setForeground(Color.BLACK);
        panel_2.setBackground(Color.DARK_GRAY);

        JButton btnNewButton_5 = new JButton("Nome:");
        btnNewButton_5.setFocusable(false);
        btnNewButton_5.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton_5.setForeground(Color.BLACK);

        JButton btnNewButton_6 = new JButton("Idade");
        btnNewButton_6.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton_6.setForeground(Color.BLACK);

        name = new JTextField();
        name.setEditable(false);
        name.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setColumns(10);

        JButton btnNewButton_6_1 = new JButton("Status");
        btnNewButton_6_1.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_6_1.setForeground(Color.BLACK);
        btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));

        status = new JTextField();
        status.setEditable(false);
        status.setColumns(10);

        JButton btnNewButton = new JButton("Limpar");

        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                                                                .addContainerGap())
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(btnNewButton_2)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                                .addGap(3)
                                                                                .addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(btnNewButton_6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                                .addComponent(name, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                                                                .addComponent(btnNewButton)
                                                                                .addGap(21))
                                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18)
                                                                                .addComponent(btnNewButton_6_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18)
                                                                                .addComponent(status, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(240, Short.MAX_VALUE))))))
                                        .addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                        .addComponent(btnNewButton_5)
                                                                        .addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnNewButton))
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                        .addComponent(btnNewButton_6)
                                                                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnNewButton_6_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(status, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.GRAY);

        JCheckBox chckbxNewCheckBox = new JCheckBox("1\u00B0 Dose");
        chckbxNewCheckBox.setFocusTraversalKeysEnabled(false);
        chckbxNewCheckBox.setFocusPainted(false);

        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("2\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("1\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("2\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("1\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_5 = new JCheckBox("1\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_6 = new JCheckBox("1\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_7 = new JCheckBox("2\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8 = new JCheckBox("3\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9 = new JCheckBox("4\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_10 = new JCheckBox("6\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Refor\u00E7o");

        JCheckBox chckbxNewCheckBox_8_1 = new JCheckBox("3\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_1 = new JCheckBox("4\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_2 = new JCheckBox("5\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_2 = new JCheckBox("Refor\u00E7o");

        JCheckBox chckbxNewCheckBox_8_3 = new JCheckBox("3\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_3 = new JCheckBox("4\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_4 = new JCheckBox("5\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_4 = new JCheckBox("6\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_5 = new JCheckBox("2\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_5 = new JCheckBox("3\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_6 = new JCheckBox("2\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_6 = new JCheckBox("3\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_7 = new JCheckBox("4\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_7 = new JCheckBox("5\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_8 = new JCheckBox("Refor\u00E7o");

        JCheckBox chckbxNewCheckBox_9_8 = new JCheckBox("6\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_7_1 = new JCheckBox("5\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_8_1 = new JCheckBox("6\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_8_1 = new JCheckBox("Refor\u00E7o");

        JCheckBox chckbxNewCheckBox_9_7_2 = new JCheckBox("5\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_9_8_2 = new JCheckBox("6\u00B0 Dose");

        JCheckBox chckbxNewCheckBox_8_8_2 = new JCheckBox("Refor\u00E7o");

        JCheckBox chckbxNewCheckBox_9_6_1 = new JCheckBox("4\u00B0 Dose");

        JLabel lblNewLabel_2 = new JLabel("2 Meses");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_1 = new JLabel("2 Meses");
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_2 = new JLabel("2 Meses");
        lblNewLabel_2_2.setForeground(Color.WHITE);
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_3 = new JLabel("2 Meses");
        lblNewLabel_2_3.setForeground(Color.WHITE);
        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_4 = new JLabel("2 Meses");
        lblNewLabel_2_4.setForeground(Color.WHITE);
        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_5 = new JLabel("2 Meses");
        lblNewLabel_2_5.setForeground(Color.WHITE);
        lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_1 = new JLabel("Ao Nascer");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));

        JButton btnNewButton_6_1_1 = new JButton("Mapa de vacina\u00E7\u00E3o");
        btnNewButton_6_1_1.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_6_1_1.setForeground(Color.BLACK);
        btnNewButton_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));

        JButton btnAtualizar = new JButton("Atualizar vacinas");
        btnAtualizar.setFont(new Font("Clarendon BT", Font.BOLD, 20));
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(
                gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addComponent(btnNewButton_6_1_1, GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                        .addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                        .addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(btnAtualizar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                                        .addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                                        .addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                                        .addComponent(lblNewLabel_2_3, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                                        .addComponent(lblNewLabel_2_4, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                                        .addComponent(lblNewLabel_2_5, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                                                .addGap(16))
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addComponent(lblNewLabel_1)
                                                                .addPreferredGap(ComponentPlacement.RELATED)))
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                                .addGap(18)
                                                                .addComponent(chckbxNewCheckBox_2, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                                .addGap(18)
                                                                .addComponent(chckbxNewCheckBox_3, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(chckbxNewCheckBox_8, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_9, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                                                .addGap(18)
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(chckbxNewCheckBox_8_1, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_9_1, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(chckbxNewCheckBox_10, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_11, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                                                .addGap(18)
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(chckbxNewCheckBox_9_2, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_9_4, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addComponent(chckbxNewCheckBox_8_2, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                                .addGap(18)
                                                                .addComponent(chckbxNewCheckBox_8_4, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                                                .addGap(29)
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(chckbxNewCheckBox_4, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_7, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_3, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_3, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_7, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_8, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_8, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                                .addGap(32)
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(chckbxNewCheckBox_5, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_5, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_5, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_7_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_8_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_8_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_7, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                                .addGap(29)
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(chckbxNewCheckBox_9_6_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_7_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_8_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_8_2, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_9_6, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_6, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
                                .addGap(41))
        );
        gl_panel_2.setVerticalGroup(
                gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addComponent(btnNewButton_6_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_2)
                                                        .addComponent(chckbxNewCheckBox_5)
                                                        .addComponent(chckbxNewCheckBox_4)
                                                        .addComponent(chckbxNewCheckBox_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblNewLabel_1))
                                                .addGap(18)
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                        .addComponent(chckbxNewCheckBox_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblNewLabel_2))
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                                .addGap(18)
                                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                                        .addComponent(chckbxNewCheckBox_9_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(chckbxNewCheckBox_9_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGap(41))
                                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                                .addGap(59)
                                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                                        .addComponent(chckbxNewCheckBox_9)
                                                                                        .addComponent(chckbxNewCheckBox_9_1)
                                                                                        .addComponent(chckbxNewCheckBox_9_3)
                                                                                        .addComponent(chckbxNewCheckBox_8_7)
                                                                                        .addComponent(chckbxNewCheckBox_9_6_1)
                                                                                        .addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(11))
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                        .addComponent(chckbxNewCheckBox_8_5)
                                                                        .addComponent(chckbxNewCheckBox_8_6))
                                                                .addGap(93)))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                        .addComponent(chckbxNewCheckBox_8_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_8_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(chckbxNewCheckBox_9_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(15)
                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                                        .addComponent(chckbxNewCheckBox_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(chckbxNewCheckBox_9_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(chckbxNewCheckBox_9_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18)
                                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                                        .addComponent(chckbxNewCheckBox_11)
                                                                                        .addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                                .addGap(3)
                                                                                .addComponent(chckbxNewCheckBox_9_8_1)
                                                                                .addGap(15)
                                                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                                                        .addComponent(chckbxNewCheckBox_9_2)
                                                                                        .addComponent(chckbxNewCheckBox_8_8)
                                                                                        .addComponent(chckbxNewCheckBox_8_8_1)))))
                                                        .addComponent(chckbxNewCheckBox_9_7_1)
                                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                                .addComponent(chckbxNewCheckBox_9_7_2)
                                                                .addGap(15)
                                                                .addComponent(chckbxNewCheckBox_9_8_2)
                                                                .addGap(18)
                                                                .addComponent(chckbxNewCheckBox_8_8_2)))
                                                .addPreferredGap(ComponentPlacement.UNRELATED))
                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                .addGap(86)
                                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(chckbxNewCheckBox_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(chckbxNewCheckBox_8_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                                .addGap(157)))
                                .addGap(45)
                                .addComponent(btnAtualizar, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(58))
        );

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        new JTextField();

        JButton btnNewButton_3 = new JButton("Idade");
        btnNewButton_3.setForeground(Color.BLACK);

        JButton btnNewButton_4_1 = new JButton("BCG");
        btnNewButton_4_1.setForeground(Color.BLACK);

        JButton btnNewButton_4 = new JButton("Hepatite B");
        btnNewButton_4.setForeground(Color.BLACK);
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        JButton btnNewButton_4_2 = new JButton("Penta/DTP");
        btnNewButton_4_2.setForeground(Color.BLACK);

        JButton btnNewButton_4_3 = new JButton("VIP/VOP");
        btnNewButton_4_3.setForeground(Color.BLACK);

        JButton btnNewButton_4_3_1 = new JButton("Meningoc\u00F3cica");
        btnNewButton_4_3_1.setForeground(Color.BLACK);
        GroupLayout gl_panel_3 = new GroupLayout(panel_3);
        gl_panel_3.setHorizontalGroup(
                gl_panel_3.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_3.createSequentialGroup()
                                .addGap(2)
                                .addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_4_1, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(btnNewButton_4_2, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_4_3, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_4_3_1, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );
        gl_panel_3.setVerticalGroup(
                gl_panel_3.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_3.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnNewButton_4_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNewButton_4_3_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNewButton_4_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNewButton_4_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5))
        );
        panel_3.setLayout(gl_panel_3);
        panel_2.setLayout(gl_panel_2);

        menuInit = new JButton("In\u00EDcio");
        menuInit.setMnemonic(KeyEvent.VK_1);
        menuInit.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        menuInit.setBackground(new Color(0, 0, 255));
        menuInit.setForeground(new Color(255, 255, 255));
        menuInit.setBorder(null);
        menuInit.setFont(new Font("Clarendon BT", Font.PLAIN, 20));
        menuInit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        JButton updateBT = new JButton("Atualizar");
        updateBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Update update = new Update();
                update.setVisible(true);
            }
        });
        updateBT.setBorder(null);
        updateBT.setBackground(new Color(0, 0, 255));
        updateBT.setForeground(new Color(255, 255, 255));
        updateBT.setFont(new Font("Clarendon BT", Font.PLAIN, 20));

        JButton registerBT = new JButton("Cadastrar");
        registerBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Register register = new Register(dados);
                register.setVisible(true);
            }
        });
        registerBT.setForeground(new Color(255, 255, 255));
        registerBT.setBackground(new Color(0, 0, 255));
        registerBT.setBorder(null);
        registerBT.setFont(new Font("Clarendon BT", Font.PLAIN, 20));

        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Meu Computador\\Pictures\\icon.jpg"));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(menuInit, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(registerBT, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(updateBT, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                                .addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(menuInit, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addComponent(registerBT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateBT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24))
                        .addGroup(gl_panel.createSequentialGroup()
                                .addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel.setLayout(gl_panel);

        search = new JTextField();
        search.setToolTipText("Digite o CPF do usu\u00E1rio");
        search.setHorizontalAlignment(SwingConstants.LEFT);
        search.setColumns(10);

        JButton okBT = new JButton("OK");
        okBT.setFont(new Font("Tahoma", Font.BOLD, 11));
        okBT.setForeground(Color.BLACK);
        okBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        //tbLeft.setModel(org());


        tbLeft.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tbLeft.setBorder(null);
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(search, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addGap(10)
                                .addComponent(okBT, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addGap(5))
                        .addComponent(tbLeft, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addGap(5)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addComponent(okBT)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(1)
                                                .addComponent(search, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(tbLeft, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        frame.getContentPane().setLayout(groupLayout);
    }
}

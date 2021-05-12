package view;

import model.User;
import model.Vaccines;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.table.DefaultTableModel;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Main {
   Vaccines vac01 = new Vaccines(true, true, false, true, true);
   Vaccines vac02 = new Vaccines(true, true, true, true, true);
   Vaccines vac03 = new Vaccines(true, true, true, true, false);
   Vaccines vac04 = new Vaccines(true, true, true, true, true);
   Vaccines vac05 = new Vaccines(true, true, true, true, true);
   Vaccines vac06 = new Vaccines(true, false, true, true, true);
   Vaccines vac07 = new Vaccines(true, false, true, true, true);

    ArrayList<Vaccines> vacc = new ArrayList<>();

    User user = new User("Saulo Silva","076.652.668-45",2020,"Rua L", "Para", "City",vacc);
    private JTable vacinas;
    private JTable tbDados;
    private JTextField textField_1;
    private JFrame frame;
    private JTextField search;
    private JButton menuInit;
    private JTextField nameLB;
    private JTextField idadeLB;
    private JTextField cpfLB;
    private ArrayList<User> dados;
    private Register register;
    private Update update;

    public ArrayList<User> getDados() {
        return dados;
    }

    private void menuItemRegister(java.awt.event.ActionEvent evt) {
        if (register == null) {
            register = new Register(this.frame, true, dados);
        }
        register.setLocationRelativeTo(this.frame);
        register.setVisible(true);
    }

    private void menuItemUpdate(java.awt.event.ActionEvent evt) {
        if (!dados.isEmpty()) {
            if (update == null) {
                update = new Update(this.frame, true, dados);
            }
            update.setLocationRelativeTo(this.frame);
            update.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this.frame, "Dados ainda não cadastrados!", "Atualizar Dados",
                    JOptionPane.WARNING_MESSAGE);
        }

    }



    private void initialize() {
        frame = new JFrame();
        dados= new ArrayList<>();
        tbDados = new JTable();
        dados.add(user);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                DefaultTableModel modelo01 = new DefaultTableModel();

                modelo01.addColumn("ID");
                modelo01.addColumn("NOME");
                modelo01.addColumn("CPF");

                if (dados.isEmpty()) {
                    modelo01.addRow(new String[]{"ID", "NOME","CPF"});
                }
                else {
                    for (int i = 0; i < dados.size(); i++)  {
                        modelo01.addRow(new Object[]{
                                i,dados.get(i).getName(), dados.get(i).getCpf()
                        });
                    }
                }

                tbDados.setModel(modelo01);
                tbDados.getColumnModel().getColumn(0).setPreferredWidth(10);
            }
        });

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Meu Computador\\Pictures\\vacina (1).png"));
        // frame.setExtendedState(6);
        frame.setSize(950,620);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(153, 153, 153));
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

        nameLB = new JTextField();
        nameLB.setEditable(false);
        nameLB.setColumns(10);

        idadeLB = new JTextField();
        idadeLB.setEditable(false);
        idadeLB.setColumns(10);

        JButton lbl = new JButton("Cpf");
        lbl.setMargin(new Insets(0, 0, 0, 0));
        lbl.setForeground(Color.BLACK);
        lbl.setFont(new Font("Tahoma", Font.BOLD, 11));

        cpfLB = new JTextField();
        cpfLB.setEditable(false);
        cpfLB.setColumns(10);

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
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                                .addComponent(idadeLB, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18)
                                                                                .addComponent(lbl, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18)
                                                                                .addComponent(cpfLB))
                                                                        .addComponent(nameLB, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                                                .addComponent(btnNewButton)
                                                                .addGap(21))))
                                        .addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)))
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
                                                                        .addComponent(nameLB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnNewButton))
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                        .addComponent(btnNewButton_6)
                                                                        .addComponent(idadeLB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cpfLB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.GRAY);

        JButton btnNewButton_6_1_1 = new JButton("Mapa de vacina\u00E7\u00E3o");
        btnNewButton_6_1_1.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_6_1_1.setForeground(Color.BLACK);
        btnNewButton_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));

        vacinas = new JTable();
        vacinas.setRowMargin(10);
        vacinas.setRowHeight(60);

        vacinas.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(
                gl_panel_2.createParallelGroup(Alignment.TRAILING)
                        .addComponent(btnNewButton_6_1_1, GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                        .addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addGap(22)
                                .addComponent(vacinas, GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_2.setVerticalGroup(
                gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addComponent(btnNewButton_6_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(vacinas, GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)
                                .addContainerGap())
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
                menuItemUpdate(e);
            }
        });
        updateBT.setBorder(null);
        updateBT.setBackground(new Color(0, 0, 255));
        updateBT.setForeground(new Color(255, 255, 255));
        updateBT.setFont(new Font("Clarendon BT", Font.PLAIN, 20));

        JButton registerBT = new JButton("Cadastrar");
        registerBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuItemRegister(e);
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

        tbDados.setRowHeight(20);
        tbDados.setFont(new Font("Tahoma", Font.PLAIN, 13));

        tbDados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = (int) tbDados.getValueAt(tbDados.getSelectedRow(), 0);
                nameLB.setText(dados.get(i).getName());
                idadeLB.setText(String.valueOf(dados.get(i).getYearOfBirth()));
                cpfLB.setText(dados.get(i).getCpf());

                DefaultTableModel modelo02 = new DefaultTableModel();
                modelo02.addColumn("BCG");
                modelo02.addColumn("Hepatite B");
                modelo02.addColumn("Penta/DTP");
                modelo02.addColumn("VIP/VOP");
                modelo02.addColumn("Meningocócica");


                for (int x = 0; x < dados.get(i).getVac().size(); x++)  {
                    modelo02.addRow(new Object[]{
                            dados.get(i).getVac().get(x).isBCG(),
                            dados.get(i).getVac().get(x).isHepatiteB(),
                            dados.get(i).getVac().get(x).isPentaDTP(),
                            dados.get(i).getVac().get(x).isVIPVOP(),
                            dados.get(i).getVac().get(x).isMeningococica()


                    });
                }

                vacinas.setModel(modelo02);
            }
        });


        tbDados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tbDados.setBorder(null);

        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(search, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addGap(10)
                                .addComponent(okBT, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addGap(5))
                        .addComponent(tbDados, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
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
                                .addComponent(tbDados, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        frame.getContentPane().setLayout(groupLayout);
    }

    /**-----------------------------------------------------------------------------------------------------------------------------------**/
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

    public Main() {
        initialize();
        vacc.add(vac01);
        vacc.add(vac02);
        vacc.add(vac03);
        vacc.add(vac04);
        vacc.add(vac05);
        vacc.add(vac06);
        vacc.add(vac07);
    }

}
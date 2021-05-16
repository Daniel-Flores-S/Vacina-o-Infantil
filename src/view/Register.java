package view;

import model.User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Register extends JDialog {
    private final JPanel contentPanel = new JPanel();
    private ArrayList<User> dados;
    private JTextField nameTX;
    private JTextField addressTX;
    private JTextField stateTX;
    private JTextField birthTX;
    private JTextField cpfTX;
    private JTextField cityTX;

    public ArrayList<User> getDados() {
        return dados;
    }

    public void setDados(ArrayList<User> dados) {
        this.dados = dados;
    }

    /**
     * @wbp.parser.constructor
     */
    public Register(java.awt.Frame parent, boolean modal,ArrayList<User> dados) {
        super(parent, modal);
        initComponents();
        setDados(dados);
    }
    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    public boolean validateData() {
        if (nameTX.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo nome esta vazio");
            return false;
        }
        if (cpfTX.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo nascimento esta vazio");
            return false;
        }
        if (birthTX.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo cpf esta vazio");
            return false;
        }
        if (addressTX.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo endereço esta vazio");
            return false;
        }
        if (stateTX.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo esta esta vazio");
            return false;
        }
        if (cityTX.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo cidade esta vazio");
            return false;
        }
        return true;
    }

    private void initComponents() {
        setSize(new Dimension(980, 635));
        setModal(true);
        setLocationRelativeTo(this);
        /*addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
            }
        });*/

        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        {
            JPanel panel = new JPanel();
            panel.setBounds(0, 10, 964, 65);
            panel.setBackground(Color.BLUE);
            contentPanel.add(panel);
            panel.setLayout(null);
            JLabel registerLB = new JLabel("Cadastrar");
            registerLB.setBounds(417, 11, 171, 43);
            registerLB.setForeground(Color.WHITE);
            registerLB.setFont(new Font("Tahoma", Font.PLAIN, 35));
            panel.add(registerLB);
        }

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 88, 938, 508);
        contentPanel.add(panel_1);
        panel_1.setLayout(null);

        nameTX = new JTextField();
        nameTX.setColumns(10);
        nameTX.setBounds(10, 39, 918, 32);
        panel_1.add(nameTX);

        addressTX = new JTextField();
        addressTX.setColumns(10);
        addressTX.setBounds(10, 173, 918, 34);
        panel_1.add(addressTX);

        JLabel nameLB = new JLabel("Nome");
        nameLB.setFont(new Font("Tahoma", Font.BOLD, 14));
        nameLB.setAlignmentX(1.0f);
        nameLB.setBounds(10, 11, 142, 17);
        panel_1.add(nameLB);

        JLabel addressLB = new JLabel("Endere\u00E7o");
        addressLB.setFont(new Font("Tahoma", Font.BOLD, 14));
        addressLB.setBounds(10, 150, 101, 17);
        panel_1.add(addressLB);

        JLabel stateLB = new JLabel("Estado");
        stateLB.setFont(new Font("Tahoma", Font.BOLD, 14));
        stateLB.setBounds(10, 218, 92, 17);
        panel_1.add(stateLB);

        stateTX = new JTextField();
        stateTX.setColumns(10);
        stateTX.setBounds(10, 246, 129, 33);
        panel_1.add(stateTX);

        JLabel nascLB = new JLabel("Ano de Nasc");
        nascLB.setFont(new Font("Tahoma", Font.BOLD, 14));
        nascLB.setBounds(10, 77, 163, 17);
        panel_1.add(nascLB);

        birthTX = new JTextField();
        birthTX.setColumns(10);
        birthTX.setBounds(10, 111, 136, 33);
        panel_1.add(birthTX);

        JLabel cpfLB = new JLabel("Cpf");
        cpfLB.setFont(new Font("Tahoma", Font.BOLD, 14));
        cpfLB.setBounds(183, 77, 58, 17);
        panel_1.add(cpfLB);

        cpfTX = new JTextField();
        cpfTX.setColumns(10);
        cpfTX.setBounds(183, 105, 745, 33);
        panel_1.add(cpfTX);

        cityTX = new JTextField();
        cityTX.setColumns(10);
        cityTX.setBounds(183, 246, 745, 33);
        panel_1.add(cityTX);

        JLabel cityLB = new JLabel("Cidade");
        cityLB.setFont(new Font("Tahoma", Font.BOLD, 14));
        cityLB.setBounds(183, 218, 64, 17);
        panel_1.add(cityLB);

        JButton salvaBT = new JButton("Salvar");
        salvaBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[][] ls = new String[7][6];
                if (validateData() == true){
                    User user = new User(nameTX.getText(), cpfTX.getText(), Integer.valueOf(birthTX.getText()),
                            addressTX.getText(), stateTX.getText(), cityTX.getText(), ls);
                    dados.add(user);
                    form();
                    int l = JOptionPane.showConfirmDialog(null, "Voltar a tela inicial", "Alerta",JOptionPane.YES_NO_OPTION);
                    switch (l){
                        case 0:
                            setVisible(false);
                    }
                }
            }
        });
        salvaBT.setForeground(Color.WHITE);
        salvaBT.setFont(new Font("Tahoma", Font.BOLD, 15));
        salvaBT.setBackground(new Color(30, 144, 255));
        salvaBT.setBounds(10, 329, 918, 49);
        panel_1.add(salvaBT);

        JButton canceBT = new JButton("Cancelar");
        canceBT.setForeground(Color.WHITE);
        canceBT.setFont(new Font("Tahoma", Font.BOLD, 15));
        canceBT.setBackground(new Color(30, 144, 255));
        canceBT.setBounds(10, 396, 918, 49);
        panel_1.add(canceBT);
    }
    private void form() {
        nameTX.setText("");
        birthTX.setText("");
        cpfTX.setText("");
        addressTX.setText("");
        cityTX.setText("");
        stateTX.setText("");
    }
}
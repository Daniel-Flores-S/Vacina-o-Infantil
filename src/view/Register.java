package view;

import model.User;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        {
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLUE);
            contentPanel.add(panel);
            JLabel lblNewLabel_1 = new JLabel("Cadastrar");
            lblNewLabel_1.setForeground(Color.WHITE);
            lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
            GroupLayout gl_panel = new GroupLayout(panel);
            gl_panel.setHorizontalGroup(
                    gl_panel.createParallelGroup(Alignment.TRAILING)
                            .addGap(0, 964, Short.MAX_VALUE)
                            .addGroup(gl_panel.createSequentialGroup()
                                    .addContainerGap(417, Short.MAX_VALUE)
                                    .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                    .addGap(376))
            );
            gl_panel.setVerticalGroup(
                    gl_panel.createParallelGroup(Alignment.LEADING)
                            .addGap(0, 65, Short.MAX_VALUE)
                            .addGroup(gl_panel.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            panel.setLayout(gl_panel);
        }
        {
            JPanel panel_1 = new JPanel();
            contentPanel.add(panel_1);
            nameTX = new JTextField();
            nameTX.setColumns(10);
            addressTX = new JTextField();
            addressTX.setColumns(10);
            JLabel lblNewLabel = new JLabel("Nome");
            lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
            JLabel lblNewLabel_2_2 = new JLabel("Endere\u00E7o");
            lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
            JLabel lblNewLabel_3 = new JLabel("Estado");
            lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
            stateTX = new JTextField();
            stateTX.setColumns(10);
            JLabel lblNewLabel_2_1_1 = new JLabel("Ano de Nasc");
            lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
            birthTX = new JTextField();
            birthTX.setColumns(10);
            JLabel lblNewLabel_2_1 = new JLabel("Cpf");
            lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
            cpfTX = new JTextField();
            cpfTX.setColumns(10);
            cityTX = new JTextField();
            cityTX.setColumns(10);
            JLabel lblNewLabel_4 = new JLabel("Cidade");
            lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
            JButton salvaBT = new JButton("Salvar");

            salvaBT.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (validateData() == true){
                        User user = new User(nameTX.getText(), cpfTX.getText(), Integer.valueOf(birthTX.getText()),
                            addressTX.getText(), stateTX.getText(), cityTX.getText());
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
            JButton canceBT = new JButton("Cancelar");
            canceBT.setForeground(Color.WHITE);
            canceBT.setFont(new Font("Tahoma", Font.BOLD, 15));
            canceBT.setBackground(new Color(30, 144, 255));
            GroupLayout gl_panel_1 = new GroupLayout(panel_1);
            gl_panel_1.setHorizontalGroup(
                    gl_panel_1.createParallelGroup(Alignment.LEADING)
                            .addGap(0, 938, Short.MAX_VALUE)
                            .addGroup(gl_panel_1.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(nameTX, GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                                                    .addContainerGap())
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(addressTX, GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                                                    .addContainerGap())
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                                    .addGap(786))
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                    .addGap(827))
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addGap(836))
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(stateTX, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap(799, Short.MAX_VALUE))
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                            .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(birthTX, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                            .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cpfTX, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
                                                    .addContainerGap())
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addGap(173)
                                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                            .addComponent(cityTX, GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                                                            .addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                                                    .addContainerGap())
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(salvaBT, GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                                                    .addContainerGap())
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addComponent(canceBT, GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                                                    .addContainerGap())))
            );
            gl_panel_1.setVerticalGroup(
                    gl_panel_1.createParallelGroup(Alignment.LEADING)
                            .addGap(0, 508, Short.MAX_VALUE)
                            .addGroup(gl_panel_1.createSequentialGroup()
                                    .addGap(26)
                                    .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                    .addComponent(nameTX, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                            .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                                    .addComponent(cpfTX, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(gl_panel_1.createSequentialGroup()
                                                    .addGap(34)
                                                    .addComponent(birthTX, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addComponent(addressTX, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                            .addComponent(lblNewLabel_3)
                                            .addComponent(lblNewLabel_4))
                                    .addPreferredGap(ComponentPlacement.UNRELATED)
                                    .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                            .addComponent(stateTX, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cityTX, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                    .addGap(50)
                                    .addComponent(salvaBT, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18)
                                    .addComponent(canceBT, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                    .addGap(44))
            );
            panel_1.setLayout(gl_panel_1);
        }
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

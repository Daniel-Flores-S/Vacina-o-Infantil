package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Update extends JDialog {
    private final JPanel contentPanel = new JPanel();
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;

    public Update() {
        setSize(new Dimension(980, 635));
        setModal(true);
        setLocationRelativeTo(this);

        //setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        contentPanel.add(panel);

        JLabel lblNewLabel_5 = new JLabel("Atualizar");
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setFont(new Font("Clarendon BT", Font.PLAIN, 33));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
                                .addGap(374)
                                .addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addGap(398))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6))
        );
        panel.setLayout(gl_panel);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.DARK_GRAY);
        contentPanel.add(panel_1);

        JLabel lblNewLabel_3 = new JLabel("Estado");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1 = new JButton("Salvar");
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_1.setBackground(new Color(30, 144, 255));

        textField = new JTextField();
        textField.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Cidade");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        JLabel lblNewLabel_2_2 = new JLabel("Endere\u00E7o");
        lblNewLabel_2_2.setForeground(Color.WHITE);
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));

        textField_2 = new JTextField();
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        JLabel lblNewLabel_2_1_1 = new JLabel("Ano de Nasc");
        lblNewLabel_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_1 = new JLabel("Cpf");
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        textField_4 = new JTextField();
        textField_4.setColumns(10);

        JLabel lblNewLabel = new JLabel("Nome");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.WHITE);

        textField_5 = new JTextField();
        textField_5.setColumns(10);

        JButton btnNewButton = new JButton("Pesquisar");

        JLabel lblNewLabel_1 = new JLabel("Pesquisar Crian\u00E7a");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(
                gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 895, Short.MAX_VALUE)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel_2.createSequentialGroup()
                                                .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(btnNewButton))
                                        .addComponent(lblNewLabel_1))
                                .addContainerGap(392, Short.MAX_VALUE))
        );
        gl_panel_2.setVerticalGroup(
                gl_panel_2.createParallelGroup(Alignment.TRAILING)
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNewLabel_1)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton))
                                .addGap(26))
        );
        panel_2.setLayout(gl_panel_2);

        textField_6 = new JTextField();
        textField_6.setColumns(10);

        JButton btnNewButton_1_1 = new JButton("Cancelar");
        btnNewButton_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_1_1.setBackground(new Color(30, 144, 255));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 934, Short.MAX_VALUE)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGap(836))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(44)
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))))
                                                .addGap(30))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                                .addGap(827))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(37))
                                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                                .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)))
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))))
                                                .addGap(30))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                .addGap(786))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                                                        .addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                                                        .addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE))
                                                .addGap(29))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 894, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(30, Short.MAX_VALUE))))
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGap(0, 510, Short.MAX_VALUE)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_3)
                                        .addComponent(lblNewLabel_4))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(14))
        );
        panel_1.setLayout(gl_panel_1);
    }




}

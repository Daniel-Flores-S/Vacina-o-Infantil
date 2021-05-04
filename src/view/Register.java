package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Register extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register frame = new Register();
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
    public Register() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 755, 533);
        //setExtendedState(6);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(950,620);

        contentPane = new JPanel();
        contentPane.setBackground(Color.GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);

        JPanel panel_1 = new JPanel();
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(10)
                                .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                                .addGap(10))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                .addGap(0))
        );

        JButton btnNewButton = new JButton("Voltar");
        btnNewButton.setFont(new Font("Clarendon BT", Font.BOLD, 14));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNewButton)
                                .addContainerGap(825, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panel.setLayout(gl_panel);

        textField = new JTextField();
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Nome");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_1 = new JLabel("Nome da M\u00E3e");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Nome do Pai");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));

        textField_2 = new JTextField();
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setColumns(10);

        JLabel lblNewLabel_2_1 = new JLabel("Cpf");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_2 = new JLabel("Endere\u00E7o");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_1_1 = new JLabel("Ano de Nasc");
        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        textField_5 = new JTextField();
        textField_5.setColumns(10);

        textField_6 = new JTextField();
        textField_6.setColumns(10);

        textField_7 = new JTextField();
        textField_7.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Estado");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_4 = new JLabel("Cidade");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton btnNewButton_1 = new JButton("Cancelar");
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBackground(new Color(30, 144, 255));
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));

        JButton btnNewButton_1_1 = new JButton("Salvar");
        btnNewButton_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1.setBackground(new Color(30, 144, 255));
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                .addGap(786))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                                .addGap(789))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                                .addGap(792))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                .addGap(173)
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                                .addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED, 627, Short.MAX_VALUE)))))
                                                .addGap(30))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(textField, GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                                                .addGap(29))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                                .addGap(827))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGap(836))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(765, Short.MAX_VALUE))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                                                .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE))
                                                .addGap(30))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                                .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED, 633, Short.MAX_VALUE))
                                                                        .addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)))
                                                        .addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE))
                                                .addGap(30))))
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(26)
                                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(120)
                                                .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_3)
                                        .addComponent(lblNewLabel_4))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        panel_1.setLayout(gl_panel_1);
        contentPane.setLayout(gl_contentPane);
    }
}

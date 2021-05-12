package view;

import model.User;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Update extends JDialog {
    private final JPanel update = new JPanel();
    private DefaultListModel list = new DefaultListModel<>();
    private JList searchList = new JList();
    private ArrayList<User> dados;
    private JTextField state;
    private JTextField city;
    private JTextField address;
    private JTextField year;
    private JTextField cpf;
    private JTextField userTextField;
    private JTextField name;
    private int aux01 = 0;
    private int aux02 = -1;
    private int aux03 = -1;


    public ArrayList<User> getDados() {
        return dados;
    }

    public Update(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Update(java.awt.Frame parent, boolean modal,ArrayList<User> listaContatos ) {
        super(parent, modal);
        initComponents();
        setListaContatos(listaContatos);
    }


    public void setListaContatos(ArrayList<User> listaContatos) {
        this.dados = listaContatos;
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

    private void initComponents() {
        setSize(new Dimension(980, 635));
        setModal(true);
        setLocationRelativeTo(this);
        /*addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });*/

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
                    name.setText(dados.get(aux02).getName());
                    year.setText(String.valueOf(dados.get(aux02).getYearOfBirth()));
                    cpf.setText(dados.get(aux02).getCpf());
                    address.setText(dados.get(aux02).getAddress());
                    city.setText(dados.get(aux02).getCity());
                    state.setText(dados.get(aux02).getState());
                    searchList.setVisible(false);
                }
            }
        });

        searchList.setVisible(false);
        searchList.setModel(list);

        //setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        update.setLayout(new FlowLayout());
        update.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(update, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        update.add(panel);

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
        update.add(panel_1);

        JLabel lblNewLabel_3 = new JLabel("Estado");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton salvarBT = new JButton("Salvar");

        salvarBT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDados();
                int l = JOptionPane.showConfirmDialog(null, "Voltar a tela inicial", "Alerta",JOptionPane.YES_NO_OPTION);
                switch (l){
                    case 0:
                        setVisible(false);
                        break;

                }

            }
        });
        salvarBT.setForeground(Color.WHITE);
        salvarBT.setFont(new Font("Tahoma", Font.BOLD, 15));
        salvarBT.setBackground(new Color(30, 144, 255));

        state = new JTextField();
        state.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Cidade");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));

        city = new JTextField();
        city.setColumns(10);

        JLabel lblNewLabel_2_2 = new JLabel("Endere\u00E7o");
        lblNewLabel_2_2.setForeground(Color.WHITE);
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));

        address = new JTextField();
        address.setColumns(10);

        year = new JTextField();
        year.setColumns(10);

        JLabel lblNewLabel_2_1_1 = new JLabel("Ano de Nasc");
        lblNewLabel_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel lblNewLabel_2_1 = new JLabel("Cpf");
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));

        cpf = new JTextField();
        cpf.setColumns(10);

        JLabel lblNewLabel = new JLabel("Nome");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.WHITE);

        userTextField = new JTextField();
        userTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                listPessoas();
            }
        });

        userTextField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Pesquisar Crian\u00E7a");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));

        JList list = new JList();


        searchList.setBorder(new LineBorder(Color.BLACK));
        GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        gl_panel_2.setHorizontalGroup(
                gl_panel_2.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel_1)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                        .addComponent(searchList, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(userTextField, GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                                .addGap(95))
        );
        gl_panel_2.setVerticalGroup(
                gl_panel_2.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel_2.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_1)
                                        .addComponent(userTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
                                        .addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchList, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        panel_2.setLayout(gl_panel_2);

        name = new JTextField();
        name.setColumns(10);

        JButton btnNewButton_1_1 = new JButton("Cancelar");
        btnNewButton_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_1_1.setBackground(new Color(30, 144, 255));
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGap(836))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(salvarBT, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                .addComponent(state, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(44)
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(city, GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))))
                                                .addGap(30))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel_2_2, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                                .addGap(827))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(address, GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                                .addComponent(year, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(37))
                                                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                                                .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)))
                                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cpf, GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))))
                                                .addGap(30))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                .addGap(786))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addComponent(name, GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                                                .addGap(29))
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 894, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(30, Short.MAX_VALUE))))
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(name, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(year, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cpf, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(address, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel_3)
                                        .addComponent(lblNewLabel_4))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(state, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(city, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(salvarBT, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(14))
        );
        panel_1.setLayout(gl_panel_1);
    }

    private void updateDados() {
        dados.get(aux03).setName(name.getText());
        dados.get(aux03).setYearOfBirth(Integer.valueOf(year.getText()));
        dados.get(aux03).setCpf(cpf.getText());
        dados.get(aux03).setAddress(address.getText());
        dados.get(aux03).setCity(city.getText());
        dados.get(aux03).setState(state.getText());
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        name.setText("");
        year.setText("");
        cpf.setText("");
        address.setText("");
        city.setText("");
        state.setText("");
    }
}

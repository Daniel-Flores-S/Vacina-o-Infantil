package view;

import model.User;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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

    /**
     * @wbp.parser.constructor
     */
    public Update(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        form();
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

        searchList.setBounds(129, 39, 693, 68);

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
        update.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(update, BorderLayout.CENTER);
        update.setLayout(null);

        JPanel header = new JPanel();
        header.setBounds(5, 10, 954, 57);
        header.setBackground(Color.BLUE);
        update.add(header);
        header.setLayout(null);

        JLabel labelUP = new JLabel("Atualizar");
        labelUP.setBounds(374, 11, 182, 40);

        labelUP.setForeground(Color.WHITE);
        labelUP.setFont(new Font("Clarendon BT", Font.PLAIN, 33));
        header.add(labelUP);

        JPanel body = new JPanel();
        body.setBounds(15, 72, 934, 510);
        body.setBackground(Color.DARK_GRAY);
        update.add(body);

        JLabel labelState = new JLabel("Estado");
        labelState.setBounds(10, 328, 88, 17);
        labelState.setForeground(Color.WHITE);
        labelState.setFont(new Font("Tahoma", Font.BOLD, 14));

        JButton salvarBT = new JButton("Salvar");
        salvarBT.setBounds(10, 395, 894, 45);

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
        state.setBounds(10, 351, 129, 33);
        state.setColumns(10);

        JLabel labelCity = new JLabel("Cidade");
        labelCity.setBounds(183, 328, 64, 17);
        labelCity.setForeground(Color.WHITE);
        labelCity.setFont(new Font("Tahoma", Font.BOLD, 14));

        city = new JTextField();
        city.setBounds(183, 351, 721, 33);
        city.setColumns(10);

        JLabel labelAddress = new JLabel("Endere\u00E7o");
        labelAddress.setBounds(10, 241, 97, 17);
        labelAddress.setForeground(Color.WHITE);
        labelAddress.setFont(new Font("Tahoma", Font.BOLD, 14));

        address = new JTextField();
        address.setBounds(10, 276, 894, 34);
        address.setColumns(10);

        year = new JTextField();
        year.setBounds(10, 197, 136, 33);
        year.setColumns(10);

        JLabel labelYear = new JLabel("Ano de Nasc");
        labelYear.setBounds(14, 162, 163, 17);
        labelYear.setForeground(Color.WHITE);
        labelYear.setFont(new Font("Tahoma", Font.BOLD, 14));

        JLabel labelCpf = new JLabel("Cpf");
        labelCpf.setBounds(183, 162, 58, 17);
        labelCpf.setForeground(Color.WHITE);
        labelCpf.setFont(new Font("Tahoma", Font.BOLD, 14));

        cpf = new JTextField();
        cpf.setBounds(183, 197, 721, 33);
        cpf.setColumns(10);

        JLabel labelName = new JLabel("Nome");
        labelName.setBounds(10, 96, 138, 17);
        labelName.setForeground(Color.WHITE);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 14));

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 11, 924, 79);
        panel_2.setBackground(Color.WHITE);

        userTextField = new JTextField();
        userTextField.setBounds(129, 11, 693, 22);
        userTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                listPessoas();
            }
        });
        userTextField.setColumns(10);

        JLabel labelPs = new JLabel("Pesquisar Crian\u00E7a");
        labelPs.setBounds(10, 13, 115, 16);
        labelPs.setFont(new Font("Tahoma", Font.BOLD, 13));
        searchList.setBorder(new LineBorder(Color.BLACK));

        name = new JTextField();
        name.setBounds(10, 124, 895, 32);
        name.setColumns(10);

        JButton cancelBT = new JButton("Cancelar");
        cancelBT.setBounds(10, 451, 894, 45);
        cancelBT.setForeground(Color.WHITE);
        cancelBT.setFont(new Font("Tahoma", Font.BOLD, 15));
        cancelBT.setBackground(new Color(30, 144, 255));
        body.setLayout(null);
        panel_2.setLayout(null);
        panel_2.add(labelPs);
        panel_2.add(searchList);
        panel_2.add(userTextField);
        body.add(panel_2);
        body.add(labelState);
        body.add(salvarBT);
        body.add(state);
        body.add(labelCity);
        body.add(city);
        body.add(labelAddress);
        body.add(address);
        body.add(year);
        body.add(labelYear);
        body.add(labelCpf);
        body.add(cpf);
        body.add(labelName);
        body.add(name);
        body.add(cancelBT);
    }

    private void updateDados() {
        dados.get(aux03).setName(name.getText());
        dados.get(aux03).setYearOfBirth(Integer.valueOf(year.getText()));
        dados.get(aux03).setCpf(cpf.getText());
        dados.get(aux03).setAddress(address.getText());
        dados.get(aux03).setCity(city.getText());
        dados.get(aux03).setState(state.getText());
    }

    private void form() {
        name.setText("");
        year.setText("");
        cpf.setText("");
        address.setText("");
        city.setText("");
        state.setText("");
    }
}

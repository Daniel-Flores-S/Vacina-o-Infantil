package controller;


import model.User;

import java.util.ArrayList;
import java.util.List;

public class MainController {



    public static List<String> atualizar(){
        List<String> vac = new ArrayList<>();
        vac.add("BCG");
        vac.add("Hepatite B");
        vac.add("Penta/DTP");
        vac.add("VIP/VOP");
        vac.add("Meningocócica");

        return vac;
    }


    private static List<User> dadosList() {
        User user = new User("Daniel", "07658551590",1998, atualizar());
        User user1 = new User("Daniel", "07658551590",1998, atualizar());
        User user2 = new User("Daniel", "07658551590",1998, atualizar());
        User user3 = new User("Daniel", "07658551590",1998, atualizar());
        User user4 = new User("Daniel", "07658551590",1998, atualizar());
        User user5 = new User("Daniel", "07658551590",1998, atualizar());
        User user6 = new User("Daniel", "07658551590",1998, atualizar());

        List<User> listUser = new ArrayList<>();

        listUser.add(user);
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user4);
        listUser.add(user5);
        listUser.add(user6);

        return listUser;
    }

    public static Object[][] colllun() {
        Object[][] dados = new Object[dadosList().size()][3];

        for (int l = 0; l < dadosList().size(); l++)  {

                dados[l][0] = dadosList().get(l).getName();
                dados[l][1] = dadosList().get(l).getCpf();
                dados[l][2] = true;

        }
        
        return dados;
    }

}

/*
        frame = new JFrame();
        frame.setExtendedState(6);
        frame.setSize(950,600);
        frame.setLocationRelativeTo(null);
*/

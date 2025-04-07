package com.declercq.messagie.crud;

import java.util.ArrayList;
import java.util.Objects;

public class UserService {

    private static final ArrayList<User> list = new ArrayList<>();
    private static long idNumber = 1;

//Jeu de donnée si besoin
//    static {
//        list.add(new UserBean(1, "toto", "aaa"));
//        list.add(new UserBean(2, "tata", "bbb"));
//    }

    public static void main(String[] args){
        UserService.save(new User(1L, "Toto", "abcd"));
        System.out.println(UserService.findById(1L));
    }

    //Sauvegarde Create or Update
    public static User save(User user) {
        //On regarde s'il n'est pas déjà en base
        User userRegister = findById(user.getId());
        if (userRegister != null) {
            //on retire celui en base pour remplacer par celui la
            list.remove(userRegister);
        } else {
            //on ajoute un id généré
            user.setId(idNumber++);
        }
        list.add(user);
        return user;
    }

    //Retourne la liste
    public static ArrayList<User> load() {
        return list;
    }

    //Permet de trouver l'utilisateur qui utilise cette session
    public static User findById(Long id) {
        if (id != null) {
            for (User user : list) {
                if (Objects.equals(user.getId(), id)) {
                    return user;
                }
            }
        }
        //Pas d'utilisateur qui a cette session
        return null;
    }

    //Supprime l'élément.Retourne true si la liste a changé
    public static boolean deleteById(Long id) {
        return list.removeIf(user -> Objects.equals(user.getId(), id));
    }
}

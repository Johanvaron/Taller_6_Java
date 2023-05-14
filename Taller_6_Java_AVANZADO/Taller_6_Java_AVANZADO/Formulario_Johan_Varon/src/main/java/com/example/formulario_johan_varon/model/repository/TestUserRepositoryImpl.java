package com.example.formulario_johan_varon.model.repository;

import com.example.formulario_johan_varon.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {

    public static void main(String[] args) throws SQLException {
        Repository <User> repository = new UserRepositorylmpl();

        System.out.println("======= saveObl Insert===========");// insert
        User userInsert = new User();
        userInsert.setUser_firstname("Johan");
        userInsert.setUser_lastname("Varon");
        userInsert.setUser_email("johan@varon.com");
        userInsert.setUser_pssword("dslñfjdsfo");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("Carolina");
        userInsert.setUser_lastname("Varon");
        userInsert.setUser_email("Carolina@varon.com");
        userInsert.setUser_pssword("zaxncdklslcn");
        repository.saveObj(userInsert);


        System.out.println("===========listAllObj==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("===========byIdObj==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("===========saveObj==========");
        User userUpdata = new User();
        userUpdata.setUser_firstname("alex");
        userUpdata.setUser_lastname("Varon");
        userUpdata.setUser_email("alexa@varon.com");
        userUpdata.setUser_pssword("");
        repository.listAllObj().forEach(System.out::println);
         System.out.println();


         System.out.println("=================deleteObj================");
         repository.deleObj(2);
         repository.listAllObj().forEach(System.out::println);


    }
}

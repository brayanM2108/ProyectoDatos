package org.brayanmelo;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.get_connection()){

        }catch (Exception e){
            System.out.println(e);
        }


    }
}
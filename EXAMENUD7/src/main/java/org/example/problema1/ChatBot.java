package org.example.problema1;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chatbot: Bienvenido! Escribe <salir> cuando quieras acabar la conversación...");
        String respuesta="";

        do {
            System.out.print("Tu:");
            respuesta=sc.next().toUpperCase();

        }while (!respuesta.equalsIgnoreCase("salir"));
    }
}

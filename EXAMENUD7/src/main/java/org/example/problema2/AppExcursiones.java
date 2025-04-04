package org.example.problema2;

public class AppExcursiones {
    public static void main(String[] args) {
        System.out.println("******* APP EXCURSIONES *******");
        Excursion terra_mitica = new Excursion("Terra Mítica","Benidorm",30.0);
        terra_mitica.insertarProfesor();
        terra_mitica.inscribirAsistente();
    }
}

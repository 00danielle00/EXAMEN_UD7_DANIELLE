package org.example.problema2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Excursion {
    static Scanner sc = new Scanner(System.in);
    private String nombreActivdad;
    private String localidad;
    private double precio;
    private Set<Estudiante> listaAsistentes = new HashSet<>();
    private ArrayList<String> profesores = new ArrayList<>();


    public Excursion(String nombreActivdad, String localidad, double precio) {
        this.nombreActivdad = nombreActivdad;
        this.localidad = localidad;
        this.precio = precio;
    }


    public String getNombreActivdad() {
        return nombreActivdad;
    }

    public void setNombreActivdad(String nombreActivdad) {
        this.nombreActivdad = nombreActivdad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Set<Estudiante> getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(Set<Estudiante> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

    public ArrayList<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<String> profesores) {
        this.profesores = profesores;
    }

    public void insertarProfesor() {
        System.out.println("Introduce el nombre del profesor/a para la excuesión " + localidad);
        String profesor = sc.next();
        profesores.add(profesor);
        System.out.println("Profesor añadido correctamente a la excursión " + nombreActivdad);
    }

    public void inscribirAsistente() {
        System.out.println("Creando estudiante...");
        System.out.println("Inserta los apellidos");
        String apellidos = sc.nextLine();
        System.out.println("Inserte el nombre:");
        String nombre = sc.next();
        System.out.println("Inserta el curso:");
        String curso = sc.next();
        System.out.println("Inserta su edad:");
        int edad= sc.nextInt();
        listaAsistentes.add(new Estudiante(apellidos,nombre,curso,edad));
    }

    public double calcularImporteIngreso() {
        return 0;
    }

    public void verAsistentes() {
        for (Estudiante es : listaAsistentes) {
            System.out.println(es);
        }
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "nombreActivdad='" + nombreActivdad + '\'' +
                ", localidad='" + localidad + '\'' +
                ", precio=" + precio +
                ", listaAsistentes=" + listaAsistentes +
                ", profesores=" + profesores +
                '}';
    }
}



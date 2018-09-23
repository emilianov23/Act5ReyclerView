package com.example.emiliano.act5reyclerview;

public class persona {
    private String Nombre;
    private String Apellido;
    private String Edad;

    public persona(){
    }
    public persona(String nombre, String apellido, String edad){
        Nombre = nombre;
        Apellido = apellido;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad(){
        return Integer.parseInt(Edad);
    }

    public void setEdad(String edad) {
        this.Edad = edad;
    }
}

package com.aluracursos.aluramusic.modelos;

public class Audios {
    private String titulo;
    private String autor;
    private double duracionEnMinutos;
    private int añoLanzamiento;
    private String transcripcion;
    private int sumaDeLasValoraciones;
    private int totalDeValoraciones;
    private int cantidadDeReproducciones;
    private int cantidadDeMegusta;
    //private int clasificacion;


    public void meGusta(){
    this.cantidadDeMegusta++;
   }

    public void reproduce (){
    this.cantidadDeReproducciones++;

     }
    
    public int getClasificacion() {
    return getClasificacion();
    }
    
    public int getCantidadDeMegusta() {
        return cantidadDeMegusta;
    }
    public void setCantidadDeMegusta(int cantidadDeMegusta) {
        this.cantidadDeMegusta = cantidadDeMegusta;
    }

  
    public int getCantidadDeReproducciones() {
        return cantidadDeReproducciones;
    }
    public void setCantidadDeReproducciones(int cantidadDeReproducciones) {
        this.cantidadDeReproducciones = cantidadDeReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(double duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getTranscripcion() {
        return transcripcion;
    }

    public void setTranscripcion(String transcripcion) {
        this.transcripcion = transcripcion;
    }
    public int getSumaDeLasValoraciones() {
        return sumaDeLasValoraciones;
    }

    public void setSumaDeLasValoraciones(int sumaDeLasValoraciones) {
        this.sumaDeLasValoraciones = sumaDeLasValoraciones;
    }

    public int getTotalDeValoraciones() {
        return totalDeValoraciones;
    }

    public void setTotalDeValoraciones(int totalDeValoraciones) {
        this.totalDeValoraciones = totalDeValoraciones;
    }
    public void mostrarFichaTecnica (){
            }
    public void evaluacion (int valoracion ) {
        sumaDeLasValoraciones += valoracion;
        totalDeValoraciones ++;
    }
    public double promedioDeEvaluaciones () {
        return (double) sumaDeLasValoraciones / totalDeValoraciones;
    }
}

package com.aluracursos.aluramusic.modelos;

public class Audios {
    private String titulo;
    private String autor;
    private double duracionEnMinutos;
    private int añoLanzamiento;
    private String transcripcion;
    private int sumaDeLasValoraciones;
    private int totalDeValoraciones;

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

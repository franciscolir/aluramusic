package com.aluracursos.aluramusic.modelos;

public class Podcasts extends Audios {

    private String nombreDelPodcast;
    private String categoria;
    private int temporadas;
    private int episodio;
    private String conductor;
    private String panelista;
    private String invitado;

    public String getNombreDelPodcast() {
        return nombreDelPodcast;
    }

    public void setNombreDelPodcast(String nombreDelPodcast) {
        this.nombreDelPodcast = nombreDelPodcast;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getPanelista() {
        return panelista;
    }

    public void setPanelista(String panelista) {
        this.panelista = panelista;
    }

    public String getInvitado() {
        return invitado;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }



    public void mostrarFichaTecnica (){
        System.out.println("Nombre del pordcast: " + getNombreDelPodcast());
        System.out.println("Titulo del capitulo: " + getTitulo());
        System.out.println("Creador del podcast: " + getAutor());
        System.out.println("Conductor: " + getConductor());
        System.out.println("Panelistas: " + getPanelista());
        System.out.println("Invitado especial: " + getInvitado());
        System.out.println("Año de lanzamiento " + getAñoLanzamiento());
        System.out.println("Duracion "+ getDuracionEnMinutos() +"min.");
        System.out.println("Categoria: "+ getCategoria());
        System.out.println("Subtitulos: \n" + getTranscripcion());

    }
}

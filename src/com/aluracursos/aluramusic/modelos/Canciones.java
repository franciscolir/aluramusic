package com.aluracursos.aluramusic.modelos;

public class Canciones extends Audios{

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private String album;
    private String artista;
    private String genero;
    private String featuring;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String compositor) {
        this.artista = compositor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFeaturing() {
        return featuring;
    }

    public void setFeaturing(String featuring) {
        this.featuring = featuring;
    }

    public void mostrarFichaTecnica (){
        System.out.println("Titulo " + getTitulo());
        System.out.println("Artista " + getArtista());
        System.out.println("Autor " + getAutor());
        System.out.println("Año de lanzamiento " + getAñoLanzamiento());
        System.out.println("Duracion "+ getDuracionEnMinutos() +"min.");
        System.out.println("Genero musical: "+ getGenero());
        System.out.println("Letra de la cancion: \n" + getTranscripcion());
    }


}

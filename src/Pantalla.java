import com.aluracursos.aluramusic.modelos.Canciones;
import com.aluracursos.aluramusic.modelos.Podcasts;

public class Pantalla {
    public static void main(String[] args) {

        System.out.println("***********************Canciones**************************");
        Canciones burningLove = new Canciones();
        burningLove.setAlbum("empty");
        burningLove.setTitulo("Burning Love");
        burningLove.setAutor("Elvis Presley");
        burningLove.setArtista("Elvis Presley");
        burningLove.setFeaturing("empty");
        burningLove.setAñoLanzamiento(1972);
        burningLove.setDuracionEnMinutos(2.57);
        burningLove.setGenero("Rock");
        burningLove.setTranscripcion("You wanna do it again?\n" +
                                    "Yeah, okay\n" +
                                    "Can we roll in?\n" +
                                    "We take two\n" +
                                    "One, two\n" +
                                    "/....\n" +
                                    "A hunk, a hunk of burning love (ah)\n" +
                                    "I need a hunk, a hunk of burning love (ah)\n" +
                                    "A hunk, a hunk of burning love (ah)\n" +
                                    "A hunk, a hunk of burning love (ah)\n" +
                                    "A hunk, a hunk (that's a guess)");
        burningLove.mostrarFichaTecnica();

        System.out.println("***********************Podcasts**************************");

        Podcasts podEjemplo = new Podcasts();

        podEjemplo.setNombreDelPodcast("Pereza");
        podEjemplo.setCategoria("Entrevistas");
        podEjemplo.setTemporadas(1);
        podEjemplo.setEpisodio(1);
        podEjemplo.setConductor("Juan Perez");
        podEjemplo.setPanelista("Marcos Perez");
        podEjemplo.setInvitado("Tony Stark");
        podEjemplo.setTitulo("Conversando con Tony Stark");
        podEjemplo.setAñoLanzamiento(2024);
        podEjemplo.setDuracionEnMinutos(80);
        podEjemplo.setTranscripcion( "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                                    "Aliquam quis massa at libero accumsan tempor non commodo orci. \n" +
                                    "Nullam congue congue quam ut suscipit. Curabitur sagittis erat sit amet \n" +
                                    "ultricies convallis. Duis sagittis tortor nec lectus interdum mollis. \n" +
                                    "Vestibulum mauris odio, sagittis a sem nec, rhoncus interdum est. Duis \n" +
                                    "sed massa libero. Proin convallis faucibus venenatis. Mauris commodo ac\n " +
                                    "libero vitae mollis. Mauris lobortis viverra tortor.");
        podEjemplo.mostrarFichaTecnica();
                    }


    }
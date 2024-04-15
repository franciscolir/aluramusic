package com.aluracursos.aluramusic.calculos;

import com.aluracursos.aluramusic.modelos.Audios;

public class Recomendaciones {

    public void recomendacion (Audios audios) {
    if (audios.getClasificacion() >= 8){
        System.out.println(audios.getTitulo() + "Populares del momento");
    }else{
        System.out.println(audios.getTitulo() + "Otros favoritos");
    }
}
}

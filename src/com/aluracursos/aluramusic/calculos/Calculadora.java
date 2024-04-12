package com.aluracursos.aluramusic.calculos;

import com.aluracursos.aluramusic.modelos.Audios;

public class Calculadora extends Audios implements Clasificacion {

@Override
    public int getClasificacion(){
        if (getCantidadDeReproducciones()>1000) {
            return 4;
        }else{
            return 2;
        }
    }










}

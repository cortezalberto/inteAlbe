package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.enums.Resultado;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipo  {
    private String name;
    private boolean autorizacion = true;
    private Resultado resultadoEnPartido;
    private int cantGoles;

    public Equipo(String name) {
        this.name=name;
    }

    //Suma todos los goles metido en todos los partidos
    public void sumarGoles(int i){
        this.cantGoles += i;
    }
}

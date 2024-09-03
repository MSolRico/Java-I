/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador.Service;

import Integrador.entidades.Estudiante;
import java.util.ArrayList;

public class EstudianteService {

    private ArrayList<Estudiante> estudiantes;

    public EstudianteService() {
        this.estudiantes = new ArrayList<>();
    }

    public void addEstudiante(Estudiante e) {
        this.estudiantes.add(e);
    }

    public double promedioCurso() {
        double prom=0;
        int cont=0;
        for(Estudiante e:this.estudiantes) {
            prom+=e.getNota();
            cont++;
        }

        return prom/cont;
    }

    public ArrayList<String> nombresAlumnosNotaMayorPromedio(){
        ArrayList<String> nombres = new ArrayList<>();
        for(Estudiante e:this.estudiantes) {
            if(e.getNota()>this.promedioCurso()) {
                nombres.add(e.getNombre());
            }
        }
        return nombres;
    }

}
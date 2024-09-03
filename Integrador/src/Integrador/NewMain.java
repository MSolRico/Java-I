/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

import Integrador.Service.EstudianteService;
import Integrador.entidades.Estudiante;

/**
 *
 * @author SFC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Martin",8);
        Estudiante e2 = new Estudiante("Jose",5);
        Estudiante e3 = new Estudiante("Nahuel",10);
        Estudiante e4 = new Estudiante("Josefina",3);
        Estudiante e5 = new Estudiante("Fidel",7);
        Estudiante e6 = new Estudiante("Maria",5);
        Estudiante e7 = new Estudiante("Sol Rico",10);
        Estudiante e8 = new Estudiante("Hiedra",5);
        EstudianteService service = new EstudianteService();

        service.addEstudiante(e1);
        service.addEstudiante(e2);
        service.addEstudiante(e3);
        service.addEstudiante(e4);
        service.addEstudiante(e5);
        service.addEstudiante(e6);
        service.addEstudiante(e7);
        service.addEstudiante(e8);

        System.out.println(service.promedioCurso());
        System.out.println("Mayor a promedio: "+service.nombresAlumnosNotaMayorPromedio());

        for(int i=2; i<=128; i*=2) {
            System.out.println("i"+ i);
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso3;

import javax.swing.JOptionPane;


public class estudiantesInfo {
    public String nombreEstudiante;
    public String curso;
    public String profesor;
    public int cali;

    public estudiantesInfo(String nombreEstudiante, String curso, String profesor, int cali) {
        this.nombreEstudiante = nombreEstudiante;
        this.curso = curso;
        this.profesor = profesor;
        this.cali = cali;
    }
    
    

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCali() {
        return cali;
    }

    public void setCali(int cali) {
        this.cali = cali;
    }
    
     public static void info(estudiantesInfo arrEstudiantes[]){
        for (int i = 0; i < arrEstudiantes.length; i++) {
            JOptionPane.showMessageDialog(null, "Se solicitaran los datos del estudiante"+i);
            String nombre = JOptionPane.showInputDialog("Escriba el nombre del estudiante");
            String curso = JOptionPane.showInputDialog("Ingrese el nombre del curso");
            String profesor = JOptionPane.showInputDialog("Ingrese el profesor del estudiante");
            int cali = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación obtenida por el estudiante"));
            arrEstudiantes[i]= new estudiantesInfo(nombre, curso, profesor, cali);
        }
     }
     
    public static void muestraEstu(estudiantesInfo arrEstudiantes[]){
        for (int i = 0; i < 9; i++) {
            JOptionPane.showMessageDialog(null,  arrEstudiantes[i].getNombreEstudiante());
            
        }
    }
}

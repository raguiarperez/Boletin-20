/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class Boletin20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Métodos obx=new Métodos();
        int fila,columna;
        fila=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca numero de equipos"));
        columna=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca numero de jornadas"));
        String[]equipo=new String[fila];
        String[]jornada=new String[columna];
        int[][]goles=new int[equipo.length][jornada.length];
        int[]golesTotal=new int[equipo.length];
        
        obx.crearTablaEquipo(equipo);
        obx.crearTablaJornada(jornada);
        obx.crearTablaGoles(goles, equipo, jornada);
        obx.mostraTabla(goles, equipo, jornada);
        obx.ordenarEquipos(goles, equipo, golesTotal);
        obx.totalGolesEquipo(equipo, golesTotal);
        obx.mostraTablaOrdenada(goles, equipo, jornada, golesTotal);
        obx.buscarCantidadGolesEnJornada(equipo, jornada, goles);
        obx.consultar(equipo, jornada, goles);
    }
    
}
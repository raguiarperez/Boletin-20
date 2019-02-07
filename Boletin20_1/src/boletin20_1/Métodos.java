package boletin20_1;

import javax.swing.JOptionPane;
//Autor:Rafaguiarperez
public class Métodos {
    public void crearTablaEquipo(String[]equipo){
        for(int i=0;i<equipo.length;i++){
            equipo[i]=JOptionPane.showInputDialog(null,"Introduzca el nombre del equipo "+(i+1));
        }
    }
    
    public void crearTablaJornada(String[]jornada){
        for(int i=0;i<jornada.length;i++){
            jornada[i]="X"+(i+1);
        }
    }
    
    public void crearTablaGoles(int[][]tabla,String[]equipo,String[]jornada){
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
                tabla[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca los goles del "+ equipo[i]+" en la jornada "+jornada[j]));
            }
        }
    }
    
    public void mostraTabla(int[][]tabla,String[]equipo,String[]jornada){
        System.out.print("E/J  ");
        for(int k=0;k<tabla.length;k++){
            System.out.print(jornada[k]+" ");
        }
        System.out.println("");
        for(int i=0;i<tabla.length;i++){
            System.out.print(equipo[i]+"  | ");
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("| ");
        }
        System.out.println("");
    }
    
    public void ordenarEquipos(int[][]goles,String[]equipo,int[]total){
        int totalg;
        for(int i=0;i<goles.length;i++){
            totalg=0;
            for(int j=0;j<goles[0].length;j++){
                totalg=goles[i][j]+totalg;
            }
            total[i]=totalg;
        }
        
        int auxg,auxt;
        String auxe;
        for (int i=0;i<total.length-1;i++){
            
            for(int j=i+1;j<total.length;j++){
                if(total[i]<total[j]){
                    auxt=total[i];
                    total[i]=total[j];
                    total[j]=auxt;
                    auxe=equipo[i];
                    equipo[i]=equipo[j];
                    equipo[j]=auxe;
                    for(int k=0;k<goles[0].length;k++){
                        auxg=goles[i][k];
                        goles[i][k]=goles[j][k];
                        goles[j][k]=auxg;
                    }
                }
            }
        } 
    }
    
    public void totalGolesEquipo(String[]equipo,int[]total){
        for(int i=0;i<equipo.length;i++){
            System.out.println("El "+equipo[i]+" marco un total de "+total[i]);
        }
        System.out.println("");
    }
    
    public void mostraTablaOrdenada(int[][]tabla,String[]equipo,String[]jornada,int[]golesTotal){
        System.out.print("E/J  ");
        for(int k=0;k<tabla.length;k++){
            System.out.print(jornada[k]+" ");
        }
        System.out.println("");
        for(int i=0;i<tabla.length;i++){
            System.out.print(equipo[i]+"  | ");
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("| "+golesTotal[i]);
        }
        System.out.println("");
    }
    
    public void buscarCantidadGolesEnJornada(String[]equipo,String[]jornada,int[][]goles){
        int max;
        String equipom[]=new String[equipo.length];
        int i,j;
        
        for(i=0;i<goles[0].length;i++){
            max=0;
            for(j=0;j<goles.length;j++){
                if(max<=goles[j][i]){
                    max=goles[j][i];
                    equipom[j]=equipo[j];
                }
            }
            for(j=0;j<goles.length;j++){
                if(max==goles[j][i]){
                    System.out.println("El equipo "+ equipom[j] +" marco un total de "+max+" en la jornada "+jornada[i]);
                }
            }
        }
        System.out.println("");
    }
    
    public void consultar(String[]equipo,String[]jornada,int[][]goles){
        String jornadas,equipos;
        int posicionE=0,posicionJ=0;
        equipos=JOptionPane.showInputDialog(null, "Introduzca el equipo a buscar");
        jornadas=JOptionPane.showInputDialog(null,"Introduzca la jornada a buscar\nLas jorandas se almacenana como:\n      X+numerodejornada");
        for(int i=0;i<equipo.length;i++){
            if(equipos.equals(equipo[i])){
                posicionE=i;
            }
        }
        for(int i=0;i<jornada.length;i++){
            if(jornadas.equals(jornada[i])){
                posicionJ=i;
            }
        }
        System.out.println("El equipo "+equipos+" marco "+ goles[posicionE][posicionJ]+" en la jornada "+jornadas);
    }
}
package boletin20_1;

import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class Goles {
//    int[][] goles=new int[3][3];

    int[][] goles = {{3, 4, 2},
    {1, 2, 1},
    {3, 0, 1}};

    public void crearTaboa() {
        for (int f = 0; f < goles.length; f++) {
            for (int c = 0; c < goles.length; c++) {
//                goles[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Escribe num:"));
            }
        }
    }

    public void amosar() {
        for (int f = 0; f < goles.length; f++) {
            System.out.print("| ");
            for (int c = 0; c < goles.length; c++) {
                System.out.print(goles[f][c] + "   ");
            }
            System.out.println("|\n");
        }
    }
}

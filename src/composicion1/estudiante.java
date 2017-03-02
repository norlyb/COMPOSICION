/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion1;

/**
 *
 * @author Estudiante
 */
public class estudiante {
     private int a1;
    private materias[] bs; //relacionando con B
    private int ins;

       
    

    public  estudiante (){
        this.bs = new materias [6];
        bs[0] = new materias ("fisica");
        ins++;
        }
   

    public void addB(materias b) {
        if(ins < 6){
          bs[ins]=b;
          ins++;
        }
    }

    public int geta1() {
        return a1;
    }

    public void seta1(int seta1) {
        this.a1 = a1;
    }

    public void imprimirB() {
        for (int i = 0; i < ins; i++) {
            System.out.println("las materias de Laura son " + bs[i].getB1());
        
    }
}}
    


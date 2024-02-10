/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navigasyon;

/**
 *
 * @author dell
 */
public class Navigasyon {
        //7<=x<10
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nav[][],x,y;
        x =(int) (Math.random()*4)+10;
        y =(int) (Math.random()*4)+10;
        nav = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==j || j-i==1){
                    nav[i][j] = 1;
                }else{
                    nav[i][j] = 0;
                }
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(nav[i][j]+" ");
            }System.out.println();
        }
        
        
        
    }
    
}

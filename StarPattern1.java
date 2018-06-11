/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpattern1;

/**
 *
 * @author divyanshu
 */
public class StarPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        //left-aligned right angle star* trinagular pattern
                for(int i=1;i<=6;i++)
                { 
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
    
}

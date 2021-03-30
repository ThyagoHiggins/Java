/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;


import javax.swing.JOptionPane;


public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /* * JOptionPane.showMessageDialog(null, "Ola Mundo", "Bem Vindo", JOptionPane.WARNING_MESSAGE, null);*/
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        
        */
        
        /*System.out.println("o número digitado é" + n);
        
        */
        
        /*JOptionPane.showMessageDialog(null, "o número digitado é " + n);
        
        */
        
        int n,q = 0,s = 0,pares = 0,impares =0, media = 0, cont=0;
        do{
           
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um número: <br><em>(valor 0 para)</em></html>"));
           
           s += n;
           
           if(n !=0){
           q +=1;
           }
           
           if(n%2 == 0 && n !=0){
               pares += 1;
               
           }else{
               if(n!=0){
               impares +=1;
               }
           }
           
           if(n>100){
           cont += 1;
           }
        }while(n !=0);
        
        media = s/q;
        
        JOptionPane.showMessageDialog(null, "<html> Resultado Final <hr>"+
                "<br> Total de Valores "+ q + "<br>"+
                "Total de Pares:  "+ pares+"<br>"+
                "Total de Impares:  "+impares+"<br>"+
                "Acima de 100: "+cont+"<br>"+
                "Média dos Valores: "+media+ "</html");
        
    }
    
}

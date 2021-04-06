package contabanco;



public class ContaBanco {

public static void main(String[] args) {
    
     
     Conta p1 = new Conta();
     
     p1.setNumConta(111);
     p1.setDono("Jubile");
     p1.abrirConta("CC");
     
     System.out.println("");
     
     Conta p2 = new Conta();
     p2.setNumConta(222);
     p2.setDono("Creuza");
     p2.abrirConta("CP");
     
     
     p1.ver();
     System.out.println("");
     p2.ver();
    
  System.out.println("");
     p1.depositar(100);
     p2.depositar(500);
     System.out.println("");
     p1.ver();
     System.out.println("");
     p2.ver();
    
   p2.sacar(100);
    System.out.println("");
   p2.ver();
   
    System.out.println("");
    p2.sacar(1000);
    
   
   
   
   
   
}
   
}

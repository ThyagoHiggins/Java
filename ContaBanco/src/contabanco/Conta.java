package contabanco;

final class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
        }
        
    

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        
        if ("CC".equals(t)){
            this.setSaldo(50);
        }else{ 
            if("CP".equals(t)){
               this.setSaldo(150);
            }        
        }  
    }
    
    public void fecharConta(){
        if(this.getSaldo() == 0){
            System.out.println("Sua conta Será fechada");
            setStatus(false);
        }else{
            if(this.getSaldo()> 0){
                System.out.println("Você não pode fechar a conta\n"
                + "Há o valor de "+ this.saldo + "na sua conta");
            }else{
                System.out.println("Você não pode fechar a conta\n"
                + "Há o valor negativo de "+ this.saldo + "na sua conta");
            }
        }
        }
    
    public void depositar( double v){
        if(this.getStatus()){
            setSaldo(this.getSaldo() + v);
            System.out.println("Valor Depositado com Sucesso");
            
        }else{
            System.out.println("CONTA FECHADA! Não pode Depositar");
        }
        
    }
    
    public void sacar(double v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Sacado");
            }else{
                System.out.println("Você não tem saldo suficiente");
                System.out.println("Valor máximo permitido é " + getSaldo());
            }
        }else{
            System.out.println("Impossivel Sacar");
        }
        
        }
    
    public void pagarMensal(){
        int v;
        if(getTipo()== "CC"){
            v = 12;
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }else{
            if (getTipo() == "CP"){
                v = 20;
            setSaldo(getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso");
            }
        }
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    public void ver(){
        System.out.println("Nº da Conta:  "+ this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono:" + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: "+ this.status);
    }
    
}

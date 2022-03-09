//grupo que uma conta tem
    public class Conta {
       private double saldo ; //saldo, agencia, numero e titular são atributos da classe Conta
       private int agencia ;
       private int numero;
       private Cliente titular;

       //VOID não retorna nada como resposta
        public  void deposita(double valor){
           if(valor>0){
               saldo += valor;
            }
            // this.saldo += valor; //this, é pra qual o atributo foi invocado. ex para contaDePaulo.saldo
        }
        public boolean saca(double valor) {
            if (valor > 0 && saldo >= valor){
                saldo -= valor;
              //  System.out.println("valor de saque " + this.saca(valor) );
                return true;

            } else {
               //System.out.println("Saldo Indisponivel");
                return false;
            }
        }
        public boolean transfere(double valor, Conta destino){
            if (this.saldo >= valor){
                this.saldo -= valor;
                destino.deposita(valor); // ou destino.saldo += valor;
                //System.out.println("Transferencia com sucesso! " + this.saldo);
                return true;
            } //ou  else{ return false;}
            return false;
        }

        public double getSaldo(){

            return this.saldo;
        }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero(){

            return this.numero;
        }
        public void setNumero(int numero){

            this.numero = numero;
        }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia ) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}

/* Composição de Objetos
Emcapsulamento e visibilidade
Construtores e membros estaticos
 */


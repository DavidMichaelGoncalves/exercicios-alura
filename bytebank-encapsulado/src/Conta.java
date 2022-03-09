//grupo que uma conta tem
    public class Conta {
       private double saldo ; //saldo, agencia, numero e titular são atributos da classe Conta
       private int agencia ;
       private int numero;
       private Cliente titular;
       private static int total; //static quer dizer que o objeto/varivel  é da classe

       public  Conta(int agencia , int numero){ //Construtor
           Conta.total++;
           System.out.println("O total de contas é " + total);

           this.agencia =agencia;
           this.numero = numero;
           System.out.println("estou criando uma conta");
       }

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
            if(numero <=0){
                System.out.println(("nao pode valor menor igual a 0"));
                return;
            }

            this.numero = numero;
        }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia ) {
            if(agencia <=0){
                System.out.println(("nao pode valor menor igual a 0"));
                return;
            }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total; // ou sem Conta. poderia ser só total
    }
}

/* Composição de Objetos
Emcapsulamento e visibilidade
Construtores e membros estaticos
 */


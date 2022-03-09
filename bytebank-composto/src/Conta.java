//grupo que uma conta tem
    public class Conta {
       private double saldo ; //saldo, agencia, numero e titular são atributos da classe Conta
       private int agencia ;
       private int numero;
       Cliente titular;

       //VOID não retorna nada como resposta
        public  void deposita(double valor){
            this.saldo += valor; //this, é pra qual o atributo foi invocado. ex para contaDePaulo.saldo
        }
        public boolean saca(double valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Valor disponivel " + this.saldo );
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
        public int getNumero(){
            return this.numero;
        }
        public void setNumero(int novoNumero){
            this.numero = novoNumero;
        }
    }

/* Composição de Objetos
Emcapsulamento e visibilidade
Construtores e membros estaticos
 */


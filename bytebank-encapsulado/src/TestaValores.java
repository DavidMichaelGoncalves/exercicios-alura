public class TestaValores {

    public static void main(String[] args){ //static quer dizer que o objeto/varivel  é da classe
        Conta conta = new Conta(1337,24226);


        System.out.println(conta.getNumero());

        Conta conta2 = new Conta(1337,16577);

        System.out.println(conta2.getNumero());
        System.out.println(Conta.getTotal());


    }

}

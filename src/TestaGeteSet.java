public class TestaGeteSet {
    public static void main(String[] args){
        Conta conta = new Conta();
        // conta.numero = 1337; como era

        conta.setNumero(1337); // como fica
        System.out.println(conta.getNumero());

        conta.setAgencia(23);
        System.out.println(conta.getAgencia());

        Cliente paulo = new Cliente();
        // conta.titular = paulo; como era


        //paulo.nome = "Paulo Silveira" ; como era
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        //agora em duas linhas ou modo antigo
      // Cliente titularDaConta = conta.getTitular();
       //titularDaConta.setProfissao("programador");

        conta.setSaldo(100);

        double valorSaque = 50;
        conta.saca(valorSaque);
        System.out.println(conta.getSaldo());

        double valorDeposito = 70;
        conta.deposita(valorDeposito);

        System.out.println(conta.getSaldo());

        System.out.println(conta.getTitular().getProfissao());

        //System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
        // os 3 a cima estão alocados no mesmo espaço de memoria, que seria o cliente
    }
}

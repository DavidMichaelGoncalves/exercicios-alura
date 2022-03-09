public class TestaBanco {
    public static void main(String[] args){
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Siveira";
        paulo.cpf = "123.123.456-78";
        paulo.profissao= "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        //associa o cliente paulo a conta contaDoPaulo
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);


    }
}

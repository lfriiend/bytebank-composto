public class TestaBanco {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.nome = "Lucas";
        lucas.cpf = "222.222.222-12";
        lucas.profissao = "programador";

        Conta contaDoLucas = new Conta();
        contaDoLucas.deposita(100);

        contaDoLucas.titular = lucas;

        System.out.println(contaDoLucas.titular.nome);
    }
}

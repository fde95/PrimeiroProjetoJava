public class PrimeiroProjetoJava{
    public static void main(String[] args) {
        String ambiente = args[0];

        if (ambiente.equals("DEV")){
            System.out.println("Olá Dev, bem vindo ao seu canal de desenvolvimento!");
        } else if (ambiente.equals("Publico")) {
            System.out.println("Olá usuário, bem vindo a sua página.");
        } else{
            System.out.println("Você adicionou um valor diferente de 'DEV' ou 'Publico'!\nTente novamente com um dos dois valores mencionados.");
        }
    }
}
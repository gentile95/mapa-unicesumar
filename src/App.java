public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pessoa pessoa = new Pessoa("Lucas", 28, (float) 1.84);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        pessoa.setNome("Thais");
        pessoa.setIdade(26);
        pessoa.setAltura((float) 1.70);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
}

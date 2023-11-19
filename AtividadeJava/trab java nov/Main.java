public class Main {
    public static void main(String[] args) {
    // Criando instância do Zoologico
        Zoologico zoo = new Zoologico();

     // Criando instâncias de Mamifero e Ave
        Mamifero leao = new Mamifero("Leão", "Feroz");
        Ave papagaio = new Ave("Papagaio", "Colorido");

     // Adicionando animais ao zoológico
        zoo.adicionarAnimal(leao);
        zoo.adicionarAnimal(papagaio);

     // Fazendo barulho no zoológico
        zoo.fazerBarulho();
    }
}
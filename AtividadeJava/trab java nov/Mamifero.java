public class Mamifero extends Animal {
    private String tipoMamifero;

    public Mamifero(String nome, String tipoMamifero) {
        super(nome);
        this.setTipoMamifero(tipoMamifero);
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero " + nome + " está fazendo um som específico para mamíferos.");
    }

	public String getTipoMamifero() {
		return tipoMamifero;
	}

	public void setTipoMamifero(String tipoMamifero) {
		this.tipoMamifero = tipoMamifero;
	}
}

public class Ave extends Animal {
    private String tipoAve;

    public Ave(String nome, String tipoAve) {
        super(nome);
        this.setTipoAve(tipoAve);
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave " + nome + " está fazendo um som específico para aves.");
    }

	public String getTipoAve() {
		return tipoAve;
	}

	public void setTipoAve(String tipoAve) {
		this.tipoAve = tipoAve;
	}
}
class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;
	
	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Esta��o de trabalho: " + this.estacaoDeTrabalho);
	}
	
}

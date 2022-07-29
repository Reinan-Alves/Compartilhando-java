package refatoracaofabio;

public class calculoDistanciaEntrePontosCartesianos implements distanciaEntrePontos{

	public Double pontoA(Double posicaoX, Double posicaoY) {
		double pontoA = Math.pow(posicaoX - posicaoY, 2);
		return pontoA;
	}

	public Double pontoB(Double posicaoX, Double posicaoY) {
		double pontoB = Math.pow(posicaoX - posicaoY, 2);
		return pontoB;
	}

	public Double distanciaEntreEixo(Double pontoA, Double pontoB) {
		double resultado = Math.sqrt(pontoA + pontoB);
		return resultado;
	}

}

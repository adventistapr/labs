public class MathLearning {
	// Cria��o de vari�veis est�ticas
	static double a = 14;
	static double b = 17;
	static int c = 20;
	static int counter = 0;

	public static void main(String[] args) {
		// Cria��o de 5 vari�veis do tipo "double"
		double result;
		double resultTwo;
		double resultThree;
		double resultFour;
		double resultFive;

		// Atribui��o de valores �s 5 vari�veis acima criadas
		result = a + b;
		resultTwo = a - b;
		resultThree = a * b;
		resultFour = a / c;
		resultFive = b % c;

		// Invocamos o m�tedo "out" com um par�metro ''double'' obrigat�rio
		out(result);
		out(resultTwo);
		out(resultThree);
		out(resultFour);
		out(resultFive);

	}

	public static void out(double output) {
		counter++;
		System.out.println("Resultado " + counter + " � " + output);
	}

}

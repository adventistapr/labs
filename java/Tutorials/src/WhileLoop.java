public class WhileLoop {
	public static void main(String[] args) {
		//Syntax:
		//for (A��o Inicial; Condi��o; A��o Final)
		for (int count = 0; count < count+1; count++) {
			System.out.println(count);
			
			if (count >= 10000) {
				break; //Para o loop quando count chega a 10000
			}
		}
	}
}

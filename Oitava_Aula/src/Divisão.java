
public class Divis�o {

		public int numerador;
		public int denominador;
		
		public Divis�o(int numerador, int denominador) {
			
			if (denominador == 0) {
				throw new ArithmeticException("O sistema n�o realiza divis�o por zero.");
			}
			else if (numerador < 0) {
				throw new ArithmeticException("Numerador menor do que zero");
			}
			
			this.numerador = numerador;
			this.denominador = denominador;
		}
		public double operacao() {
			return (numerador / denominador);
		}

	}



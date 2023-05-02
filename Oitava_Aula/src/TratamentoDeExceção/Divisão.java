package TratamentoDeExceção;

public class Divisão {

		public int numerador;
		public int denominador;
		
		public Divisão(int numerador, int denominador) {
			
			if (denominador == 0 || denominador > numerador) {
				throw new ArithmeticException("Números inválidos");
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



package triangulo;

public class Equilatero {
	double lado, area, perimetro;
	
	void calcArea() {
		area = ((lado * lado) * Math.sqrt(3)) / 4; 
		
	}
	
	void calcPerimetro() {
		perimetro = 3 * lado;
		
	}
	

}

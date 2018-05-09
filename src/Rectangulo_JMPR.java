/**
 * 
 * @author Jose Manuel
 * @version 1.1
 */
public class Rectangulo_JMPR extends FiguraGeometrica_JMPL {
	private double l1;
	private double l2;
	
	/**
	 * 
	 * @param tipoFigura es para saber de que forma es la figura
	 * @param lG es la variable de la medida de un lado del rectangulo
	 * @param lP es la variable de la medida del otro lado del rectangulo
	 */
	public Rectangulo_JMPR(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * @param area es para saber el tamaño de la superficie 
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * @param perimetro es para saber el tamaño del contorno 
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}

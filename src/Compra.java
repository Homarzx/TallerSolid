import java.util.List;

public class Compra {
	private Pago pago;
	private PagoPayPal pagoPayPal;
	private List articulos;
	public Compra(Pago pago) {
		
	}
	public Compra(PagoPayPal pagoPayPal) {
		
	}
	public void agregarArticulo(Articulo articulo) {
		
	}
	public void removerArticulo(Articulo articulo) {
		
	}
	/*
        En este ejemplo se viola el principio de "Single responsibility principle", que dice que cada clase debe tener sólo una única responsabilidad , por lo tanto si una
	clase se ocupa de varias tareas es mejor separar ocupaciones mediante otras clases. La solución sería crear una clase de Artículos y poner los dos métodos
	relacionados.
	 public class Articulo{
             private List articulos;
    
              public void agregarArticulo(Articulo articulo){
        
              }
              public void removerArticulo(Articulo articulo){
        
               }
}
        
        */

}

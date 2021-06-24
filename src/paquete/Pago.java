package paquete;
public class Pago {
	
	public void realizarCobro(double monto) {
		
	}
	public void calcularImpuestosFactura() {
		
	}
	public void generarFactura() {
		
	}
	

}

/* En este ejemplo se viola el principio de "Liskov Substitution" que dice que cada clase que hereda de otra puede utilizarse como su clase padre 
	sin conocer necesariamente las diferencias que hay entre ellas. La solución sería la siguiente:
	public class Pago{
           private boolean LoggedIn;
           public void realizarCobro(double monto){   
           }
           public void realizarCobroPayPal(double monto){
              if(!LoggedIn){
               return;
              }
           }
           public void calcularImpuestosFactura(){
       
           }
           public void generarFacturas(){
       
           }
   
       }
	
	*/


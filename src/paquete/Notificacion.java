package paquete;
public class Notificacion {
	
	private int tipoNotificacion;
	
	public void notificar(Pago pago) {
		if(tipoNotificacion == 1) {
			
		}else {
			
		}
	}

}


/*En este ejemplo se viola el Open Closed Principle porque no estan abiertas a la extension es decir 
al querer agregar una nueva forma de notificacion(Telegram), tendria que modificar esta clase(Notificacion) para
que realice la notificacion para Telegram.
La solucion seria Seria mejor implementar una interface en este caso Tipo que tenga el método abstracto notificar(),
entonces al agregar una nueva notificacion como Telegram esta implementara esta interfaz junto con el método. 
 		
*/


public class PagoPayPal  extends Pago{
	private boolean loggedIn; //conexion a cuenta PayPal
	@Override
	public void realizarCobro(double monto) {
		if(!loggedIn) {
			return;
		}
	}

}

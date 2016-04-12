class Area{

	private double largo, ancho, alto;
	public Area(){}//Constructor
	public Area(double ml,double ma){ //Constructor
		largo=ml;
		ancho=ma;
	}
	public void Medidas(double ml, double ma, double mal){//Metodo para asignar las tres meidaa
		largo = ml; ancho = ma; alto = mal;
	}
}                       


class Plafon{

	private Area res1;//variable del tipo area

	public Plafon(){
	}

	protected void msgMedidaErronea(){
		System.out.println("Ingresa una medida correcta");
	}

	public Plafon (double ml, double ma){

		res1 = new Area (ml, ma);//mandamos a llamar el constructor

		if (ml < 0 && ma < 0){
			msgMedidaErronea();
			ml = -ml;
			ma = -ma;
		}
} 


class Muro{

	private Area res2;

	public Muro(){
	}

	protected void msgMedidaErronea(){
	System.out.println("Ingresa un digito correcto");	
	}

	public Muro (double ml, double mal){

		res2 = new Area(ml, mal);

		if (ml < 0 && mal < 0){
			msgMedidaErronea();
			ml = -ml;
			mal= -mal;
		}

	}

} 

class Materiales{

	private Muro lista;
	private double colgante, amarre, canaleta, liston, angulo, tabr, ps1;
	private double rdmx, cinta;

	public Materiales(){
		
	}
	protected void msgIngresaUnaMedida(){
		System.out.println("Ingresa una  Medida");
	}
	protected void msgLosMAterialesSon(){
		System.out.println("Los Materiales que requieres para tu proyecto son:");
	}
	public Materiales (double col, double arr, double can, double lis, double ang, double tr, double s1){
		lista = new Muro (ml,mal);
	if ( res2 < 0) {
		msgIngresaUnaMedida();
			}
		}
}
public class Test{
	public static void main(String[] args) {
		
	}
}





	


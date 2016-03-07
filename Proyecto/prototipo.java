import java.util.Scanner;
public class prototipo
{

  public static void main (String [] args);
	{
		Scanner teclado = new Scanner (System.in);
		int menu, proyecto, material, plafon, muro;
		float areap, aream, alto, ancho;

			System.out.println("Seleccione una opcion del siguiete menu: \n");

    			while (menu != 4) 
    			{
        			System.out.println("1.- ingresar Nombre de Proyecto\n");
        			System.out.println("2.- Ingresar Area de Plafon\n");
        			System.out.println("3.- Ingresar Area de Muros\n");
        			System.out.println("4.- Calculo de Material \n");
        			System.out.println("Indica la opcion: ");
        			menu = teclado.nextInt();

        			if (menu != 4) 
        			{
           				proyecto = teclado.nextInt();
           				material = teclado.nextInt();
           				System.out.println("Ingresa la medida de la altura : \n");
            			alto = teclado.nextInt();
            			System.out.println("Ingresa la medida de lo ancho: \n");
           				ancho = teclado.nextInt();
           			}

           				else
           				{
           					areap  = alto * ancho;
           					aream  = alto * ancho;

                    palfon = (double) areap;
                    muro   = (double) aream;


           				}
        			

        				switch (menu) 
        				{
            				case 1: System.out.print("El Nombre del Proyecto es:\n", + proyecto);
                			break;
            				case 2: System.out.print("El Area del Plafon es :\n", + plafon);
                			break;
            				case 3: System.out.print("El Area del Muro es:\n", + muro);
                			break;
            				case 4: System.out.print("El Material requerido es :\n", + material);
            				break;
			        	}    	    		
    			}
	}
}
	


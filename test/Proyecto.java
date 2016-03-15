import java.io.*;
public class Proyecto{
	
	public double Muro(double a, double b){ 
            return a * b;                    
            } 
    public double Plafon(double a, double b){ 
            return a * b;                    
            }        
    public double Lambrin(double a, double b){ 
            return a * b;                    
            }
    public double Tapial(double a, double b){ 
            return a * b;                    
            }
    public double MaterialPlafon(double a, double b){ 
            double tabla=3, pi1=12, liston=3, canaleta=3, anguloama=3, alambre12=3, alambre16=3, anclas=4, cinta=3, rdmix=3;
            double ope=0, ope1;

            ope = Plafon * tabla;
            ope1 = Plafon * pi1;





            return ope;                    
            }


		public static void main(String a[]){ 

			int opcion = 0;
            int opcion2= NULL;                           
        	Proyecto objeto = new Proyecto(); 
            
            	do{
                	try{ 
                    	while(true){  
                            System.out.println("SISTEMAS INTEGRALES EN CONSTRUCCION Y ACABADOS DE INTERIORES");        
                        	System.out.println("Menu:"); 
                        	System.out.println("\t1\t Sistemas de Muros"); 
                        	System.out.println("\t2\t Sistemas de Plafon"); 
                        	System.out.println("\t3\tLambrin"); 
                        	System.out.println("\t4\tTapial"); 
                        	System.out.println("\t5\tSalida"); 

                        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                        	opcion = Integer.parseInt(br.readLine());

                        	if(opcion > 0 && opcion < 5){ 
                                System.out.println("Ingrese la primer medida:"); 
                                double n1 = Double.parseDouble(br.readLine()); 

                                System.out.println("Ingrese la segunda medida:"); 
                                double n2 = Double.parseDouble(br.readLine()); 

                                switch(opcion){

                                    case 1: 
                                        System.out.println("\n\t\tEl area es: " + objeto.Muro(n1, n2) + "m2" + "\n"); 

                                         System.out.println("Deseas saber cuanto material necesitas, digita 1 ");
                                         System.in = opcion2;
                                         System.out.println("Digita 0 para regresar al menu");

                                         if (opcion2 = 1){
                                            opcion2 = materiales;

                                         }






                                    break; 

                                        case 2: 
                                            System.out.println("\n\t\tEl area es: " + objeto.Plafon(n1, n2) + "m2" + "\n"); 
                                        break; 

                                            case 3: 
                                                System.out.println("\n\t\tEl resultado es: " + objeto.Lambrin(n1, n2) + "m2" + "\n"); 
                                            break; 

                                                case 4: 
                                                    System.out.println("\n\t\tEl resultado es: " + objeto.Tapial(n1, n2) + "\n"); 
                                                break; 

                                                    default: 
                                                    break; 

                                                } 
                            } 
                                else { 
                                     System.exit(0); //Sale del programa
                                } 
                    } 
                }
                    catch(Exception e){                                                    
                        e.printStackTrace(); 
                        System.out.println("Caracter no valido, ingrese una opcion valida");
                        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                        //opcion = Integer.parseInt(br.readLine());
                    } 
            }
            while (opcion!=0 || opcion!=1 || opcion!=2 || opcion!=3 || opcion!=4 || opcion!=5 );
    } 
} 






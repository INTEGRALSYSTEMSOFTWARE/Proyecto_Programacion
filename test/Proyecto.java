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


		public static void main(String a[]){ 

			int opcion = 0;                           
        	Proyecto objeto = new Proyecto(); 
            
            	do{
                	try{ 
                    	while(true){  
                                  
                        	System.out.println("Menu:"); 
                        	System.out.println("\t1\tMuros"); 
                        	System.out.println("\t2\tPlafon"); 
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






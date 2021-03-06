import java.util.*;
import java.io.*;

public class Principal {

	public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);

		ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
		ArrayList<Leche> leches = new ArrayList<Leche>();
		ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();

		ArrayList<Cesta> cestas = new ArrayList<Cesta>();
		
		
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try{

			String ruta = "/home/zubiri/Proyectosjava/java2_almacencliente/src/distribuidores.txt";
 			File archivo2 = new File(ruta);
			FileReader leer2 = new FileReader (archivo2);
			BufferedReader bf2 = new BufferedReader(leer2);
			String salida2 = bf2.readLine();

	        
	        
	        String [] cortarString = null;
	        String [] cortarString1 = null;	
	        String [] cortarString2 = null;	
	        String [] cortarString3 = null;	

	       
	        while(salida2!=null){
	        	//separa el string de la  linea usara el ; como referencia de la separacion
	        	cortarString = salida2.split("#");
	        
	        	
	       		Distribuidor distribuidor = new Distribuidor();
	       		//cortarString1 = cortarString[0].split(",");
	       		distribuidor.setNombre (cortarString[0]);
	       		distribuidor.setCif (cortarString[1]);

	       		Direccion direccion = new Direccion();
	       		cortarString2 = cortarString[2].split(",");
	       		direccion.setCiudad  (cortarString2[0]);
	       		direccion.setCalle  (cortarString2[1]);
	       		direccion.setPiso  (cortarString2[2]);
	       		direccion.setPortal  (Integer.parseInt(cortarString2[3]));
	       		direccion.setCodPostal  (Integer.parseInt(cortarString2[4]));
	       		distribuidor.setDireccion(direccion);

	       		Contacto contacto = new Contacto();
	       		cortarString3 = cortarString[3].split(",");
	       		contacto.setNombre (cortarString3[0]);
	       		contacto.setApellido (cortarString3[1]);
	       		contacto.setDni (cortarString3[2]);
	       		contacto.setEmail (cortarString3[3]);
	       		contacto.setTelefono (Integer.parseInt(cortarString3[4]));
	       		distribuidor.setPersonaContacto(contacto);
	       		
	       	
	       		
	       		
	       		distribuidores.add(distribuidor);
	       		

	       		
	       		
	       		salida2 = bf2.readLine();
	        }
	         
	    }catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }
	    	int quehacer = 0;
	    	System.out.println(" \nQue quieres hacer?:" );
	    	System.out.println(" \n 	1) Introducir nuevo producto" );
	    	System.out.println(" \n 	2) Lectura de productos" );
	    	System.out.println(" \n 	3) Ver los Clientes" );
	    	System.out.println(" \n 	4) Crear Cesta" );
	    	quehacer = sc.nextInt();

	    	//----para escribir fichero de productos.txt
	    	FileWriter fw = new FileWriter("/home/zubiri/Proyectosjava/java2_almacencliente/src/productos.txt" , true);
			BufferedWriter bw = new BufferedWriter(fw);

			//definicion de los arraylist (distribuidores lechuga/manzana/leche)
	        		ArrayList<String> distribuman = new ArrayList<String>();
			        ArrayList<String> distribuleche = new ArrayList<String>();
			        ArrayList<String> distribulechu = new ArrayList<String>();

			do{

	        switch (quehacer){



	        	case 1:
		        //-----------------Introducccion de datos de las manzanas------------------

	        		System.out.println("Intruduce la cantidad de tipos de manzana: ");
						int cuantasman=sc.nextInt();
			        
			       	for (int m=0 ; m<cuantasman ; m++){
						Manzana manzana = new Manzana();
						System.out.println("Introduce el tipo de manzana: ");
						manzana.setTipoManzana(sc.next());
						System.out.println("Introduce la procedencia de la manzana: ");
						manzana.setProcedencia(sc.next());
						System.out.println("Introduce el color de la manzana: ");
						manzana.setColor(sc.next());
						System.out.println("Introduce precio/kilo de la manzana: ");
						manzana.setEurosKilo(sc.nextDouble());
						System.out.println("Introduce el numero del codigo de barras de la manzana: ");
						manzana.setCod_barras(sc.nextInt());
						System.out.println("Introduce el nombre del distribuidor de la manzana: ");
						String di = sc.next();
						distribuman.add(di);

						manzanas.add(manzana);
					
					}

					//-----------------Introducccion de datos de la leche------------------

					System.out.println("Intruduce la cantidad de tipos de leche: ");
					int cuantasleche=sc.nextInt();
					
					System.out.println("**************leche************** ");
					for (int l=0 ; l<cuantasleche ; l++){
						Leche leche = new Leche();
						System.out.println("Introduce el tipo de leche: ");
						leche.setTipo(sc.next());
						System.out.println("Introduce la procedencia de la leche: ");
						leche.setProcedencia(sc.next());
						System.out.println("Introduce la euro/litro de leche: ");
						leche.setEurosLitro(sc.nextDouble());
						System.out.println("Introduce el numero del codigo de barras de la leche: ");
						leche.setCod_barras(sc.nextInt());
						System.out.println("Introduce el nombre del distribuidor de la leche: ");
						String di = sc.next();
						distribuleche.add(di);
						leches.add(leche);
					
					}

					//-----------------Introducccion de datos de las lechugas ------------------
					System.out.println("Intruduce la cantidad de tipos de lechugas: ");
					int cuantaslechu=sc.nextInt();
						
						System.out.println("**************lechugas************** ");
					for (int g=0 ; g<=cuantaslechu ; g++){
						Lechuga lechuga = new Lechuga();
						System.out.println("Introduce el tipo de lechuga: ");
						lechuga.setTipoLechuga(sc.next());
						System.out.println("Introduce la procedencia de la lechuga: ");
						lechuga.setProcedencia(sc.next());
						System.out.println("Introduce el color de la lechuga: ");
						lechuga.setColor(sc.next());
						System.out.println("Introduce las precio/unidad de lechuga: ");
						lechuga.setEurosUnidad(sc.nextDouble());
						System.out.println("Introduce el numero del codigo de barras de la lechuga: ");
						lechuga.setCod_barras(sc.nextInt());
						System.out.println("Introduce el nombre del distribuidor de la lechuga: ");
						String di = sc.next();
						distribulechu.add(di);

						lechugas.add(lechuga);
					
					}

					break;
					case 2:

					//---------impresion de los productos-------------
					System.out.println(" \n\n**************manzanas**************" );
					for (int m=0 ; m < manzanas.size(); m++){

						System.out.println(" \n\nTipo de manzana: "+manzanas.get(m).getTipoManzana() );
						bw.write(manzanas.get(m).getTipoManzana() + ",");
			            System.out.println(" \nProcedencia: "+manzanas.get(m).getProcedencia());
			            bw.write(manzanas.get(m).getProcedencia() + ",");
			            System.out.println(" \nColor : "+manzanas.get(m).getColor() );
			            bw.write(manzanas.get(m).getColor() + ",");
			            System.out.println(" \nEuros Kilo: "+manzanas.get(m).getEurosKilo());
			            bw.write(manzanas.get(m).getEurosKilo() + ",");
			            System.out.println(" \nCodigo de barras: "+manzanas.get(m).getCod_barras());
			            bw.write(manzanas.get(m).getCod_barras());

			            bw.close();
			           
				        for(int d=0; d<distribuidores.size(); d++)
			        	{
			        		if (distribuman.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
			            	System.out.println("  -------Distribuidor de la manzana-----------");
			            	
			            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
			            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
			            		//---
			            		System.out.println(" \n 	Direccion:" );
			            		System.out.println(" \n     	Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
			            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
			            		System.out.println("     		Piso: "+ distribuidores.get(d).getDireccion().getPiso());
			            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
			            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
			            		//---
			            		System.out.println(" \n 	Contacto: " );
			            		System.out.println(" \n    		Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
			            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
			            		System.out.println(" \n    		DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
			            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
			            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
			            		}
			        	}
			        }
			        
					
			        	//---------impresion de la leche con sus respectivos distribuidores-------------
			        System.out.println(" \n\n**************Leche**************" );
					for (int m=0 ; m < leches.size(); m++){

						System.out.println(" \n\nTipo de leche: "+leches.get(m).getTipo() );
			            System.out.println(" \nProcedencia: "+leches.get(m).getProcedencia());
			            System.out.println(" \nEuros Litro: "+leches.get(m).getEurosLitro());
			            System.out.println(" \nCofigo de barras: "+leches.get(m).getCod_barras());

			           
				        for(int d=0; d<distribuidores.size(); d++)
			        	{
			        		if (distribuleche.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
			            	System.out.println("  -------Distribuidor de la leche-----------");
			            	
			            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
			            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
			            		//---
			            		System.out.println(" \n 	Direccion:" );
			            		System.out.println(" \n     	Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
			            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
			            		System.out.println(" \n     	Piso: "+ distribuidores.get(d).getDireccion().getPiso());
			            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
			            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
			            		//---
			            		System.out.println(" \n 	Contacto: " );
			            		System.out.println(" \n    		Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
			            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
			            		System.out.println(" \n     	DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
			            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
			            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
			            		}
			        	}	
				    }

					//---------impresion de las lechugas con sus respectivos distribuidores-------------
				    System.out.println(" \n\n**************lechugas**************" );
					for (int lechu=0 ; lechu < lechugas.size(); lechu++){

						System.out.println(" \n\nTipo de lechuga: "+lechugas.get(lechu).getTipoLechuga() );
			            System.out.println(" \nProcedencia: "+lechugas.get(lechu).getProcedencia());
			            System.out.println(" \nColor : "+lechugas.get(lechu).getColor() );
			            System.out.println(" \nEuros Unidad: "+lechugas.get(lechu).getEurosUniad());
			            System.out.println(" \nCodigo de barras: "+lechugas.get(lechu).getCod_barras());

			           
				        for(int d=0; d<distribuidores.size(); d++)
			        	{
			        		if (distribulechu.get(lechu).equalsIgnoreCase(distribuidores.get(d).getNombre())){
			            	System.out.println("  -------Distribuidor de la lechuga-----------");
			            	
			            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
			            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
			            		//---
			            		System.out.println(" \n 	Direccion:" );
			            		System.out.println(" \n    		Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
			            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
			            		System.out.println(" \n     	Piso: "+ distribuidores.get(d).getDireccion().getPiso());
			            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
			            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
			            		//---
			            		System.out.println(" \n 	Contacto: " );
			            		System.out.println(" \n     	Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
			            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
			            		System.out.println(" \n     	DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
			            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
			            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
			            		}
			        	}
			        }

			     System.out.println(" \nQue quieres hacer?:" );
		    System.out.println(" \n 	1) Introducir nuevo producto" );
	    	System.out.println(" \n 	2) Lectura de productos" );
	    	System.out.println(" \n 	3) Ver los Clientes" );
	    	System.out.println(" \n 	4) Crear Cesta" );
		    	quehacer = sc.nextInt();




			     break;
		    
	    

			    //-----------------clientes-------------------------------------------------------------------------------

			    //--lectura de fichero de clientes
			    case 3:
			    	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

				    try{
						String ruta2 = "./clientes.txt";
			 			File archivo3 = new File(ruta2);
						FileReader leer3 = new FileReader (archivo3);
						BufferedReader bf3 = new BufferedReader(leer3);
						String salida3 = bf3.readLine();

						

				       
				        while(salida3!=null){
				        	//separa el string de la  linea usara el ; como referencia de la separacion
				        	String [] cortarString4 = salida3.split("#");
				         	

				       		Cliente cliente = new Cliente();
				       		String [] cortarString5 = cortarString4[0].split(",");
				       		cliente.setNombre (cortarString5[0]);
				       		cliente.setApellidos (cortarString5[1]);
				       		cliente.setDNI (cortarString5[2]);
				       		cliente.setNum_socio (Double.parseDouble(cortarString5[3]));
				       		cliente.setDto (Double.parseDouble(cortarString5[4]));
				       		
				       		
				       		Direccion direccionc = new Direccion();
				       		String [] cortarString6 = cortarString4[1].split(",");
				       		direccionc.setCiudad  (cortarString6[0]);
				       		direccionc.setCalle  (cortarString6[1]);
				       		direccionc.setPiso  (cortarString6[2]);
				       		direccionc.setPortal  (Integer.parseInt(cortarString6[3]));
				       		direccionc.setCodPostal  (Integer.parseInt(cortarString6[4]));
				       		cliente.setDireccion(direccionc);
				       		
				       		
				       		clientes.add(cliente);
				       		

				       		
				       		
				       		salida3 = bf3.readLine();
				        }
				    }catch(Exception ioe){
				    	System.out.println("Error: "+ioe);
				    }
				


		  			//---------------Impresion de la lista de clientes-----------------
		    		for (int cli=0 ; cli < clientes.size(); cli++){

						System.out.println(" \n\nNombre: "+clientes.get(cli).getNombre() );
			            System.out.println(" \nApellido: "+clientes.get(cli).getApellidos());
			            System.out.println(" \nDNI : "+clientes.get(cli).getDNI() );
			            System.out.println(" \nNumero de socio: "+clientes.get(cli).getNum_socio());
			            System.out.println(" \nDescuento "+clientes.get(cli).getDto());
			    	}

			    System.out.println(" \nQue quieres hacer?:" );
		    	System.out.println(" \n 	1) Introducir nuevo producto" );
		    	System.out.println(" \n 	2) Lectura de productos" );
		    	System.out.println(" \n 	3) Ver los Clientes" );
		    	System.out.println(" \n 	4) Crear Cesta" );
		    	quehacer = sc.nextInt();



				break;
	
				case 4:
	    			//-----------------cesta---------------------------
	    			
	    			Double condescuento = 0.0;
	    			Double descuento1 = 0.0;
	    			Double totala = 0.0;



				   	System.out.println("************Cesta*********** ");	   
				   	System.out.println("Introduce el codigo del cliente:");
				   		int numcli = sc.nextInt();

				   			try{
				   				//para buscar el cliente
									String ruta4 = "./clientes.txt";
						 			File archivo4 = new File(ruta4);
									FileReader leer4 = new FileReader (archivo4);
									BufferedReader bf4 = new BufferedReader(leer4);
									String salida4 = bf4.readLine();

									
							       
							        while(salida4!=null){
							        	//separa el string de la  linea usara el ; como referencia de la separacion
							        	
							        	String [] cortarString4 = salida4.split("#");
							         	Cliente cliente = new Cliente();
							       		String [] cortarString5 = cortarString4[0].split(",");
							       		cliente.setNombre (cortarString5[0]);
							       		cliente.setApellidos (cortarString5[1]);
							       		cliente.setDNI (cortarString5[2]);
							       		cliente.setNum_socio (Double.parseDouble(cortarString5[3]));
							       		cliente.setDto (Double.parseDouble(cortarString5[4]));
							       		
							       		Double nc =Double.parseDouble(cortarString5[3]);
							       		if (numcli == nc){
							       			descuento1= Double.parseDouble(cortarString5[4]);
							       		}
							       		
							       		salida4 = bf4.readLine();
							        }
							    }catch(Exception ioe){
							    	System.out.println("Error: "+ioe);
							    }

					System.out.println(" \ncuantos productos quieres añadira a la cesta? ");
		    		int cuan = sc.nextInt();


				    for  (int ces=0 ; ces < cuan ; ces++){

					   	System.out.println("Introduce el codigo de barras del producto que quieras añadir a la cesta:");
					   		int codigo=sc.nextInt();




					   		//para recorrer manzanas
							for (int manz=0 ; manz < manzanas.size(); manz++){
					   				
					   				if  (codigo == manzanas.get(manz).getCod_barras()){
					   				Cesta cesta = new Cesta();
					   				cesta.setNombreproducto(manzanas.get(manz).getTipoManzana());
					   				cesta.setPrecioku(manzanas.get(manz).getEurosKilo());

					   				System.out.println("Cuantas manzanas: ");
					   				Double cuantas = sc.nextDouble();

					   				Double precio = cuantas * manzanas.get(manz).getEurosKilo();
					   				cesta.setPreciototalp(precio);
					   				condescuento = (1-descuento1) * precio;
					   				cesta.setDescuento(condescuento); 

					   				cestas.add(cesta);
					   				
					   				}
					   				
						
							}
					//para recorrer leches
							for (int lech=0 ; lech < leches.size(); lech++){
					   				
					   				if  (codigo == leches.get(lech).getCod_barras()){
					   				Cesta cesta = new Cesta();
					   				cesta.setNombreproducto(leches.get(lech).getTipo());
					   				cesta.setPrecioku(leches.get(lech).getEurosLitro());

					   				System.out.println("Cuantas leches: ");
					   				Double cuantas = sc.nextDouble();

					   				Double precio = cuantas * leches.get(lech).getEurosLitro();
					   				cesta.setPreciototalp(precio);
					   				condescuento = (1-descuento1) * precio;
					   				cesta.setDescuento(condescuento); 

					   				cestas.add(cesta);
					   				
					   				}
					   				
						
							}

					   		//para recorrer el array de lechugas
					   		for (int lechu=0 ; lechu < lechugas.size(); lechu++){
					   				
					   				if  (codigo == lechugas.get(lechu).getCod_barras()){
					   				Cesta cesta = new Cesta();
					   				cesta.setNombreproducto(lechugas.get(lechu).getTipoLechuga());
					   				cesta.setPrecioku(lechugas.get(lechu).getEurosUniad());

					   				System.out.println("Cuantas lechugas: ");
					   				Double cuantas = sc.nextDouble();

					   				Double precio = cuantas * lechugas.get(lechu).getEurosUniad();
					   				cesta.setPreciototalp(precio);
					   				condescuento = (1-descuento1) * precio;
					   				cesta.setDescuento(condescuento); 

					   				cestas.add(cesta);
					   				
					   				}
					   				
						
							}
							

							System.out.println(cestas.get(ces).getPreciototalp());
					   		System.out.println(condescuento);
	   				}

	   				for (int cest=0 ; cest < cestas.size(); cest++){
	   					System.out.println(" \nNombre del producto: "+cestas.get(cest).getNombreproducto() );
	   					System.out.println(" \nPrecio unidad/kilo: "+cestas.get(cest).getPrecioku() );
	   					System.out.println(" \nPrecio sin descuento: "+cestas.get(cest).getPreciototalp() );



	   					totala = totala + cestas.get(cest).getDescuento();
	   				

	   				}

	   			System.out.println(" Este es el valor de la compra con descuento "+totala );	


		   		System.out.println(" \nQue quieres hacer?:" );
		    	System.out.println(" \n 	1) Introducir nuevo producto" );
		    	System.out.println(" \n 	2) Lectura de productos" );
		    	System.out.println(" \n 	3) Ver los Clientes" );
		    	System.out.println(" \n 	4) Crear Cesta" );
		    	quehacer = sc.nextInt();



	   			break;
	   		}

	   		
	   	}while (quehacer != 4);
	   	
	}
}
	   	




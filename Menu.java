			import java.util.Scanner;

			public class Menu{

				int opc = 0;
				Scanner leer = new Scanner(System.in); 

				Charizard cz = new Charizard();
				Squirtle sq = new Squirtle();
				Bulbasur bs = new Bulbasur();
				Pikachu pk = new Pikachu();
				Gurdur gd = new Gurdur();
				Randal vd = new Randal();
				Randal at = new Randal();
				Stado st = new Stado();
				Umbreon ub = new Umbreon();
				int contadorBata;
				int contadorj1;
				int contadorj2;
				int contador = 0; 



				public void menuPokemons(){
					int contadorcz = 0;
					int contadorsq = 0;
					int contadorbs = 0;
					int contadorpk = 0;
					int contadorgd = 0 ;
					int contadorub = 0;
					String j1;
					String j2;
							
					int a;
					int b;
					int c;
					int d;
					do{
						System.out.println("----------Que quieres realizar hoy Mr---------");
						System.out.println("--     1. Ver Lista de pokemones            --");
						System.out.println("--     2. Ver  Registro de partidas         --");
						System.out.println("--     3. Batallar                          --");
						System.out.println("--     4. Ver Estadisticas de pokemones     --");
						System.out.println("--     5. Salir                             --");
						System.out.println("QUe opcion desea realizar");
						opc = leer.nextInt();
					 
						


						switch(opc){
						case 1:

							System.out.println("Los pokemones disponibles son:");

							cz.charizard();
							st.estado();
							

							
							sq.squirtle();
							st.estado();
							
							

							bs.bulbasur();
							st.estado();
							

							pk.pikachu();
							st.estado();
							


							gd.gurdur();
							st.estado();

							ub.umbreon();
							st.estado();
							
						break;
						case 2:
							System.out.println(" Han realizado una cantidad de " + contadorBata +  " Batallas");
							System.out.println(" EL J1 ha ganado " +contadorj1 );
							System.out.println(" El j2 ha ganado " +contadorj2 );
						break;
						case 3:
							leer.nextLine();

							System.out.println("cual es tu nombre jugador 1 "); 
							j1 = leer.nextLine();

							System.out.println("cual es tu nombre jugador 2 ");
							j2 = leer.nextLine();

								System.out.println("------Seleccione un perosnaje------" );
								System.out.println("1. Charizard");
								System.out.println("2. Squirle ");
								System.out.println("3. Bulbasur");
								System.out.println("4. Pikachu");
								System.out.println("5. Gurdur");
								System.out.println("6. Umbreon");
								System.out.println("Que personaje desea " +j1);
								a = leer.nextInt();

						switch(a){
						case 1:

							cz.charizard();
								at.ataque();
								vd.vida();
								st.estado();
								contadorcz ++;
						break;
						case 2:
							sq.squirtle();
							at.ataque();
							vd.vida();
							st.estado();
							contadorsq ++;
						break;
						case 3:
							bs.bulbasur();
							at.ataque();
							vd.vida();
							st.estado();
							contadorbs ++;
						break;
						case 4:
							pk.pikachu();
							at.ataque();
							vd.vida();
							st.estado();
							contadorpk ++;

						break;
						case 5:
							gd.gurdur();
							at.ataque();
							vd.vida();
							st.estado();
							contadorgd ++;

						break;
						case 6:
							ub.umbreon();
							at.ataque();
							vd.vida();
							st.estado();
							contadorub ++;		

						break;
						default:
							System.out.println("Escoga Una opcion valida");
					}

					System.out.println("Elige un segundo Personaje " +j1);
					b = leer.nextInt();

							switch(b){
							case 1:

								cz.charizard();
								at.ataque();
								vd.vida();
								st.estado();
								contadorcz ++;
								
							break;
							case 2:
								sq.squirtle();
								at.ataque();
								vd.vida();
								st.estado();
								contadorsq ++;

							break;
							case 3:
								bs.bulbasur();
								at.ataque();
								vd.vida();
								st.estado();
								contadorbs ++;

							break;
							case 4:
								pk.pikachu();
								at.ataque();
								vd.vida();
								st.estado();
								contadorpk ++;

							break;
							case 5:
								gd.gurdur();
								at.ataque();
								vd.vida();
								st.estado();
								contadorgd ++;
							break;
							case 6:
								ub.umbreon();
								at.ataque();
								vd.vida();
								st.estado();
								contadorub ++;

							break;
							default:
								System.out.println("Una opcion valida");

								}
					 

					System.out.println("------Seleccione un perosnaje------ " +j2 );
								System.out.println("1. Charizard");
								System.out.println("2. Squirle ");
								System.out.println("3. Bulbasur");
								System.out.println("4. Pikachu");
								System.out.println("5. Gurdur");
								System.out.println("6. Salir");
								System.out.println("Que personaje desea " +j2);
								c = leer.nextInt();

						switch(c){
							case 1:

								cz.charizard();
								at.ataque();
								vd.vida();
								st.estado();
								contadorcz ++;
								
							break;
							case 2:
								sq.squirtle();
								at.ataque();
								vd.vida();
								st.estado();
								contadorsq ++;

							break;
							case 3:
								bs.bulbasur();
								at.ataque();
								vd.vida();
								st.estado();
								contadorbs ++;

							break;
							case 4:
								pk.pikachu();
								at.ataque();
								vd.vida();
								st.estado();
								contadorpk ++;

							break;
							case 5:
								gd.gurdur();
								at.ataque();
								vd.vida();
							    st.estado();
							   	contadorgd ++;

							break;
							case 6:
								ub.umbreon();
								at.ataque();
								vd.vida();
								st.estado();
								contadorub ++;

								break;
							default:
								System.out.println("Escoga Una opcion valida");
						}

						System.out.println("Elige un segundo Personaje " +j2);
						d = leer.nextInt();

								switch(d){
								case 1:

									cz.charizard();
									at.ataque();
									vd.vida();
									st.estado();
									contadorcz ++;
								
								break;
								case 2:
									sq.squirtle();
									at.ataque();
									vd.vida();
									st.estado();
									contadorsq ++;
								
								break;
								case 3:
									bs.bulbasur();
									at.ataque();
									vd.vida();
									st.estado();
									contadorbs ++;
										
								break;
								case 4:
									pk.pikachu();
									at.ataque();
									vd.vida();
									st.estado();
									contadorpk ++;
									
								break;
								case 5:
									gd.gurdur();
									at.ataque();
									vd.vida();
									st.estado();
									contadorgd ++;
								break;
								case 6:
									ub.umbreon();
									at.ataque();
									vd.vida();
									st.estado();
									contadorub ++;
									
								break;
								default:
									System.out.println("Una opcion valida");
								}
							contadorBata++;
								do {
							System.out.println("Los resultados de la primera batalla son:");
							
							System.out.println("vida del j2 " + (c-a));
							c -= a ;
							System.out.println("vida del j1 " + (a-c));
							a -=c;
							if (c <= 0){
								System.out.println(" El ganador es " +j1); 
								 contadorj1 ++;
								break;

							} else if (a <= 0){
								System.out.println(" El ganador es " +j2); 
								contadorj2 ++;
								break; 
							

							} else {
							}




						}while ( a >= 0 | c >= 0); 

						contadorBata++;
						do {
							System.out.println("Los resultados de la segunda batalla son:");
							
							System.out.println("vida del j2 " + (d-b));
							d -= b ;
							System.out.println("vida del j1 " + (b-d));
							b -=d;
							if (d <= 0){
								System.out.println(" El ganador es " +j1); 
								 contadorj1 ++;
								break;

							} else if (b <= 0){
								System.out.println(" El ganador es " +j2); 
								contadorj2 ++;
								break; 
							

							} else {
							}


						}while ( a >= 0 | c >= 0); 


						break;
						case 4:
							cz.charizard();
							System.out.println("Charizard se ha utilizado " + contadorcz + " veces");

							sq.squirtle();
							System.out.println("Squirtle se ha utilizado " + contadorsq + " veces");

							bs.bulbasur();
							System.out.println("Bulbasur se ha utilizado " +contadorbs + " veces");

							pk.pikachu();
							System.out.println("Pikachu se ha utilizado " +contadorpk + " veces");

							gd.gurdur();
							System.out.println("Gurdur se ha utilizado " +contadorgd + " veces");

							ub.umbreon();
							System.out.println("Umbreon se ha utilizado " +contadorub + " veces");

						break;
						case 5:
							System.out.println("Saliendo...");
						break;
						default:
							System.out.println("Una opcion valida");
						
							}	
					} while(opc !=5);

		}
	}
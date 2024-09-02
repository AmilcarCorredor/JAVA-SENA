package app;

import java.util.Scanner;

public class Ejercicios_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //Ejercicio 1
//        System.out.println("Ingrese su edad");
//        int edad = sc.nextInt();
//        
//        System.out.println("Digite su ingreso anual $");
//        int ingresoAnual = sc.nextInt();
//        
//        System.out.println("Ingrese su puntiacion crediticia");
//        int puntuacionCrediticia = sc.nextInt();
//        
//        if(edad>25 && ingresoAnual>50000000 && puntuacionCrediticia>700){
//            System.out.println("Es elegible para un prestamo hipotecario");
//        }
//        else{
//            System.out.println("No es elegible para un prestamo hipotecario");
//        }
//Ejercicio 2
//          System.out.println("Ingrese medio de transporte coche/autobus/avion");
//          String trasnporte = sc.nextLine();
//          
//          System.out.println("Digite el numero de pasajeros");
//          int pasajeros = sc.nextInt();
//          int costo = 0;
//          double descuento = 0;
//          double total= 0;
//          
//        if (trasnporte.equals("coche")) {
//            costo = 1500*500;
//              if (pasajeros>3) {
//                  descuento = costo*0.1;
//                  total = costo-descuento;
//                  System.out.println("Costo total con descuento es de: " + total);
//              }
//              else{
//                  System.out.println("Costo total sin descuento es de: " + costo); 
//              } 
//        }
//        else if (trasnporte.equals("autobus")) {
//            costo = 900*500;
//              if (pasajeros>3) {
//                  descuento = costo*0.1;
//                  total = costo-descuento;
//                  System.out.println("Costo total con descuento es de: " + total);
//              }
//               else{
//                  System.out.println("Costo total sin descuento es de: " + costo); 
//              } 
//        }
//        else if (trasnporte.equals("avion")) {
//            costo = 3000*500;
//              if (pasajeros>3) {
//                  descuento = costo*0.1;
//                  total = costo-descuento;
//                  System.out.println("Costo total con descuento es de: " + total);
//              }
//               else{
//                  System.out.println("Costo total sin descuento es de: " + costo); 
//              } 
//        }
//        else{
//            System.out.println("Vehiculo no regitrado");
//        }
//Ejercicio 3
//           System.out.println("Ingrese su promedio:");
//           int promedio = sc.nextInt();
//           
//           System.out.println("Ingrese el numero de participacion en actividades extracurriculares:");
//           int participacion = sc.nextInt();
//           
//           System.out.println("¿Cual son sus ingresos financieros familiares?:");
//           int necesidad = sc.nextInt();
//           
//           if (promedio>= 85 && participacion>=3 && necesidad<3000000) {
//               System.out.println("Es elegible para una beca"); 
//            }
//           else{
//               System.out.println("No es elegible para una beca"); 
//           }
//Ejercicio 4
//            System.out.println("Ingrese su rol (visitante/registrado/admin)");
//            String rol = sc.nextLine();
//            
//            if (rol.equals("visitante")) {
//                System.out.println("Usuario visitante (sin inicio de sesión)");
//            }
//            else if (rol.equals("registrado")) {
//                System.out.println("Usuario registrado (con inicio de sesión)");
//            }
//            else if (rol.equals("admin")) {
//                System.out.println("Usuario Administrador");
//            }
//Ejercicio 5
//            System.out.println("Ingrese el capital disponible");
//            int capital = sc.nextInt();
//            
//            System.out.println("Ingrese la tasa de retorno esperada en porcentaje %");
//            int retorno = sc.nextInt();
//            
//            System.out.println("Ingrese los riesgos asociados en porcentaje %");
//            int riesgos = sc.nextInt();
//            
//            if (capital>100000000 && retorno>=10 && riesgos<20) {
//                System.out.println("Esta inversion es viable"); 
//        }
//            else{
//                System.out.println("Esta inversion no es viable"); 
//            }
//Ejercicio 6
//             int salarioBruto = 4000000;
//             double descuento = salarioBruto*0.25;
//             double salarioNeto = (salarioBruto-descuento)-200000;
//             
//             System.out.println("El salario neto despues de deducir el 20% en impuestos y 5% en seguridad social y $200.000 COP en otros "
//                     + "cuentos es de: " + "$" + salarioNeto + "COP");    
//Ejercicio 7
//                System.out.println("Ingrese el tipo de urgencia(critica/alta/baja)");
//                String urgencia = sc.nextLine();
//                
//                System.out.println("Ingrese el tipo de impacto(alto/medio/bajo)");
//                String impacto = sc.nextLine();
//                
//                if (urgencia.equals("critica")){
//                    if (impacto.equals("alto")|| impacto.equals("medio")) {
//                        System.out.println("Se le asigna prioridad alta");
//                    }
//                    else{
//                        System.out.println("Se le asigna prioridad media");
//                    }
//                    
//                }
//                else if (urgencia.equals("alta")) {
//                    if (impacto.equals("alto")|| impacto.equals("medio")) {
//                        System.out.println("Se le asigna prioridad alta");
//                    }
//                    else{
//                        System.out.println("Se le asigna prioridad baja");
//                    }
//                }
//                   else if (urgencia.equals("baja")) {
//                    if (impacto.equals("medio")|| impacto.equals("bajo")) {
//                        System.out.println("Se le asigna prioridad baja");
//                    }
//                    else{
//                        System.out.println("Se le asigna prioridad media");
//                    }
//                }
//                   else{
//                       System.out.println("Ticket de soporte no encontrado");
//                   }
//Ejercicio 8
//                    System.out.println("Ingrese su edad: ");
//                    int edad = sc.nextInt();
//                    
//                    System.out.println("¿Cuenta con enfermedades cronicas?: (si/no)");
//                    String enfermedades = sc.next();
//                    
//                    System.out.println("¿Usted fuma? (si/no)");
//                    String fumador = sc.next();
//                    
//                    if (edad > 24 && enfermedades.equals("no") && fumador.equals("no")) {
//                        System.out.println("Es elegible para un seguro de salud premium");
//        }
//                    else{
//                        System.out.println("No es elegible para un seguro de salud premium");
//                    }
//Ejercicio 10
//                    System.out.println("Eliga la propiedad que desea averiguar los impuestos: (residencial/comercial)");
//                    String propiedad = sc.next();
//                    
//                    int recidencial = 250000000;
//                    int comercial = 500000000;
//                    
//                    if (propiedad.equals("recidencial")) {
//                        double impuesto1 = recidencial*1.2;
//                        System.out.println("La tarifa de impuestos de una propiedad recidencial son de: " + impuesto1);
//        }
//                    else{
//                        double impuesto2 = comercial*2;
//                        System.out.println("La tarifa de impuestos de una propiedad comercial son de: " + impuesto2);
//                    }
//Ejercicio 11
//                    System.out.println("Ingrese las toneladas de CO2 que genera el proyecto: ");
//                    int co2 = sc.nextInt();
//                    
//                    System.out.println("Ingrese la cantidad de agua en el uso del proyecto: ");
//                    int agua = sc.nextInt();
//                    
//                    System.out.println("Ingrese las toneladas de residuos solidos que genera el proyecto: ");
//                    int residuos = sc.nextInt();
//                    
//                    String estandares = (co2<=100 && agua<=40000 && residuos<=150) ? "Cumple con los estandares de ambientales":
//                                     "NO cumple con los estandares de ambientales";
//                    System.out.println(estandares);
//Ejercicio 12
//                    System.out.println("Los años de servicio: ");
//                    int servicio = sc.nextInt();
//                    
//                    System.out.println("¿Cual es su salario promedio?: ");
//                    int salario = sc.nextInt();
//                    
//                    double pension = (salario*74)/12;
//                    
//                    System.out.println("Su pension es de: " + pension);
//Ejercicio 13
//                    System.out.println("Ingrese la cantidad de su inversion: ");
//                    int inversion = sc.nextInt();
//                    
//                    System.out.println("Ingrese en porcentaje de votalidad de su inversion: ");
//                    int volatilidad = sc.nextInt();
//                    
//                    String rentabilidad = (volatilidad<5) ? "Su inversion tiene nivel bajo de votalidad":
//                                          (volatilidad>5 && volatilidad<15)? "Su inversion tiene nivel medio de votalidad" : "Su inversion tiene alto riesgo de volatilidad"; 
//                                          
//                    System.out.println(rentabilidad);
//Ejercicio 14
//                    System.out.println("Ingrese el numero de pisos: ");
//                    int pisos =sc.nextInt();
//                    
//                    System.out.println("¿Los materiales son resistentes al fuego? (si/no): ");
//                    String fuego = sc.next();
//                    
//                    System.out.println("¿Cual es la magnitud de terremotos que soporta?: ");
//                    int magnitud = sc.nextInt();
//                    
//                    String verificacion = (fuego.equals("si") && magnitud>6)? "Cumple con las normativas locales" :
//                                                                              "No cumple con las normativas locales";
//                    System.out.println(verificacion);
//Ejercicio 15
//                    System.out.println("¿Desea el paquete de servicios de internet? (si/no))");
//                    String internet = sc.next();
//                    
//                    System.out.println("¿Desea el paquete de servicios de cable? (si/no))");
//                    String cable = sc.next();
//                    
//                    System.out.println("¿Desea el paquete de servicios de telefono? (si/no))");
//                    String telefono = sc.next();
//                    
//                    int precioNet = 150000;
//                    int precioCable = 120000;
//                    int precioTelefono = 90000;
//                    double precioTotal = precioNet+precioCable+precioTelefono;
//                    double precioTotalDescuento= (precioNet+precioCable+precioTelefono)*0.85;
//                    
//                    String precio = (internet.equals("si") && cable.equals("si") && telefono.equals("si")) ? "Su costo total es igual a: " + precioTotalDescuento + " con descuento":
//                                                                                                             "Su costo total es igual a: " + precioTotal + "sin descuento";   
//                    System.out.println(precio); 
//Ejercicio 16
//                    System.out.println("¿Tiene un historial de adopcion positivo? (si/no)");
//                    String historial = sc.next();
//                    
//                    System.out.println("¿Cual es su enterno domestico?: (interior/exterior)");
//                    String entorno = sc.next();
//                    
//                    System.out.println("Ingrese su salario mensual: ");
//                    int salario = sc.nextInt();
//                    
//                    String evaluacion = (historial.equals("si") && entorno.equals("exterior") && salario>1200000)?"Es elegible para adoptar una mascota": 
//                                                                                                                   "No es elegible para adoptar una mascota";
//                    System.out.println(evaluacion);
////Ejercicio 17      
//                    System.out.println("¿Cual producto desea calcularle los impuestos?: (producto1/producto2)");
//                    String producto = sc.next();
//                    
//                    int producto1 = 1000000;
//                    int producto2= 10000000;
//                    double impuesto1 = producto1*0.05+producto1;
//                    double impuesto2 = producto2*0.15+producto2;
//                    
//                    String Producto = (producto.equals("producto1"))? "Los impuestos del producto1 son: " + impuesto1:
//                                                                      "Los impuestos del producto1 son: " + impuesto2;
//                    System.out.println(Producto);
//Ejercicio 18
                    
                    
    }   
    
}

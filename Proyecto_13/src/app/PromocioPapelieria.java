package app;

import java.util.Scanner;

public class PromocioPapelieria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = {"Enero", "Febrero",  "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septimbre", "Octubre", "Novimebre", "Diciembre"};
        String[] nombresArticulos = {"Lapices","Cuadernos","Borradores","Reglas" };
       
        int [][] juegos = {
                             {2,3,1,2},
                             {6,4,2,1},
                          };
        int [][] ventas = new int[12][2];
       
        double[][] precios = new double[4][12];
       
        for (int mes = 0; mes < 12; mes++) {
            System.out.println("Digite las vaentas del mes de " + meses[mes] + ": ");
            System.out.println("Promocion 1 vendidios: ");
            ventas[mes][0] = sc.nextInt();
            System.out.println("Promocion 2 vendidios: ");
            ventas[mes][1] = sc.nextInt();
           
            System.out.println("Digite los precios de los productos el el mes de " + meses[mes] + ": ");
            for (int articulo = 0; articulo < 4; articulo++) {
                System.out.println("Precio por " + nombresArticulos[articulo] + ": ");
                precios[articulo][mes] = sc.nextDouble();
            }
        }
        //Calculo de articulos vedidos por mes, total anual
        int [][] articulosVendidosMensuales = new int [4][12];//Articulos vendidos en 12 meses
        int[] articulosVendidosAnuales = new int[4];//total anual articulos
       
        System.out.println("\nNumero de articulos vendidos en c/mes: ");
        for (int mes = 0; mes < 12; mes++) {
            System.out.println("\nMes: " + meses[mes]);
            for (int articulo = 0; articulo < 4; articulo++) {
                articulosVendidosMensuales[articulo][mes] = juegos[0][articulo] * ventas[mes][0] + juegos[1][articulo] * ventas[mes][1];
                articulosVendidosAnuales[articulo] += articulosVendidosMensuales[articulo][mes];
                System.out.println(nombresArticulos[articulo] + "vendidos: " + articulosVendidosMensuales[articulo][mes]);
            }
           
        // Calculo total de ventas por articulo/mes y total anual
        double[][] ventasPorArticulo = new double[4][12];
        double[] totalVentasMensuales = new double[12];
        double[] totalVentasAnualesPorArticulo = new double[4];
        double totalVentasAnual = 0.0;
       
        System.out.println("\nTotal de ventas por articulo y mes: ");
            for (mes = 0; mes < 12; mes++) {
                System.out.println("\nMes: " + meses[mes]);
                for (int articulo = 0; articulo < 4; articulo++) {
                    ventasPorArticulo[articulo][mes] = articulosVendidosMensuales[articulo][mes] * precios[articulo][mes];
                    totalVentasMensuales[mes] += ventasPorArticulo[articulo][mes];
                    totalVentasAnualesPorArticulo[articulo] += ventasPorArticulo[articulo][mes];
                    System.out.println("Ventas de " + nombresArticulos[articulo] + ": $" + ventasPorArticulo[articulo][mes]);                  
                }
                System.out.println("Total ventas en " + meses[mes] + ": $" + totalVentasMensuales[mes]);
                totalVentasAnual += totalVentasMensuales[mes];
            }
            //Mostrar el total de ventas por articulo y el total general anual
            System.out.println("\nTotal anual de ventas por articulo");
            for (int articulo = 0; articulo < 4; articulo++) {
                System.out.println(nombresArticulos[articulo] + ": $" + totalVentasAnualesPorArticulo[articulo]);
            }
            System.out.println("\nTotal ventas anual: $" + totalVentasAnual);
        }      
    }
}


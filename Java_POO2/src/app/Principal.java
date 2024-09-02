
package app;

public class Principal {
    public static void main(String[] args) {
        //Ejercicio26
//      inversion objInversion = new inversion("2461533", "Claudia Lopez",  1000000, 5.0);
//        System.out.println(objInversion);
        //Ejercicio27
//        productoAlmacen objproductoAlmacen1 = new productoAlmacen("875563", "Cuaderno", 125, 5800);
//        productoAlmacen objproductoAlmacen2 = new productoAlmacen("875545", "Libro", 75, 35000);
//        System.out.println(objproductoAlmacen1);
//        System.out.println(objproductoAlmacen2);
        //Ejercicio28
//        pago objPago1 = new pago("12345", "Laura Balaguera", 1650000, 150000, 35000);
//        pago objPago2 = new pago("54321", "Fernanda Cristancho", 2550000, 320000, 150000);
//        
//        System.out.println(objPago1);
//        System.out.println(objPago2);
        //Ejercicio29
//        servicio objServicio1 = new servicio("4597866", "Profesor prescolar", 5200, 9);
//        servicio objServicio2 = new servicio("4457456", "Plomero", 6800, 12);
//        System.out.println(objServicio1);
//        System.out.println(objServicio2);
        //Ejercicio30
//        compra objCompra1 = new compra("001", "Inversiones Lummys", 250, 35000);
//        compra objCompra2 = new compra("002", "Inversiones Lummys", 50, 5000);
//        compra objCompra3 = new compra("003", "Inversiones Lummys", 30, 1500);
//        System.out.println(objCompra1);
//        System.out.println(objCompra2);
//        System.out.println(objCompra3);
//      //Ejercicio31
//        Empleado objEmpleado1 = new Empleado("Renold Sapos", 1200000);
//        Empleado objEmpleado2 = new Empleado("Karla Stiven", 2200000);
//        objEmpleado1.mostrarInformacion();
//        System.out.println("");
//        objEmpleado2.mostrarInformacion();
        //Ejercicio32
//        producto objProducto = new producto("54789", "Shampoo", 15000, 5);
//        objProducto.mtdMostrarDescuento();
        //Ejercicio33
//        cliente objCliente1 = new cliente("Carlos Fernandez", "CLL22 N33 42", "320558416");
//        cliente objCliente2 = new cliente("Estefania Gutierrez", "Margarita Suarez", "311546835");
//        objCliente1.mtdMostarInfo();
//        System.out.println("");
//        objCliente2.mtdMostarInfo();
        //Ejercicio34
//        factura objFactura1 = new factura("7895464","Gustavo Freeman", 36500);
//        objFactura1.mtdMostrarFactura();
        //Ejercicio35
//        pedido objPedido1 = new pedido("8521546", "Julian Gonzalez", 25, 1500);
//        pedido objPedido2 = new pedido("7564546", "Marcela Perez", 5, 15000);
//        objPedido1.mtdMostarPedido();
//        System.out.println("");
//        objPedido2.mtdMostarPedido();
        //Ejercicio36
//        inventario objInventario1 = new inventario("0012", 8, 1800);
//        inventario objInventario2 = new inventario("0013", 4, 24000);
//        objInventario1.mtdMostrarInventario();
//        System.out.println("");
//        objInventario2.mtdMostrarInventario(); 
        //Ejercicio37
//        proveedor objProveedor = new proveedor("Julio Cesar", "Bavaria", "32054862");
//        objProveedor.mtdMostrarProveedor();   
        //Ejercicio38
//        Compra compra1 = new Compra("4568498", "Umbrella", 5,12000 );
//        Compra compra2 = new Compra("4568499", "Industrias Corp", 2,35500);
//        compra1.mtdMostarCompra();
//        System.out.println("");
//        compra2.mtdMostarCompra();
        //Ejercicio39
//        venta objVenta1 = new venta("Aromatizante para carro", 2, 12500);
//        venta objVenta2 = new venta("Neunaticos para carro", 4, 120000);
//        objVenta1.mtdMostrarVenta();
//        System.out.println("");
//        objVenta2.mtdMostrarVenta();
        //Ejercicio40
//        Servicio objServicio1 = new Servicio("001", "Lavado de automovil", 8200, 5);
//        objServicio1.mtdMostrarCosto();
        //Ejercicio41
//        gerente objGerente1 = new gerente ("Francisco de paula", 200000,1000000);
//        System.out.println(objGerente1);
        //Ejercicio42
        productoPerecedero objProducto1 = new productoPerecedero("001", "Cigarrillos", 100, "01/02/2026", 5);
        System.out.println(objProducto1);
    }
}
//Ejercicio26
class inversion{
    public String codigoInver;
    public String inversor;
    public int montoInicial;
    public double tasaInteres;
    public double interesGenerado;

    public inversion(String codigoInver, String inversor, int montoInicial, double tasaInteres) {
        this.codigoInver = codigoInver;
        this.inversor = inversor;
        this.montoInicial = montoInicial;
        this.tasaInteres = tasaInteres;
        this.interesGenerado = (montoInicial*tasaInteres)/100;
    }

    public String getCodigoInver() {
        return codigoInver;
    }

    public void setCodigoInver(String codigoInver) {
        this.codigoInver = codigoInver;
    }

    public String getInversor() {
        return inversor;
    }

    public void setInversor(String inversor) {
        this.inversor = inversor;
    }

    public int getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(int montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getInteresGenerado() {
        return interesGenerado;
    }

    public void setInteresGenerado(double interesGenerado) {
        this.interesGenerado = interesGenerado;
    }
         @Override
         public String toString() {
             return "Codigo de inversion: " + codigoInver + "\n" +
               "Inversor: " + inversor + "\n" +
               "Monto inicial: " + montoInicial + "\n" +
               "Tasa de interes anual: " + tasaInteres + "\n" +
               "Interes generado: " + interesGenerado + "\n";
         }   
}
//Ejercicio 27
class productoAlmacen{
    public String codigoProduct;
    public String nombreProduct;
    public int cantidadAlmacen;
    public int precioUnidad;
    public int valorTotal;

    public productoAlmacen(String codigoProduct, String nombreProduct, int cantidadAlmacen, int precioUnidad) {
        this.codigoProduct = codigoProduct;
        this.nombreProduct = nombreProduct;
        this.cantidadAlmacen = cantidadAlmacen;
        this.precioUnidad = precioUnidad;
        this.valorTotal = cantidadAlmacen*precioUnidad;
    }

    public String getCodigoProduct() {
        return codigoProduct;
    }

    public void setCodigoProduct(String codigoProduct) {
        this.codigoProduct = codigoProduct;
    }

    public String getNombreProduct() {
        return nombreProduct;
    }

    public void setNombreProduct(String nombreProduct) {
        this.nombreProduct = nombreProduct;
    }

    public int getCantidadAlmacen() {
        return cantidadAlmacen;
    }

    public void setCantidadAlmacen(int cantidadAlmacen) {
        this.cantidadAlmacen = cantidadAlmacen;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
             @Override
         public String toString() {
             return "Codigo del producto: " + codigoProduct + "\n" +
               "Nombre del producto: " + nombreProduct + "\n" +
               "Cantidad en almacen: " + cantidadAlmacen + "\n" +
               "Precio por unidad: " + precioUnidad + "\n" +
               "Valor total en almacen: " + valorTotal + "\n";
         }  
}
//Ejercicio28
class pago{
    public String numPago;
    public String empleado;
    public int salarioBase;
    public int bonificacion;
    public int deduccion;
    public int salarioNeto;

    public pago(String numPago, String empleado, int salarioBase, int bonificacion, int deduccion) {
        this.numPago = numPago;
        this.empleado = empleado;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
        this.deduccion = deduccion;
        this.salarioNeto = (salarioBase+bonificacion)-deduccion;
    }

    public String getNumPago() {
        return numPago;
    }

    public void setNumPago(String numPago) {
        this.numPago = numPago;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(int deduccion) {
        this.deduccion = deduccion;
    }

    public int getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(int salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    
                 @Override
         public String toString() {
             return "Numero de pago: " + numPago + "\n" +
               "Empleado: " + empleado + "\n" +
               "Salario base: " + salarioBase + "\n" +
               "Bonificacion: " + bonificacion + "\n" +
               "Deduccion: " + deduccion + "\n" +
               "Salario neto: " + salarioNeto + "\n";
         }   
}
//Ejercicio 29
class servicio{
    public String codigoServicio;
    public String descripcion;
    public int precioHora;
    public int horasTrabajadas;
    public int precioTotal;

    public servicio(String codigoServicio, String descripcion, int precioHora, int horasTrabajadas) {
        this.codigoServicio = codigoServicio;
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = precioHora*horasTrabajadas;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
                     @Override
         public String toString() {
             return "Codigo de servicio: " + codigoServicio + "\n" +
               "Descripcion: " + descripcion + "\n" +
               "Precio por hora: " + precioHora + "\n" +
               "Horas trabajadas: " + horasTrabajadas + "\n" +
               "Precio total: " + precioTotal + "\n";
         }    
}
//Ejercicio 30
class compra{
    public String numCompra;
    public String proveedor;
    public int cantProductos;
    public int precio;
    public int precioTotal;

    public compra(String numCompra, String proveedor, int cantProductos, int precio) {
        this.numCompra = numCompra;
        this.proveedor = proveedor;
        this.cantProductos = cantProductos;
        this.precio = precio;
        this.precioTotal = cantProductos*precio;
    }

    public String getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(String numCompra) {
        this.numCompra = numCompra;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
                         @Override
         public String toString() {
             return "Numero de compra: " + numCompra + "\n" +
               "Proveedor: " + proveedor + "\n" +
               "Cantidad de productos: " + cantProductos + "\n" +
               "Precio por producto: " + precio + "\n" +
               "Precio total: " + precioTotal + "\n";
         }  
}
//Ejercicio31
class Empleado {
    // Atributos privados
    public String nombre;
    public long salario;

    // Constructor para inicializar los atributos
    public Empleado(String nombre, long salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método público para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método público para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método público para establecer el salario
    public void setSalario(long salario) {
        this.salario = salario;
    }

    // Método público para obtener el salario
    public double getSalario() {
        return salario;
    }

    // Método público para calcular el salario anual
    public long calcularSalarioAnual() {
        return salario * 12;
    }

    // Método para mostrar la información del empleado (opcional)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario mensual: " + salario);
        System.out.println("Salario anual: " + calcularSalarioAnual());
    }
}
//Ejercicio 32
class producto{
    private String codigo;
    private String nombre;
    private int precio;
    private double descuento;

    public producto(String codigo, String nombre, int precio, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = (precio*descuento)/100;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    public double mtdDescuento(){
        return precio-descuento;
    }
    public void mtdMostrarDescuento(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Precio Total: " + "$"+mtdDescuento());
    } 
}
//Ejercicio 33
class cliente {
    private String nombre;
    private String direccion;
    private String telefono;

    public cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void mtdMostarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion " + direccion);
        System.out.println("Telefono: " + telefono);
    }  
}
//Ejercicio 34
class factura{
    public String numero;
    public String cliente;
    public int subTotal;

    public factura(String numero, String cliente, int subTotal) {
        this.numero = numero;
        this.cliente = cliente;
        this.subTotal = subTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    private double mtdIva(){
        double iva = subTotal*0.19;
        double total= iva+subTotal;
        return total;
    }
    public void mtdMostrarFactura(){
        System.out.println("Numero: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Total: " + "$"+mtdIva());
    }  
}
//Ejercicio 35
class pedido{
    protected String numero;
    protected String cliente;
    protected int cantidad;
    protected double precioPorUnidad;

    public pedido(String numero, String cliente, int cantidad, double precioPorUnidad) {
        this.numero = numero;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }
    public void mtdMostarPedido(){
        System.out.println("Numero: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por unidad: " + precioPorUnidad);
    }   
}
//Ejercicio 36
class inventario{
    public String codigoProducto;
    public int cantidad;
    public double precioPorUnidad;

    public inventario(String codigoProducto, int cantidad, double precioPorUnidad) {
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }
    private double mtdInventario(){
        double total = cantidad*precioPorUnidad;
        return total; 
    }
    public void mtdMostrarInventario(){
        System.out.println("Codigo de producto: " + codigoProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por unidad: " + precioPorUnidad);
        System.out.println("Valor total: " + mtdInventario());
    }
}
//Ejercicio 37
class proveedor{
    protected String nombre;
    protected String empresa;
    protected String telefono;

    public proveedor(String nombre, String empresa, String telefono) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
    }

    protected String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    protected String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void mtdMostrarProveedor(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Empresa: " + empresa);
        System.out.println("Telefono: " + telefono);
    }
}
//Ejercicio 38
class Compra{
    private String numero;
    private String proveedor;
    private int cantidad;
    private double precioPorProducto;

    public Compra(String numero, String proveedor, int cantidad, double precioPorProducto) {
        this.numero = numero;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.precioPorProducto = precioPorProducto;
    }

    public String getNombre() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.numero = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorProducto() {
        return precioPorProducto;
    }

    public void setPrecioPorProducto(double precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
    }
    public double mtdCompra(){
        double total = cantidad*precioPorProducto;
        return total;
    }
    public void mtdMostarCompra(){
        System.out.println("Numero: " + numero);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Cantidad de productos: " + cantidad);
        System.out.println("Precio por producto: " + precioPorProducto);
        System.out.println("Costo total: " + mtdCompra());
    }
}
//Ejercicio 39
class venta{
    public String producto;
    public int cantidad;
    public double precioUnitario;

    public venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    private double mtdTotalVenta(){
        double totalVenta= cantidad*precioUnitario;
        return totalVenta;
    }
    public void mtdMostrarVenta(){
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total de venta: " + mtdTotalVenta());
    }
}
//Ejercicio40
class Servicio{
    public String codigo;
    public String descripcion;
    public double precioPorHora;
    public int horasTrabajadas;

    public Servicio(String codigo, String descripcion, double precioPorHora, int horasTrabajadas) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    protected double mtdCostoTotal(){
        double costoTotal = horasTrabajadas*precioPorHora;
        return costoTotal;
    }
    public void mtdMostrarCosto(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio por hora " + precioPorHora);
        System.out.println("Costo total: " + mtdCostoTotal());
    }
}
//Ejercicio 41
class empleados{
    private String nombre;
    private double salarioBase;

    public empleados(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
class gerente extends empleados{
    private int bonificacion;
    private double salarioTotal;

    public gerente(String nombre, int bonificacion,double salarioBase) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
        this.salarioTotal = salarioBase+bonificacion;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
        @Override
         public String toString() {
             return "Nombre: " + getNombre() + "\n" +
               "Salario base: " + getSalarioBase() + "\n" +
               "Bonificacion: " + bonificacion + "\n" +
               "Salario Total: " + salarioTotal + "\n";
         }  
}
//Ejercicio 42
class Producto{
    public String codigoProducto;
    public String nombreProducto;
    public int precioUnidad;

    public Producto(String codigoProducto, String nombreProducto, int precioUnidad) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
}
class productoPerecedero extends Producto{
    public String fecha;
    public double descuento;
    public double descuentoTotal;

    public productoPerecedero(String codigoProducto, String nombreProducto, int precioUnidad, String fecha, double descuento) {
        super(codigoProducto, nombreProducto, precioUnidad);
        this.fecha = fecha;
        this.descuento = descuento;
        this.descuentoTotal = (precioUnidad*descuento)/100;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }
    public double mtdCalcularDescuento(){
        double precioTotal = precioUnidad-descuentoTotal;
        return precioTotal;
    }
            @Override
         public String toString() {
             return "Codigo del producto: " + getCodigoProducto()+ "\n" +
               "Nombre del Producto: " + getNombreProducto()+ "\n" +
               "Precio por unidad: " + precioUnidad + "\n" +
               "Fecha de caducidad: " + fecha + "\n" +
               "Descuento: " + descuento + "\n" +
               "Precio total con descuento : " + mtdCalcularDescuento() + "\n";
         }     
}
//Ejercicio43

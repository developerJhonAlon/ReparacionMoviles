/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.List;
import sun.security.provider.certpath.BuildStep;

/**
 *
 * @author ANDRES
 */
public class control_existencias {

    private Sentencias_sql sen;
    private String Documento;
    private String numero_factura = "";

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getId_cliente() {
        return Documento;
    }

    public void setId_cliente(String id_cliente) {
        this.Documento = Documento;
    }
    private String No_documento;

    public String getId_proveedor() {
        return No_documento;
    }

    public void setId_proveedor(String id_proveedor) {
        this.No_documento = No_documento;
    }

    public String getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }
    private String id_articulo;

    public control_existencias() {
        sen = new Sentencias_sql();
    }

    public boolean existe_cliente(String cod) {

        this.Documento = cod;
        return sen.existencias("Documento", " from cliente where Documento='" + cod + "';");

    }

    public boolean existe_mantenimiento(String cod) {

        this.numero_factura = cod;
        return sen.existencias("id_mantenimiento", " from mantenimiento where id_mantenimiento='" + cod + "';");

    }

    public boolean existe_usuario(String usuario, String password) {
        return sen.existencias("clave_user", " from usuario where nombre_user='" + usuario + "' and clave_user='" + password + "';");
    }

    public boolean existe_proveedor(String id_prov) {
        this.No_documento = id_prov;
        return sen.existencias(id_prov, " from proveedor where No_documento='" + id_prov + "';");

    }

    public boolean existe_articulo(String idart) {
        this.id_articulo = idart;
        return sen.existencias(idart, " from articulo where id_articulo='" + idart + "';");

    }

    public String ingresa_nombre_Cliente() {
        String result;
        result = sen.datos_string("nombres", "select nombres from cliente where Documento='" + this.Documento + "';");
        return result;
    }

    public String ingresa_apellidos_Cliente() {
        String resultado;
        resultado = sen.datos_string("apellidos", "select apellidos from cliente where Documento='" + this.Documento + "';");
        return resultado;
    }

    public String GenerarNumeroFactura() {
        String codigo = "FACT-";
        for (int i = 1; i <= 6; i++) {
            int num = (int) ((Math.random() * (5)) + 6);
            codigo = codigo + num;
        }
        numero_factura = codigo;
        return codigo;
    }

    public void registrar_factura(String Nnm_factura, String Nombre_empleado, String fecha_facturacion, String cod_formapago) {
        String[] datos = {Nnm_factura, Documento, Nombre_empleado, fecha_facturacion, cod_formapago};
        sen.insertar(datos, "insert into factura(Nnm_factura,cod_cliente,Nombre_empleado,fecha_facturacion, cod_formapago) values(?,?,?,?,?);");
    }

    public boolean registrar_mantenimiento(String numMantenimiento, String nombreEmpleado, String fechaMante, String codFormaPago, String equipo, String falla, String observacion,
            String precio, String estado) {
        String[] datos = {numMantenimiento, Documento, nombreEmpleado, fechaMante, codFormaPago, equipo, falla, observacion, precio, estado};
        return sen.insertar(datos,
                "insert into mantenimiento(id_mantenimiento,cod_cliente,nombre_empleado,fecha,cod_formapago,equipo,falla,observacion,precio,estado) values(?,?,?,?,?,?,?,?,?,?);");
    }

    public boolean update_mantenimiento(String numMantenimiento, String nombreEmpleado, String fechaMante, String codFormaPago, String equipo, String falla, String observacion,
            String precio, String estado) {
        String[] datos = {nombreEmpleado, fechaMante, codFormaPago, equipo, falla, observacion, precio, estado, numMantenimiento};
        return sen.insertar(datos,
                "update mantenimiento set nombre_empleado=?, fecha=?, cod_formapago=?, equipo=?, falla=?, observacion=?, precio=?, estado=? where id_mantenimiento=?;");
    }

    public boolean update_factura(String factura, String total, String iva) {
        String campos[] = {total, iva, factura};
        return sen.insertar(campos, "update factura set total_factura=?, IVA=? where Nnm_factura=?;");

    }

    public boolean update_stock(String stock, String id_articulo) {
        String campos[] = {stock, id_articulo};
        return sen.insertar(campos, "update articulo set stock=stock+? where id_articulo=?;");

    }

    public List<OpcionGenerica> combox(String tabla, String[] campo) {
        return sen.poblar_combox(tabla, campo, "select " + campo[0] + "," + campo[1] + " from " + tabla + ";");
    }

    public Object[][] datos_articulo(String id_articulo) {
        String[] columnas = {"descripcion", "precio_venta", "stock"};
        Object[][] resultado = sen.GetTabla(columnas, "articulo", "select descripcion, precio_venta, stock from articulo where id_articulo='" + id_articulo + "';");
        return resultado;
    }

    public Object[][] datos_cliente(String id_cliente) {
        String[] columnas = {"Documento", "Descripcion", "Nombres", "Apellidos", "Direccion", "Nombre_ciudad", "Telefono"};
        Object[][] resultado = sen.GetTabla(columnas, "cliente", "select * from cliente, ciudad, tipo_de_documento where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad and documento='" + id_cliente + "';");
        return resultado;
    }

    public Object[][] datos_detallefactura(String numero_factura) {
        String[] columnas = {"cod_factura", "cod_articulo", "descripcion", "cantidad", "total"};
        Object[][] resultado = sen.GetTabla(columnas, "detalle_factura where cod_factura='" + numero_factura + "';", "select * from detalle_factura,articulo where id_articulo = cod_articulo and cod_factura='" + numero_factura + "';");
        return resultado;
    }

    public Object[][] consulta_factura(String id) {
        String[] columnas = {"Nnm_factura", "Nombres", "Apellidos", "Nombre_empleado", "Fecha_facturacion", "Descripcion_formapago", "total_factura", "IVA"};
        Object[][] resultado = sen.GetTabla(columnas, "cliente", "select * from cliente, factura, forma_de_pago where documento=cod_cliente and cod_formapago=id_formapago and documento='" + id + "';");
        return resultado;
    }
    
    
    public Object[][] contarFactura(String cedula, String fecha) {
         String[] columnas = {"cod_cliente", "Fecha_facturacion", "cont"};
        if(!cedula.isEmpty() && fecha.isEmpty()){
            return sen.GetTabla(columnas, "factura", "SELECT cod_cliente,Fecha_facturacion,count(cod_cliente) as 'cont' FROM factura where cod_cliente='"+cedula+"' GROUP BY cod_cliente;");
        }else if(cedula.isEmpty() && !fecha.isEmpty()){
            return sen.GetTabla(columnas, "factura", "SELECT cod_cliente,Fecha_facturacion,count(Fecha_facturacion) as 'cont' FROM factura where Fecha_facturacion='"+fecha+"' GROUP BY Fecha_facturacion;");
        }else{
            return sen.GetTabla(columnas, "factura", "SELECT cod_cliente,Fecha_facturacion,count(cod_cliente) as 'cont' FROM factura GROUP BY cod_cliente;");
        }
        
    }
    
    
     public Object[][] contarMantenimiento(String cedula, String fecha) {
         String[] columnas = {"cod_cliente", "fecha", "cont"};
        if(!cedula.isEmpty() && fecha.isEmpty()){
            return sen.GetTabla(columnas, "mantenimiento", "SELECT cod_cliente,fecha,count(cod_cliente) as 'cont' FROM mantenimiento where cod_cliente='"+cedula+"' GROUP BY cod_cliente;");
        }else if(cedula.isEmpty() && !fecha.isEmpty()){
            return sen.GetTabla(columnas, "mantenimiento", "SELECT cod_cliente,fecha,count(fecha) as 'cont' FROM mantenimiento where fecha='"+fecha+"' GROUP BY fecha;");
        }else{
            return sen.GetTabla(columnas, "mantenimiento", "SELECT cod_cliente,fecha,count(cod_cliente) as 'cont' FROM mantenimiento GROUP BY cod_cliente;");
        }
        
    }
    

    public Object[][] consultaReporte(String tipo, String cedula, String fecha) {

        try {
            
            StringBuilder where = new StringBuilder();
            if (tipo.equals("Mantenimiento")) {
                if (cedula != null && !cedula.isEmpty()) {
                    where.append(" and cod_cliente = '").append(cedula).append("'");
                }
                if (fecha != null && !fecha.isEmpty()) {
                    where.append(" and fecha = '").append(fecha).append("'");
                }
                String columnas[] = {"id_mantenimiento","cod_cliente","nombre_empleado","fecha","precio"};
                return sen.GetTabla(columnas, "mantenimiento", "select * from mantenimiento where 1=1 " + where.toString());
            } else {
                if (cedula != null && !cedula.isEmpty()) {
                    where.append(" and cod_cliente = '").append(cedula).append("'");
                }
                if (fecha != null && !fecha.isEmpty()) {
                    where.append(" and Fecha_facturacion = '").append(fecha).append("'");
                }
                String columnas[] = {"Nnm_factura","cod_cliente","Nombre_empleado","Fecha_facturacion","total_factura"};
                return sen.GetTabla(columnas, "factura", "select * from factura where 1=1 " + where.toString());
            }
        }catch(Exception e){
            System.out.println(e);
            return null;
        }      
    }

    public Object[][] consultaMantenimientoPorCliente(String id) {

        String[] columnas = {"id_mantenimiento", "Nombres", "Apellidos", "nombre_empleado", "fecha", "Descripcion_formapago", "equipo", "falla", "observacion", "precio", "estado"};
        Object[][] resultado = sen.GetTabla(columnas, "mantenimiento", "select * from cliente, mantenimiento, forma_de_pago where documento=cod_cliente and cod_formapago=id_formapago and documento='" + id + "';");
        return resultado;
    }

    public Object[][] consultaMantenimientoPorFactura() {

        String[] columnas = {"id_mantenimiento", "Nombres", "Apellidos", "nombre_empleado", "fecha", "Descripcion_formapago", "equipo", "falla", "observacion", "precio", "estado"};
        Object[][] resultado = sen.GetTabla(columnas, "mantenimiento", "select * from cliente, mantenimiento, forma_de_pago where Documento=cod_cliente and cod_formapago=id_formapago and id_mantenimiento='" + numero_factura + "';");
        return resultado;
    }

    public boolean devolucion(String cod_detallefactura, String cod_detallearticulo, String Motivo, String fecha_devolucion, String cantidad) {
        String[] columnas = {cod_detallefactura, cod_detallearticulo, Motivo, fecha_devolucion, cantidad};
        return sen.insertar(columnas, "insert into devolucion(cod_detallefactura,cod_detallearticulo,Motivo,fecha_devolucion,cantidad) values(?,?,?,?,?)");

    }

    public boolean registrar_producto(String Nnm_factura, String id_articulo, String cantidad, String total) {
        String[] datos = {Nnm_factura, id_articulo, cantidad, total};

        String[] datosP = {cantidad, id_articulo};
        if (sen.insertar(datosP, "update articulo set stock=stock-? where id_articulo=?;")) {
            return sen.insertar(datos, "insert into detalle_factura(cod_factura,cod_articulo,cantidad,total) values(?,?,?,?);");
        } else {
            return false;
        }
    }

    public Double total_factura(String numfact) {
        return sen.datos_totalfactura("total", "select round( sum( total ) , 2 ) as total from detalle_factura where cod_factura='" + numfact + "';");
    }
}

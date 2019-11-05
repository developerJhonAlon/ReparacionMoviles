/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author ANDRES
 */
public class IVA {

    private Double precio;

    public IVA(Double precio) {
        this.precio = precio;

    }

    public Double calcular_iva() {

        return (precio * 12) / 100;

    }
}

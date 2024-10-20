
package clases;
import java.util.Date;
import java.util.List;

public class Factura {
    private int idFactura;
    private Date fecha;
    private List<Producto> detalles; // Cambio para almacenar productos directamente en la factura

    public void generarFactura() {
        // Lógica para generar la factura con los productos comprados
    }

    // Getters y Setters
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Producto> detalles) {
        this.detalles = detalles;
    }
}

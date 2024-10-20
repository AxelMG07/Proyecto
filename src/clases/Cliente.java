package clases;

import java.util.List;

public class Cliente {
    private String nombre;
    private int idCliente;
    private List<Producto> productosComprados; 

    public void realizarCompra(Producto producto) {
        // Lógica para realizar una compra
        productosComprados.add(producto);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }
}

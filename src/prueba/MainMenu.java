package prueba;
import javax.swing.JOptionPane;

public class MainMenu {

    public static void main(String[] args) {
        String[] options = {
            "Gestionar Clientes", 
            "Gestionar Productos", 
            "Procesar Ventas", 
            "Gestionar Inventario", 
            "Gestionar Pedidos", 
            "Gestionar Comprobante", 
            "Gestionar Proveedores", 
            "Generar Reportes", 
            "Salir"
        };

        boolean continuar = true;

        while (continuar) {
            String menu = (String) JOptionPane.showInputDialog(null, 
                    "Seleccione una opción", 
                    "Menú Principal", 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, options, options[0]);

            if (menu == null || menu.equals("Salir")) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
            } else {
                switch (menu) {
                    case "Gestionar Clientes":
                        gestionarClientes();
                        break;
                    case "Gestionar Productos":
                        gestionarProductos();
                        break;
                    case "Procesar Ventas":
                        procesarVentas();
                        break;
                    case "Gestionar Inventario":
                        gestionarInventario();
                        break;
                    case "Gestionar Pedidos":
                        gestionarPedidos();
                        break;
                    case "Gestionar Facturas":
                        gestionarFacturas();
                        break;
                    case "Gestionar Proveedores":
                        gestionarProveedores();
                        break;
                    case "Generar Reportes":
                        generarReportes();
                        break;
                }
            }
        }
    }

    // Métodos para cada opción
    public static void gestionarClientes() {
        JOptionPane.showMessageDialog(null, "Aquí puedes gestionar los clientes.");
        // Implementar lógica para gestionar clientes.
    }

    public static void gestionarProductos() {
        JOptionPane.showMessageDialog(null, "Aquí puedes gestionar los productos.");
        // Implementar lógica para gestionar productos.
    }

    public static void procesarVentas() {
        JOptionPane.showMessageDialog(null, "Aquí puedes procesar ventas.");
        // Implementar lógica para procesar ventas.
    }

    public static void gestionarInventario() {
        JOptionPane.showMessageDialog(null, "Aquí puedes gestionar el inventario.");
        // Implementar lógica para gestionar inventario.
    }

    public static void gestionarPedidos() {
        JOptionPane.showMessageDialog(null, "Aquí puedes gestionar los pedidos.");
        // Implementar lógica para gestionar pedidos.
    }

    public static void gestionarFacturas() {
        JOptionPane.showMessageDialog(null, "Aquí puedes gestionar las facturas.");
        // Implementar lógica para gestionar facturas.
    }

    public static void gestionarProveedores() {
        JOptionPane.showMessageDialog(null, "Aquí puedes gestionar los proveedores.");
        // Implementar lógica para gestionar proveedores.
    }

    public static void generarReportes() {
        JOptionPane.showMessageDialog(null, "Aquí puedes generar reportes.");
        // Implementar lógica para generar reportes.
    }
}
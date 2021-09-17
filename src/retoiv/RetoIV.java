
package retoiv;

public class RetoIV {

    public static void main(String[] args) {
        
        Usuario u = new Usuario(1,"1098","Marcos Oviedo","Gerente");
        u.addTelefono("333333");
        u.addTelefono("111111");
        u.addTelefono("222222");
        u.addTelefono("222222");
        
        u.mostrarTelefonos();
    }
    
}

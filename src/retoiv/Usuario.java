
package retoiv;


import java.util.TreeSet;

public class Usuario {
    private int id;
    private String cedula;
    private String nombre;
    private String cargo;
    TreeSet<String> telefonos = new TreeSet<>();
   

    public Usuario(int id, String cedula, String nombre, String cargo, TreeSet telefonos) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefonos = telefonos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public TreeSet<String> getTelefonos() {
        return telefonos;
    }
    
    public void setTelefonos(TreeSet<String> telefonos){
        this.telefonos = telefonos;
    
    }

    public Usuario(int id, String cedula, String nombre, String cargo) {
    }
    
    public void addTelefono(String telefono){
        if(!telefonos.contains(telefono)){
            telefonos.add(telefono);
        }
    }    
    
    public void mostrarTelefonos(){
       
        System.out.println(this.telefonos);
        for(String it: telefonos){
           System.out.println(it);
       }
    }
}




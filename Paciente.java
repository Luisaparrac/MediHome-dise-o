public class Paciente extends Usuario implements INotificable {
    private String telefono;
    private String direccionProfesional;

    public Paciente() {}

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccionProfesional() { return direccionProfesional; }
    public void setDireccionProfesional(String direccionProfesional) {
        this.direccionProfesional = direccionProfesional;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación al paciente " + getNombre() + ": " + mensaje);
    }

    public void registrar() {
        System.out.println("Paciente registrado: " + getNombre());
    }
}

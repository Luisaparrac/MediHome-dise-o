public class ProfesionalSalud extends Usuario implements INotificable {
    private String numeroRegistroProfesional;

    public ProfesionalSalud() {}

    public String getNumeroRegistroProfesional() { return numeroRegistroProfesional; }
    public void setNumeroRegistroProfesional(String numeroRegistroProfesional) {
        this.numeroRegistroProfesional = numeroRegistroProfesional;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación al profesional " + getNombre() + ": " + mensaje);
    }

    public void registrar() {
        System.out.println("Profesional registrado: " + getNombre());
    }
}

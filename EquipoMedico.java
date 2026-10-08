import java.util.ArrayList;
import java.util.List;

public class EquipoMedico {
    private String codigo;
    private String nombre;
    private String zonaCobertura;
    private List<ProfesionalSalud> profesionales = new ArrayList<>();

    public EquipoMedico() {}

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getZonaCobertura() { return zonaCobertura; }
    public void setZonaCobertura(String zonaCobertura) { this.zonaCobertura = zonaCobertura; }

    public void agregarProfesional(ProfesionalSalud profesional) {
        profesionales.add(profesional);
    }

    public void quitarProfesional(ProfesionalSalud profesional) {
        profesionales.remove(profesional);
    }
}

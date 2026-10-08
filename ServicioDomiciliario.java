import java.time.LocalDateTime;

public class ServicioDomiciliario {
    private String codigoUnico;
    private LocalDateTime fechaHora;
    private String direccionAtencion;
    private String motivo;
    private String estado;

    private Paciente paciente;             
    private ProfesionalSalud profesional;    
    private AtencionMedica atencion;         

    public ServicioDomiciliario() {}

    public String getCodigoUnico() { return codigoUnico; }
    public void setCodigoUnico(String codigoUnico) { this.codigoUnico = codigoUnico; }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public String getDireccionAtencion() { return direccionAtencion; }
    public void setDireccionAtencion(String direccionAtencion) { this.direccionAtencion = direccionAtencion; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public ProfesionalSalud getProfesional() { return profesional; }
    public void setProfesional(ProfesionalSalud profesional) { this.profesional = profesional; }

    public AtencionMedica getAtencion() { return atencion; }
    public void setAtencion(AtencionMedica atencion) { this.atencion = atencion; }

    public void programar() {
        this.estado = "PROGRAMADO";
        System.out.println("Servicio " + codigoUnico + " programado para " + fechaHora);
    }
}

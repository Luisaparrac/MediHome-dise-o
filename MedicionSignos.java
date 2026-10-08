import java.time.LocalDateTime;

public class MedicionSignos {
    private LocalDateTime fechaHora;
    private Double temperatura;
    private int frecuenciaCardiaca;
    private int presionSistolica;
    private int presionDiastolica;
    private Double saturacionOxigeno;

    public MedicionSignos() {}

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public Double getTemperatura() { return temperatura; }
    public void setTemperatura(Double temperatura) { this.temperatura = temperatura; }

    public int getFrecuenciaCardiaca() { return frecuenciaCardiaca; }
    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) { this.frecuenciaCardiaca = frecuenciaCardiaca; }

    public int getPresionSistolica() { return presionSistolica; }
    public void setPresionSistolica(int presionSistolica) { this.presionSistolica = presionSistolica; }

    public int getPresionDiastolica() { return presionDiastolica; }
    public void setPresionDiastolica(int presionDiastolica) { this.presionDiastolica = presionDiastolica; }

    public Double getSaturacionOxigeno() { return saturacionOxigeno; }
    public void setSaturacionOxigeno(Double saturacionOxigeno) { this.saturacionOxigeno = saturacionOxigeno; }

    public void registrar() {
        System.out.println("Medición registrada: " + fechaHora);
    }
}

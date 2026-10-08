import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.setIdentificacion("1001");
        paciente.setNombre("Ana");
        paciente.setTelefono("3001234567");

        ProfesionalSalud medico = new ProfesionalSalud();
        medico.setIdentificacion("2002");
        medico.setNombre("Dr. Pérez");
        medico.setNumeroRegistroProfesional("RM-123");

        EquipoMedico equipo = new EquipoMedico();
        equipo.setNombre("Equipo Norte");
        equipo.agregarProfesional(medico);

        ServicioDomiciliario servicio = new ServicioDomiciliario();
        servicio.setCodigoUnico("SD-001");
        servicio.setFechaHora(LocalDateTime.now().plusDays(1));
        servicio.setDireccionAtencion("Calle 10 #5-20");
        servicio.setMotivo("Control de presión");
        servicio.setPaciente(paciente);
        servicio.setProfesional(medico);
        servicio.programar();

        AtencionMedica atencion = new AtencionMedica();
        atencion.setObservaciones("Paciente estable");
        MedicionSignos medicion = new MedicionSignos();
        medicion.setFechaHora(LocalDateTime.now());
        medicion.setTemperatura(36.8);
        medicion.setFrecuenciaCardiaca(78);
        atencion.agregarMedicion(medicion);
        servicio.setAtencion(atencion);

        paciente.notificar("Su servicio fue programado");
        medico.notificar("Tiene un nuevo servicio asignado");
        atencion.registrar();
    }
}

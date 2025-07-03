import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade("Florianópolis", "SC");
        Cidade cidade2 = new Cidade("Ijuí", "RS");
        Cidade cidade3 = new Cidade();
        cidade3.setNome("Lages");
        cidade3.setUf("SC");

        //System.out.println("Cidades");
        //System.out.println("Cidade 1 ==> " + cidade1);
        //System.out.println("Cidade 2 ==> " + cidade2);

        //Endereco endereco = new Endereco("Rua qualquer", cidade1);

        Paciente paciente1 = new Paciente("João", "12332145678", "Rua das Flores", cidade1);
        paciente1.setCpf("321312145678");
        paciente1.atualizarEndereco("Rua X de Novembro", cidade3);

        Paciente paciente2 = new Paciente("Maria", "43223456789", "Rua das Neves", cidade2);

        //System.out.println("Pacientes");
        //System.out.println("Paciente 1 ==>  " + paciente1);

        Medico medico1 = new Medico("Dra. Ana", "45678932100", "Cardiologia", "CRM1234");

        //System.out.println("Médicos");
        //System.out.println("Médico 1 ==> " + medico1);

        Consulta consulta1 = new Consulta("06/12/2024", "10:00", medico1, paciente1, Prioridade.BAIXA, StatusConsulta.AGENDADA);

        //System.out.println("Consultas");
        //System.out.println("Consulta 1 ==> " + consulta1.toString());

        Consulta consulta2 = new Consulta("01/07/2025", "16:00", medico1, paciente2,
                Prioridade.MEDIA, StatusConsulta.REALIZADA);
        //System.out.println("Consulta 2 ==> " + consulta2.toString());

        //System.out.println("\n\nConsultas do médico 1: ");
        //System.out.println(medico1.getConsultas());

        print(consulta1);
        print(consulta2);

        printConsultas(medico1);

    }

    public static void print(Consulta consulta) {
        System.out.println("******* DADOS DA CONSULTA *******");
        System.out.println("Médico...................: " + consulta.getMedico().getNome());
        System.out.println("Paciente.................: " + consulta.getPaciente().getNome());
        System.out.println("Cidade do paciente.......: " +
                consulta.getPaciente().getEndereco().getCidade().getNome());
        System.out.println("Data.....................: " + consulta.getDataConsulta());
        System.out.println("Horário..................: " + consulta.getHorario());
        System.out.println("Prioridade...............: " + consulta.getPrioridade());
        System.out.println("Status da Consulta.......: " + consulta.getStatusConsulta());
        System.out.println("=================================");
    }

    public static void printConsultas(Medico medico) {
        System.out.println("****** CONSULTAS DO MEDICO ******");
        System.out.println("Nome: " + medico.getNome());
        if (medico.getConsultas().isEmpty()) {
            System.out.println("Nenhuma consulta realizada pelo médico.");
        } else {
            for (Consulta consulta : medico.getConsultas()) {
                System.out.println("Paciente.................: " + consulta.getPaciente().getNome());
                System.out.println("Cidade do paciente.......: " +
                        consulta.getPaciente().getEndereco().getCidade().getNome());
                System.out.println("Data.....................: " + consulta.getDataConsulta());
                System.out.println("Horário..................: " + consulta.getHorario());
                System.out.println("Prioridade...............: " + consulta.getPrioridade());
                System.out.println("Status da Consulta.......: " + consulta.getStatusConsulta());
                System.out.println();
            }
        }

    }
}

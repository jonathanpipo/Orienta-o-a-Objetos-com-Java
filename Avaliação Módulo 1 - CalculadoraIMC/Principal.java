public class Principal {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Paciente A", 65, 1.65);
        Paciente p2 = new Paciente("Paciente B", 95, 1.75);
        Paciente p3 = new Paciente("Paciente C", 84, 1.90);
        p1.outPut();
        p2.outPut();
        p3.outPut();

    }
}

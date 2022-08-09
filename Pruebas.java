public class Pruebas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setEdad(14);
        cliente.setTelefono("666666666");
        cliente.setNombre("pepe");
        cliente.setCredito(500.5);

        System.out.printf("El cliente %s que tiene %d años y con telefono %s, ha solicitado un credito de %.2f\n"
                , cliente.getNombre(), cliente.getEdad(), cliente.getTelefono(), cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(27);
        trabajador.setTelefono("666676666");
        trabajador.setNombre("roberto");
        trabajador.setSalario(3500.57);

        System.out.printf("El trabajador %s que tiene %d años y con telefono %s, cobra %.2f"
                , cliente.getNombre(), cliente.getEdad(), cliente.getTelefono(), cliente.getCredito());
    }
}

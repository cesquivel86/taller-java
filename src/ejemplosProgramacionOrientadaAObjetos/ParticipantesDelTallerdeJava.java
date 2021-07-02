package ejemplosProgramacionOrientadaAObjetos;

public class ParticipantesDelTallerdeJava {
    public static void main (String args[]){
        Persona persona1 = new Persona();
        persona1.setNombre("Cesar");
        persona1.setApellidos("López");
        persona1.setAltura(1.8);
        persona1.setAltura(1.8,"metros");

        Persona persona2 =  new Persona("Sergio", "Pat");


        System.out.println("El primer estudiante registrado en el taller es:"+ persona1.getNombre()+" "+persona1.getApellidos());
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Karina");
    }
}

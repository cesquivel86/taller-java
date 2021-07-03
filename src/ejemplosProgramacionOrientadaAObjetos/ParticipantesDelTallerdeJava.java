package ejemplosProgramacionOrientadaAObjetos;

import excepciones.MiPropiaExcepcion;

public class ParticipantesDelTallerdeJava {
    public static void main (String args[]) throws MiPropiaExcepcion {
        Persona persona1 = new Persona();
        persona1.setNombre("Cesar");
        persona1.setApellidos("López");
        persona1.setAltura(1.8);
        persona1.setAltura(1.8,"metros");


        try {
            Persona persona2 = new Persona("Se", "Pat");
        }catch(MiPropiaExcepcion e){
            System.out.println(e.getMessage());
        }





        System.out.println("El primer estudiante registrado en el taller es:"+ persona1.getNombre()+" "+persona1.getApellidos());
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Karina");
    }
}

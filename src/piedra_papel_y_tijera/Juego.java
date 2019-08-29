package piedra_papel_y_tijera;

import static piedra_papel_y_tijera.Gesto.PAPEL;
import static piedra_papel_y_tijera.Gesto.PIEDRA;
import static piedra_papel_y_tijera.Gesto.TIJERA;

public class Juego {
    
    private Jugador jug1;
    private Jugador jug2;
    private RandomR random = new RandomR();
    
    // Constructor de Juego.
    
    public Juego (String nombjug1, String nombjug2) {
        jug1 = new Jugador (nombjug1);
        jug2 = new Jugador (nombjug2);
    }
    
    public void Jugar () {
        
        int cantidadVictorias1 = 0;
        int cantidadVictorias2 = 0;
        
        Jugador ganador = null;
        
        while (cantidadVictorias1 < 2 && cantidadVictorias2 < 2) {
            jug1.hacerGesto(); System.out.println(jug1);
            jug2.hacerGesto(); System.out.println(jug2);
            
            ganador = quienGana();
            
            if (ganador == jug1) {
                cantidadVictorias1++;
                System.out.println("Ganador: " + jug1.getNombre());
            }
            if (ganador == jug2) {
                cantidadVictorias2++;
                System.out.println("Ganador: " + jug2.getNombre());
            }
            if(ganador == null) {
                Jugador nadie = new Jugador("Nadie");
                nadie.setMano(new Gesto()); //me chupa un huevo cual me genere, es para que no tire nullpointer
                ganador = nadie; //ahora nadie es el ganador
                System.out.println("Empate!");
            }
            
            System.out.println("El ganador es: " + ganador.getNombre()); //aca tiraba antes el nullpointer
            
        }
    }
    //  1 es PIEDRA, 2 es PAPEL, 3 es TIJERA
    private Jugador quienGana() {
        
        if (jug1.getMano().getGesto() == jug2.getMano().getGesto()){
            return null;
        }
        if (jug1.getMano().getGesto() == Gesto.PIEDRA && jug2.getMano().getGesto() == Gesto.TIJERA){
            return jug1;
        }
        if (jug1.getMano().getGesto() == Gesto.PAPEL && jug2.getMano().getGesto() == Gesto.PIEDRA) {
            return jug1;
        }
        if (jug1.getMano().getGesto()==Gesto.TIJERA && jug2.getMano().getGesto() == Gesto.PAPEL) {
            return jug1;
        }
        return jug2;
    }
    
}

package piedra_papel_y_tijera;

// Lo aconseja NetBeans, aplicar.

import java.util.Random;

public class Gesto {
    
    // Se crean las variables "piedra", "papel" y "tijera" con valores para poder usarlas.
    
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    
    // Se crea una variable para que muestren el resultado.
    
    public static String NOMB_PIEDRA = "PIEDRA";
    public static String NOMB_PAPEL = "PAPEL";
    public static String NOMB_TIJERA = "TIJERA";
    
    // La variable que va a representar cualquiera de los gestos.
    
    private int gesto;
    
    // Numeros random, para que el resultado sea aleatorio.
    
    private static final Random R = new Random();
    
    public Gesto () {
        gesto = R.nextInt (TIJERA - PIEDRA + 1) + PIEDRA;
    }
    // Transforma las variables en Strings, asi se pueden leer en la consola.
    
    @Override
    public String toString() {
        String resultado = "";
        switch (gesto) {
            case PIEDRA:
                resultado = NOMB_PIEDRA;
                break;
            case PAPEL:
                resultado = NOMB_PAPEL;
                break;
            case TIJERA:
                resultado = NOMB_TIJERA;
                break;
        }
        return resultado;
    }
// Getters y Setters.
    
    public int getGesto() {
        return gesto;
    }

    public void setGesto(int gesto) {
        this.gesto = gesto;
    }
   
}

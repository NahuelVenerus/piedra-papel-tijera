package piedra_papel_y_tijera;

public class Jugador {
    
// Creamos las variables que usaremos luego para nombrar al jugador y mostrar el gesto (hecho por el jugador).
    
    private String nombre;
    private Gesto mano;

// Creamos Getters para que nos den quien hizo el resultado, y con qué gesto.    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gesto getMano() {
        return mano;
    }

    public void setMano(Gesto mano) {
        this.mano = mano;
    }

// Le damos a nuestro jugador la capacidad de hacer gestos.    
    
    public Jugador (String nombre){
        this.nombre = nombre;
        mano = new Gesto();
    }
    
// Mostrar resultado.    
    
    public String toString(){
        return nombre + " " + mano;
    }
    
// Creamos mano como nuevo objeto.    
    
    public void hacerGesto(){
        mano = new Gesto();
    }

  }


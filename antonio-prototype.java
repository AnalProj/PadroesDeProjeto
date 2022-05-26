import java.util.HashMap;
import java.util.Map;


public interface Prototype {
  Prototype clone();
}

public class Bovino implements Prototype {
  private String sexo;
  private String tipo;
  private int idade
  private float peso;
 
  public Bovino(String sexo, String tipo, int idade, float peso) {
    this.sexo = sexo;
    this.tipo = tipo;
    this.idade = idade;
    this.peso = peso;
  }
  
  public Bovino(Bovino bovino) {
    this.sexo = bovino.sexo;
    this.tipo = bovino.tipo;
    this.idade = bovino.idade;
    this.peso = bovino.peso;
  }
  
  @Override
  public Bovino clone(){
    return new Bovino(this);
  }


}


public class RegistroVacas {

    private final Map<String, Bovino> registro = new HashMap<>();

    public RegistroVacas() {
        Bovino brangusVelhoGordo = new Bovino("masculino", "Brangus", 10, 1200.43);
        Bovino senepolJovemMedia = new Bus("femea", "Senepol", 3, 386.71);

        registro.put("Brangus Velho Gordo", brangusVelhoGordo);
        registro.put("Senepol Jovem Media", senepolJovemMedia);
    }

    public Bovino get(String key) {
        return registro.get(key).clone();
    }


}

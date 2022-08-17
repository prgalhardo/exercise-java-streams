import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeExamples {
  public static Collection<Carros> obterCarros() {
    return Set.of(
            new Carros("Modelo A", 2013, "ABC123"),
            new Carros("Modelo A", 2017, "ABC456"),
            new Carros("Modelo B", 2012, "ABC789"),
            new Carros("Modelo A", 2015, "DEF123"),
            new Carros("Modelo A", 2014, "DEF456"),
            new Carros("Modelo B", 2017, "DEF789"));
  }
//
  public static void main(String[] args) {
    Collection<Carros> carros = obterCarros();
    List<String> paraRecall = carros.stream()
            .filter(c -> "Modelo A".equals(c.getModelo()))
            .filter(c -> c.getAno() >= 2015 && c.getAno() <= 2017)
            .map(auto -> auto.getChassi())
            .collect(Collectors.toList());
    System.out.println(paraRecall);
  }
}

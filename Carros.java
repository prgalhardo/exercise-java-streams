public class Carros {
  private String modelo;
  private int ano;

  private String chassi;

  public Carros(String modelo, int ano, String chassi) {
    this.modelo = modelo;
    this.ano = ano;
    this.chassi = chassi;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getChassi() {
    return chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }
}

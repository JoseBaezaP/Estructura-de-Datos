public class Equipos{

  private String nombre;
  private int valor;
  private int tiempo;

  public Equipos(String nombre, int valor, int tiempo)
  {
    this.nombre = nombre;
    this.valor = valor;
    this.tiempo = tiempo;
  }

    public void setNombre(String nombre)
    {
      this.nombre = nombre;
    }
    public String getNombre()
    {
      return this.nombre;
    }
    public void setValor(int valor)
    {
      this.valor = valor;
    }
    public int getValor()
    {
      return this.valor;
    }
    public void setTiempo(int tiempo)
    {
      this.tiempo = tiempo;
    }
    public int getTiempo()
    {
      return this.tiempo;
    }

}

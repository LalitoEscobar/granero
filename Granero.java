public abstract class Granero{
 String tipoGrano;
 
 public Granero(String tipoGrano) {
  this.tipoGrano = tipoGrano;
 }
 
 public abstract void visualizarTipo();
 public abstract float CalcularVolumen();
}
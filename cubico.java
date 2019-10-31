public class cubico extends Granero{
 float lado;
 float volumen;

 public cubico(float lado, float volumen, String tipoGrano) {
  super(tipoGrano);
  this.lado = lado;
  this.volumen = volumen;
 }
 
 @Override
 public float CalcularVolumen(){
  volumen = (float) Math.pow(lado,3);
  return volumen;
 }

 @Override
 public void visualizarTipo() {
  System.out.println("Tipo de grano: "+tipoGrano);
  System.out.println("Lados del granero: "+lado);
  System.out.println("Volumen del granero: "+volumen);
 }
}
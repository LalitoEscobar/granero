import static java.lang.Math.PI;
public class Cilindrico extends Granero {
 float radio;
 float altura;
 float volumen;

 public Cilindrico(float radio, float altura, float volumen, String tipoGrano) {
  super(tipoGrano);
  this.radio = radio;
  this.altura = altura;
  this.volumen = volumen;
 }
 
 @Override
 public float CalcularVolumen(){
  volumen = (float)(PI)* (radio*radio) * altura;
  return volumen;
 }

 @Override
 public void visualizarTipo() {
  System.out.println("Tipo de grano: "+tipoGrano);
  System.out.println("Radio del granero: "+radio);
  System.out.println("Altura del granero: "+altura);
  System.out.println("Volumen del granero: "+volumen);
 }
}
import java.util.Scanner;
public class principal8 {
 public static void main(String[] args){
  int rep=1,tam,opc_granero;
  float auxRadio,auxAltura,auxLado,auxVolumen;
  String auxSemilla;
  Scanner entrada = new Scanner(System.in);
  System.out.println("Practca poliformismo: Granero");
  while(rep==1){
   System.out.println("Digite el numero de graneros que desea agregar: ");
   tam=entrada.nextInt();
   Granero nuevos[] = new Granero[tam];
   
   for(int i=0;i<tam;i++){
    do{
     System.out.println("Graneros Disponibles\n[1]. Cilindrico\n[2]. Cubico.\n[3]. Conico.");
     System.out.print("En que granero desea guardar sus nuevas semillas: ");opc_granero = entrada.nextInt();
    }while((opc_granero<1)||(opc_granero>3));
    
    switch(opc_granero){
     case 1:
            System.out.print("Radio del granero: ");auxRadio=entrada.nextFloat();
            System.out.print("Altura del granero: ");auxAltura=entrada.nextFloat();
            System.out.print("Tipo de semillas: ");auxSemilla=entrada.next();
            auxVolumen = nuevos[i].CalcularVolumen();
            nuevos[i] = new Cilindrico(auxRadio,auxAltura,auxVolumen,auxSemilla);
            break;
     case 2:
            System.out.print("Lado del granero cubico: ");auxLado=entrada.nextFloat();
            System.out.print("Tipo de semillas: ");auxSemilla=entrada.next();
            auxVolumen = nuevos[i].CalcularVolumen();
            nuevos[i] = new cubico(auxLado,auxVolumen,auxSemilla);
            break;
     case 3:
            System.out.print("Radio del granero: ");auxRadio=entrada.nextFloat();
            System.out.print("Altura del granero: ");auxAltura=entrada.nextFloat();
            System.out.print("Tipo de semillas: ");auxSemilla=entrada.next();
            auxVolumen = nuevos[i].CalcularVolumen();
            nuevos[i] = new conico(auxRadio,auxAltura,auxVolumen,auxSemilla);
            break;
    }
   }
   
   //Mostramos todos los datos agregados y terminamos el programa pero en cada clase
   for(int k=0;k<tam;k++){
    nuevos[k].visualizarTipo();
   }
   
   //Punto de retorno
   do{
    System.out.print("\n¿Desea repetir el programa? [si=1/no=2]: "); 
    rep=entrada.nextInt();
   }while((rep<1)||(rep>2));
   
   if(rep==2){
    System.out.println("Saliendo del programa...");break;
   }
  }
  System.out.println("Fin del programa.");
 }   
}
package ejercicos_semana09;
import java.util.ArrayList;
/**
 *
 * @author Josthen Gabriel Chauca
 */
public class Ejercicos_Semana09 {

    public static void main(String[] args) {
    
    ArrayList<String> lista = new ArrayList<String>();
    
    lista.add("hola");
    lista.add("que");
    lista.add("tal");
    lista.add("estas");
    lista.add("hoy");
    
    for (int i=0;i<lista.size();i++) {
      
      System.out.println(lista.get(i));
    }
  }
}

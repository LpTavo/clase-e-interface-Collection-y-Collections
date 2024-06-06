import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjemploCollectionCollections {
    public static void main(String[] args) {
        
        Collection<String> nombres = new ArrayList<>();
    
        nombres.add("Gustavo");
        nombres.add("Luis");
        nombres.add("Adrii");
        nombres.add("Luz");
        
 
        System.out.println("Elementos en la colección: " + nombres);
        
      
        boolean contieneLuz = nombres.contains("Luz");
        System.out.println("¿La colección contiene 'Luz'? " + contieneLuz);
        
     
        Object[] arrayNombres = nombres.toArray();
        System.out.println("Elementos en el array:");
        for (Object nombre : arrayNombres) {
            System.out.println(nombre);
        }
        
      
        List<String> listaNombres = new ArrayList<>(nombres);
        

        Collections.sort(listaNombres);
        System.out.println("Lista ordenada: " + listaNombres);
        
       
        Collections.reverse(listaNombres);
        System.out.println("Lista invertida: " + listaNombres);
        
     
        int posicion = Collections.binarySearch(listaNombres, "Adrii");
        System.out.println("Posición de 'Adrii' en la lista: " + posicion);
        
       
        Collections.shuffle(listaNombres);
        System.out.println("Lista mezclada: " + listaNombres);
    }
}


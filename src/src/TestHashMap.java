package src;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> vehicules = new HashMap<>();
        vehicules.put("BMW", 5);
        vehicules.put("Mercedes", 3);
        vehicules.put("Audi", 4);
        vehicules.put("Ford", 6);

        System.out.println("Total des véhicules : " + vehicules.size());

        // Parcours et affichage des clés de la hashMap
        Set<String> cles = vehicules.keySet();
        for (String cle : cles) {
            System.out.println(cle);
        }

        // Parcours et affichage des valeurs de la hashMap
        Collection<Integer> valeurs = vehicules.values();
        for (int val : valeurs) {
            System.out.println("La valeur est : " + val);
        }

        // Recherche de la valeur de la clé "Audi"
        String searchKey = "Audi";
        if (vehicules.containsKey(searchKey)) {
            System.out.println("Le total " + vehicules.get(searchKey) + " " + searchKey + " voitures!\n");
        }

        // Effacer toutes les valeurs de la hashMap
        vehicules.clear();
        System.out.println("Après l'opération clear, size: " + vehicules.size());
    }
}
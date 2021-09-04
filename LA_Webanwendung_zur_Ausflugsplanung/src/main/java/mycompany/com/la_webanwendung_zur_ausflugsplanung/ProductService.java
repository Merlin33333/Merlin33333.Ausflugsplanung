/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.com.la_webanwendung_zur_ausflugsplanung;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author vande
 */
@Named
@ApplicationScoped
public class ProductService {

    List<Product> products;
    
    

    ChoicesBean valuechoices =  new ChoicesBean();
    

    //Kegel offen
    @PostConstruct
    public void init() {
      products = new ArrayList<>();
          //    •	Kegeln:  am Wochenende auch tagsüber, schönes oder schlechtes Wetter. Auch mit Kindern möglich. 
            products.add(new Product("Kegel", "-", "-", "Nachts / Tag möglich wenn am Wochenende",  "-", "Am Wochenende möglich", valuechoices.Kegelnopenornot));
        products.add(new Product("Freibad", "-", "Schönes", "Tagsüber", "-", "-",valuechoices.FreibadOpenOrNot));
        products.add(new Product("Hallenbad", "-", "Schönes", "Tagsüber",  "An Wochenenden in den Schulferien wird das Bad gewartet und ist geschlossen.","nicht am Wochenende", valuechoices.HallenbadOpenOrNot));
        products.add(new Product("Wandern", "-", "Schönes", "Tagsüber", "-", "-", valuechoices.WanderOpenOrNot));
        products.add(new Product("Musikkurs", "-", "-", "Nachts", "-", "Nicht am Wochenende", valuechoices.MusikkursOpenOrNot));
        products.add(new Product("Brotbackkurs", "-", "Schlechtes","Es gibt einen Tages- und einen Abendkurs.", "-", "Am Wochenende", valuechoices.BrotbackkursOpenOrNot));
        products.add(new Product("Schieferbergwerk", "-", "-","tagsüber (keine Abendführungen außer an Wochenenden in den Schulferien).","-","-", valuechoices.SchieferbergwerkOpenOrNot));
        products.add(new Product("Go-Kurse", "-", "Schlechtes ODER *Schönes*", "*Tagsüber*", "-", "Am Wochenende ODER *Nicht am Wochenende*", valuechoices.GokurseOpenOrNot));
        products.add(new Product("Billard", "Nein", "-", "Abends ODER *Tagsüber*", "-","*Am Wochenede*", valuechoices.BillardOpenOrNot));
        products.add(new Product("Rennautofahren", "Nein", "-", "Tagsüber", "Am Wochenende", "In den Ferien", valuechoices.RennautofahrenOpenOrNot));
        products.add(new Product("Open-Air Kino", "-", "Schönes", "Abends ODER *Tagsüber*", "-","*Am Wochenende*", valuechoices.OpenAirKinoOpenOrNot));
        products.add(new Product("Korbflechten", "-", "Schlechtes", "-", "In den Ferien", "Nicht am Wochenende", valuechoices.KorbflechtenOpenOrNot));
        products.add(new Product("Besuch des Wasserfalls", "-", "-", "Nicht Abends", "-", "-", valuechoices.BesuchdesWasserfallsOpenOrNot));
        products.add(new Product("Zoobesuch", "-", "-", "Täglich", "-", "-", valuechoices.ZoobesuchOpenOrNot));

//        this.Createliste();
        //                              Name   Kinder   Wetter    Time  Wochenende Ferien   Offen
       
    }
    public void Createliste(ChoicesBean valuechoices){
        
        products = new ArrayList<>();

        //•	Hallenbad: Schönes oder schlechtes Wetter. Offen täglich. An Wochenenden in den Schulferien wird das Bad gewartet und ist geschlossen.

         products.add(new Product("Kegel", "-", "-", "Nachts / Tag möglich wenn am Wochenende",  "-", "Am Wochenende möglich", valuechoices.Kegelnopenornot));
        products.add(new Product("Freibad", "-", "Schönes", "Tagsüber", "-", "-",valuechoices.FreibadOpenOrNot));
        products.add(new Product("Hallenbad", "-", "Schönes", "Tagsüber",  "An Wochenenden in den Schulferien wird das Bad gewartet und ist geschlossen.","nicht am Wochenende", valuechoices.HallenbadOpenOrNot));
        products.add(new Product("Wandern", "-", "Schönes", "Tagsüber", "-", "-", valuechoices.WanderOpenOrNot));
        products.add(new Product("Musikkurs", "-", "-", "Nachts", "-", "Nicht am Wochenende", valuechoices.MusikkursOpenOrNot));
        products.add(new Product("Brotbackkurs", "-", "Schlechtes","Es gibt einen Tages- und einen Abendkurs.", "-", "Am Wochenende", valuechoices.BrotbackkursOpenOrNot));
        products.add(new Product("Schieferbergwerk", "-", "-","tagsüber (keine Abendführungen außer an Wochenenden in den Schulferien).","-","-", valuechoices.SchieferbergwerkOpenOrNot));
        products.add(new Product("Go-Kurse", "-", "Schlechtes ODER *Schönes*", "*Tagsüber*", "-", "Am Wochenende ODER *Nicht am Wochenende*", valuechoices.GokurseOpenOrNot));
        products.add(new Product("Billard", "Nein", "-", "Abends ODER *Tagsüber*", "-","*Am Wochenede*", valuechoices.BillardOpenOrNot));
        products.add(new Product("Rennautofahren", "Nein", "-", "Tagsüber", "Am Wochenende", "In den Ferien", valuechoices.RennautofahrenOpenOrNot));
        products.add(new Product("Open-Air Kino", "-", "Schönes", "Abends ODER *Tagsüber*", "-","*Am Wochenende*", valuechoices.OpenAirKinoOpenOrNot));
        products.add(new Product("Korbflechten", "-", "Schlechtes", "-", "In den Ferien", "Nicht am Wochenende", valuechoices.KorbflechtenOpenOrNot));
        products.add(new Product("Besuch des Wasserfalls", "-", "-", "Nicht Abends", "-", "-", valuechoices.BesuchdesWasserfallsOpenOrNot));
        products.add(new Product("Zoobesuch", "-", "-", "Täglich", "-", "-", valuechoices.ZoobesuchOpenOrNot));

    }


    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getProducts(int size) {

        if (size > products.size()) {
            Random rand = new Random();

            List<Product> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(products.size());
                randomList.add(products.get(randomIndex));
            }

            return randomList;
        } else {
            return new ArrayList<>(products.subList(0, size));
        }

    }

//	public List<Product> getClonedProducts(int size) {
//		List<Product> results = new ArrayList<>();
//		List<Product> originals = getProducts(size);
//		for (Product original : originals) {
//			results.add(original.clone());
//		}
//		return results;
//	}
}

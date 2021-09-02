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
          
         products.add(new Product("Kegel", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.Kegelnopenornot));
        products.add(new Product("Freibad", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation,valuechoices.FreibadOpenOrNot));
        products.add(new Product("Hallenbad", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.HallenbadOpenOrNot));
        products.add(new Product("Wandern", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.WanderOpenOrNot));
        products.add(new Product("Musikkurs", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.MusikkursOpenOrNot));
        products.add(new Product("Brotbackkurs", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.BrotbackkursOpenOrNot));
        products.add(new Product("Schieferbergwerk", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.SchieferbergwerkOpenOrNot));
        products.add(new Product("Go-Kurse", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.GokurseOpenOrNot));
        products.add(new Product("Billard", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.BillardOpenOrNot));
        products.add(new Product("Rennautofahren", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.RennautofahrenOpenOrNot));
        products.add(new Product("Open-Air Kino", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.OpenAirKinoOpenOrNot));
        products.add(new Product("Korbflechten", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.KorbflechtenOpenOrNot));
        products.add(new Product("Besuch des Wasserfalls", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.BesuchdesWasserfallsOpenOrNot));
        products.add(new Product("Zoobesuch", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.ZoobesuchOpenOrNot));

//        this.Createliste();
        //                              Name   Kinder   Wetter    Time  Wochenende Ferien   Offen
       
    }
    public void Createliste(ChoicesBean valuechoices){
        
        products = new ArrayList<>();
          
        products.add(new Product("Kegel", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.Kegelnopenornot));
        products.add(new Product("Freibad", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation,valuechoices.FreibadOpenOrNot));
        products.add(new Product("Hallenbad", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.HallenbadOpenOrNot));
        products.add(new Product("Wandern", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.WanderOpenOrNot));
        products.add(new Product("Musikkurs", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.MusikkursOpenOrNot));
        products.add(new Product("Brotbackkurs", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.BrotbackkursOpenOrNot));
        products.add(new Product("Schieferbergwerk", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.SchieferbergwerkOpenOrNot));
        products.add(new Product("Go-Kurse", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.GokurseOpenOrNot));
        products.add(new Product("Billard", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.BillardOpenOrNot));
        products.add(new Product("Rennautofahren", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.RennautofahrenOpenOrNot));
        products.add(new Product("Open-Air Kino", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.OpenAirKinoOpenOrNot));
        products.add(new Product("Korbflechten", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.KorbflechtenOpenOrNot));
        products.add(new Product("Besuch des Wasserfalls", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.BesuchdesWasserfallsOpenOrNot));
        products.add(new Product("Zoobesuch", valuechoices.children, valuechoices.weather, valuechoices.time, valuechoices.weekend, valuechoices.vacation, valuechoices.ZoobesuchOpenOrNot));

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

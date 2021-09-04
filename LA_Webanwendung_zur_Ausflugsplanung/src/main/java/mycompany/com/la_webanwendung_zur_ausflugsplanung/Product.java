/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.com.la_webanwendung_zur_ausflugsplanung;

/**
 *
 * @author vande
 */
public class Product {

    private String names;
    private String kids;
    private String weather;
    private String time;
    private String holidays;
    private String open;
    private String weekend;

    public Product(String names, String kids, String weather, String time, String holidays,  String weekend ,String open) {
        this.names = names;
        this.kids = kids;
        this.weather = weather;
        this.time = time;
        this.holidays = holidays;
        this.open = open;
        this.weekend = weekend;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }

  

    public String getNames() {
        return names;
    }

    public String getKids() {
        return kids;
    }

    public String getWeather() {
        return weather;
    }

    public String getTime() {
        return time;
    }

    public String getHolidays() {
        return holidays;
    }

    public String getOpen() {
        return open;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setKids(String kids) {
        this.kids = kids;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setHolidays(String holidays) {
        this.holidays = holidays;
    }

    public void setOpen(String open) {
        this.open = open;
    }



}

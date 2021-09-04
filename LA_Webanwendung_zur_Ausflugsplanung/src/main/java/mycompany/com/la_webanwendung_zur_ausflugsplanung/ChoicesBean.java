package mycompany.com.la_webanwendung_zur_ausflugsplanung;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;



/**
 *
 * @author vande
 */
@Named(value = "ChoicesBean")
@ApplicationScoped

public class ChoicesBean {

    String weather;

    String time;

    String vacation;

    String children;

    String weekend;

    String reset;



    String Kegelnopenornot;

    String FreibadOpenOrNot;

    String HallenbadOpenOrNot;

    String WanderOpenOrNot;

    String MusikkursOpenOrNot;

    String BrotbackkursOpenOrNot;

    String SchieferbergwerkOpenOrNot;

    String GokurseOpenOrNot;

    String BillardOpenOrNot;

    String RennautofahrenOpenOrNot;

    String OpenAirKinoOpenOrNot;

    String KorbflechtenOpenOrNot;

    String BesuchdesWasserfallsOpenOrNot;

    String ZoobesuchOpenOrNot;

    public ChoicesBean() {

    }

    public String getWeather() {
        return weather;
    }

    public String getTime() {
        return time;
    }

    public String getVacation() {
        return vacation;
    }

    public String getChildren() {
        return children;
    }

    public String getWeekend() {
        return weekend;
    }
    @Inject
    BasicView x;

    public String go() {


        //kegel
        if ("timenight".equals(time) && "weekendno".equals(weekend)) {
            Kegelnopenornot = "Offen";
        } else if ("weekenday".equals(weekend)) {
            Kegelnopenornot = "Offen";
        } else {
            Kegelnopenornot = "geschlossen";
        }

//    •	Kegeln:  am Wochenende auch tagsüber, schönes oder schlechtes Wetter. Auch mit Kindern möglich. 
        if ("weatherisgood".equals(weather) && "timeday".equals(time)) {
            FreibadOpenOrNot = "Offen";

        } else {
            FreibadOpenOrNot = "geschlossen";
        }
//•	Freibad: nur schönes Wetter. Nur tagsüber (nach 17:00 geschlossen)
        if ( "weekendno".equals(weekend)) {
            HallenbadOpenOrNot = "Offen";
        } else {
            HallenbadOpenOrNot = "geschlossen";
        }
//•	Hallenbad: Schönes oder schlechtes Wetter. Offen täglich. An Wochenenden in den Schulferien wird das Bad gewartet und ist geschlossen.
        if ("weatherisgood".equals(weather) && "timeday".equals(time)) {
            WanderOpenOrNot = "Offen";
        } else {
            WanderOpenOrNot = "geschlossen";
        }

//•	Wandern im Dunkelwald: Nur bei schönem Wetter. Tagsüber immer möglich. Abends nicht möglich.
        if ("timenight".equals(time) && "weekendno".equals(weekend)) {
            MusikkursOpenOrNot = "Offen";
        } else {
            MusikkursOpenOrNot = "geschlossen";
        }
//•	Musikkurs: Im Schulhaus, daher nur abends während der Schulzeit (nicht am Wochenende). Wetter egal.
        if ("weekendyes".equals(weekend) && "weatherisbad".equals(weather)) {
            BrotbackkursOpenOrNot = "Offen";
        } else {
            BrotbackkursOpenOrNot = "geschlossen";
        }
//•	Brotbackkurs: Wird nur am Wochenende bei Schlechtwetter durchgeführt. Es gibt einen Tages- und einen Abendkurs.
        if ("timeday".equals(time)) {
            SchieferbergwerkOpenOrNot = "Offen";

        } else if ("timenight".equals(time) && "weekendyes".equals(weekend) && "vacationyes".equals(vacation)) {
            SchieferbergwerkOpenOrNot = "Offen";
        } else {
            SchieferbergwerkOpenOrNot = "geschlossen";
        }
//•	Schieferbergwerk: Täglich tagsüber (keine Abendführungen außer an Wochenenden in den Schulferien).
        if ("weekendyes".equals(weekend) && "weatherisbad".equals(weather)) {
            GokurseOpenOrNot = "Offen";
        } else if ("timenight".equals(time) && "weekendno".equals(weekend) && "weatherisbad".equals(weather)) {
            GokurseOpenOrNot = "Offen";
        } else {
            GokurseOpenOrNot = "geschlossen";
        }
//•	Go-Kurse: Am Wochenende bei schlechtem Wetter (im Gemeindelokal Raum B4) oder aber unter der Woche, dann aber nur abends bei schönem Wetter (im Lokal Widder in der Gartenwirtschaft).
        if ("timenight".equals(time) && "childrenno".equals(children)) {
            BillardOpenOrNot = "Offen";
        } else if ("timeday".equals(time) && "weekenyes".equals(weekend) && "childrenno".equals(children)) {
            BillardOpenOrNot = "Offen";
        } else {
            BillardOpenOrNot = "geschlossen";
        }
//•	Billard: Abends, am Wochenende auch tagsüber. Für Kinder wegen der hohen Tische ungeeignet.
        if ("childrenno".equals(children) && "weekendyes".equals(weekend) && "vacationyes".equals(vacation) && "timeday".equals(time)) {
            RennautofahrenOpenOrNot = "Offen";
        } else {
            RennautofahrenOpenOrNot = "geschlossen";
        }
//•	Rennautofahren: Nur Erwachsene: Nur tagsüber an Wochenenden der Schulferien.
        if ("timenight".equals(time) && "weatherisgood".equals(weather)) {
            OpenAirKinoOpenOrNot = "Offen";
        } else if ("timeday".equals(time) && "weekenyes".equals(weekend) && "weatherisgood".equals(weather)) {
            OpenAirKinoOpenOrNot = "Offen";
        } else {
            OpenAirKinoOpenOrNot = "geschlossen";
        }
//•	Open-Air Kino: Nur abends. Am Wochenende auch tagsüber (dann aber mit Lichtschutz). Nur bei schönem Wetter.
        if ("vacationyes".equals(vacation) && "weatherisbad".equals(weather) && "weekendno".equals(weekend)) {
            KorbflechtenOpenOrNot = "Offen";
        } else {
            KorbflechtenOpenOrNot = "geschlossen";
        }
//•	Korbflechten: Nur in den Schulferien bei Schlechtwetter. Keine Kurse am Wochenende.
        if ("timeday".equals(time)) {
            BesuchdesWasserfallsOpenOrNot = "Offen";
        } else {
            BesuchdesWasserfallsOpenOrNot = "geschlossen";
        }
//•	Besuch des Wasserfalls: Täglich tagsüber. Keine Abendführungen, weil der Fußweg zu dunkel ist.

        ZoobesuchOpenOrNot = "Offen";

//•	Zoobesuch: Täglich offen, auch abends.
        x.getService().Createliste(this);
        return "Ausflugsplanung.xhtml";
    }

    public String getReset() {
        return reset;
    }

    public String getKegelnopenornot() {
        return Kegelnopenornot;
    }

    public String getFreibadOpenOrNot() {
        return FreibadOpenOrNot;
    }

    public String getHallenbadOpenOrNot() {
        return HallenbadOpenOrNot;
    }

    public String getWanderOpenOrNot() {
        return WanderOpenOrNot;
    }

    public String getMusikkursOpenOrNot() {
        return MusikkursOpenOrNot;
    }

    public String getBrotbackkursOpenOrNot() {
        return BrotbackkursOpenOrNot;
    }

    public String getSchieferbergwerkOpenOrNot() {
        return SchieferbergwerkOpenOrNot;
    }

    public String getGokurseOpenOrNot() {
        return GokurseOpenOrNot;
    }

    public String getBillardOpenOrNot() {
        return BillardOpenOrNot;
    }

    public String getRennautofahrenOpenOrNot() {
        return RennautofahrenOpenOrNot;
    }

    public String getOpenAirKinoOpenOrNot() {
        return OpenAirKinoOpenOrNot;
    }

    public String getKorbflechtenOpenOrNot() {
        return KorbflechtenOpenOrNot;
    }

    public String getBesuchdesWasserfallsOpenOrNot() {
        return BesuchdesWasserfallsOpenOrNot;
    }

    public String getZoobesuchOpenOrNot() {
        return ZoobesuchOpenOrNot;
    }

    public BasicView getX() {
        return x;
    }

    public void setReset(String reset) {
        this.reset = reset;
    }

    public void setKegelnopenornot(String Kegelnopenornot) {
        this.Kegelnopenornot = Kegelnopenornot;
    }

    public void setFreibadOpenOrNot(String FreibadOpenOrNot) {
        this.FreibadOpenOrNot = FreibadOpenOrNot;
    }

    public void setHallenbadOpenOrNot(String HallenbadOpenOrNot) {
        this.HallenbadOpenOrNot = HallenbadOpenOrNot;
    }

    public void setWanderOpenOrNot(String WanderOpenOrNot) {
        this.WanderOpenOrNot = WanderOpenOrNot;
    }

    public void setMusikkursOpenOrNot(String MusikkursOpenOrNot) {
        this.MusikkursOpenOrNot = MusikkursOpenOrNot;
    }

    public void setBrotbackkursOpenOrNot(String BrotbackkursOpenOrNot) {
        this.BrotbackkursOpenOrNot = BrotbackkursOpenOrNot;
    }

    public void setSchieferbergwerkOpenOrNot(String SchieferbergwerkOpenOrNot) {
        this.SchieferbergwerkOpenOrNot = SchieferbergwerkOpenOrNot;
    }

    public void setGokurseOpenOrNot(String GokurseOpenOrNot) {
        this.GokurseOpenOrNot = GokurseOpenOrNot;
    }

    public void setBillardOpenOrNot(String BillardOpenOrNot) {
        this.BillardOpenOrNot = BillardOpenOrNot;
    }

    public void setRennautofahrenOpenOrNot(String RennautofahrenOpenOrNot) {
        this.RennautofahrenOpenOrNot = RennautofahrenOpenOrNot;
    }

    public void setOpenAirKinoOpenOrNot(String OpenAirKinoOpenOrNot) {
        this.OpenAirKinoOpenOrNot = OpenAirKinoOpenOrNot;
    }

    public void setKorbflechtenOpenOrNot(String KorbflechtenOpenOrNot) {
        this.KorbflechtenOpenOrNot = KorbflechtenOpenOrNot;
    }

    public void setBesuchdesWasserfallsOpenOrNot(String BesuchdesWasserfallsOpenOrNot) {
        this.BesuchdesWasserfallsOpenOrNot = BesuchdesWasserfallsOpenOrNot;
    }

    public void setZoobesuchOpenOrNot(String ZoobesuchOpenOrNot) {
        this.ZoobesuchOpenOrNot = ZoobesuchOpenOrNot;
    }

    public void setX(BasicView x) {
        this.x = x;
    }

  

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }


}

package tav.Model.planoMedico;

import java.util.List;

public class DateTime {
    public String date;
    public List<String> hour;

    public DateTime() {
    	
    }
    
    void AddHour(String hour) {
    	this.hour.add(hour);
    }
    
    public DateTime(String date, List<String> hour) {
        setDate(date);
        setHour(hour);
    }

    public String toString() {
        return String.format("Data: %s\nHorário: %s",
        getDate(), getHour());
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(List<String> hour) {
        this.hour = hour;
    }

    public List<String> getHour() {
        return this.hour;
    }

    public String getDate() {
        return this.date;
    }
}

package ManAndCupboard;

import java.util.ArrayList;

public class Cupboard {
    private String color;
    private Boolean dorOpen; // если true - то дверь открыта
    private ArrayList<String> cupboardItems = new ArrayList<>();

    public Cupboard(String color, Boolean dorOpen) {
        this.color = color;
        this.dorOpen = dorOpen;
    }

    public Cupboard(Boolean dorOpen) {
        this.dorOpen = dorOpen;
    }

    public Cupboard(String color) {
        this.color = color;
        this.dorOpen = false;
    }

    public String getColor() {
        return color;
    }

    public Boolean getdorOpen() {
        return dorOpen;
    }

    public Boolean setdorOpen(Boolean openClose) {
        return this.dorOpen = openClose;
    }

    public ArrayList<String> getCupboardItems() {
        return cupboardItems;
    }

    public void setCupboardItems(String item){
        cupboardItems.add(item);
    }

    public void removeCupboardItem(String item){
        cupboardItems.remove(item);
    }
}
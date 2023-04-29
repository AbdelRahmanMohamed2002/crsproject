package com.models;

public class Extrafees {
    private boolean charger;
    private boolean wifiHotspot;
    private boolean prepaidfuel;
    private boolean Insurance;
    private boolean driverServes;
    private boolean Childseats;
    private boolean phoneHolder;
    public boolean isCharger() {
        return charger;
    }
    public void setCharger(boolean charger) {
        this.charger = charger;
    }
    public boolean isWifiHotspot() {
        return wifiHotspot;
    }
    public void setWifiHotspot(boolean wifiHotspot) {
        this.wifiHotspot = wifiHotspot;
    }
    public boolean isPrepaidfuel() {
        return prepaidfuel;
    }
    public void setPrepaidfuel(boolean prepaidfuel) {
        this.prepaidfuel = prepaidfuel;
    }
    public boolean isInsurance() {
        return Insurance;
    }
    public void setInsurance(boolean insurance) {
        Insurance = insurance;
    }
    public boolean isDriverServes() {
        return driverServes;
    }
    public void setDriverServes(boolean driverServes) {
        this.driverServes = driverServes;
    }
    public boolean isChildseats() {
        return Childseats;
    }
    public void setChildseats(boolean childseats) {
        Childseats = childseats;
    }
    public boolean isPhoneHolder() {
        return phoneHolder;
    }
    public void setPhoneHolder(boolean phoneHolder) {
        this.phoneHolder = phoneHolder;
    }
    public int Addcharger()
    {
return 0;
    }
    public int WIFIhotspot()
    {
        return 0;
    }
    public int prepaidfueal()
    {
        return 0;
    }
    public int insurance()
    {
        return 0;
    }
    public int driverserves()
    {
        return 0;
    }
    public int childseats()
    {
        return 0;
    }
    public int AddPhoneHolder()
    {
        return 0;
    }
    public Extrafees(boolean charger, boolean wifiHotspot, boolean prepaidfuel, boolean insurance, boolean driverServes,
            boolean childseats, boolean phoneHolder) {
        this.charger = charger;
        this.wifiHotspot = wifiHotspot;
        this.prepaidfuel = prepaidfuel;
        Insurance = insurance;
        this.driverServes = driverServes;
        Childseats = childseats;
        this.phoneHolder = phoneHolder;
    }
    
}


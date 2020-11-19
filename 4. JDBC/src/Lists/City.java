package Lists;

import java.util.ArrayList;

public class City {

    private int ID;
    private String Name;
    private String CountryCode;
    private String District;

    public City(int ID, String name, String countryCode, String district) {
        this.ID = ID;
        Name = name;
        CountryCode = countryCode;
        District = district;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    ArrayList <City> cityArrayList = new ArrayList<>();


}
